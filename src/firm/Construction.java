package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_ircons.ir_cons_flags;
import firm.nodes.Block;
import firm.nodes.Node;

/**
 * Utility class helping in constructing firm graphs. (Performs SSA-construction
 * and keeps track of variables/ state during construction).
 */
public class Construction extends ConstructionBase {

	/**
	 * Start construction of a graph
	 *
	 * @param graph
	 *            the graph to construct
	 */
	public Construction(Graph graph) {
		super(graph);

		/* backedges interfere with construction somehow... */
		if (BackEdges.enabled(graph)) {
			throw new IllegalStateException(
					"Backedges must be disabled while building the graph");
		}
	}

	public Graph getGraph() {
		return graph;
	}

	/** Constructs a new "immature" Block where you can append inputs later on. */
	public Block newBlock() {
		return new Block(binding_ircons.new_r_immBlock(graph.ptr));
	}

	/** Convenience Const construction method that takes an int value and a mode */
	public Node newConst(int value, Mode mode) {
		return newConst(new TargetValue(value, mode));
	}

	/** Convenience Load construction method with cons_flags being None. */
	public Node newLoad(Node mem, Node ptr, Mode loadMode) {
		return newLoad(mem, ptr, loadMode, ir_cons_flags.cons_none);
	}

	/** Convenience Store construction method with cons_flags being None. */
	public Node newStore(Node mem, Node ptr, Node value) {
		return newStore(mem, ptr, value, ir_cons_flags.cons_none);
	}

	/** Convenience Sel construction method with a single base inputs and an entity */
	public Node newSel(Node ptr, Entity entity) {
		return newSel(ptr, new Node[] {}, entity);
	}

	/**
	 * sets the current block
	 *
	 * @param block
	 */
	public void setCurrentBlock(Block block) {
		binding_ircons.set_r_cur_block(graph.ptr, block.ptr);
	}

	/**
	 * marks current block as unreachable, all code generated in this block is
	 * removed immediately and a Bad node is returned instead.
	 */
	public void setUnreachable() {
		Node unreachableBlock = newBlock(new Node[] {});
		binding_ircons.set_r_cur_block(graph.ptr, unreachableBlock.ptr);
	}

	/**
	 * returns true if the current block obviously unreachable.
	 */
	public boolean isUnreachable() {
		Block block = getCurrentBlock();
		return block.getPredCount() == 0 && !block.equals(graph.getStartBlock())
				&& !block.equals(graph.getEndBlock());
	}

	/**
	 * returns the current block
	 */
	public Block getCurrentBlock() {
		Pointer ptr = binding_ircons.get_r_cur_block(graph.ptr);
		if (ptr == null)
			return null;
		return new Block(binding_ircons.get_r_cur_block(graph.ptr));
	}

	/**
	 * return the current memory node
	 */
	public Node getCurrentMem() {
		return Node.createWrapper(binding_ircons.get_r_store(graph.ptr));
	}

	/**
	 * sets the current memory node
	 */
	public void setCurrentMem(Node node) {
		binding_ircons.set_r_store(graph.ptr, node.ptr);
	}

	/**
	 * sets the (current) value of a variable
	 *
	 * @param num
	 *            number of the variable
	 * @param value
	 *            new variable value
	 */
	public void setVariable(int num, Node value) {
		binding_ircons.set_r_value(graph.ptr, num, value.ptr);
	}

	/**
	 * returns the (current) value of a variable. This either returns a value
	 * set by setVariable or in case of control flow join, construct Phi nodes.
	 * If no previous value has been set then an unknown node with the specified
	 * mode is created.
	 *
	 * @param num
	 *            number of the variable
	 * @param mode
	 *            mode of the value to return
	 */
	public Node getVariable(int num, Mode mode) {
		assert num < graph.getnLocalVars();
		return Node.createWrapper(binding_ircons.get_r_value(graph.ptr, num, mode.ptr));
	}

	/**
	 * must be called when graph construction has finished.
	 *
	 * This replaces Phi0 placeholders with real phi nodes, where necessary
	 * by calling mature() on all blocks.
	 */
	public void finish() {
		/* backedges interfere with construction somehow... */
		if (BackEdges.enabled(graph)) {
			throw new IllegalStateException(
					"Backedges must not be enabled while building the graph");
		}

		/* mature blocks */
		graph.walkBlocks(new BlockWalker() {
			public void visitBlock(Block block) {
				block.mature();
			}
		});

		binding_ircons.irg_finalize_cons(graph.ptr);
	}
}
