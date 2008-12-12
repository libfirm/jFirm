/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Sync extends Node {

	
	public Sync(Block block, Node[] ins) {
		super(binding_cons.new_r_Sync(Graph.getCurrent().ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	

	public Sync(Pointer ptr) {
		super(ptr);
	}

	

	
}