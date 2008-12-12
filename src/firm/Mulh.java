/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Mulh extends Binop {

	
	public Mulh(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Mulh(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Mulh(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Mulh_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Mulh_right(ptr));
	}
	
}