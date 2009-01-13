package firm;

import com.sun.jna.Pointer;

public class PrimitiveType extends Type {

	public PrimitiveType(Pointer ptr) {
		super(ptr);
	}
	
	public PrimitiveType(Ident name, Mode mode) {
		super(binding.new_type_primitive(name.ptr, mode.ptr));
	}
	
	public PrimitiveType(String name, Mode mode) {
		this(new Ident(name), mode);
	}
	
	Type getBaseType() {
		return Type.createWrapper(binding.get_primitive_base_type(ptr));
	}
	
	public void setBaseType(Type type) {
		binding.set_primitive_base_type(ptr, type.ptr);
	}
	
	public void setMode(Mode mode) {
		binding.set_type_mode(ptr, mode.ptr);
	}
	
	@Override
	public void fixed() {
	}
}
