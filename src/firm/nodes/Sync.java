/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Sync extends Node {

	
	public Sync(Block block, Node[] ins) {
		super(binding_cons.new_r_Sync(firm.Graph.getCurrent().ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	

	public Sync(Pointer ptr) {
		super(ptr);
	}

	

	
}