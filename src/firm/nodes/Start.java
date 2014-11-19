/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Start extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Start(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Start();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Start(Pointer ptr) {
		super(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** initial memory */
	public static final int pnM = 0;

	/** frame base pointer */
	public static final int pnPFrameBase = 1;

	/** function arguments */
	public static final int pnTArgs = 2;

	public static final int pnMax = 3;
}
