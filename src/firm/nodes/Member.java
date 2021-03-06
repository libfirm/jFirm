/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Member extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Member(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Member();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Member(Pointer ptr) {
		super(ptr);
	}

	public Node getPtr() {
		return createWrapper(firm.bindings.binding_irnode.get_Member_ptr(ptr));
	}

	public void setPtr(Node _ptr) {
		firm.bindings.binding_irnode.set_Member_ptr(this.ptr, _ptr.ptr);
	}

	public firm.Entity getEntity() {
		Pointer _res = firm.bindings.binding_irnode.get_Member_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		firm.bindings.binding_irnode.set_Member_entity(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
