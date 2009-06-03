package firm;

import com.sun.jna.Native;

import firm.bindings.binding_irgmod;
import firm.bindings.binding_irvrfy;
import firm.bindings.binding_lowering;
import firm.nodes.Cmp;

/**
 * Class containing various static utility functions
 */
public class Util {
	protected static binding_irvrfy binding_vrfy = (binding_irvrfy) Native.loadLibrary("firm", binding_irvrfy.class);
	protected static binding_irgmod binding_mod = (binding_irgmod) Native.loadLibrary("firm", binding_irgmod.class);
	protected static binding_lowering binding_lower = (binding_lowering) Native.loadLibrary("firm", binding_lowering.class);
	
	/**
	 * This calss only contains static utility functions,
	 * creating an instance makes no sense
	 */
	private Util() {
	}
	
	/**
	 * Calculates a negated pnc condition (ie. a<b becomes a>=b)
	 */
	public int getNegatedCmpPn(Mode mode, int pnc) {
		pnc ^= Cmp.pnTrue;
		if (!mode.isFloat())
			pnc &= ~Cmp.pnUo;
		return pnc;
	}
	
	/**
	 * Calculates the inversed pnc condition (ie. a<b becomes a>b)
	 */
	public int getInverseCmpPn(Mode mode, int pnc) {
		int     code    = pnc & ~(Cmp.pnLt|Cmp.pnGt);
		boolean lesser  = (pnc & Cmp.pnLt) != 0;
		boolean greater = (pnc & Cmp.pnGt) != 0;
		code           |= (lesser ? Cmp.pnGt : 0) | (greater ? Cmp.pnLt : 0);
		return code;
	}
	
	/**
	 * Replace Sel nodes by explicit address arithmetic
	 */
	public static void lowerSels() {
		binding_lower.lower_highlevel(0);
	}
}
