/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class IJmp extends Node {

	
	public IJmp(Block block, Node target) {
		super(binding_cons.new_r_IJmp(Graph.getCurrent().ptr, block.ptr, target.ptr));
	}
	

	public IJmp(Pointer ptr) {
		super(ptr);
	}

	
	public Node getTarget() {
		return createWrapper(binding.get_IJmp_target(ptr));
	}

	public void setTarget(Node target) {
		binding.set_IJmp_target(this.ptr, target.ptr);
	}
	

	
}