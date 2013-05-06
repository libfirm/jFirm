/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Load extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Load(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Load.val, new Factory());
	}

	public Load(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Load_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Load_mem(this.ptr, mem.ptr);
	}

	public Node getPtr() {
		return createWrapper(firm.bindings.binding_irnode.get_Load_ptr(ptr));
	}

	public void setPtr(Node ptr) {
		firm.bindings.binding_irnode.set_Load_ptr(this.ptr, ptr.ptr);
	}

	public firm.Mode getLoadMode() {
		Pointer _res = firm.bindings.binding_irnode.get_Load_mode(ptr);
		return new firm.Mode(_res);
	}

	public void setLoadMode(firm.Mode _val) {
		firm.bindings.binding_irnode.set_Load_mode(this.ptr, _val.ptr);
	}

	public firm.bindings.binding_irnode.ir_volatility getVolatility() {
		int _res = firm.bindings.binding_irnode.get_Load_volatility(ptr);
		return firm.bindings.binding_irnode.ir_volatility.getEnum(_res);
	}

	public void setVolatility(firm.bindings.binding_irnode.ir_volatility _val) {
		firm.bindings.binding_irnode.set_Load_volatility(this.ptr, _val.val);
	}

	public firm.bindings.binding_irnode.ir_align getUnaligned() {
		int _res = firm.bindings.binding_irnode.get_Load_unaligned(ptr);
		return firm.bindings.binding_irnode.ir_align.getEnum(_res);
	}

	public void setUnaligned(firm.bindings.binding_irnode.ir_align _val) {
		firm.bindings.binding_irnode.set_Load_unaligned(this.ptr, _val.val);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** result of load operation */
	public static final int pnRes = 1;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 2;

	/** control flow when exception occured */
	public static final int pnXExcept = 3;

	public static final int pnMax = 4;
}
