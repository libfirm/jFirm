/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Const extends Node {

	public Const(Pointer ptr) {
		super(ptr);
	}

	

	
	public firm.TargetValue getTarval() {
		Pointer _res = binding_irnode.get_Const_tarval(ptr);
		return new firm.TargetValue(_res);
	}

	public void setTarval(firm.TargetValue _val) {
		binding_irnode.set_Const_tarval(this.ptr, _val.ptr);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}