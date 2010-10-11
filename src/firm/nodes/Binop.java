/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public abstract class Binop extends Node {

	public Binop(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getLeft() {
		return createWrapper(binding_irnode.get_binop_left(ptr));
	}

	
	public void setLeft(Node left) {
		binding_irnode.set_binop_left(this.ptr, left.ptr);
	}
	
	
	public Node getRight() {
		return createWrapper(binding_irnode.get_binop_right(ptr));
	}

	
	public void setRight(Node right) {
		binding_irnode.set_binop_right(this.ptr, right.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
}