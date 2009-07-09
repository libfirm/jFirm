/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mux extends Node {

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
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}