/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public abstract class Unop extends Node {

	public Unop(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getOp() {
		return createWrapper(binding.get_unop_op(ptr));
	}

	
	public void setOp(Node op) {
		binding.set_unop_op(this.ptr, op.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
}