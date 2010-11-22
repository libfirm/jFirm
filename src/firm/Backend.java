package firm;

import java.io.IOException;

import com.sun.jna.Pointer;

import firm.bindings.binding_be;
import firm.bindings.binding_iroptimize;
import firm.bindings.binding_libc;

public final class Backend {
	private static int runs = 0;

	private Backend() {
	}

	public static void createAssembler(String outputFileName,
			String compilationUnitName) throws IOException {
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

	public static void option(String option) {
		if (binding_be.be_parse_arg(option) != 1) {
			throw new IllegalArgumentException("Unknown option '" + option
					+ "'");
		}
	}
}
