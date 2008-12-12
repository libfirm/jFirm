/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Proj extends Node {

	
	public Proj(Block block, Node arg, Mode mode) {
		super(binding_cons.new_r_Proj(Graph.getCurrent().ptr, block.ptr, arg.ptr, mode.ptr));
	}
	

	protected Proj(Pointer ptr) {
		super(ptr);
	}

	
	public Node getArg() {
		return createWrapper(binding.get_Proj_arg(ptr));
	}
	
}