/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Add extends Binop {

	
	public Add(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Add(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	protected Add(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Add_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Add_right(ptr));
	}
	
}