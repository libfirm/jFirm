/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Bound extends Node {

	public Bound(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Bound_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Bound_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getIndex() {
		return createWrapper(binding.get_Bound_index(ptr));
	}

	
	public void setIndex(Node index) {
		binding.set_Bound_index(this.ptr, index.ptr);
	}
	
	
	public Node getLower() {
		return createWrapper(binding.get_Bound_lower(ptr));
	}

	
	public void setLower(Node lower) {
		binding.set_Bound_lower(this.ptr, lower.ptr);
	}
	
	
	public Node getUpper() {
		return createWrapper(binding.get_Bound_upper(ptr));
	}

	
	public void setUpper(Node upper) {
		binding.set_Bound_upper(this.ptr, upper.ptr);
	}
	

	

	

	public static final int pnM = 0;
	public static final int pnXRegular = 1;
	public static final int pnXExcept = 2;
	public static final int pnRes = 3;
	public static final int pnMax = 4;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}