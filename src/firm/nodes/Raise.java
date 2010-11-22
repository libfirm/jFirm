/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Raise extends Node {

	public Raise(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Raise_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Raise_mem(this.ptr, mem.ptr);
	}

	public Node getExoPtr() {
		return createWrapper(firm.bindings.binding_irnode.get_Raise_exo_ptr(ptr));
	}

	public void setExoPtr(Node exo_ptr) {
		firm.bindings.binding_irnode.set_Raise_exo_ptr(this.ptr, exo_ptr.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** control flow to exception handler */
	public static final int pnX = 1;

	public static final int pnMax = 2;
}