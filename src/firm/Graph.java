/* Warning: automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.nodes.Node;

/**
 * A graph is an object owning stuff related to a firm graph. That is:
 * 
 * - Nodes and Blocks
 * - A type describing the stackframe layout
 * - Direct pointers to some unique nodes (StartBlock, Start, ...)
 * - Helper functions to traverse the graph
 */
public class Graph extends GraphBase {

	public Graph(Pointer pointer) {
		super(pointer);
	}

	/**
	 * create a new firm graph.
	 * You have to specify the number of parameters, you want to use during
	 * graph construction (for Construction.setVariable/Construction.getVariable)
	 * @param entity      Entity for the graph (an entity with MethodType)
	 * @param nLocalVars  number of local variables during graph construction
	 */
	public Graph(Entity entity, int nLocalVars) {
		this(binding.new_ir_graph(entity.ptr, nLocalVars));
	}

	
	/** Create a new NoMem node */
	public final Node newNoMem() {
		return Node.createWrapper(binding_cons.new_r_NoMem(this.ptr));
	}
	
	/** Create a new Const node */
	public final Node newConst(firm.TargetValue tarval) {
		return Node.createWrapper(binding_cons.new_r_Const(this.ptr, tarval.ptr));
	}
	
	/** Create a new Raise node */
	public final Node newRaise(Node block, Node mem, Node exo_ptr) {
		return Node.createWrapper(binding_cons.new_r_Raise(this.ptr, block.ptr, mem.ptr, exo_ptr.ptr));
	}
	
	/** Create a new Quot node */
	public final Node newQuot(Node block, Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		return Node.createWrapper(binding_cons.new_r_Quot(this.ptr, block.ptr, mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val));
	}
	
