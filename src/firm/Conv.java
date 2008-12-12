/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Conv extends Unop {

	
	public Conv(Block block, Node op, Mode mode) {
		super(binding_cons.new_r_Conv(Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	

	protected Conv(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Conv_op(ptr));
	}
	
}