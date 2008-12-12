/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public abstract class Binop extends Node {

	

	protected Binop(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_binop_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_binop_right(ptr));
	}
	
}