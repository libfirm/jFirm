/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Store extends Node {

	
	public Store(Block block, Node store, Node addr, Node val) {
		super(binding_cons.new_r_Store(Graph.getCurrent().ptr, block.ptr, store.ptr, addr.ptr, val.ptr));
	}
	

	protected Store(Pointer ptr) {
		super(ptr);
	}

	
	public Node getStore() {
		return createWrapper(binding.get_Store_store(ptr));
	}
	
	public Node getAddr() {
		return createWrapper(binding.get_Store_addr(ptr));
	}
	
	public Node getVal() {
		return createWrapper(binding.get_Store_val(ptr));
	}
	
}