/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Tuple extends Node {

	
	public Tuple(Block block, Node[] ins) {
		super(binding_cons.new_r_Tuple(firm.Graph.getCurrent().ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	

	public Tuple(Pointer ptr) {
		super(ptr);
	}

	

	

	
}