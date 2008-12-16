/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Shr extends Binop {

	public Shr(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shr_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Shr_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shr_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Shr_right(this.ptr, right.ptr);
	}
	

	

	

	
}