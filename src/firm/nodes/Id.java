/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Id extends Node {

	public Id(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getPred() {
		return createWrapper(binding.get_Id_pred(ptr));
	}

	
	public void setPred(Node pred) {
		binding.set_Id_pred(this.ptr, pred.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}