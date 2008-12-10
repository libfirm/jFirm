package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class Type {
	
	protected static final binding_typerep binding = Entity.binding;
	
	protected final Pointer ptr;
	
	protected Type(Pointer ptr) {
		this.ptr = ptr;
	}
	
}
