/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Bitcast extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Bitcast(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Bitcast();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Bitcast(Pointer ptr) {
		super(ptr);
	}

	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Bitcast_op(ptr));
	}

	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Bitcast_op(this.ptr, op.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
