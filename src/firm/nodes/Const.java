/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Const extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Const(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Const.val, new Factory());
	}

	public Const(Pointer ptr) {
		super(ptr);
	}

	public firm.TargetValue getTarval() {
		Pointer _res = firm.bindings.binding_irnode.get_Const_tarval(ptr);
		return new firm.TargetValue(_res);
	}

	public void setTarval(firm.TargetValue _val) {
		firm.bindings.binding_irnode.set_Const_tarval(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
