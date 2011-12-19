package firm;

import firm.bindings.binding_lowering;

/**
 * Class containing various static utility functions
 */
public class Util {

	/**
	 * This class only contains static utility functions, creating an instance
	 * makes no sense
	 */
	private Util() {
	}

	/**
	 * Replace Sel nodes by explicit address arithmetic
	 */
	public static void lowerSels() {
		binding_lowering.lower_highlevel();
	}
}
