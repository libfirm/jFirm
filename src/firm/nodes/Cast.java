/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cast extends Unop {

	public Cast(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getOp() {
		return createWrapper(binding.get_Cast_op(ptr));
	}

	@Override
	public void setOp(Node op) {
		binding.set_Cast_op(this.ptr, op.ptr);
	}
	

	
	public firm.Type getType() {
		Pointer _res = binding.get_Cast_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding.set_Cast_type(this.ptr, _val.ptr);
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}