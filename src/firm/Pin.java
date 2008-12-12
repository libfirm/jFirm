/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

public class Pin extends Node {

	
	public Pin(Block block, Node node, Mode mode) {
		super(binding_cons.new_r_Pin(Graph.getCurrent().ptr, block.ptr, node.ptr, mode.ptr));
	}
	

	protected Pin(Pointer ptr) {
		super(ptr);
	}

	
	public Node getNode() {
		return createWrapper(binding.get_Pin_node(ptr));
	}
	
}