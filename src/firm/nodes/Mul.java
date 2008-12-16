/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mul extends Binop {

	public Mul(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Mul_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Mul_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Mul_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Mul_right(this.ptr, right.ptr);
	}
	

	

	

	
}