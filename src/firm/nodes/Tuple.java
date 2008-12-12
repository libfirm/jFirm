/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Tuple extends Node {

	
	public Tuple(Block block, Node[] ins) {
		super(binding_cons.new_r_Tuple(Graph.getCurrent().ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	

	public Tuple(Pointer ptr) {
		super(ptr);
	}

	

	
}