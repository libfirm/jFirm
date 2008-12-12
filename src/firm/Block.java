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
	
	public Block getBlock() {
		return null;
	}
	
	public boolean blockVisited() {
		return 0 != binding.Block_block_visited(ptr);
	}
	
	public void markBlockVisited() {
		binding.mark_Block_block_visited(ptr);
	}
}
