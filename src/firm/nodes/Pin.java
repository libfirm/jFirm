/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Pin extends Node {

	public Pin(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getOp() {
		return createWrapper(binding.get_Pin_op(ptr));
	}

	
	public void setOp(Node op) {
		binding.set_Pin_op(this.ptr, op.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}