/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Unknown extends Node {

	
	public Unknown(Mode mode) {
		super(binding_cons.new_r_Unknown(Graph.getCurrent().ptr, mode.ptr));
	}
	

	public Unknown(Pointer ptr) {
		super(ptr);
	}

	
}