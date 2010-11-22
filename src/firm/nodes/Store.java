/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Store extends Node {

	public Store(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Store_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Store_mem(this.ptr, mem.ptr);
	}

	public Node getPtr() {
		return createWrapper(firm.bindings.binding_irnode.get_Store_ptr(ptr));
	}

	public void setPtr(Node ptr) {
		firm.bindings.binding_irnode.set_Store_ptr(this.ptr, ptr.ptr);
	}

	public Node getValue() {
		return createWrapper(firm.bindings.binding_irnode.get_Store_value(ptr));
	}

	public void setValue(Node value) {
		firm.bindings.binding_irnode.set_Store_value(this.ptr, value.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 1;

	/** control flow when exception occured */
	public static final int pnXExcept = 2;

	public static final int pnMax = 3;
}