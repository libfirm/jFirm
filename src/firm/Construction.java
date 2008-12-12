package firm;

import com.sun.jna.Pointer;

import firm.nodes.Block;
import firm.nodes.Node;

public class Construction extends ConstructionBase {
	
	private final Graph graph;
	
	public Construction(Graph graph) {
		this.graph = graph;
		Graph.setCurrent(graph);
	}
	
	public Block newImmatureBlock() {
		return new Block(binding_cons.new_immBlock());
	}
	
	public void setCurrentBlock(Block block) {
		if (block == null)
			binding_cons.set_cur_block(Pointer.NULL);
		else
			binding_cons.set_cur_block(block.ptr);
	}
	
	public Block getCurrentBlock() {
		Pointer ptr = binding_cons.get_cur_block();
		if (ptr == Pointer.NULL)
			return null;
		return new Block(binding_cons.get_cur_block());
	}
	
	public Node getCurrentMem() {
		return Node.createWrapper(binding_cons.get_store());
	}
	
	public void setCurrentMem(Node node) {
		binding_cons.set_store(node.ptr);
	}
	
	public void finish() {
		/* mature blocks */
		graph.walkBlocks(new BlockWalker() {
			public void visitBlock(Block block) {
				block.mature();
			}
		});		
	}
}
