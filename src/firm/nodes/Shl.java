/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Shl extends Binop {

	
	public Shl(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Shl(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	public Shl(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Shl_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Shl_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Shl_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Shl_right(this.ptr, right.ptr);
	}
	

	
}