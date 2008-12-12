/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Cmp extends Binop {

	
	public Cmp(Block block, Node left, Node right) {
		super(binding_cons.new_r_Cmp(Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr));
	}
	

	public Cmp(Pointer ptr) {
		super(ptr);
	}

	
	public Node getLeft() {
		return createWrapper(binding.get_Cmp_left(ptr));
	}

	public void setLeft(Node left) {
		binding.set_Cmp_left(this.ptr, left.ptr);
	}
	
	public Node getRight() {
		return createWrapper(binding.get_Cmp_right(ptr));
	}

	public void setRight(Node right) {
		binding.set_Cmp_right(this.ptr, right.ptr);
	}
	
}