/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class NoMem extends Node {

	
	public NoMem() {
		super(binding_cons.new_r_NoMem(Graph.getCurrent().ptr));
	}
	

	public NoMem(Pointer ptr) {
		super(ptr);
	}

	
}