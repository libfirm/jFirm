/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Return extends Node {

	public Return(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Return_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Return_mem(this.ptr, mem.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}