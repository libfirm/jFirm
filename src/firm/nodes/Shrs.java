/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Shrs extends Binop {

	
	public Shrs(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Shrs(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	public Shrs(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shrs_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Shrs_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shrs_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Shrs_right(this.ptr, right.ptr);
	}
	

	
}