/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Minus extends Node {

	public Minus(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Minus_op(ptr));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Minus_op(this.ptr, op.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
