/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Proj extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Proj(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Proj();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Proj(Pointer ptr) {
		super(ptr);
	}

	public Node getPred() {
		return createWrapper(firm.bindings.binding_irnode.get_Proj_pred(ptr));
	}

	public void setPred(Node pred) {
		firm.bindings.binding_irnode.set_Proj_pred(this.ptr, pred.ptr);
	}

	public int getProj() {
		com.sun.jna.NativeLong _res = firm.bindings.binding_irnode.get_Proj_proj(ptr);
		return _res.intValue();
	}

	public void setProj(int _val) {
		firm.bindings.binding_irnode.set_Proj_proj(this.ptr, new com.sun.jna.NativeLong(_val));
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
