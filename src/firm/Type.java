package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class Type extends JNAWrapper {
	
	protected static final binding_typerep binding = Entity.binding;
	
	protected Type(Pointer ptr) {
		super(ptr);
	}
	
}
