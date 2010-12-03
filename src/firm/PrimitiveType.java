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

	Type getBaseType() {
		return Type.createWrapper(binding_typerep.get_primitive_base_type(ptr));
	}

	public void setBaseType(Type type) {
		binding_typerep.set_primitive_base_type(ptr, type.ptr);
	}

	public void setMode(Mode mode) {
		binding_typerep.set_type_mode(ptr, mode.ptr);
	}

	@Override
	public void finishLayout() {
	}
}
