/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Shrs extends Binop {

	public Shrs(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Shrs_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Shrs_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Shrs_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Shrs_right(this.ptr, right.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}