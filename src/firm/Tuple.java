/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Tuple extends Node {

	
	public Tuple(Block block, Node[] ins) {
		super(binding_cons.new_r_Tuple(Graph.getCurrent().ptr, block.ptr, ins.length, getPointerListFromNodeList(ins)));
	}
	

	protected Tuple(Pointer ptr) {
		super(ptr);
	}

	
}