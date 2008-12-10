package firm;

import com.sun.jna.Pointer;

public class Node {
	protected Pointer ptr;
	
	protected Node(Pointer ptr) {
		this.ptr = ptr;
	}
}
