/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Block extends Node {

	public Block(Pointer ptr) {
		super(ptr);
	}

	

	

	
	public void addPred(Node node) {
		binding_ircons.add_immBlock_pred(ptr, node.ptr);
	}

	public void mature() {
		binding_ircons.mature_immBlock(ptr);
	}

	@Override
	public Block getBlock() {
		return null;
	}

	public boolean blockVisited() {
		return 0 != binding_irnode.Block_block_visited(ptr);
	}

	public void markBlockVisited() {
		binding_irnode.mark_Block_block_visited(ptr);
	}

	public boolean isBad() {
		return binding_irnode.is_Bad(ptr) != 0;
	}
	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}