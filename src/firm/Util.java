package firm;

import com.sun.jna.Native;

import firm.bindings.binding_irgmod;
import firm.bindings.binding_irvrfy;
import firm.bindings.binding_lowering;

/**
 * Class containing various static utility functions
 */
public class Util {
	protected static binding_irvrfy binding_vrfy = (binding_irvrfy) Native.loadLibrary("firm", binding_irvrfy.class);
	protected static binding_irgmod binding_mod = (binding_irgmod) Native.loadLibrary("firm", binding_irgmod.class);
	protected static binding_lowering binding_lower = (binding_lowering) Native.loadLibrary("firm", binding_lowering.class);
	
	/**
	 * This class only contains static utility functions,
	 * creating an instance makes no sense
	 */
	private Util() {
	}
	
	/**
	 * Replace Sel nodes by explicit address arithmetic
	 */
	public static void lowerSels() {
		binding_lower.lower_highlevel(0);
	}
}