	/** Create a new Unknown node */
	public final Node newUnknown(firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Unknown(this.ptr, mode.ptr));
	}
	
	/** Create a new Add node */
	public final Node newAdd(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Add(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Proj node */
	public final Node newProj(Node block, Node pred, firm.Mode mode, int proj) {
		return Node.createWrapper(binding_cons.new_r_Proj(this.ptr, block.ptr, pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj)));
	}
	
	/** Create a new Store node */
	public final Node newStore(Node block, Node mem, Node ptr, Node value, firm.bindings.binding_ircons.ir_cons_flags flags) {
		return Node.createWrapper(binding_cons.new_r_Store(this.ptr, block.ptr, mem.ptr, ptr.ptr, value.ptr, flags.val));
	}
	
	/** Create a new Mulh node */
	public final Node newMulh(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mulh(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Tuple node */
	public final Node newTuple(Node block, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Tuple(this.ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	/** Create a new Jmp node */
	public final Node newJmp(Node block) {
		return Node.createWrapper(binding_cons.new_r_Jmp(this.ptr, block.ptr));
	}
	
	/** Create a new Free node */
	public final Node newFree(Node block, Node mem, Node ptr, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		return Node.createWrapper(binding_cons.new_r_Free(this.ptr, block.ptr, mem.ptr, ptr.ptr, size.ptr, type.ptr, where.val));
	}
	
	/** Create a new Or node */
	public final Node newOr(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Or(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Break node */
	public final Node newBreak(Node block) {
		return Node.createWrapper(binding_cons.new_r_Break(this.ptr, block.ptr));
	}
	
	/** Create a new Not node */
	public final Node newNot(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Not(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	/** Create a new InstOf node */
	public final Node newInstOf(Node block, Node store, Node obj, firm.Type type) {
		return Node.createWrapper(binding_cons.new_r_InstOf(this.ptr, block.ptr, store.ptr, obj.ptr, type.ptr));
	}
	
	/** Create a new Mod node */
	public final Node newMod(Node block, Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		return Node.createWrapper(binding_cons.new_r_Mod(this.ptr, block.ptr, mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val));
	}
	
	/** Create a new Load node */
	public final Node newLoad(Node block, Node mem, Node ptr, firm.Mode load_mode, firm.bindings.binding_ircons.ir_cons_flags flags) {
		return Node.createWrapper(binding_cons.new_r_Load(this.ptr, block.ptr, mem.ptr, ptr.ptr, load_mode.ptr, flags.val));
	}
	
	/** Create a new Shr node */
	public final Node newShr(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shr(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Filter node */
	public final Node newFilter(Node block, Node pred, firm.Mode mode, int proj) {
		return Node.createWrapper(binding_cons.new_r_Filter(this.ptr, block.ptr, pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj)));
	}
	
	/** Create a new Bad node */
	public final Node newBad() {
		return Node.createWrapper(binding_cons.new_r_Bad(this.ptr));
	}
	
	/** Create a new DivMod node */
	public final Node newDivMod(Node block, Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		return Node.createWrapper(binding_cons.new_r_DivMod(this.ptr, block.ptr, mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val));
	}
	
	/** Create a new Div node */
	public final Node newDiv(Node block, Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		return Node.createWrapper(binding_cons.new_r_Div(this.ptr, block.ptr, mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val));
	}
	
	/** Create a new Shl node */
	public final Node newShl(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shl(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Minus node */
	public final Node newMinus(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Minus(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	/** Create a new Cmp node */
	public final Node newCmp(Node block, Node left, Node right) {
		return Node.createWrapper(binding_cons.new_r_Cmp(this.ptr, block.ptr, left.ptr, right.ptr));
	}
	
	/** Create a new And node */
	public final Node newAnd(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_And(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Pin node */
	public final Node newPin(Node block, Node op) {
		return Node.createWrapper(binding_cons.new_r_Pin(this.ptr, block.ptr, op.ptr));
	}
	
	/** Create a new IJmp node */
	public final Node newIJmp(Node block, Node target) {
		return Node.createWrapper(binding_cons.new_r_IJmp(this.ptr, block.ptr, target.ptr));
	}
	
	/** Create a new Shrs node */
	public final Node newShrs(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shrs(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Sel node */
	public final Node newSel(Node block, Node mem, Node ptr, Node[] ins, firm.Entity entity) {
		return Node.createWrapper(binding_cons.new_r_Sel(this.ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), entity.ptr));
	}
	
	/** Create a new Sub node */
	public final Node newSub(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Sub(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Confirm node */
	public final Node newConfirm(Node block, Node value, Node bound, int cmp) {
		return Node.createWrapper(binding_cons.new_r_Confirm(this.ptr, block.ptr, value.ptr, bound.ptr, cmp));
	}
	
	/** Create a new Mux node */
	public final Node newMux(Node block, Node sel, Node _false, Node _true, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mux(this.ptr, block.ptr, sel.ptr, _false.ptr, _true.ptr, mode.ptr));
	}
	
	/** Create a new Sync node */
	public final Node newSync(Node block, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Sync(this.ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	/** Create a new Builtin node */
	public final Node newBuiltin(Node block, Node mem, Node[] ins, firm.bindings.binding_ircons.ir_builtin_kind kind, firm.Type type) {
		return Node.createWrapper(binding_cons.new_r_Builtin(this.ptr, block.ptr, mem.ptr, ins.length, Node.getPointerListFromNodeList(ins), kind.val, type.ptr));
	}
	
	/** Create a new Abs node */
	public final Node newAbs(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Abs(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	/** Create a new Call node */
	public final Node newCall(Node block, Node mem, Node ptr, Node[] ins, firm.Type type) {
		return Node.createWrapper(binding_cons.new_r_Call(this.ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), type.ptr));
	}
	
	/** Create a new Mul node */
	public final Node newMul(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mul(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Phi node */
	public final Node newPhi(Node block, Node[] ins, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Phi(this.ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins), mode.ptr));
	}
	
	/** Create a new Return node */
	public final Node newReturn(Node block, Node mem, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Return(this.ptr, block.ptr, mem.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	/** Create a new CopyB node */
	public final Node newCopyB(Node block, Node mem, Node dst, Node src, firm.Type type) {
		return Node.createWrapper(binding_cons.new_r_CopyB(this.ptr, block.ptr, mem.ptr, dst.ptr, src.ptr, type.ptr));
	}
	
	/** Create a new Alloc node */
	public final Node newAlloc(Node block, Node mem, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		return Node.createWrapper(binding_cons.new_r_Alloc(this.ptr, block.ptr, mem.ptr, size.ptr, type.ptr, where.val));
	}
	
	/** Create a new Eor node */
	public final Node newEor(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Eor(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Rotl node */
	public final Node newRotl(Node block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Rotl(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	/** Create a new Block node */
	public final Node newBlock(Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Block(this.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	/** Create a new Conv node */
	public final Node newConv(Node block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Conv(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	/** Create a new Cast node */
	public final Node newCast(Node block, Node op, firm.Type type) {
		return Node.createWrapper(binding_cons.new_r_Cast(this.ptr, block.ptr, op.ptr, type.ptr));
	}
	
	/** Create a new Bound node */
	public final Node newBound(Node block, Node mem, Node index, Node lower, Node upper) {
		return Node.createWrapper(binding_cons.new_r_Bound(this.ptr, block.ptr, mem.ptr, index.ptr, lower.ptr, upper.ptr));
	}
	
	/** Create a new Cond node */
	public final Node newCond(Node block, Node selector) {
		return Node.createWrapper(binding_cons.new_r_Cond(this.ptr, block.ptr, selector.ptr));
	}
	
	/** Create a new Id node */
	public final Node newId(Node block, Node pred, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Id(this.ptr, block.ptr, pred.ptr, mode.ptr));
	}
	
}