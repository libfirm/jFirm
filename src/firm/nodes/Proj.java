/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Proj extends Node {

	
	public Proj(Block block, Node pred, Mode mode, int proj) {
		super(binding_cons.new_r_Proj(Graph.getCurrent().ptr, block.ptr, pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj)));
	}
	

	public Proj(Pointer ptr) {
		super(ptr);
	}

	
	public Node getPred() {
		return createWrapper(binding.get_Proj_pred(ptr));
	}

	public void setPred(Node pred) {
		binding.set_Proj_pred(this.ptr, pred.ptr);
	}
	
}