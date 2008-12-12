/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Eor extends Binop {

	
	public Eor(Block block, Node left, Node right, Mode mode) {
		super(binding_cons.new_r_Eor(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	

	public Eor(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Eor_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Eor_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Eor_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Eor_right(this.ptr, right.ptr);
	}
	

	
}