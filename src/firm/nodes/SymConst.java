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
	

	
	public SymConst(firm.Entity entity) {
		this(entity, firm.Mode.getP());
	}
						
	public SymConst(firm.Entity entity, firm.Mode mode) {
		super(binding_cons.new_rd_SymConst_addr_ent(Pointer.NULL, firm.Graph.getCurrent().ptr, mode.ptr, entity.ptr, entity.getType().ptr));
	}

	
}