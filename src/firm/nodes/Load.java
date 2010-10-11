/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Load extends Node {

	public Load(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding_irnode.get_Load_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding_irnode.set_Load_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getPtr() {
		return createWrapper(binding_irnode.get_Load_ptr(ptr));
	}

	
	public void setPtr(Node ptr) {
		binding_irnode.set_Load_ptr(this.ptr, ptr.ptr);
	}
	

	
	public firm.Mode getLoadMode() {
		Pointer _res = binding_irnode.get_Load_mode(ptr);
		return new firm.Mode(_res);
	}

	public void setLoadMode(firm.Mode _val) {
		binding_irnode.set_Load_mode(this.ptr, _val.ptr);
	}
	

	

	
	/** memory result */
	public static final int pnM = 0;
	
	/** control flow when no exception occurs */
	public static final int pnXRegular = 1;
	
	/** control flow when exception occured */
	public static final int pnXExcept = 2;
	
	/** result of load operation */
	public static final int pnRes = 3;
	public static final int pnMax = 4;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}