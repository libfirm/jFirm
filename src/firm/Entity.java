package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_typerep;

public class Entity extends JNAWrapper {
	
	protected final static binding_typerep binding = Bindings.getTypeRepBinding(); 
	
	protected Entity(Pointer ptr) {
		super(ptr);
	}
	
	public Entity(Type owner, Ident name, Type type) {
		this(binding.new_entity(owner.ptr, name.ptr, type.ptr));
	}
	
	public void free() {
		binding.free_entity(ptr);
	}
}
