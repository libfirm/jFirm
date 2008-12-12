/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class End extends Node {

	
	public End(Block block) {
		super(binding_cons.new_r_End(Graph.getCurrent().ptr, block.ptr));
	}
	

	protected End(Pointer ptr) {
		super(ptr);
	}

	
}