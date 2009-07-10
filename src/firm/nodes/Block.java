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
		int visited = getGraph().getBlockVisited();
		return binding.get_Block_block_visited(ptr).intValue() >= visited;
	}
	
	public void markBlockVisited() {
		int visited = getGraph().getBlockVisited();		
		binding.set_Block_block_visited(ptr, new com.sun.jna.NativeLong(visited));
	}	

	public boolean isBad() {	
		return binding.is_Bad(ptr) != 0;
	}
	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}