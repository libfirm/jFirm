/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class InstOf extends Node {

	public InstOf(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getStore() {
		return createWrapper(binding.get_InstOf_store(ptr));
	}

	
	public void setStore(Node store) {
		binding.set_InstOf_store(this.ptr, store.ptr);
	}
	
	
	public Node getObj() {
		return createWrapper(binding.get_InstOf_obj(ptr));
	}

	
	public void setObj(Node obj) {
		binding.set_InstOf_obj(this.ptr, obj.ptr);
	}
	

	
	public firm.Type getType() {
		Pointer _res = binding.get_InstOf_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding.set_InstOf_type(this.ptr, _val.ptr);
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