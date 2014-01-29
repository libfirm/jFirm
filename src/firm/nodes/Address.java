/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Address extends Entconst {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Address(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Address();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Address(Pointer ptr) {
		super(ptr);
	}

	public firm.Entity getEntity() {
		Pointer _res = firm.bindings.binding_irnode.get_Address_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		firm.bindings.binding_irnode.set_Address_entity(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
