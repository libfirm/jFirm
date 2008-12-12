/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Return extends Node {

	
	public Return(Block block, Node mem, Node[] ins) {
		super(binding_cons.new_r_Return(Graph.getCurrent().ptr, block.ptr, mem.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	

	public Return(Pointer ptr) {
		super(ptr);
	}

	
	public Node getMem() {
		return createWrapper(binding.get_Return_mem(ptr));
	}

	public void setMem(Node mem) {
		binding.set_Return_mem(this.ptr, mem.ptr);
	}
	
}