/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Return extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Return(ptr);
		}
	}

	static void init() {
		Node.registerFactory(firm.bindings.binding_irnode.ir_opcode.iro_Return.val, new Factory());
	}

	public Return(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Return_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Return_mem(this.ptr, mem.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
