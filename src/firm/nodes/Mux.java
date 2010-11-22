/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mux extends Node {

	public Mux(Pointer ptr) {
		super(ptr);
	}

	public Node getSel() {
		return createWrapper(firm.bindings.binding_irnode.get_Mux_sel(ptr));
	}

	public void setSel(Node sel) {
		firm.bindings.binding_irnode.set_Mux_sel(this.ptr, sel.ptr);
	}

	public Node getFalse() {
		return createWrapper(firm.bindings.binding_irnode.get_Mux_false(ptr));
	}

	public void setFalse(Node _false) {
		firm.bindings.binding_irnode.set_Mux_false(this.ptr, _false.ptr);
	}

	public Node getTrue() {
		return createWrapper(firm.bindings.binding_irnode.get_Mux_true(ptr));
	}

	public void setTrue(Node _true) {
		firm.bindings.binding_irnode.set_Mux_true(this.ptr, _true.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}