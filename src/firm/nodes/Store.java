/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Store extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Store(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Store();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

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

	public void setPtr(Node _ptr) {
		firm.bindings.binding_irnode.set_Store_ptr(this.ptr, _ptr.ptr);
	}

	public Node getValue() {
		return createWrapper(firm.bindings.binding_irnode.get_Store_value(ptr));
	}

	public void setValue(Node value) {
		firm.bindings.binding_irnode.set_Store_value(this.ptr, value.ptr);
	}

	public firm.bindings.binding_irnode.ir_volatility getVolatility() {
		int _res = firm.bindings.binding_irnode.get_Store_volatility(ptr);
		return firm.bindings.binding_irnode.ir_volatility.getEnum(_res);
	}

	public void setVolatility(firm.bindings.binding_irnode.ir_volatility _val) {
		firm.bindings.binding_irnode.set_Store_volatility(this.ptr, _val.val);
	}

	public firm.bindings.binding_irnode.ir_align getUnaligned() {
		int _res = firm.bindings.binding_irnode.get_Store_unaligned(ptr);
		return firm.bindings.binding_irnode.ir_align.getEnum(_res);
	}

	public void setUnaligned(firm.bindings.binding_irnode.ir_align _val) {
		firm.bindings.binding_irnode.set_Store_unaligned(this.ptr, _val.val);
	}

	@Override
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
