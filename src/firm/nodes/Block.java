/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Block extends Node {

	public Block(Pointer ptr) {
		super(ptr);
	}

	

	

	
	public void addPred(Node node) {
		binding_cons.add_immBlock_pred(ptr, node.ptr);
	}
	
	public void mature() {
		binding_cons.mature_immBlock(ptr);
	}

	@Override
	public Block getBlock() {
		return null;
	}
	
	public boolean blockVisited() {
		return 0 != binding.Block_block_visited(ptr);
	}
	
	public void markBlockVisited() {
		binding.mark_Block_block_visited(ptr);
	}

	
	public static final int pnMax = 0;
}