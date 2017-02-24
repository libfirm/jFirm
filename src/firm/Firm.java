package firm;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;

import firm.bindings.binding_firm_common;
import firm.bindings.binding_irflag;
import firm.bindings.binding_libc;
import firm.bindings.binding_target;
import firm.nodes.Nodes;

public final class Firm {

	public interface binding_callback extends Library {

		interface FirmCallback extends Callback {
			void callback(String expr, String file, int line);
		}

		void firm_set_assert_callback(FirmCallback handler);
	}

	public static int getMajorVersion() {
		return binding_firm_common.ir_get_version_major();
	}

	public static int getMinorVersion() {
		return binding_firm_common.ir_get_version_minor();
	}

	public static String getBuild() {
		return binding_firm_common.ir_get_version_build();
	}

	public static String getRevision() {
		return binding_firm_common.ir_get_version_revision();
	}

	private static binding_callback binding_cb = null;

	private static final binding_callback.FirmCallback handler = new binding_callback.FirmCallback() {
		@Override
		public void callback(String expr, String file, int line) {
			// throw new FirmAssertionException(expr, file, line);
			System.err.printf("Failed assert('%1s') in %2s:%3d\n", expr, file,
					line);
		}
	};

	public static binding_libc.SigHandler sigHandler = new binding_libc.SigHandler() {
		@Override
		public void callback(int arg) {
			throw new RuntimeException("Prog Aborted");
		}
	};

	public static void init() {
		init(null, new String[] {});
	}

	private static void do_option(String option) {
		if (binding_target.ir_target_option(option) != 1) {
			throw new IllegalArgumentException("Unknown option '" + option
					+ "'");
		}
	}

	/**
	 * Initializes the firm library. Must be called before using any operations
	 * of the firm library (except querying the version numbers) Must not be
	 * called more than once unless there was an finish() call.
	 */
	public static void init(String targetTriple, String[] targetOptions) {
		/* hack to catch asserts... */
		if (binding_cb == null) {
			binding_cb = (binding_callback) Native.loadLibrary("firm",
					binding_callback.class);
		}

		if (binding_cb != null) {
			try {
				binding_cb.firm_set_assert_callback(handler);
				System.out
						.println("Callback activated: firm_set_assert_callback found.");
			} catch (UnsatisfiedLinkError e) {
				/* not critical */
			}
		}

		// catch abort signal
		binding_libc.signal(/* SIGABRT */6, sigHandler);

		/* Setup code generation for host machine */
		binding_firm_common.ir_init_library();
		final Pointer target;
		if (targetTriple != null) {
			target = binding_target.ir_parse_machine_triple(targetTriple);
			if (target.equals(Pointer.NULL))
				throw new RuntimeException("Invalid target triple");
		} else {
			target = binding_target.ir_get_host_machine_triple();
		}
		int res = binding_target.ir_target_set_triple(target);
		binding_target.ir_free_machine_triple(target);
		if (res == 0)
			throw new RuntimeException("Could not initialize libFirm backend");
		for (String option : Backend.getOptions()) {
			do_option(option);
		}
		for (String option : targetOptions) {
			do_option(option);
		}
		binding_target.ir_target_init();

		/* disable automatic optimisations */
		binding_irflag.set_optimize(0);

		Nodes.init();
	}

	public static void enableOptimisations() {
		binding_irflag.set_optimize(1);
	}

	/**
	 * frees internal data structures of firm. After this call no firm operation
	 * must be performed anymore.
	 */
	public static void finish() {
		binding_firm_common.ir_finish();
	}

	private Firm() {
	}
}
