package firm.nodes;

import com.sun.jna.Pointer;

import firm.Graph;
import firm.Mode;
import firm.TargetValue;

public class Const extends Node {

	public Const(Pointer ptr) {
		super(ptr);
	}
	
	public Const(TargetValue value) {
		super(binding_cons.new_r_Const(Graph.getCurrent().ptr, value.ptr));
	}
	
	public Const(int value, Mode mode) {
		super(binding_cons.new_r_Const(Graph.getCurrent().ptr, (new TargetValue(value, mode)).ptr));		
	}
	
	public TargetValue getValue() {
		return new TargetValue(binding.get_Const_tarval(ptr));
	}
	
	public void setValue(TargetValue value) {
		binding.set_Const_tarval(ptr, value.ptr);
	}
}
