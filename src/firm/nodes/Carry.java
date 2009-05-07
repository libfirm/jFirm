/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Carry extends Binop {

	public Carry(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Carry_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Carry_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Carry_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Carry_right(this.ptr, right.ptr);
	}
	

	

	

	
	public static final int pnMax = 0;
}