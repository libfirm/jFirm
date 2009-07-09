/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Free extends Node {

	public Free(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Free_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Free_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getPtr() {
		return createWrapper(binding.get_Free_ptr(ptr));
	}

	
	public void setPtr(Node ptr) {
		binding.set_Free_ptr(this.ptr, ptr.ptr);
	}
	
	
	public Node getSize() {
		return createWrapper(binding.get_Free_size(ptr));
	}

	
	public void setSize(Node size) {
		binding.set_Free_size(this.ptr, size.ptr);
	}
	

	
	public firm.Type getType() {
		Pointer _res = binding.get_Free_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding.set_Free_type(this.ptr, _val.ptr);
	}
	
	public firm.bindings.binding_ircons.ir_where_alloc getWhere() {
		int _res = binding.get_Free_where(ptr);
		return firm.bindings.binding_ircons.ir_where_alloc.getEnum(_res);
	}

	public void setWhere(firm.bindings.binding_ircons.ir_where_alloc _val) {
		binding.set_Free_where(this.ptr, _val.val);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}