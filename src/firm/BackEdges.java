package firm;

import java.util.Iterator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.binding_iredges;
import firm.bindings.binding_iredges.ir_edge_kind_t;
import firm.nodes.Node;

public class BackEdges {
	private static binding_iredges binding = (binding_iredges) Native.loadLibrary("firm", binding_iredges.class);
	
	public static void enable(Graph graph) {
		binding.edges_activate(graph.ptr);
	}
	
	public static void disable(Graph graph) {
		binding.edges_deactivate(graph.ptr);
	}
	
	public static class Edge {
		public Node node;
		public int pos;
	}
	
	private static class EdgeIterator implements Iterator<Edge> {
		private Pointer edge;
		private Pointer next;
		private Pointer node;
		
		public EdgeIterator(Node newNode, ir_edge_kind_t kind) {
			this.node = newNode.ptr;
			edge = binding.get_irn_out_edge_first_kind(node, kind.val);
			next = binding.get_irn_out_edge_next(node, edge); 
		}

		@Override
		public boolean hasNext() {
			return next != Pointer.NULL; 
		}

		@Override
		public Edge next() {
			assert edge != Pointer.NULL;
			
			Edge result = new Edge();
			result.node = Node.createWrapper(binding.get_edge_src_irn(edge));
			result.pos  = binding.get_edge_src_pos(edge);
			edge = next;
			return result;
		}

		@Override
		public void remove() {
			throw new NotImplementedException();
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
		return new EdgeIterable(node);
	}
	
	public static int getNOuts(Node node) {
		return binding.get_irn_n_edges(node.ptr);
	}
}
