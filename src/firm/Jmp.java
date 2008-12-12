/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Jmp extends Node {

	
	public Jmp(Block block) {
		super(binding_cons.new_r_Jmp(Graph.getCurrent().ptr, block.ptr));
	}
	

	protected Jmp(Pointer ptr) {
		super(ptr);
	}

	
}