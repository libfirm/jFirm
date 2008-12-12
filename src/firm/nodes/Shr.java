/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Shr extends Binop {

	
	public Shr(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Shr(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	public Shr(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shr_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Shr_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shr_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Shr_right(this.ptr, right.ptr);
	}
	

	
}