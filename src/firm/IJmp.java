/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class IJmp extends Node {

	
	public IJmp(Block block, Node target) {
		super(binding_cons.new_r_IJmp(Graph.getCurrent().ptr, block.ptr, target.ptr));
	}
	

	protected IJmp(Pointer ptr) {
		super(ptr);
	}

	
	public Node getTarget() {
		return createWrapper(binding.get_IJmp_target(ptr));
	}
	
}