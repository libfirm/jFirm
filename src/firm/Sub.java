/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Sub extends Binop {

	
	public Sub(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Sub(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Sub(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Sub_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Sub_right(ptr));
	}
	
}