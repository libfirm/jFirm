package firm;

import java.io.IOException;

import com.sun.jna.LastErrorException;
import com.sun.jna.Pointer;

import firm.bindings.binding_be;
import firm.bindings.binding_iroptimize;
import firm.bindings.binding_libc;
import firm.bindings.binding_target;

public final class Backend {
	private static int runs = 0;

	private Backend() {
	}

	public static void createAssembler(String outputFileName,
			String compilationUnitName) throws IOException, LastErrorException {
		/* running the backend twice is currently not supported */
		assert runs == 0;
		runs++;

		Pointer file = binding_libc.fopen(outputFileName, "w");
		if (file == null) {
			throw new IOException("Couldn't open output file (write access): "
					+ outputFileName);
		}

		try {
			/* just to be sure we have no bad blocks left... */
			for (Graph graph : Program.getGraphs()) {
				binding_iroptimize.optimize_cf(graph.ptr);
			}
			binding_be.be_main(file, compilationUnitName);
		} finally {
			binding_libc.fclose(file);
		}
	}

	/**
	 * Target-lowering pass. This should be run once on a program before
	 * using createAssembler. You can should perform other optimisations
	 * after using this method and before using createAssembler!
	 */
	public static void lowerForTarget() {
		binding_be.be_lower_for_target();
	}

	public static void option(String option) {
		if (binding_target.ir_target_option(option) != 1) {
			throw new IllegalArgumentException("Unknown option '" + option
					+ "'");
		}
	}

	public static Mode getFloatArithmeticMode() {
		Pointer p = binding_target.ir_target_float_arithmetic_mode();
		/* In soft-float mode, there will be no float mode set. */
		if (p == null)
			return null;
		return new Mode(p);
	}
}
