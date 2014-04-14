/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Sel extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Sel(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Sel();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Sel(Pointer ptr) {
		super(ptr);
	}

	public Node getPtr() {
		return createWrapper(firm.bindings.binding_irnode.get_Sel_ptr(ptr));
	}

	public void setPtr(Node _ptr) {
		firm.bindings.binding_irnode.set_Sel_ptr(this.ptr, _ptr.ptr);
	}

	public Node getIndex() {
		return createWrapper(firm.bindings.binding_irnode.get_Sel_index(ptr));
	}

	public void setIndex(Node index) {
		firm.bindings.binding_irnode.set_Sel_index(this.ptr, index.ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_Sel_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_Sel_type(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
