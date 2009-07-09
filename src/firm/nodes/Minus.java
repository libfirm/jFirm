/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Minus extends Unop {

	public Minus(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getOp() {
		return createWrapper(binding.get_Minus_op(ptr));
	}

	@Override
	public void setOp(Node op) {
		binding.set_Minus_op(this.ptr, op.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}