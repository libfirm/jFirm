package firm.nodes;

import java.util.Iterator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.sun.jna.Pointer;

import firm.Graph;
import firm.JNAWrapper;
import firm.Mode;
import firm.bindings.Bindings;
import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;

public class Node extends JNAWrapper {
	protected static final binding_ircons binding_cons = Bindings.getIrConsBinding();
	protected static final binding_irnode binding = Bindings.getIrNodeBinding();

	public Node(Pointer ptr) {
		super(ptr);
	}
	
	public Graph getGraph() {
		return new Graph(binding.get_irn_irg(ptr));
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
	
	public Mode getMode() {
		return new Mode(binding.get_irn_mode(ptr));
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
