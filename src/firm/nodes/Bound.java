/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Bound extends Node {

	public Bound(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding_irnode.get_Bound_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding_irnode.set_Bound_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getIndex() {
		return createWrapper(binding_irnode.get_Bound_index(ptr));
	}

	
	public void setIndex(Node index) {
		binding_irnode.set_Bound_index(this.ptr, index.ptr);
	}
	
	
	public Node getLower() {
		return createWrapper(binding_irnode.get_Bound_lower(ptr));
	}

	
	public void setLower(Node lower) {
		binding_irnode.set_Bound_lower(this.ptr, lower.ptr);
	}
	
	
	public Node getUpper() {
		return createWrapper(binding_irnode.get_Bound_upper(ptr));
	}

	
	public void setUpper(Node upper) {
		binding_irnode.set_Bound_upper(this.ptr, upper.ptr);
	}
	

	

	

	
	/** memory result */
	public static final int pnM = 0;
	
	/** control flow when no exception occurs */
	public static final int pnXRegular = 1;
	
	/** control flow when exception occured */
	public static final int pnXExcept = 2;
	
	/** the checked index */
	public static final int pnRes = 3;
	public static final int pnMax = 4;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}