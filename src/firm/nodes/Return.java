/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Return extends Node {

	public Return(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Return_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Return_mem(this.ptr, mem.ptr);
	}
	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}