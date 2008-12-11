package firm;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.binding_be;
import firm.bindings.binding_libc;

public class Backend {
	protected static final binding_be binding = (binding_be) Native.loadLibrary("firm", binding_be.class);
	protected static final binding_libc binding_c = (binding_libc) Native.loadLibrary("c", binding_libc.class);
	
	public static void createAssembler(String outputFileName, String compilationUnitName) {
		Pointer file = binding_c.fopen(outputFileName, "w");
		if (file == Pointer.NULL) {
			throw new RuntimeException("Couldn't open output file");
		}
		binding.be_main(file, compilationUnitName);
		binding_c.fclose(file);
	}
	
	public static void option(String option) {
		if (binding.be_parse_arg(option) != 1) {
			throw new IllegalArgumentException("Unknown option '" + option + "'");
		}
	}
}
