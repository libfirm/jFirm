/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class IJmp extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new IJmp(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_IJmp();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public IJmp(Pointer ptr) {
		super(ptr);
	}

	public Node getTarget() {
		return createWrapper(firm.bindings.binding_irnode.get_IJmp_target(ptr));
	}

	public void setTarget(Node target) {
		firm.bindings.binding_irnode.set_IJmp_target(this.ptr, target.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
