/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Builtin extends Node {

	public Builtin(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Builtin_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Builtin_mem(this.ptr, mem.ptr);
	}
	

	
	public firm.bindings.binding_ircons.ir_builtin_kind getKind() {
		int _res = binding.get_Builtin_kind(ptr);
		return firm.bindings.binding_ircons.ir_builtin_kind.getEnum(_res);
	}

	public void setKind(firm.bindings.binding_ircons.ir_builtin_kind _val) {
		binding.set_Builtin_kind(this.ptr, _val.val);
	}
	
	public firm.Type getType() {
		Pointer _res = binding.get_Builtin_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding.set_Builtin_type(this.ptr, _val.ptr);
	}
	

	

	public static final int pnM = 0;
	public static final int pnXRegular = 1;
	public static final int pnXExcept = 2;
	public static final int pnTResult = 3;
	public static final int pnPValueResBase = 4;
	public static final int pnMax = 5;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}