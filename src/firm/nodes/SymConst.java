/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class SymConst extends Node {

	public SymConst(Pointer ptr) {
		super(ptr);
	}

	

	
	public firm.Entity getEntity() {
		Pointer _res = binding.get_SymConst_entity(ptr);
		return new firm.Entity(_res);
	}

	public void setEntity(firm.Entity _val) {
		binding.set_SymConst_entity(this.ptr, _val.ptr);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}