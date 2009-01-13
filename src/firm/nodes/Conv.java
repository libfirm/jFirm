/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Conv extends Unop {

	public Conv(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getOp() {
		return createWrapper(binding.get_Conv_op(ptr));
	}

	@Override
	public void setOp(Node op) {
		binding.set_Conv_op(this.ptr, op.ptr);
	}
	

	

	

	
	public static final int pnMax = 0;
}