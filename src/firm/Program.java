package firm;

import com.sun.jna.Native;

import firm.bindings.binding_irprog;

public class Program {
	
	private static final binding_irprog binding = (binding_irprog) Native.loadLibrary("firm", binding_irprog.class);
	
	public static Type getGlobalType() {
		return new Type(binding.get_glob_type());
	}

}
