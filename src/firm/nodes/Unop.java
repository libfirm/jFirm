/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public abstract class Unop extends Node {

	

	public Unop(Pointer ptr) {
		super(ptr);
	}

	
	public Node getOp() {
		return createWrapper(binding.get_unop_op(ptr));
	}

	public void setOp(Node op) {
		binding.set_unop_op(this.ptr, op.ptr);
	}
	

	
}