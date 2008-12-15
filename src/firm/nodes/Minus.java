/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Minus extends Unop {

	
	public Minus(Block block, Node op, firm.Mode mode) {
		super(binding_cons.new_r_Minus(firm.Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	

	public Minus(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Minus_op(ptr));
	}

	public void setOp(Node op) {
		binding.set_Minus_op(this.ptr, op.ptr);
	}
	

	

	
}