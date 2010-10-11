/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Id extends Node {

	public Id(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getPred() {
		return createWrapper(binding_irnode.get_Id_pred(ptr));
	}

	
	public void setPred(Node pred) {
		binding_irnode.set_Id_pred(this.ptr, pred.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}