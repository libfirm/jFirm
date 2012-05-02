/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Bound extends Node {

	public Bound(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Bound_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Bound_mem(this.ptr, mem.ptr);
	}

	public Node getIndex() {
		return createWrapper(firm.bindings.binding_irnode.get_Bound_index(ptr));
	}

	public void setIndex(Node index) {
		firm.bindings.binding_irnode.set_Bound_index(this.ptr, index.ptr);
	}

	public Node getLower() {
		return createWrapper(firm.bindings.binding_irnode.get_Bound_lower(ptr));
	}

	public void setLower(Node lower) {
		firm.bindings.binding_irnode.set_Bound_lower(this.ptr, lower.ptr);
	}

	public Node getUpper() {
		return createWrapper(firm.bindings.binding_irnode.get_Bound_upper(ptr));
	}

	public void setUpper(Node upper) {
		firm.bindings.binding_irnode.set_Bound_upper(this.ptr, upper.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** the checked index */
	public static final int pnRes = 1;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 2;

	/** control flow when exception occured */
	public static final int pnXExcept = 3;

	public static final int pnMax = 4;
}
