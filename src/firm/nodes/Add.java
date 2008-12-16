/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Add extends Binop {

	public Add(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Add_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Add_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Add_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Add_right(this.ptr, right.ptr);
	}
	

	

	

	
}