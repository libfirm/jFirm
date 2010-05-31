package firm;

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import firm.bindings.Bindings;
import firm.bindings.binding_ircons;
import firm.bindings.binding_irgraph;
import firm.bindings.binding_irnode;
import firm.bindings.binding_irop;
import firm.bindings.binding_irnode.ir_opcode;
import firm.bindings.binding_irvrfy.irg_verify_flags_t;
import firm.nodes.Bad;
import firm.nodes.Block;
import firm.nodes.End;
import firm.nodes.NoMem;
import firm.nodes.Node;
import firm.nodes.NodeVisitor;
import firm.nodes.Phi;
import firm.nodes.Proj;
import firm.nodes.Start;

/**
 * Implements basic Graph functions. This is supposed to be the base for
 * the automatically generated code in the Graph class.
 */
public abstract class GraphBase extends JNAWrapper {
	
	static final binding_irgraph binding = Bindings.getIrGraphBinding();
	static final binding_irnode binding_node = Bindings.getIrNodeBinding();
	static final binding_irop binding_op = Bindings.getIrOpBinding();
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
	
	public Node newConst(int value, Mode mode) {
		return Node.createWrapper(binding_cons.new_rd_Const_long(Pointer.NULL, ptr, mode.ptr, new NativeLong(value)));
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
	public Start getStart() {
		return new Start(binding.get_irg_start(ptr));
	}
	
	/** returns the end block */
	public Block getEndBlock() {
		return new Block(binding.get_irg_end_block(ptr));
	}
	
	/** returns the end node */
	public End getEnd() {
		return new End(binding.get_irg_end(ptr));
	}
	
	/** returns the end node for exceptions */
	public End getEndReg() {
		return new End(binding.get_irg_end_reg(ptr));
	}
	
	/** returns the initial ProjX node (start of control flow) */
	public Proj getInitialExec() {
		return new Proj(binding.get_irg_initial_exec(ptr));
	}
	
	/** returns the initial memory */
	public Node getInitialMem() {
		return Node.createWrapper(binding.get_irg_initial_mem(ptr));
	}
	
	/** returns the pointer to the functions stackframe */
	public Node getFrame() {
		return Node.createWrapper(binding.get_irg_frame(ptr));
	}
	
	/** returns the pointer to the thread local storage area */
	public Node getTls() {
		return Node.createWrapper(binding.get_irg_tls(ptr));
	}
	
	/** returns function arguments */
	public Node getArgs() {
		return Node.createWrapper(binding.get_irg_args(ptr));
	}
	
	/** returns the Bad node */
	public Bad getBad() {
		return new Bad(binding.get_irg_bad(ptr));
	}
	
	/** return the NoMem node */
	public NoMem getNoMem() {
		return new NoMem(binding.get_irg_no_mem(ptr));
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
	
	private void walkHelper(NodeVisitor walker, Node node) {
		if (node.visited())
			return;
		node.markVisited();
		
		node.accept(walker);
		if (node.getBlock() != null) {
			walkHelper(walker, node.getBlock());			
		}
		for (Node pred : node.getPreds()) {
			walkHelper(walker, pred);
		}
	}
	
	private void walkHelperPostorder(NodeVisitor walker, Node node) {
		if (node.visited())
			return;
		node.markVisited();
		
		if (node.getBlock() != null) {
			walkHelperPostorder(walker, node.getBlock());			
		}
		for (Node pred : node.getPreds()) {
			walkHelperPostorder(walker, pred);
		}
		node.accept(walker);
	}
	
	/**
	 * variation of the postorder walker, breaking loops at phi/jump nodes.
	 * This ensures that all nodes inside a basic block are visited in a
	 * topological order.
	 */
	private void walkTopologicalHelper(NodeVisitor walker, Node node) {
		if (node.visited())
			return;
		
		/* only break loops at phi/block nodes */
		boolean isLoopBreaker =
			node.getClass() == Phi.class || node.getClass() == Block.class;
		if (isLoopBreaker) {
			node.markVisited();
		}

		if (node.getBlock() != null) {
			walkTopologicalHelper(walker, node.getBlock());
		}
		for (Node pred : node.getPreds()) {
			walkTopologicalHelper(walker, pred);
		}
		
		if (isLoopBreaker || !node.visited())
			node.accept(walker);
		node.markVisited();
	}	
	
	private void blockWalkHelper(BlockWalker walker, Node node) {
		Node nodeBlock = node.getBlock();
		if (nodeBlock.getClass() == Bad.class)
			return;
		
		Block block = (Block) nodeBlock;
		if (block.blockVisited())
			return;
		block.markBlockVisited();
		
		walker.visitBlock(block);
		for (Node pred : block.getPreds()) {
			blockWalkHelper(walker, pred);
		}		
	}
	
	private void blockWalkHelperPostorder(BlockWalker walker, Node node) {
		Node nodeBlock = node.getBlock();
		if (nodeBlock.getClass() == Bad.class)
			return;
		
		Block block = (Block) nodeBlock;
		if (block.blockVisited())
			return;
		block.markBlockVisited();
		
		for (Node pred : block.getPreds()) {
			blockWalkHelperPostorder(walker, pred);
		}		
		walker.visitBlock(block);
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
	public void walk(NodeVisitor walker) {
		incrementNodeVisited();
		walkHelper(walker, getEnd());
	}
	
	/**
	 * visits all nodes of the graph in postorder.
	 * This means that except for cycles all predecessors
	 * will have been visited before a node is visited.
	 * @param walker
	 */
	public void walkPostorder(NodeVisitor walker) {
		incrementNodeVisited();
		walkHelperPostorder(walker, getEnd());
	}
	
	/**
	 * walks all graph nodes, ensuring that nodes inside a basic block are visited in
	 * topological order. Nodes in different blocks might still get visited in an
	 * interleaved order.
	 */
	public void walkTopological(NodeVisitor visitor) {
		incrementNodeVisited();
		walkTopologicalHelper(visitor, getEnd());
	}	
	
	/**
	 * Visits all block nodes in a graph
	 */
	public void walkBlocks(BlockWalker walker) {
		incrementBlockVisited();
		blockWalkHelper(walker, getEnd());
	}
	
	/**
	 * Visits all block nodes in a graph in postorder
	 */
	public void walkBlocksPostorder(BlockWalker walker) {
		incrementBlockVisited();
		blockWalkHelperPostorder(walker, getEnd());
	}
	
	public void setPhaseState(binding_irgraph.irg_phase_state state) {
		binding.set_irg_phase_state(ptr, state.val);
	}
	
	public binding_irgraph.irg_phase_state getPhaseState() {
		return binding_irgraph.irg_phase_state.getEnum(binding.get_irg_phase_state(ptr));
	}
	
	@Override
	public String toString() {
		String name;
		/* special handling for const code graph as it has no entity... */
		if (equals(Program.getConstCodeGraph())) {
			name = "$ConstCode$";
		} else {
			name = getEntity().getName();
		}
		
		return "Graph " + name;
	}

	/**
	 * Checks if a graph is well formed
	 * @param graph   the graph to check
	 */
	public void check() {
		Util.binding_vrfy.irg_verify(ptr, irg_verify_flags_t.VRFY_ENFORCE_SSA.val);
	}

	/** 
	 * Turns a node into a "useless" Tuple.
	 *
	 *  Turns a node into a "useless" Tuple.  The Tuple node just forms a tuple
	 *  from several inputs.  The predecessors of the tuple have to be
	 *  set by hand.  The block predecessor automatically remains the same.
	 *  This is useful if a node returning a tuple is removed, but the Projs
	 *  extracting values from the tuple are not available.
	 *
	 *  @param node The node to be turned into a tuple.
	 *  @param outArity The number of values formed into a Tuple.
	 */
	public static Node turnIntoTuple(Node node, int outArity) {
		Util.binding_mod.turn_into_tuple(node.ptr, outArity);
		Node tuple = Node.createWrapper(node.ptr);
		Graph graph = node.getGraph();
		for (int i = 0; i < outArity; ++i) {
			tuple.setPred(i, graph.newBad());
		}
		return tuple;
	}

	/**
	 * Kill a node by setting its predecessors to Bad and finally
	 * exchange the node by Bad itself.
	 */
	public static void killNode(Node node) {
		Util.binding_mod.kill_node(node.ptr);
	}

	/** 
	 * Exchanges two nodes by conserving edges leaving old (i.e.,
	 * pointers pointing to old).  Turns the old node into an Id. 
	 */
	public static void exchange(Node oldNode, Node newNode) {
		assert oldNode != newNode;
		assert !oldNode.equals(newNode);
		Util.binding_mod.exchange(oldNode.ptr, newNode.ptr);
	}
	
	public static class IrOpOps extends Structure {
		public IrOpOps(Pointer ptr) {
			super(ptr);
			read();
		}
		
		public Pointer    hash_func;
		public Pointer    computed_value;
		public Pointer    computed_value_Proj;
		public Pointer    equivalent_node;
		public Pointer    equivalent_node_Proj;
		public Pointer    transform_node;
		public Pointer    transform_node_Proj;
		public Pointer    node_cmp_attr;
		public Pointer    reassociate;
		private static interface CopyAttrCallback extends Callback {
			void invoke(Pointer old_node, Pointer new_node);
		}
		public CopyAttrCallback copy_attr;
		public Pointer    get_type;
		public Pointer    get_type_attr;
		public Pointer    get_entity_attr;
		public Pointer    verify_node;
		public Pointer    verify_proj_node;
		public Pointer    dump_node;
		public Pointer    generic;
		public Pointer    be_ops;
	}
	
	private void copyNodeAttr(Pointer old_node, Pointer new_node) {
		Pointer op = binding_node.get_irn_op(old_node);
		IrOpOps ops = new IrOpOps(binding_op.get_op_ops(op));
		ops.copy_attr.invoke(old_node, new_node);
	}
	
	/**
	 * Copies a node and its attributes into the graph.
	 * The node is allowed to be on a different graph.
	 * Note that the predecessors might still point to nodes on the other
	 * graph after the copy operation which is not valid until you have
	 * exchanged the predecessors.
	 * (Note: node.getGraph() uses the block to detect the graph! So as long as
	 *  you haven't exchanged the block yet, you will get invalid answers when
	 *  calling getGraph() on the copied node)
	 */
	public Node copyNode(Node node) {
		Pointer dbgi = binding_node.get_irn_dbg_info(node.ptr);
		Pointer op = binding_node.get_irn_op(node.ptr);
		Pointer mode = binding_node.get_irn_mode(node.ptr);
		int arity = binding_node.get_irn_arity(node.ptr);
		Pointer[] ins = new Pointer[arity];
		for (int i = 0; i < arity; ++i) {
			ins[i] = node.getPred(i).ptr;
		}
		Pointer block;
		if (node.getOpCode() == ir_opcode.iro_Block) {
			block = null;
		} else {
			block = binding_node.get_nodes_block(node.ptr);
		}
		Pointer new_node = binding_node.new_ir_node(dbgi, ptr, block, op, mode, arity, ins);
		if (node.getOpCode() == ir_opcode.iro_Block) {
			Pointer macroblock = binding_node.get_Block_MacroBlock(node.ptr);
			binding_node.set_Block_MacroBlock(new_node, macroblock);
		}
		copyNodeAttr(node.ptr, new_node);
		
		return Node.createWrapper(new_node);
	}
	
	/**
	 * Notify the graph that control flow has changed, so dominance and other
	 * information gets invalidated.
	 */
	public void notifyControlFlowChange() {
		binding.set_irg_loopinfo_inconsistent(ptr);
		binding.set_irg_doms_inconsistent(ptr);
		binding.set_irg_extblk_inconsistent(ptr);
		binding.set_irg_outs_inconsistent(ptr);
	}
}
