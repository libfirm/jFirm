/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Or extends Binop {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Or(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Or.val, new Factory());
	}

	public Or(Pointer ptr) {
		super(ptr);
	}

	@Override
	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_Or_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_Or_left(this.ptr, left.ptr);
	}

	@Override
	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_Or_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_Or_right(this.ptr, right.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
