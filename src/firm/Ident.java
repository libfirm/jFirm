package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_ident;

public class Ident extends JNAWrapper {
	
	private final static binding_ident binding = Bindings.getIdentBinding();
	
	protected Ident(Pointer ptr) {
		super(ptr);
	}
	
	public Ident(String string) {
		this(binding.new_id_from_str(string));
	}
	
	public String getString() {
		return binding.get_id_str(ptr);
	}
	
	public String toString() {
		return getString();
	}
}
