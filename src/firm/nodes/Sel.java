/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Sel extends Node {

	public Sel(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Sel_mem(ptr));
	}

	
	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Sel_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getPtr() {
		return createWrapper(firm.bindings.binding_irnode.get_Sel_ptr(ptr));
	}

	
	public void setPtr(Node ptr) {
		firm.bindings.binding_irnode.set_Sel_ptr(this.ptr, ptr.ptr);
	}
	

	
	public firm.Entity getEntity() {
		Pointer _res = firm.bindings.binding_irnode.get_Sel_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		firm.bindings.binding_irnode.set_Sel_entity(this.ptr, _val.ptr);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}