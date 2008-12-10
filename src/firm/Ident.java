package firm;

import com.sun.jna.Pointer;

public class Ident {
	private final Pointer ptr;
	
	protected Ident(Pointer ptr) {
		this.ptr = ptr;
	}
}
