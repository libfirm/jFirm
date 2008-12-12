/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Shl extends Binop {

	
	public Shl(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Shl(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Shl(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shl_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shl_right(ptr));
	}
	
}