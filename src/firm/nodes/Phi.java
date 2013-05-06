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
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Phi.val, new Factory());
	}

	public Phi(Pointer ptr) {
		super(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
