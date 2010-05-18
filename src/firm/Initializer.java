package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_initializer_kind_t;
import firm.nodes.Const;
import firm.nodes.Node;

public class Initializer extends JNAWrapper {

	protected final static binding_typerep binding = Entity.binding; 
	
	Initializer(Pointer ptr) {
		super(ptr);
	}
	
	/** Creates an simple initializer with a value constructed
	 * in the const-graph */ 
	public Initializer(Node node) {
		super(binding.create_initializer_const(node.ptr));
	}

	/**
	 * Creates a simple initializer. The value is specified as
	 * a TargetValue
	 * @param tarval   initializer value
	 */
	public Initializer(TargetValue tarval) {
		super(binding.create_initializer_tarval(tarval.ptr));
	}

	/**
	 * Create a compound initializer (an initializer that contains a list
	 * of sub-initializer). Compound initializers are used to initialize
	 * class, struct and array types.
	 * @param entries    Number of sub-initializers
	 */
	public Initializer(int n_entries) {
		super(binding.create_initializer_compound(n_entries));
	}
	
	public final ir_initializer_kind_t getKind() {
		int val = binding.get_initializer_kind(ptr);
		return ir_initializer_kind_t.getEnum(val);
	}
	
	/**
	 * Return the Null-initializer which initializes the value
	 * with null-bits
	 */
	public final static Initializer getNull() {
		Pointer p = binding.get_initializer_null();
		return new Initializer(p);
	}
	
	public final Const getConstValue() {
		Pointer p = binding.get_initializer_const_value(ptr);
		return new Const(p);
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
