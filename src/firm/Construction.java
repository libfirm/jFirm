package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons.ir_cons_flags;
import firm.bindings.binding_irgraph.irg_phase_state;
import firm.bindings.binding_typerep.ir_type_state;
import firm.nodes.Block;
import firm.nodes.Node;

/**
 * Utility class helping in constructing firm graphs.
 * (Performs SSA-construction and keeps track of variables/
 *  state during construction).
 */
public class Construction extends ConstructionBase {
	
	private final Graph graph;
	
	private static boolean constructionActive = false;
	
	/**
	 * Start construction of a graph
	 * @param graph  the graph to construct
	 */
	public Construction(Graph graph) {
		/* well firm can only support 1 active graph construction.
		 * you have to call Construction.finish() to start
		 * another one.
		 */
		if (constructionActive) {
			throw new IllegalStateException("Another construction is currently in progress."
					+ " Don't forget to call Constuction.finish() when done...");
		}

		constructionActive = true;
		
		/* backedges interfere with construction somehow... */
		if (BackEdges.enabled(graph)) {
			throw new IllegalStateException("Backedges must be disabled while building the graph");
		}
		
		this.graph = graph;
		Graph.setCurrent(graph);
	}
	
	public Block newBlock() {
		return new Block(binding_cons.new_immBlock());
	}
	
	public Node newSymConst(Entity entity) {
		return graph.newSymConst(entity);
	}
	
	public Node newConst(TargetValue tarval) {
		return graph.newConst(tarval);
	}
	
	public Node newConst(int value, Mode mode) {
		return newConst(new TargetValue(value, mode));
	}
	
	public Node newLoad(Node mem, Node ptr, Mode loadMode) {
		return newLoad(mem, ptr, loadMode, ir_cons_flags.cons_none);
	}
	
	public Node newStore(Node mem, Node ptr, Node value) {
		return newStore(mem, ptr, value, ir_cons_flags.cons_none);
	}
	
	public Node newSel(Node ptr, Entity entity) {
		return newSel(newNoMem(), ptr, new Node[] {}, entity);
	}
	
	/**
	 * sets the current block
	 * @param block
	 */
	public void setCurrentBlock(Block block) {
		binding_cons.set_cur_block(block.ptr);
	}
	
	/** sets current block to bad, this will result in all
	 * generated code being remove immediately.
	 * You should use this after generating Jmp or
	 * Return nodes. */
	public void setCurrentBlockBad() {
		binding_cons.set_cur_block(newBad().ptr);
	}
	
	/**
	 * returns the current block
	 */
	public Block getCurrentBlock() {
		Pointer ptr = binding_cons.get_cur_block();
		if (ptr == null)
			return null;
		return new Block(binding_cons.get_cur_block());
	}

	/**
	 * return the current memory node
	 */
	public Node getCurrentMem() {
		assert !getCurrentBlock().isBad();
		return Node.createWrapper(binding_cons.get_store());
	}
	
	/**
	 * sets the current memory node
	 */
	public void setCurrentMem(Node node) {
		binding_cons.set_store(node.ptr);
	}

	/**
	 * sets the (current) value of a variable
	 * @param num    number of the variable
	 * @param value  new variable value
	 */
	public void setVariable(int num, Node value) {
		binding_cons.set_value(num, value.ptr);
	}
	
	/**
	 * returns the (current) value of a variable.
	 * This either returns a value set by setVariable or in case of
	 * control flow join, construct Phi nodes.
	 * If no previous value has been set then an unknown node 
	 * with the specified mode is created.
	 * 
	 * @param num   number of the variable
	 * @param mode  mode of the value to return  
	 */
	public Node getVariable(int num, Mode mode) {
		assert num < graph.getnLocalVars();
		return Node.createWrapper(binding_cons.get_value(num, mode.ptr));
	}
	
	/**
	 * must be called when graph construction has finished.
	 * 
	 * This replaces Phi0 placeholders with real phi nodes,
	 * constructs a frame type and sets graph phase to high
	 * (which means construction has finished and the graph should
	 *  be well formed). 
	 */
	public void finish() {
		if (!constructionActive) {
			throw new IllegalStateException("Construciton is not active.");
		}
		/* backedges interfere with construction somehow... */
		if (BackEdges.enabled(graph)) {
			throw new IllegalStateException("Backedges must not be enabled while building the graph");
		}
		
		constructionActive = false;
		
		/* mature blocks */
		graph.walkBlocks(new BlockWalker() {
			public void visitBlock(Block block) {
				block.mature();
			}
		});
		
		/* setup a minimal frame type... */
		Type frameType = graph.getFrameType();
		frameType.setSizeBytes(0);
		frameType.setAlignmentBytes(4);
		frameType.setTypeState(ir_type_state.layout_fixed);
		
		/* set graph to state high */
		graph.setPhaseState(irg_phase_state.phase_high);
	}
}
