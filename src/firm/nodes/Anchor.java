/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Anchor extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Anchor(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Anchor();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	public Anchor(Pointer ptr) {
		super(ptr);
	}

	public Node getEndBlock() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_end_block(ptr));
	}

	public void setEndBlock(Node end_block) {
		firm.bindings.binding_irnode.set_Anchor_end_block(this.ptr, end_block.ptr);
	}

	public Node getStartBlock() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_start_block(ptr));
	}

	public void setStartBlock(Node start_block) {
		firm.bindings.binding_irnode.set_Anchor_start_block(this.ptr, start_block.ptr);
	}

	public Node getEnd() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_end(ptr));
	}

	public void setEnd(Node end) {
		firm.bindings.binding_irnode.set_Anchor_end(this.ptr, end.ptr);
	}

	public Node getStart() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_start(ptr));
	}

	public void setStart(Node start) {
		firm.bindings.binding_irnode.set_Anchor_start(this.ptr, start.ptr);
	}

	public Node getFrame() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_frame(ptr));
	}

	public void setFrame(Node frame) {
		firm.bindings.binding_irnode.set_Anchor_frame(this.ptr, frame.ptr);
	}

	public Node getInitialMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_initial_mem(ptr));
	}

	public void setInitialMem(Node initial_mem) {
		firm.bindings.binding_irnode.set_Anchor_initial_mem(this.ptr, initial_mem.ptr);
	}

	public Node getArgs() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_args(ptr));
	}

	public void setArgs(Node args) {
		firm.bindings.binding_irnode.set_Anchor_args(this.ptr, args.ptr);
	}

	public Node getNoMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Anchor_no_mem(ptr));
	}

	public void setNoMem(Node no_mem) {
		firm.bindings.binding_irnode.set_Anchor_no_mem(this.ptr, no_mem.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
