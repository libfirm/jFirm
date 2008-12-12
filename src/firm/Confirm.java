/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Confirm extends Node {

	
	public Confirm(Block block, Node val, Node bound, Mode mode) {
		super(binding_cons.new_r_Confirm(Graph.getCurrent().ptr, block.ptr, val.ptr, bound.ptr, mode.ptr));
	}
	

	protected Confirm(Pointer ptr) {
		super(ptr);
	}

	
	public Node getVal() {
		return createWrapper(binding.get_Confirm_val(ptr));
	}
	
	public Node getBound() {
		return createWrapper(binding.get_Confirm_bound(ptr));
	}
	
}