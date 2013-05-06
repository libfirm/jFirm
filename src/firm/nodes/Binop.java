/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.bindings.binding_irop;

public abstract class Binop extends Node {

	public Binop(Pointer ptr) {
		super(ptr);
	}

	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_binop_left(ptr));
	}

	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_binop_left(this.ptr, left.ptr);
	}

	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_binop_right(ptr));
	}

	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_binop_right(this.ptr, right.ptr);
	}

	public static final int pnMax = 0;
}
