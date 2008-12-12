/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Confirm extends Node {

	
	public Confirm(Block block, Node value, Node bound, int cmp) {
		super(binding_cons.new_r_Confirm(Graph.getCurrent().ptr, block.ptr, value.ptr, bound.ptr, cmp));
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
	

	
}