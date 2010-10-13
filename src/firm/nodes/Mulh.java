/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mulh extends Binop {

	public Mulh(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_Mulh_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_Mulh_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_Mulh_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_Mulh_right(this.ptr, right.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}