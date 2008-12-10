package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.FirmBinding;

public class TargetValue {

	private static final FirmBinding b = Bindings.getBinding();
	
	/**
	 * Pointer to the tarval in lib
	 */
	private final Pointer p;

	protected TargetValue(Pointer p) {
		this.p = p;
	}
	
}
