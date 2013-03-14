/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public abstract class Unop extends Node {

	public Unop(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_irn_n(ptr, 0));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_irn_n(this.ptr, 0, op.ptr);
	}

	public static final int pnMax = 0;
}
