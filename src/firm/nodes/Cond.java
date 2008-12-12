/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Cond extends Node {

	
	public Cond(Block block, Node selector) {
		super(binding_cons.new_r_Cond(Graph.getCurrent().ptr, block.ptr, selector.ptr));
	}
	

	public Cond(Pointer ptr) {
		super(ptr);
	}

	
	public Node getSelector() {
		return createWrapper(binding.get_Cond_selector(ptr));
	}

	public void setSelector(Node selector) {
		binding.set_Cond_selector(this.ptr, selector.ptr);
	}
	

	
	public static final int pnFalse = 0;
	
	public static final int pnTrue = 1;
	
}