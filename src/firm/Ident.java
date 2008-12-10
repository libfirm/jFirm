package firm;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.binding_ident;

public class Ident {
	
	private final static binding_ident binding = (binding_ident) Native.loadLibrary("firm", binding_ident.class);
	
	protected final Pointer ptr;
	
	protected Ident(Pointer ptr) {
		this.ptr = ptr;
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
