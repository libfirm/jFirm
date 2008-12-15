/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Conv extends Unop {

	
	public Conv(Block block, Node op, firm.Mode mode) {
		super(binding_cons.new_r_Conv(firm.Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	

	public Conv(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Conv_op(ptr));
	}

	public void setOp(Node op) {
		binding.set_Conv_op(this.ptr, op.ptr);
	}
	

	

	
}