/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Const extends Node {

	
	public Const(firm.TargetValue tarval) {
		super(binding_cons.new_r_Const(firm.Graph.getCurrent().ptr, tarval.ptr));
	}
	

	public Const(Pointer ptr) {
		super(ptr);
	}

	

	
	public firm.TargetValue getTarval() {
		Pointer _res = binding.get_Const_tarval(ptr);
		return new firm.TargetValue(_res);
	}

	public void setTarval(firm.TargetValue _val) {
		binding.set_Const_tarval(this.ptr, _val.ptr);
	}
	

	
	public Const(int value, firm.Mode mode) {
		this(new firm.TargetValue(value, mode));
	}

	
}