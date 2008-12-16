/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class And extends Binop {

	public And(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_And_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_And_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_And_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_And_right(this.ptr, right.ptr);
	}
	

	

	

	
}