/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Not extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Not(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Not.val, new Factory());
	}

	public Not(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Not_op(ptr));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Not_op(this.ptr, op.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
