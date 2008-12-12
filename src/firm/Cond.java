/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Cond extends Node {

	
	public Cond(Block block, Node selector) {
		super(binding_cons.new_r_Cond(Graph.getCurrent().ptr, block.ptr, selector.ptr));
	}
	

	protected Cond(Pointer ptr) {
		super(ptr);
	}

	
	public Node getSelector() {
		return createWrapper(binding.get_Cond_selector(ptr));
	}
	
}