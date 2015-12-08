package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class PrimitiveType extends Type {

	PrimitiveType(Pointer ptr) {
		super(ptr);
	}

	public PrimitiveType(Mode mode) {
		super(binding_typerep.new_type_primitive(mode.ptr));
	}

	@Override
	public void finishLayout() {
	}
}
