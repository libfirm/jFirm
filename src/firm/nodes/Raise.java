/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Raise extends Node {

	public Raise(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding_irnode.get_Raise_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding_irnode.set_Raise_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getExoPtr() {
		return createWrapper(binding_irnode.get_Raise_exo_ptr(ptr));
	}

	
	public void setExoPtr(Node exo_ptr) {
		binding_irnode.set_Raise_exo_ptr(this.ptr, exo_ptr.ptr);
	}
	

	

	

	
	/** memory result */
	public static final int pnM = 0;
	
	/** control flow to exception handler */
	public static final int pnX = 1;
	public static final int pnMax = 2;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}