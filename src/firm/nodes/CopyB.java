/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class CopyB extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new CopyB(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_CopyB();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public CopyB(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_CopyB_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_CopyB_mem(this.ptr, mem.ptr);
	}

	public Node getDst() {
		return createWrapper(firm.bindings.binding_irnode.get_CopyB_dst(ptr));
	}

	public void setDst(Node dst) {
		firm.bindings.binding_irnode.set_CopyB_dst(this.ptr, dst.ptr);
	}

	public Node getSrc() {
		return createWrapper(firm.bindings.binding_irnode.get_CopyB_src(ptr));
	}

	public void setSrc(Node src) {
		firm.bindings.binding_irnode.set_CopyB_src(this.ptr, src.ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_CopyB_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_CopyB_type(this.ptr, _val.ptr);
	}

	public firm.bindings.binding_irnode.ir_volatility getVolatility() {
		int _res = firm.bindings.binding_irnode.get_CopyB_volatility(ptr);
		return firm.bindings.binding_irnode.ir_volatility.getEnum(_res);
	}

	public void setVolatility(firm.bindings.binding_irnode.ir_volatility _val) {
		firm.bindings.binding_irnode.set_CopyB_volatility(this.ptr, _val.val);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
