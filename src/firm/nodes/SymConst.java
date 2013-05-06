/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class SymConst extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new SymConst(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_SymConst.val, new Factory());
	}

	public SymConst(Pointer ptr) {
		super(ptr);
	}

	public firm.Entity getEntity() {
		Pointer _res = firm.bindings.binding_irnode.get_SymConst_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		firm.bindings.binding_irnode.set_SymConst_entity(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
