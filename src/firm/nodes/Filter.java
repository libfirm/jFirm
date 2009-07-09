/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Filter extends Node {

	public Filter(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getPred() {
		return createWrapper(binding.get_Filter_pred(ptr));
	}

	
	public void setPred(Node pred) {
		binding.set_Filter_pred(this.ptr, pred.ptr);
	}
	

	
	public int getProj() {
		com.sun.jna.NativeLong _res = binding.get_Filter_proj(ptr);
		return _res.intValue();
	}

	public void setProj(int _val) {
		binding.set_Filter_proj(this.ptr, new com.sun.jna.NativeLong(_val));
	}
	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}