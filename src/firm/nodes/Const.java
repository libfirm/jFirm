/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Const extends Node {

	public Const(Pointer ptr) {
		super(ptr);
	}

	public firm.TargetValue getTarval() {
		Pointer _res = firm.bindings.binding_irnode.get_Const_tarval(ptr);
		return new firm.TargetValue(_res);
	}

	public void setTarval(firm.TargetValue _val) {
		firm.bindings.binding_irnode.set_Const_tarval(this.ptr, _val.ptr);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
