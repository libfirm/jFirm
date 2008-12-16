/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Eor extends Binop {

	public Eor(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Eor_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Eor_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Eor_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Eor_right(this.ptr, right.ptr);
	}
	

	

	

	
}