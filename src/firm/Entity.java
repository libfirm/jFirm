package firm;

import com.sun.jna.Pointer;

public class Entity {
	protected final Pointer ptr;
	
	Entity(Pointer ptr) {
		this.ptr = ptr;
	}
}
