package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_initializer_kind_t;

public class Initializer extends JNAWrapper {

	protected final static binding_typerep binding = Entity.binding; 
	
	Initializer(Pointer ptr) {
		super(ptr);
	}
	
	public Initializer(Node node) {
		super(binding.create_initializer_const(node.ptr));
	}
	
	public Initializer(TargetValue tarval) {
		super(binding.create_initializer_tarval(tarval.ptr));
	}

	public Initializer(int entries) {
		super(binding.create_initializer_compound(entries));
	}
	
	public final ir_initializer_kind_t getKind() {
		int val = binding.get_initializer_kind(ptr);
		return ir_initializer_kind_t.getEnum(val);
	}
	
	public final static Initializer getNull() {
		Pointer p = binding.get_initializer_null();
		return new Initializer(p);
	}
	
	public final Node getConstValue() {
		Pointer p = binding.get_initializer_const_value(ptr);
		return new Node(p);
	}
	
	public final TargetValue getTarvalValue() {
		Pointer p = binding.get_initializer_tarval_value(ptr);
		return new TargetValue(p);
	}
	
	public final int getCompoundNEntries() {
		return binding.get_initializer_compound_n_entries(ptr);
	}
	
	public final void setCompoundValue(int index, Initializer value) {
		binding.set_initializer_compound_value(ptr, index, value.ptr);
	}

	public final Initializer getCompoundValue(int index) {
		Pointer p = binding.get_initializer_compound_value(ptr, index);
		return new Initializer(p);
	}
	
}
