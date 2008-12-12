/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Shr extends Binop {

	
	public Shr(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Shr(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Shr(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shr_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shr_right(ptr));
	}
	
}