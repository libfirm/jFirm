/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Sel extends Node {

	public Sel(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding_irnode.get_Sel_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding_irnode.set_Sel_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getPtr() {
		return createWrapper(binding_irnode.get_Sel_ptr(ptr));
	}

	
	public void setPtr(Node ptr) {
		binding_irnode.set_Sel_ptr(this.ptr, ptr.ptr);
	}
	

	
	public firm.Entity getEntity() {
		Pointer _res = binding_irnode.get_Sel_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		binding_irnode.set_Sel_entity(this.ptr, _val.ptr);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}