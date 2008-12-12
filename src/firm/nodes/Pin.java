/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Pin extends Node {

	
	public Pin(Block block, Node op) {
		super(binding_cons.new_r_Pin(Graph.getCurrent().ptr, block.ptr, op.ptr));
	}
	

	public Pin(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Pin_op(ptr));
	}

	public void setOp(Node op) {
		binding.set_Pin_op(this.ptr, op.ptr);
	}
	

	
}