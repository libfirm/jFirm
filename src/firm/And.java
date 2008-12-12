/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class And extends Binop {

	
	public And(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_And(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected And(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_And_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_And_right(ptr));
	}
	
}