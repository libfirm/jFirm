package firm;

import java.util.Iterator;

import com.sun.jna.Pointer;

import firm.bindings.binding_iredges;
import firm.bindings.binding_iredges.ir_edge_kind_t;
import firm.nodes.Node;

public class BackEdges {

	public static void enable(Graph graph) {
		binding_iredges.edges_activate(graph.ptr);
	}

	public static void disable(Graph graph) {
		binding_iredges.edges_deactivate(graph.ptr);
	}

	public static boolean enabled(Graph graph) {
		return binding_iredges.edges_activated_kind(graph.ptr,
				ir_edge_kind_t.EDGE_KIND_NORMAL.val) != 0;
	}

	public static class Edge {
		public Node node;
		public int pos;
	}

	private static class EdgeIterator implements Iterator<Edge> {
		private Pointer edge;
		private Pointer node;
		private int     kind;

		public EdgeIterator(Node newNode, ir_edge_kind_t kind) {
			this.node = newNode.ptr;
			this.kind = kind.val;
			edge = binding_iredges.get_irn_out_edge_first_kind(node, this.kind);
		}

		@Override
		public boolean hasNext() {
			return edge != null;
		}

		@Override
		public Edge next() {
			assert edge != null;

			Edge result = new Edge();
			result.node = Node.createWrapper(binding_iredges
					.get_edge_src_irn(edge));
			result.pos = binding_iredges.get_edge_src_pos(edge);
			edge = binding_iredges.get_irn_out_edge_next(node, edge, kind);
			return result;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	private static class EdgeIterable implements Iterable<Edge> {
		private final Node node;

		public EdgeIterable(Node node) {
			this.node = node;
		}

		@Override
		public Iterator<Edge> iterator() {
			return new EdgeIterator(node, ir_edge_kind_t.EDGE_KIND_NORMAL);
		}
	}

	public static Iterable<Edge> getOuts(Node node) {
		if (binding_iredges.edges_activated_kind(node.getGraph().ptr,
				ir_edge_kind_t.EDGE_KIND_NORMAL.val) == 0)
			throw new RuntimeException("Edges not activated");

		return new EdgeIterable(node);
	}

	public static int getNOuts(Node node) {
		return binding_iredges.get_irn_n_edges(node.ptr);
	}
}
