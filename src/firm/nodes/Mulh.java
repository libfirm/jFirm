/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mulh extends Binop {

	public Mulh(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Mulh_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Mulh_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Mulh_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Mulh_right(this.ptr, right.ptr);
	}
	

	

	

	
}