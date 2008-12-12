/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Or extends Binop {

	
	public Or(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Or(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Or(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Or_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Or_right(ptr));
	}
	
}