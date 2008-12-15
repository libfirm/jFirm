/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Confirm extends Node {

	
	public Confirm(Block block, Node value, Node bound, int cmp) {
		super(binding_cons.new_r_Confirm(firm.Graph.getCurrent().ptr, block.ptr, value.ptr, bound.ptr, cmp));
	}
	

	public Confirm(Pointer ptr) {
		super(ptr);
	}

	
	public Node getValue() {
		return createWrapper(binding.get_Confirm_value(ptr));
	}

	public void setValue(Node value) {
		binding.set_Confirm_value(this.ptr, value.ptr);
	}
	
	public Node getBound() {
		return createWrapper(binding.get_Confirm_bound(ptr));
	}

	public void setBound(Node bound) {
		binding.set_Confirm_bound(this.ptr, bound.ptr);
	}
	

	
	public int getCmp() {
		int _res = binding.get_Confirm_cmp(ptr);
		return _res;
	}
	

	
}