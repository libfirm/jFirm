package firm;

import com.sun.jna.Pointer;

public final class Block extends Node {
	
	public Block(Pointer ptr) {
		super(ptr);
	}

	public void addPred(Node node) {
		binding_cons.add_immBlock_pred(ptr, node.ptr);
	}
	
	public void mature() {
		binding_cons.mature_immBlock(ptr);
	}
}
