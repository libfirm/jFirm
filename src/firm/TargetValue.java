package firm;

import com.sun.jna.Pointer;

public class TargetValue {

	/**
	 * Pointer to the tarval in lib
	 */
	protected final Pointer ptr;

	protected TargetValue(Pointer ptr) {
		this.ptr = ptr;
	}
	
}
