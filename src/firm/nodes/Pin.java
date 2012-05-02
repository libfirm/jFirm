/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Pin extends Node {

	public Pin(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Pin_op(ptr));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Pin_op(this.ptr, op.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
