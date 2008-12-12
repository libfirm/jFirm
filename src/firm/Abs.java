/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Abs extends Unop {

	
	public Abs(Block block, Node op, Mode mode) {
		super(binding_cons.new_r_Abs(Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	

	protected Abs(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Abs_op(ptr));
	}
	
}