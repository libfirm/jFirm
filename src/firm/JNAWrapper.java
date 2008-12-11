package firm;

import com.sun.jna.Pointer;

abstract class JNAWrapper {

	protected final Pointer ptr;
	
	JNAWrapper(final Pointer ptr) {
		if (ptr == null) {
			throw new IllegalArgumentException("Pointer object is null.");
		} else if (ptr == Pointer.NULL) {
			throw new IllegalArgumentException("Pointer object holds a C NULL pointer.");
		}
		
		this.ptr = ptr;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof JNAWrapper) {
			return ptr.equals(((JNAWrapper) obj).ptr);
		}
		
		return false;
	}
	
	public int hashCode() {
		return ptr.hashCode();
	}
	
}
