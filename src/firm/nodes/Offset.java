/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Offset extends Entconst {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Offset(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Offset();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Offset(Pointer ptr) {
		super(ptr);
	}

	public firm.Entity getEntity() {
		Pointer _res = firm.bindings.binding_irnode.get_Offset_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		firm.bindings.binding_irnode.set_Offset_entity(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
