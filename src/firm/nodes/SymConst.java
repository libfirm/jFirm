package firm.nodes;

import com.sun.jna.Pointer;

import firm.Entity;
import firm.Graph;
import firm.Mode;

public class SymConst extends Node {

	public SymConst(Pointer ptr) {
		super(ptr);
	}
	
	public SymConst(Entity entity) {
		this(entity, Mode.getP());
	}
	
	public SymConst(Entity entity, Mode mode) {
		super(binding_cons.new_rd_SymConst_addr_ent(Pointer.NULL, Graph.getCurrent().ptr, mode.ptr, entity.ptr, entity.getType().ptr));
	}
	

}
