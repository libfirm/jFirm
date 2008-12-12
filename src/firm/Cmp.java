/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Cmp extends Binop {

	
	public Cmp(Block block, Node left, Node right) {
		super(binding_cons.new_r_Cmp(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr));
	}
	

	protected Cmp(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Cmp_left(ptr));
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Cmp_right(ptr));
	}
	
}