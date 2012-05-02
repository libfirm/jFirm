/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cond extends Node {

	public Cond(Pointer ptr) {
		super(ptr);
	}

	public Node getSelector() {
		return createWrapper(firm.bindings.binding_irnode.get_Cond_selector(ptr));
	}

	public void setSelector(Node selector) {
		firm.bindings.binding_irnode.set_Cond_selector(this.ptr, selector.ptr);
	}

	public firm.bindings.binding_irnode.cond_jmp_predicate getJmpPred() {
		int _res = firm.bindings.binding_irnode.get_Cond_jmp_pred(ptr);
		return firm.bindings.binding_irnode.cond_jmp_predicate.getEnum(_res);
	}

	public void setJmpPred(firm.bindings.binding_irnode.cond_jmp_predicate _val) {
		firm.bindings.binding_irnode.set_Cond_jmp_pred(this.ptr, _val.val);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** control flow if operand is "false" */
	public static final int pnFalse = 0;

	/** control flow if operand is "true" */
	public static final int pnTrue = 1;

	public static final int pnMax = 2;
}
