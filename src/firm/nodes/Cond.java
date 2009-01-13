/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cond extends Node {

	public Cond(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getSelector() {
		return createWrapper(binding.get_Cond_selector(ptr));
	}

	
	public void setSelector(Node selector) {
		binding.set_Cond_selector(this.ptr, selector.ptr);
	}
	

	

	

	
	public static final int pnFalse = 0;
	
	public static final int pnTrue = 1;
	
	public static final int pnMax = 2;
}