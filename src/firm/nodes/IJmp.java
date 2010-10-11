/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class IJmp extends Node {

	public IJmp(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getTarget() {
		return createWrapper(binding_irnode.get_IJmp_target(ptr));
	}

	
	public void setTarget(Node target) {
		binding_irnode.set_IJmp_target(this.ptr, target.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}