/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Sync extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Sync(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Sync.val, new Factory());
	}

	public Sync(Pointer ptr) {
		super(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
