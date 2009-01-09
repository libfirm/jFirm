package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_ircons;
import firm.bindings.binding_irgraph;
import firm.nodes.Block;
import firm.nodes.Node;

/**
 * A graph is an object owning stuff related to a firm graph. That is:
 * 
 * - Nodes and Blocks
 * - A type describing the stackframe layout
 * - Direct pointers to some unique nodes (StartBlock, Start, ...)
 * - Helper functions to traverse the graph
 */
public abstract class GraphBase extends JNAWrapper {
	
	static final binding_irgraph binding = Bindings.getIrGraphBinding();
	public static final binding_ircons binding_cons = Bindings.getIrConsBinding();


	public GraphBase(Pointer ptr) {
		super(ptr);
	}
	
	/**
	 * returns the currently active graph
	 */
	public static Graph getCurrent() {
		return new Graph(binding.get_current_ir_graph());
	}
	
	/**
	 * sets the currently active graph
	 */
	public static void setCurrent(GraphBase graph) {
		binding.set_current_ir_graph(graph.ptr);
	}
	
	public Node newSymConst(Entity entity) {
		return Node.createWrapper(binding_cons.new_rd_SymConst_addr_ent(Pointer.NULL, ptr, Mode.getP().ptr, entity.ptr, entity.getType().ptr));
	}
	
	/**
	 * free resources occupied by the graph.
	 * You are not allowed to use the graph anymore after calling this.
	 */
	public void free() {
		binding.free_ir_graph(ptr);
	}

	/**
	 * returns associated entity
	 */
	public Entity getEntity() {
		return new Entity(binding.get_irg_entity(ptr));
	}
	
	public void setEntity(Entity entity) {
		binding.set_irg_entity(ptr, entity.ptr);
	}

	/**
	 * returns compound type for the functions stackframe layout
	 */
	public Type getFrameType() {
		return Type.createWrapper(binding.get_irg_frame_type(ptr));
	}
	
	public void setFrameType(Type type) {
		binding.set_irg_frame_type(ptr, type.ptr);
	}

	/**
	 * returns the start block
	 */
	public Block getStartBlock() {
		return new Block(binding.get_irg_start_block(ptr));
	}

	/**
	 * returns the start node
	 */
	public Node getStart() {
		return new Node(binding.get_irg_start(ptr));
	}
	
	/** returns the end block */
	public Block getEndBlock() {
		return new Block(binding.get_irg_end_block(ptr));
	}
	
	/** returns the end node */
	public Node getEnd() {
		return new Node(binding.get_irg_end(ptr));
	}
	
	/** returns the end node for exceptions */
	public Node getEndReg() {
		return new Node(binding.get_irg_end_reg(ptr));
	}
	
	/** returns the initial ProjX node (start of control flow) */
	public Node getInitialExec() {
		return new Node(binding.get_irg_initial_exec(ptr));
	}
	
	/** returns the initial memory */
	public Node getInitialMem() {
		return new Node(binding.get_irg_initial_mem(ptr));
	}
	
	/** returns the pointer to the functions stackframe */
	public Node getFrame() {
		return new Node(binding.get_irg_frame(ptr));
	}
	
	/** returns the pointer to the thread local storage area */
	public Node getTls() {
		return new Node(binding.get_irg_tls(ptr));
	}
	
	/** returns function arguments */
	public Node getArgs() {
		return new Node(binding.get_irg_args(ptr));
	}
	
	/** returns function arguments pointers for objects passed by value */
	public Node getValueParambase() {
		return new Node(binding.get_irg_value_param_base(ptr));
	}
	
	/** returns the Bad node */
	public Node getBad() {
		return new Node(binding.get_irg_bad(ptr));
	}
	
	/** return the NoMem node */
	public Node getNoMem() {
		return new Node(binding.get_irg_no_mem(ptr));
	}
	
	public void setStartBlock(Block block) {
		binding.set_irg_start_block(ptr, block.ptr);
	}
	
	public void setStart(Node node) {
		binding.set_irg_start(ptr, node.ptr);
	}
	
	public void setEndBlock(Block block) {
		binding.set_irg_end_block(ptr, block.ptr);
	}
	
	public void setEnd(Node node) {
		binding.set_irg_end(ptr, node.ptr);
	}
	
	public void setEndReg(Node node) {
		binding.set_irg_end_reg(ptr, node.ptr);
	}
	
