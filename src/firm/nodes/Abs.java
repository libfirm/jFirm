/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Abs extends Unop {

	public Abs(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getOp() {
		return createWrapper(binding.get_Abs_op(ptr));
	}

	@Override
	public void setOp(Node op) {
		binding.set_Abs_op(this.ptr, op.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}