/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Load extends Node {

	
	public Load(Block block, Node mem, Node ptr, firm.Mode mode, firm.bindings.binding_ircons.cons_flags flags) {
		super(binding_cons.new_r_Load(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, mode.ptr, flags.val));
	}
	

	public Load(Pointer ptr) {
		super(ptr);
	}

	
	public Node getMem() {
		return createWrapper(binding.get_Load_mem(ptr));
	}

	public void setMem(Node mem) {
		binding.set_Load_mem(this.ptr, mem.ptr);
	}
	
	public Node getPtr() {
		return createWrapper(binding.get_Load_ptr(ptr));
	}

	public void setPtr(Node ptr) {
		binding.set_Load_ptr(this.ptr, ptr.ptr);
	}
	

	
	public firm.Mode getMode() {
		Pointer _res = binding.get_Load_mode(ptr);
		return new firm.Mode(_res);
	}

	public void setMode(firm.Mode _val) {
		binding.set_Load_mode(this.ptr, _val.ptr);
	}
	

	

	
	public static final int pnM = 0;
	
	public static final int pnXRegular = 1;
	
	public static final int pnXExcept = 2;
	
	public static final int pnRes = 3;
	
}