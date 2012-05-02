/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class IJmp extends Node {

	public IJmp(Pointer ptr) {
		super(ptr);
	}

	public Node getTarget() {
		return createWrapper(firm.bindings.binding_irnode.get_IJmp_target(ptr));
	}

	public void setTarget(Node target) {
		firm.bindings.binding_irnode.set_IJmp_target(this.ptr, target.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
