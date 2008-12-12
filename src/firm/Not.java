/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Not extends Binop {

	
	public Not(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Not(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Not(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Not_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Not_right(ptr));
	}
	
}