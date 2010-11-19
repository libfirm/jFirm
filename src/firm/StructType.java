package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_tv;

public class StructType extends CompoundType {
	StructType(Pointer ptr) {
		super(ptr);
	}

	public StructType(Ident name) {
		super(binding_tv.new_type_struct(name.ptr));
	}

	public StructType(String name) {
		this(new Ident(name));
	}
}
