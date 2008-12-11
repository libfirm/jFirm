package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_irgraph;

public final class Graph extends JNAWrapper {
	private static final binding_irgraph binding = Bindings.getIrGraphBinding();
	
	protected Graph(Pointer ptr) {
		super(ptr);
	}
	
	public Graph(Entity entity, int nLocalVars) {
		this(binding.new_ir_graph(entity.ptr, nLocalVars));
	}
	
	public static Graph getCurrent() {
		return new Graph(binding.get_current_ir_graph());
	}
	
	public static void setCurrent(Graph graph) {
		binding.set_current_ir_graph(graph.ptr);
	}
	
	public void free() {
		binding.free_ir_graph(ptr);
	}
	
	public Entity getEntity() {
		return new Entity(binding.get_irg_entity(ptr));
	}
	
	public void setEntity(Entity entity) {
		binding.set_irg_entity(ptr, entity.ptr);
	}
	
	public Type getFrameType() {
		return new Type(binding.get_irg_frame_type(ptr));
	}
	
	public void setFrameType(Type type) {
		binding.set_irg_frame_type(ptr, type.ptr);
	}
	
	public Block getStartBlock() {
		return new Block(binding.get_irg_start_block(ptr));
	}
	
	public Node getStart() {
		return new Node(binding.get_irg_start(ptr));
	}
	
	public Block getEndBlock() {
		return new Block(binding.get_irg_end_block(ptr));
	}
	
	public Node getEnd() {
		return new Node(binding.get_irg_end(ptr));
	}
	
	public Node getEndReg() {
		return new Node(binding.get_irg_end_reg(ptr));
	}
	
	public Node getInitialExec() {
		return new Node(binding.get_irg_initial_exec(ptr));
	}
	
	public Node getInitialMem() {
		return new Node(binding.get_irg_initial_mem(ptr));
	}
	
	public Node getFrame() {
		return new Node(binding.get_irg_frame(ptr));
	}
	
	public Node getTls() {
		return new Node(binding.get_irg_tls(ptr));
	}
	
	public Node getArgs() {
		return new Node(binding.get_irg_args(ptr));
	}
	
	public Node getValueParambase() {
		return new Node(binding.get_irg_value_param_base(ptr));
	}
	
	public Node getBad() {
		return new Node(binding.get_irg_bad(ptr));
	}
	
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
	
	protected void incrementNodeVisited() {
		binding.inc_irg_visited(ptr);
	}
	
	public void walk(GraphWalker walker) {
		incrementNodeVisited();
		walkHelper(walker, getEnd());
	}
	
//	int get_irg_fp_model(Pointer irg);
//	void set_irg_fp_model(Pointer irg, int model);
}
