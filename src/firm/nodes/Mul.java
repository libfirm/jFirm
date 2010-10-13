/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mul extends Binop {

	public Mul(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_Mul_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_Mul_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_Mul_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_Mul_right(this.ptr, right.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}