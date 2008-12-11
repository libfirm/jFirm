package firm;

import java.util.Iterator;

import javax.naming.OperationNotSupportedException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;

public class Node extends JNAWrapper {
	protected static final binding_ircons binding_cons = (binding_ircons) Native.loadLibrary("firm", binding_ircons.class);
	protected static final binding_irnode binding = (binding_irnode) Native.loadLibrary("firm", binding_irnode.class);

	protected Node(Pointer ptr) {
		super(ptr);
	}
	
	public Graph getGraph() {
		return new Graph(binding.get_irn_irg(ptr));
	}
	
	protected static Node createWrapper(Pointer ptr) {
		switch (binding_irnode.ir_opcode.getEnum(binding.get_irn_opcode(ptr))) {
		case iro_Block:
			return new Block(ptr);
		default:
			return new Node(ptr);
		}
	}
	
	protected static Pointer[] getPointerListFromNodeList(Node[] list) {
		Pointer[] ptrlist = new Pointer[list.length];
		for (int i = 0; i < list.length; ++i) {
			ptrlist[i] = list[i].ptr;
		}
		return ptrlist;
	}
	
	public int getPredCount() {
		return binding.get_irn_arity(ptr);
	}
	
	public void markVisited() {
		binding.mark_irn_visited(ptr);
	}
	
	public boolean visited() {
		return 0 != binding.irn_visited(ptr);
	}
	
	public Node getPred(int n) {
		return createWrapper(binding.get_irn_n(ptr, n));
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
			throw new NotImplementedException();
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
	
	public String toString() {
		return binding.gdb_node_helper(ptr);
	}
	
	public Block getBlock() {
		return new Block(binding.get_nodes_block(ptr));
	}
}
