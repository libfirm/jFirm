/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Store extends Node {

	public Store(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Store_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Store_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getPtr() {
		return createWrapper(binding.get_Store_ptr(ptr));
	}

	
	public void setPtr(Node ptr) {
		binding.set_Store_ptr(this.ptr, ptr.ptr);
	}
	
	
	public Node getValue() {
		return createWrapper(binding.get_Store_value(ptr));
	}

	
	public void setValue(Node value) {
		binding.set_Store_value(this.ptr, value.ptr);
	}
	

	

	

	public static final int pnM = 0;
	public static final int pnXRegular = 1;
	public static final int pnXExcept = 2;
	public static final int pnMax = 3;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}