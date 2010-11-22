/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Id extends Node {

	public Id(Pointer ptr) {
		super(ptr);
	}

	public Node getPred() {
		return createWrapper(firm.bindings.binding_irnode.get_Id_pred(ptr));
	}

	public void setPred(Node pred) {
		firm.bindings.binding_irnode.set_Id_pred(this.ptr, pred.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}