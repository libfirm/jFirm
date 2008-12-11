package firm;

import com.sun.jna.Pointer;

public class Return extends Node {
	
	protected Return(Pointer ptr) {
		super(ptr);
	}
	
	public Return(Block block, Node store, Node[] inputs) {
		super(binding_cons.new_r_Return(block.getGraph().ptr, block.ptr, store.ptr, inputs.length, getPointerListFromNodeList(inputs)));
	}

}
