/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Switch extends Node {

	public Switch(Pointer ptr) {
		super(ptr);
	}

	public Node getSelector() {
		return createWrapper(firm.bindings.binding_irnode.get_Switch_selector(ptr));
	}

	public void setSelector(Node selector) {
		firm.bindings.binding_irnode.set_Switch_selector(this.ptr, selector.ptr);
	}

	public int getNOuts() {
		int _res = firm.bindings.binding_irnode.get_Switch_n_outs(ptr);
		return _res;
	}

	public void setNOuts(int _val) {
		firm.bindings.binding_irnode.set_Switch_n_outs(this.ptr, _val);
	}

	public Pointer getTable() {
		Pointer _res = firm.bindings.binding_irnode.get_Switch_table(ptr);
		return _res;
	}

	public void setTable(Pointer _val) {
		firm.bindings.binding_irnode.set_Switch_table(this.ptr, _val);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** control flow if no other case matches */
	public static final int pnDefault = 0;

	public static final int pnMax = 1;
}
