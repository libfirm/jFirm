/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.bindings.binding_irop;

public class InstOf extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new InstOf(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_InstOf();
		Node.registerFactory(binding_irop.get_op_code(op), new Factory());
	}

	public InstOf(Pointer ptr) {
		super(ptr);
	}

	public Node getStore() {
		return createWrapper(firm.bindings.binding_irnode.get_InstOf_store(ptr));
	}

	public void setStore(Node store) {
		firm.bindings.binding_irnode.set_InstOf_store(this.ptr, store.ptr);
	}

	public Node getObj() {
		return createWrapper(firm.bindings.binding_irnode.get_InstOf_obj(ptr));
	}

	public void setObj(Node obj) {
		firm.bindings.binding_irnode.set_InstOf_obj(this.ptr, obj.ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_InstOf_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_InstOf_type(this.ptr, _val.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** checked object pointer */
	public static final int pnRes = 1;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 2;

	/** control flow when exception occured */
	public static final int pnXExcept = 3;

	public static final int pnMax = 4;
}
