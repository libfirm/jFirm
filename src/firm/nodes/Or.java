/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Or extends Binop {

	public Or(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Or_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Or_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Or_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Or_right(this.ptr, right.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}