/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public abstract class Binop extends Node {

	public Binop(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getLeft() {
		return createWrapper(binding.get_binop_left(ptr));
	}

	
	public void setLeft(Node left) {
		binding.set_binop_left(this.ptr, left.ptr);
	}
	
	
	public Node getRight() {
		return createWrapper(binding.get_binop_right(ptr));
	}

	
	public void setRight(Node right) {
		binding.set_binop_right(this.ptr, right.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
}