/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class CopyB extends Node {

	public CopyB(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_CopyB_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_CopyB_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getDst() {
		return createWrapper(binding.get_CopyB_dst(ptr));
	}

	
	public void setDst(Node dst) {
		binding.set_CopyB_dst(this.ptr, dst.ptr);
	}
	
	
	public Node getSrc() {
		return createWrapper(binding.get_CopyB_src(ptr));
	}

	
	public void setSrc(Node src) {
		binding.set_CopyB_src(this.ptr, src.ptr);
	}
	

	
	public firm.Type getType() {
		Pointer _res = binding.get_CopyB_type(ptr);
		return firm.Type.createWrapper(_res);
	}

	public void setType(firm.Type _val) {
		binding.set_CopyB_type(this.ptr, _val.ptr);
	}
	

	

	public static final int pnM = 0;
	public static final int pnXRegular = 1;
	public static final int pnXExcept = 2;
	public static final int pnMax = 3;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}