package firm;

import com.sun.jna.Pointer;

public abstract class JNAWrapper {

	public final Pointer ptr;
	
	protected JNAWrapper(final Pointer ptr) {
		if (ptr == null) {
			throw new IllegalArgumentException("Pointer object is null.");
		}
		
		this.ptr = ptr;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JNAWrapper) {
			return ptr.equals(((JNAWrapper) obj).ptr);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return ptr.hashCode();
	}
	
}
