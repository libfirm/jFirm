/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Conv extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Conv(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Conv.val, new Factory());
	}

	public Conv(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Conv_op(ptr));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Conv_op(this.ptr, op.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