	public void setInitialExec(Node node) {
		binding.set_irg_initial_exec(ptr, node.ptr);
	}
	
	public void setInitialMem(Node node) {
		binding.set_irg_initial_mem(ptr, node.ptr);
	}
	
	public void setFrame(Node node) {
		binding.set_irg_frame(ptr, node.ptr);
	}
	
	public void setTls(Node node) {
		binding.set_irg_tls(ptr, node.ptr);
	}
	
	public void setArgs(Node node) {
		binding.set_irg_args(ptr, node.ptr);
	}
	
	public void setValueParamBase(Node node) {
		binding.set_irg_value_param_base(ptr, node.ptr);
	}
	
	public void setBad(Node node) {
		binding.set_irg_bad(ptr, node.ptr);
	}
	
	public void setNoMem(Node node) {
		binding.set_irg_no_mem(ptr, node.ptr);
	}
	
	public Block getCurrentBlock() {
		return new Block(binding.get_irg_current_block(ptr));
	}
	
	public void setCurrentBlock(Block block) {
		binding.set_irg_current_block(ptr, block.ptr);
	}
	
	public int getnLocalVars() {
		return binding.get_irg_n_locs(ptr);
	}
	
	public int getNr() {
		return binding.get_irg_graph_nr(ptr).intValue();
	}
	
	public int getIdx() {
		return binding.get_irg_idx(ptr);
	}
	
	public void incVisited() {
		binding.inc_irg_visited(ptr);
	}
	
	public int getVisited() {
		return binding.get_irg_visited(ptr).intValue();
	}
	
	public void setVisited(int visited) {
		binding.set_irg_visited(ptr, new NativeLong(visited));
	}
	
	public void incBlockVisited() {
		binding.inc_irg_block_visited(ptr);
	}
	
	public int getBlockVisited() {
		return binding.get_irg_block_visited(ptr).intValue();
	}
	
	public void setBlockVisited(int visited) {
		binding.set_irg_block_visited(ptr, new NativeLong(visited));
	}
	
	public int getLastIdx() {
		return binding.get_irg_last_idx(ptr);
	}
	
	private void walkHelper(GraphWalker walker, Node node) {
		if (node.visited())
			return;
		node.markVisited();
		
		walker.visiteNode(node);
		if (node.getBlock() != null) {
			walkHelper(walker, node.getBlock());			
		}
		for (Node pred : node.getPreds()) {
			walkHelper(walker, pred);
		}
	}
	
	private void walkHelperPostorder(GraphWalker walker, Node node) {
		if (node.visited())
			return;
		node.markVisited();
		
		if (node.getBlock() != null) {
			walkHelper(walker, node.getBlock());			
		}
		for (Node pred : node.getPreds()) {
			walkHelper(walker, pred);
		}
		walker.visiteNode(node);		
	}
	
	private void blockWalkHelper(BlockWalker walker, Node node) {
		Block block = node.getBlock();
		if (block.blockVisited())
			return;
		block.markBlockVisited();
		
		walker.visitBlock(block);
		for (Node pred : block.getPreds()) {
			blockWalkHelper(walker, pred);
		}		
	}
	
	protected void incrementNodeVisited() {
		binding.inc_irg_visited(ptr);
	}
	
	protected void incrementBlockVisited() {
		binding.inc_irg_block_visited(ptr);
	}
	
	/**
	 * visits all nodes of the graph, starting at the end node
	 * @param walker
	 */
	public void walk(GraphWalker walker) {
		incrementNodeVisited();
		walkHelper(walker, getEnd());
	}
	
	/**
	 * visits all nodes of the graph in postorder.
	 * This means that except for cycles all predecessors
	 * will have been visited before a node is visited.
	 * @param walker
	 */
	public void walkPostorder(GraphWalker walker) {
		incrementNodeVisited();
		walkHelperPostorder(walker, getEnd());
	}
	
	/**
	 * Visits all block nodes in a graph
	 * @param walker
	 */
	public void walkBlocks(BlockWalker walker) {
		incrementBlockVisited();
		blockWalkHelper(walker, getEnd());
	}
	
	public void setPhaseState(binding_irgraph.irg_phase_state state) {
		binding.set_irg_phase_state(ptr, state.val);
	}
	
	public binding_irgraph.irg_phase_state getPhaseState() {
		return binding_irgraph.irg_phase_state.getEnum(binding.get_irg_phase_state(ptr));
	}
}
