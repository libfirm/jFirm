/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Jmp extends Node {

	
	public Jmp(Block block) {
		super(binding_cons.new_r_Jmp(firm.Graph.getCurrent().ptr, block.ptr));
	}
	

	public Jmp(Pointer ptr) {
		super(ptr);
	}

	

	

	
}