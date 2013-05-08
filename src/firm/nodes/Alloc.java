/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.bindings.binding_irop;

public class Alloc extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Alloc(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Alloc();
		Node.registerFactory(binding_irop.get_op_code(op), new Factory());
	}

	public Alloc(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Alloc_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Alloc_mem(this.ptr, mem.ptr);
	}

	public Node getSize() {
		return createWrapper(firm.bindings.binding_irnode.get_Alloc_size(ptr));
	}

	public void setSize(Node size) {
		firm.bindings.binding_irnode.set_Alloc_size(this.ptr, size.ptr);
	}

	public int getAlignment() {
		int _res = firm.bindings.binding_irnode.get_Alloc_alignment(ptr);
		return _res;
	}

	public void setAlignment(int _val) {
		firm.bindings.binding_irnode.set_Alloc_alignment(this.ptr, _val);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** pointer to newly allocated memory */
	public static final int pnRes = 1;

	public static final int pnMax = 2;
}
