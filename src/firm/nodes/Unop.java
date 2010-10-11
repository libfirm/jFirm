/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public abstract class Unop extends Node {

	public Unop(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getOp() {
		return createWrapper(binding_irnode.get_unop_op(ptr));
	}

	
	public void setOp(Node op) {
		binding_irnode.set_unop_op(this.ptr, op.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
}