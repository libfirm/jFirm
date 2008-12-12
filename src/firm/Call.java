/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Call extends Node {

	
	public Call(Block block, Node store, Node callee, Node[] ins) {
		super(binding_cons.new_r_Call(Graph.getCurrent().ptr, block.ptr, store.ptr, callee.ptr, ins.length, getPointerListFromNodeList(ins)));
	}
	

	protected Call(Pointer ptr) {
		super(ptr);
	}

	
	public Node getStore() {
		return createWrapper(binding.get_Call_store(ptr));
	}
	
	public Node getCallee() {
		return createWrapper(binding.get_Call_callee(ptr));
	}
	
}