/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Abs extends Unop {

	
	public Abs(Block block, Node op, Mode mode) {
		super(binding_cons.new_r_Abs(Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	

	public Abs(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_Abs_op(ptr));
	}

	public void setOp(Node op) {
		binding.set_Abs_op(this.ptr, op.ptr);
	}
	

	
}