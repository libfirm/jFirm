package firm;

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
	
	protected static Pointer[] getPointerListFromNodeList(Node[] list) {
		Pointer[] ptrlist = new Pointer[list.length];
		for (int i = 0; i < list.length; ++i) {
			ptrlist[i] = list[i].ptr;
		}
		return ptrlist;
	}
}
