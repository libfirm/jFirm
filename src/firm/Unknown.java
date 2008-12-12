/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Unknown extends Node {

	
	public Unknown(Block block, Mode mode) {
		super(binding_cons.new_r_Unknown(Graph.getCurrent().ptr, block.ptr, mode.ptr));
	}
	

	protected Unknown(Pointer ptr) {
		super(ptr);
	}

	
}