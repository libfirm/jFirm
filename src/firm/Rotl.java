/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Rotl extends Binop {

	
	public Rotl(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Rotl(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Rotl(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Rotl_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Rotl_right(ptr));
	}
	
}