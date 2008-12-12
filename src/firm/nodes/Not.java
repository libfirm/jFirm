/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Not extends Unop {

	
	public Not(Block block, Node op, Mode mode) {
		super(binding_cons.new_r_Not(Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	

	public Not(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Not_op(ptr));
	}

	public void setOp(Node op) {
		binding.set_Not_op(this.ptr, op.ptr);
	}
	

	
}