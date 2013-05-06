/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.bindings.binding_irop;

public class End extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new End(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_End();
		Node.registerFactory(binding_irop.get_op_code(op), new Factory());
	}

	public End(Pointer ptr) {
		super(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
