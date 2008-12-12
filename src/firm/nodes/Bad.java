/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Bad extends Node {

	
	public Bad() {
		super(binding_cons.new_r_Bad(Graph.getCurrent().ptr));
	}
	

	public Bad(Pointer ptr) {
		super(ptr);
	}

	
}