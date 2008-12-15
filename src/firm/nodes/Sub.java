/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Sub extends Binop {

	
	public Sub(Block block, Node left, Node right, firm.Mode mode) {
		super(binding_cons.new_r_Sub(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	public Sub(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Sub_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Sub_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Sub_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Sub_right(this.ptr, right.ptr);
	}
	

	

	

	
}