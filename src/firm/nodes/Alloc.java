/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Alloc extends Node {

	public Alloc(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Alloc_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Alloc_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getCount() {
		return createWrapper(binding.get_Alloc_count(ptr));
	}

	
	public void setCount(Node count) {
		binding.set_Alloc_count(this.ptr, count.ptr);
	}
	

	
	public firm.Type getType() {
		Pointer _res = binding.get_Alloc_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding.set_Alloc_type(this.ptr, _val.ptr);
	}
	
	public firm.bindings.binding_ircons.ir_where_alloc getWhere() {
		int _res = binding.get_Alloc_where(ptr);
		return firm.bindings.binding_ircons.ir_where_alloc.getEnum(_res);
	}

	public void setWhere(firm.bindings.binding_ircons.ir_where_alloc _val) {
		binding.set_Alloc_where(this.ptr, _val.val);
	}
	

	

	public static final int pnM = 0;
	public static final int pnXRegular = 1;
	public static final int pnXExcept = 2;
	public static final int pnRes = 3;
	public static final int pnMax = 4;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}