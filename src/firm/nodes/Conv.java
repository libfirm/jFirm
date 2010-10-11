/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Conv extends Unop {

	public Conv(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getOp() {
		return createWrapper(binding_irnode.get_Conv_op(ptr));
	}

	@Override
	public void setOp(Node op) {
		binding_irnode.set_Conv_op(this.ptr, op.ptr);
	}
	

	
	public int getStrict() {
		int _res = binding_irnode.get_Conv_strict(ptr);
		return _res;
	}

	public void setStrict(int _val) {
		binding_irnode.set_Conv_strict(this.ptr, _val);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}