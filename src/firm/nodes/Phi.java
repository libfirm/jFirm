/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Phi extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Phi(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Phi();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Phi(Pointer ptr) {
		super(ptr);
	}

	public int getLoop() {
		int _res = firm.bindings.binding_irnode.get_Phi_loop(ptr);
		return _res;
	}

	public void setLoop(int _val) {
		firm.bindings.binding_irnode.set_Phi_loop(this.ptr, _val);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
