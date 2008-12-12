/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Mul extends Binop {

	
	public Mul(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Mul(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Mul(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Mul_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Mul_right(ptr));
	}
	
}