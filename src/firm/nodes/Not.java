/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Not extends Unop {

	public Not(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Not_op(ptr));
	}

	public void setOp(Node op) {
		binding.set_Not_op(this.ptr, op.ptr);
	}
	

	

	

	
	public static final int pnMax = 0;
}