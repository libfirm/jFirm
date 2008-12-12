/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Mux extends Node {

	
	public Mux(Block block, Node sel, Node _false, Node _true, Mode mode) {
		super(binding_cons.new_r_Mux(Graph.getCurrent().ptr, block.ptr, sel.ptr, _false.ptr, _true.ptr, mode.ptr));
	}
	

	protected Mux(Pointer ptr) {
		super(ptr);
	}

	
	public Node getSel() {
		return createWrapper(binding.get_Mux_sel(ptr));
	}
	
	public Node getFalse() {
		return createWrapper(binding.get_Mux_false(ptr));
	}
	
	public Node getTrue() {
		return createWrapper(binding.get_Mux_true(ptr));
	}
	
}