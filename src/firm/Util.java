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
	 * and similar lowering transformations for a specific graph.
	 */
	public static void lowerSels(Graph graph) {
		binding_lowering.lower_highlevel_graph(graph.ptr);
	}

	/**
	 * Replace Sel nodes by explicit address arithmetic
	 * and similar lowering transformations in the special 'const graph'.
	 */
	public static void lowerSelsConstCode() {
		binding_lowering.lower_const_code();
	}

	/**
	 * Call lowerSels on all graphs and lowerSelsConstCode
	 */
	public static void lowerSels() {
		binding_lowering.lower_highlevel();
	}
}
