/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Not extends Unop {

	
	public Not(Block block, Node op, firm.Mode mode) {
		super(binding_cons.new_r_Not(firm.Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
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