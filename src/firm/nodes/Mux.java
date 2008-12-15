/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mux extends Node {

	
	public Mux(Block block, Node sel, Node _false, Node _true, firm.Mode mode) {
		super(binding_cons.new_r_Mux(firm.Graph.getCurrent().ptr, block.ptr, sel.ptr, _false.ptr, _true.ptr, mode.ptr));
	}
	

	public Mux(Pointer ptr) {
		super(ptr);
	}

	
	public Node getSel() {
		return createWrapper(binding.get_Mux_sel(ptr));
	}

	public void setSel(Node sel) {
		binding.set_Mux_sel(this.ptr, sel.ptr);
	}
	
	public Node getFalse() {
		return createWrapper(binding.get_Mux_false(ptr));
	}

	public void setFalse(Node _false) {
		binding.set_Mux_false(this.ptr, _false.ptr);
	}
	
	public Node getTrue() {
		return createWrapper(binding.get_Mux_true(ptr));
	}

	public void setTrue(Node _true) {
		binding.set_Mux_true(this.ptr, _true.ptr);
	}
	

	

	
}