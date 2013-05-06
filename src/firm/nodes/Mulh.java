/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mulh extends Binop {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Mulh(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Mulh.val, new Factory());
	}

	public Mulh(Pointer ptr) {
		super(ptr);
	}

	@Override
	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_Mulh_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_Mulh_left(this.ptr, left.ptr);
	}

	@Override
	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_Mulh_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_Mulh_right(this.ptr, right.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
