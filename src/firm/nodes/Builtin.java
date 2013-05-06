/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Builtin extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Builtin(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Builtin.val, new Factory());
	}

	public Builtin(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Builtin_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Builtin_mem(this.ptr, mem.ptr);
	}

	public firm.bindings.binding_ircons.ir_builtin_kind getKind() {
		int _res = firm.bindings.binding_irnode.get_Builtin_kind(ptr);
		return firm.bindings.binding_ircons.ir_builtin_kind.getEnum(_res);
	}

	public void setKind(firm.bindings.binding_ircons.ir_builtin_kind _val) {
		firm.bindings.binding_irnode.set_Builtin_kind(this.ptr, _val.val);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_Builtin_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_Builtin_type(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	public static final int pnMax = 1;
}
