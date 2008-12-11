package firm;

import com.sun.jna.Pointer;

abstract class JNAWrapper {

	protected final Pointer ptr;
	
	public JNAWrapper(final Pointer ptr) {
		this.ptr = ptr;
	}
	
}
