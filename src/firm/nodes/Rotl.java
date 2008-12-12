/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Rotl extends Binop {

	
	public Rotl(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Rotl(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	public Rotl(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Rotl_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Rotl_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Rotl_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Rotl_right(this.ptr, right.ptr);
	}
	
}