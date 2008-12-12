/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Load extends Node {

	
	public Load(Block block, Node store, Node addr) {
		super(binding_cons.new_r_Load(Graph.getCurrent().ptr, block.ptr, store.ptr, addr.ptr));
	}
	

	protected Load(Pointer ptr) {
		super(ptr);
	}

	
	public Node getStore() {
		return createWrapper(binding.get_Load_store(ptr));
	}
	
	public Node getAddr() {
		return createWrapper(binding.get_Load_addr(ptr));
	}
	
}