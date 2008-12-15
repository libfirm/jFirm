/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Proj extends Node {

	
	public Proj(Block block, Node pred, firm.Mode mode, int proj) {
		super(binding_cons.new_r_Proj(firm.Graph.getCurrent().ptr, block.ptr, pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj)));
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
	

	
	public int getProj() {
		com.sun.jna.NativeLong _res = binding.get_Proj_proj(ptr);
		return _res.intValue();
	}

	public void setProj(int _val) {
		binding.set_Proj_proj(this.ptr, new com.sun.jna.NativeLong(_val));
	}
	

	

	
}