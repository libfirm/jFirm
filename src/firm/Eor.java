/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Eor extends Binop {

	
	public Eor(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Eor(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Eor(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Eor_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Eor_right(ptr));
	}
	
}