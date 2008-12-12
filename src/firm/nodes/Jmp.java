/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Jmp extends Node {

	
	public Jmp(Block block) {
		super(binding_cons.new_r_Jmp(Graph.getCurrent().ptr, block.ptr));
	}
	

	public Jmp(Pointer ptr) {
		super(ptr);
	}

	

	
}