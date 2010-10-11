/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Call extends Node {

	public Call(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding_irnode.get_Call_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding_irnode.set_Call_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getPtr() {
		return createWrapper(binding_irnode.get_Call_ptr(ptr));
	}

	
	public void setPtr(Node ptr) {
		binding_irnode.set_Call_ptr(this.ptr, ptr.ptr);
	}
	

	
	public firm.Type getType() {
		Pointer _res = binding_irnode.get_Call_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding_irnode.set_Call_type(this.ptr, _val.ptr);
	}
	
	public int getTailCall() {
		int _res = binding_irnode.get_Call_tail_call(ptr);
		return _res;
	}

	public void setTailCall(int _val) {
		binding_irnode.set_Call_tail_call(this.ptr, _val);
	}
	

	

	
	/** memory result */
	public static final int pnM = 0;
	
	/** control flow when no exception occurs */
	public static final int pnXRegular = 1;
	
	/** control flow when exception occured */
	public static final int pnXExcept = 2;
	
	/** tuple containing all results */
	public static final int pnTResult = 3;
	
	/** pointer to memory register containing copied results passed by value */
	public static final int pnPValueResBase = 4;
	public static final int pnMax = 5;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}