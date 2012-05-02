/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cast extends Unop {

	public Cast(Pointer ptr) {
		super(ptr);
	}

	@Override
	public Node getOp() {
		return createWrapper(firm.bindings.binding_irnode.get_Cast_op(ptr));
	}

	@Override
	public void setOp(Node op) {
		firm.bindings.binding_irnode.set_Cast_op(this.ptr, op.ptr);
	}

	public firm.Type getType() {
		Pointer _res = firm.bindings.binding_irnode.get_Cast_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		firm.bindings.binding_irnode.set_Cast_type(this.ptr, _val.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
