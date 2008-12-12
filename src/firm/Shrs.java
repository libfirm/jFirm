/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Shrs extends Binop {

	
	public Shrs(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Shrs(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Shrs(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shrs_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shrs_right(ptr));
	}
	
}