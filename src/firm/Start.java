/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.nodes.Block;
import firm.nodes.Node;

public class Start extends Node {

	
	public Start(Block block) {
		super(binding_cons.new_r_Start(Graph.getCurrent().ptr, block.ptr));
	}
	

	protected Start(Pointer ptr) {
		super(ptr);
	}

	
}