/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Align extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Align(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Align();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Align(Pointer ptr) {
		super(ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_Align_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_Align_type(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
