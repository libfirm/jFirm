/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Sync extends Node {

	
	public Sync(Block block) {
		super(binding_cons.new_r_Sync(Graph.getCurrent().ptr, block.ptr));
	}
	

	protected Sync(Pointer ptr) {
		super(ptr);
	}

	
}