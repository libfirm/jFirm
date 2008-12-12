/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Return extends Node {

	
	public Return(Block block, Node mem, Node[] ins) {
		super(binding_cons.new_r_Return(Graph.getCurrent().ptr, block.ptr, mem.ptr, ins.length, getPointerListFromNodeList(ins)));
	}
	

	protected Return(Pointer ptr) {
		super(ptr);
	}

	
	public Node getMem() {
		return createWrapper(binding.get_Return_mem(ptr));
	}
	
}