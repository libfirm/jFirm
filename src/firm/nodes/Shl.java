/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Shl extends Binop {

	public Shl(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shl_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Shl_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shl_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Shl_right(this.ptr, right.ptr);
	}
	

	

	

	
	public static final int pnMax = 0;
}