package firm.nodes;

import java.nio.IntBuffer;
import java.util.Iterator;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.Graph;
import firm.JNAWrapper;
import firm.Mode;
import firm.bindings.binding_irnode;
import firm.bindings.binding_irnode.ir_opcode;

public abstract class Node extends JNAWrapper {

	public Node(Pointer ptr) {
		super(ptr);
	}

	public Graph getGraph() {
		return new Graph(binding_irnode.get_irn_irg(ptr));
	}

	public static Node createWrapper(Pointer ptr) {
		return NodeWrapperConstruction.createWrapper(ptr);
	}

	public static Pointer[] getPointerListFromNodeList(Node[] list) {
		Pointer[] ptrlist = new Pointer[list.length];
		for (int i = 0; i < list.length; ++i) {
			ptrlist[i] = list[i].ptr;
		}
		return ptrlist;
	}

	public static IntBuffer getBufferFromNodeList(Node[] list) {
		assert Pointer.SIZE == 4; // There is no PointerBuffer...
		IntBuffer buf = IntBuffer.allocate(list.length);
		for (int i = 0; i < list.length; ++i) {
			buf.put(i, (int) Pointer.nativeValue(list[i].ptr));
		}
		return buf;
	}

	public Mode getMode() {
		return new Mode(binding_irnode.get_irn_mode(ptr));
	}

	public int getPredCount() {
		return binding_irnode.get_irn_arity(ptr);
	}

	public void markVisited() {
		binding_irnode.set_irn_visited(ptr, new NativeLong(getGraph()
				.getVisited()));
	}

	public boolean visited() {
		int node_visited = binding_irnode.get_irn_visited(ptr).intValue();
		return node_visited >= getGraph().getVisited();
	}

	public Node getPred(int n) {
		return createWrapper(binding_irnode.get_irn_n(ptr, n));
	}

	public void setPred(int n, Node node) {
		binding_irnode.set_irn_n(ptr, n, node.ptr);
	}

	public int getNr() {
		return binding_irnode.get_irn_node_nr(ptr).intValue();
	}

	public class PredIterator implements Iterator<Node> {
		private int i;

		@Override
		public boolean hasNext() {
			return i < getPredCount();
		}

		@Override
		public Node next() {
			return getPred(i++);
		}

		@Override
		public void remove() {
			throw new RuntimeException("Not implemented");
		}
	}

	public Iterable<Node> getPreds() {
		return new Iterable<Node>() {
			@Override
			public Iterator<Node> iterator() {
				return new PredIterator();
			}
		};
	}

	/**
	 * May be used instead of instanceof tests. (node.getOpCode() ==
	 * ir_opcode.iro_Add) => node instanceof Add
	 * 
	 * @return Type of the current node
	 */
	public binding_irnode.ir_opcode getOpCode() {
		int code = binding_irnode.get_irn_opcode(this.ptr);
		binding_irnode.ir_opcode op = binding_irnode.ir_opcode.getEnum(code);
		return op;
	}

	@Override
	public String toString() {
		return binding_irnode.gdb_node_helper(ptr);
	}

	public Node getBlock() {
		return createWrapper(binding_irnode.get_nodes_block(ptr));
	}

	public void setBlock(Node block) {
		assert block.getOpCode() == ir_opcode.iro_Block
				|| block.getOpCode() == ir_opcode.iro_Bad;
		assert this.getOpCode() != ir_opcode.iro_Block;
		binding_irnode.set_nodes_block(ptr, block.ptr);
	}

	public abstract void accept(NodeVisitor visitor);
}
