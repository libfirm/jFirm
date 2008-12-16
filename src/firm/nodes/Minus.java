/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Minus extends Unop {

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