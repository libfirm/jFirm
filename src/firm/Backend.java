package firm;

import java.io.IOException;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_be;
import firm.bindings.binding_iroptimize;
import firm.bindings.binding_libc;

public class Backend {
	protected static final binding_be binding = Bindings.getBeBinding();
	protected static final binding_libc binding_c = Bindings.getLibcBinding();
	protected static final binding_iroptimize binding_opt = Bindings.getIrOptimizeBinding();
	
	public static void createAssembler(String outputFileName, String compilationUnitName) throws IOException {
		Pointer file = binding_c.fopen(outputFileName, "w");
		if (file == null) {
			throw new IOException("Couldn't open output file (write access): " + outputFileName);
		}
		
		/* just to be sure we have no bad blocks left... */
		for (Graph graph : Program.getGraphs()) {
			binding_opt.optimize_cf(graph.ptr);			
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
