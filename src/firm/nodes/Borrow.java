/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Borrow extends Binop {

	public Borrow(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Borrow_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Borrow_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Borrow_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Borrow_right(this.ptr, right.ptr);
	}
	

	

	

	
	public static final int pnMax = 0;
}