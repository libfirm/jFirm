/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public abstract class Unop extends Node {

	

	protected Unop(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_unop_op(ptr));
	}
	
}