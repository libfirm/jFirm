package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons.cons_flags;
import firm.bindings.binding_irgraph.irg_phase_state;
import firm.bindings.binding_typerep.ir_type_state;
import firm.nodes.Block;
import firm.nodes.Const;
import firm.nodes.Load;
import firm.nodes.Node;
import firm.nodes.Store;
import firm.nodes.SymConst;

public class Construction extends ConstructionBase {
	
	private final Graph graph;
	
	public Construction(Graph graph) {
		this.graph = graph;
		Graph.setCurrent(graph);
	}
	
	public Block newBlock() {
		return new Block(binding_cons.new_immBlock());
	}
	
	public SymConst newSymConst(Entity entity, Mode mode) {
		return new SymConst(entity, mode);
	}
	
	public SymConst newSymConst(Entity entity) {
		return new SymConst(entity);
	}
	
	public Const newConst(TargetValue value) {
		return new Const(value);
	}
	
	public Const newConst(int value, Mode mode) {
		return new Const(value, mode);
	}
	
	public Load newLoad(Node mem, Node ptr, Mode loadMode) {
		return newLoad(mem, ptr, loadMode, cons_flags.cons_none);
	}
	
	public Store newStore(Node mem, Node ptr, Node value) {
		return newStore(mem, ptr, value, cons_flags.cons_none);
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
	
	public void setVariable(int num, Node value) {
		binding_cons.set_value(num, value.ptr);
	}
	
	public Node getVariable(int num, Mode mode) {
		return Node.createWrapper(binding_cons.get_value(num, mode.ptr));
	}
	
	public void finish() {
		/* mature blocks */
		graph.walkBlocks(new BlockWalker() {
			public void visitBlock(Block block) {
				block.mature();
			}
		});
		
		/* construct a frame type... (TODO: do this properly...) */
		Type frameType = graph.getFrameType();
		frameType.setSizeBytes(0);
		frameType.setAlignmentBytes(4);
		frameType.setTypeState(ir_type_state.layout_fixed);
		
		/* set graph to state hight */
		graph.setPhaseState(irg_phase_state.phase_high);
	}
}
