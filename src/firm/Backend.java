package firm;

import java.io.IOException;

import com.sun.jna.Pointer;

import firm.bindings.binding_be;
import firm.bindings.binding_iroptimize;
import firm.bindings.binding_libc;

public class Backend {
	
	public static void createAssembler(String outputFileName, String compilationUnitName) throws IOException {
		Pointer file = binding_libc.fopen(outputFileName, "w");
		if (file == null) {
			throw new IOException("Couldn't open output file (write access): " + outputFileName);
		}
		
		/* just to be sure we have no bad blocks left... */
		for (Graph graph : Program.getGraphs()) {
			binding_iroptimize.optimize_cf(graph.ptr);			
		}
		binding_be.be_main(file, compilationUnitName);
		binding_libc.fclose(file);
	}
	
	public static void option(String option) {
		if (binding_be.be_parse_arg(option) != 1) {
			throw new IllegalArgumentException("Unknown option '" + option + "'");
		}
	}
}
