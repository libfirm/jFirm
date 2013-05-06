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
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Start.val, new Factory());
	}

	public Start(Pointer ptr) {
		super(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** control flow */
	public static final int pnXInitialExec = 0;

	/** initial memory */
	public static final int pnM = 1;

	/** frame base pointer */
	public static final int pnPFrameBase = 2;

	/** function arguments */
	public static final int pnTArgs = 3;

	public static final int pnMax = 4;
}
