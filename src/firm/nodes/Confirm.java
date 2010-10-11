/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Confirm extends Node {

	public Confirm(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getValue() {
		return createWrapper(binding_irnode.get_Confirm_value(ptr));
	}

	
	public void setValue(Node value) {
		binding_irnode.set_Confirm_value(this.ptr, value.ptr);
	}
	
	
	public Node getBound() {
		return createWrapper(binding_irnode.get_Confirm_bound(ptr));
	}

	
	public void setBound(Node bound) {
		binding_irnode.set_Confirm_bound(this.ptr, bound.ptr);
	}
	

	
	public int getCmp() {
		int _res = binding_irnode.get_Confirm_cmp(ptr);
		return _res;
	}

	public void setCmp(int _val) {
		binding_irnode.set_Confirm_cmp(this.ptr, _val);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}