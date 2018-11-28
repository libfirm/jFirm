package firm;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import com.sun.jna.LastErrorException;
import com.sun.jna.Pointer;

import firm.bindings.binding_be;
import firm.bindings.binding_iroptimize;
import firm.bindings.binding_libc;
import firm.bindings.binding_target;

public final class Backend {
	private static int runs = 0;

	private static List<String> options = new ArrayList<String>();

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

	/**
	 * Add a backend option. The option is not yet sent to this
	 * backend; instead, Firm.init takes care of that.
	 */
	public static void option(String option) {
		options.add(option);
	}

	/**
	 * Return the list of options passed to previous calls to
	 * option. After this method return, the option list is
	 * cleared.
	 */
	public static List<String> getOptions() {
		List<String> result = options;
		options = new ArrayList<String>();
		return result;
	}

	public static Mode getFloatArithmeticMode() {
		Pointer p = binding_target.ir_target_float_arithmetic_mode();
		/* In soft-float mode, there will be no float mode set. */
		if (p == null)
			return null;
		return new Mode(p);
	}

	/**
	 * Returns the prefix that goes in front of function/method
	 * labels on the target architecture (e.g. "_" for Apple).
	 */
	public static String getPlatformUserLabelPrefix() {
		byte raw = binding_target.ir_platform_user_label_prefix();
		if (raw == 0) {
			return "";
		} else {
			return new String(new byte[] { raw });
		}
	}
}
