/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Or extends Binop {

	
	public Or(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Or(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	public Or(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Or_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Or_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Or_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Or_right(this.ptr, right.ptr);
	}
	

	
}