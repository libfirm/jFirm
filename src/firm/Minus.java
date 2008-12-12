/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Minus extends Unop {

	
	public Minus(Block block, Node op, Mode mode) {
		super(binding_cons.new_r_Minus(Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	

	protected Minus(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Minus_op(ptr));
	}
	
}