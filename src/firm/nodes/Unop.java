/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public abstract class Unop extends Node {

	public Unop(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_unop_op(ptr));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_unop_op(this.ptr, op.ptr);
	}

	public static final int pnMax = 0;
}
