/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class CopyB extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new CopyB(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_CopyB();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public CopyB(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_CopyB_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_CopyB_mem(this.ptr, mem.ptr);
	}

	public Node getDst() {
		return createWrapper(firm.bindings.binding_irnode.get_CopyB_dst(ptr));
	}

	public void setDst(Node dst) {
		firm.bindings.binding_irnode.set_CopyB_dst(this.ptr, dst.ptr);
	}

	public Node getSrc() {
		return createWrapper(firm.bindings.binding_irnode.get_CopyB_src(ptr));
	}

	public void setSrc(Node src) {
		firm.bindings.binding_irnode.set_CopyB_src(this.ptr, src.ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_CopyB_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_CopyB_type(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 1;

	/** control flow when exception occured */
	public static final int pnXExcept = 2;

	public static final int pnMax = 3;
}
