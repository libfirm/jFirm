/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class IJmp extends Node {

	public IJmp(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getTarget() {
		return createWrapper(binding.get_IJmp_target(ptr));
	}

	
	public void setTarget(Node target) {
		binding.set_IJmp_target(this.ptr, target.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}