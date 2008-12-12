/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Call extends Node {

	
	public Call(Block block, Node mem, Node ptr, Node[] ins, Type type) {
		super(binding_cons.new_r_Call(Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), type.ptr));
	}
	

	public Call(Pointer ptr) {
		super(ptr);
	}

	
	public Node getMem() {
		return createWrapper(binding.get_Call_mem(ptr));
	}

	public void setMem(Node mem) {
		binding.set_Call_mem(this.ptr, mem.ptr);
	}
	
	public Node getPtr() {
		return createWrapper(binding.get_Call_ptr(ptr));
	}

	public void setPtr(Node ptr) {
		binding.set_Call_ptr(this.ptr, ptr.ptr);
	}
	
}