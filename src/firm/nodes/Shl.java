/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Shl extends Binop {

	public Shl(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Shl_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Shl_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Shl_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Shl_right(this.ptr, right.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}