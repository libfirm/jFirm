/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Call extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Call(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Call();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Call(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Call_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Call_mem(this.ptr, mem.ptr);
	}

	public Node getPtr() {
		return createWrapper(firm.bindings.binding_irnode.get_Call_ptr(ptr));
	}

	public void setPtr(Node ptr) {
		firm.bindings.binding_irnode.set_Call_ptr(this.ptr, ptr.ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_Call_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_Call_type(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** tuple containing all results */
	public static final int pnTResult = 1;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 2;

	/** control flow when exception occured */
	public static final int pnXExcept = 3;

	public static final int pnMax = 4;
}
