/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cond extends Node {

	public Cond(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getSelector() {
		return createWrapper(binding.get_Cond_selector(ptr));
	}

	
	public void setSelector(Node selector) {
		binding.set_Cond_selector(this.ptr, selector.ptr);
	}
	

	
	public int getDefaultProj() {
		com.sun.jna.NativeLong _res = binding.get_Cond_default_proj(ptr);
		return _res.intValue();
	}

	public void setDefaultProj(int _val) {
		binding.set_Cond_default_proj(this.ptr, new com.sun.jna.NativeLong(_val));
	}
	
	public firm.bindings.binding_irnode.cond_jmp_predicate getJmpPred() {
		int _res = binding.get_Cond_jmp_pred(ptr);
		return firm.bindings.binding_irnode.cond_jmp_predicate.getEnum(_res);
	}

	public void setJmpPred(firm.bindings.binding_irnode.cond_jmp_predicate _val) {
		binding.set_Cond_jmp_pred(this.ptr, _val.val);
	}
	

	

	public static final int pnFalse = 0;
	public static final int pnTrue = 1;
	public static final int pnMax = 2;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}