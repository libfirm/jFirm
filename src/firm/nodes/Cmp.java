/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cmp extends Binop {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Cmp(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Cmp();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Cmp(Pointer ptr) {
		super(ptr);
	}

	@Override
	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_Cmp_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_Cmp_left(this.ptr, left.ptr);
	}

	@Override
	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_Cmp_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_Cmp_right(this.ptr, right.ptr);
	}

	public firm.Relation getRelation() {
		int _res = firm.bindings.binding_irnode.get_Cmp_relation(ptr);
		return firm.Relation.fromValue(_res);
	}

	public void setRelation(firm.Relation _val) {
		firm.bindings.binding_irnode.set_Cmp_relation(this.ptr, _val.value());
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
