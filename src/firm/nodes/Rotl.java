/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Rotl extends Binop {

	public Rotl(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Rotl_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Rotl_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Rotl_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Rotl_right(this.ptr, right.ptr);
	}
	

	

	

	
}