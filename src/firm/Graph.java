/* Warning: automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.nodes.Block;
import firm.nodes.Node;

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


	
	
	
	
	public final Node newNoMem() {
		return Node.createWrapper(binding_cons.new_r_NoMem(this.ptr));
	}
	
	
	
	public final Node newConst(firm.TargetValue tarval) {
		return Node.createWrapper(binding_cons.new_r_Const(this.ptr, tarval.ptr));
	}
	
	
	
	public final Node newSub(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Sub(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newConfirm(Block block, Node value, Node bound, int cmp) {
		return Node.createWrapper(binding_cons.new_r_Confirm(this.ptr, block.ptr, value.ptr, bound.ptr, cmp));
	}
	
	
	
	public final Node newUnknown(firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Unknown(this.ptr, mode.ptr));
	}
	
	
	
	public final Node newMux(Block block, Node sel, Node _false, Node _true, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mux(this.ptr, block.ptr, sel.ptr, _false.ptr, _true.ptr, mode.ptr));
	}
	
	
	
	
	
	public final Node newAlloc(Block block, Node mem, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		return Node.createWrapper(binding_cons.new_r_Alloc(this.ptr, block.ptr, mem.ptr, size.ptr, type.ptr, where.val));
	}
	
	
	
	
	
	public final Node newAdd(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Add(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newAbs(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Abs(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public final Node newCall(Block block, Node mem, Node ptr, Node[] ins, firm.Type type) {
		return Node.createWrapper(binding_cons.new_r_Call(this.ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), type.ptr));
	}
	
	
	
	public final Node newProj(Block block, Node pred, firm.Mode mode, int proj) {
		return Node.createWrapper(binding_cons.new_r_Proj(this.ptr, block.ptr, pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj)));
	}
	
	
	
	public final Node newMul(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mul(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newStore(Block block, Node mem, Node ptr, Node value, firm.bindings.binding_ircons.ir_cons_flags flags) {
		return Node.createWrapper(binding_cons.new_r_Store(this.ptr, block.ptr, mem.ptr, ptr.ptr, value.ptr, flags.val));
	}
	
	
	
	public final Node newMulh(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mulh(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newReturn(Block block, Node mem, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Return(this.ptr, block.ptr, mem.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	
	
	public final Node newTuple(Block block, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Tuple(this.ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	
	
	public final Node newJmp(Block block) {
		return Node.createWrapper(binding_cons.new_r_Jmp(this.ptr, block.ptr));
	}
	
	
	
	public final Node newFree(Block block, Node mem, Node ptr, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		return Node.createWrapper(binding_cons.new_r_Free(this.ptr, block.ptr, mem.ptr, ptr.ptr, size.ptr, type.ptr, where.val));
	}
	
	
	
	public final Node newMinus(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Minus(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public final Node newNot(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Not(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public final Node newCond(Block block, Node selector) {
		return Node.createWrapper(binding_cons.new_r_Cond(this.ptr, block.ptr, selector.ptr));
	}
	
	
	
	public final Node newLoad(Block block, Node mem, Node ptr, firm.Mode load_mode, firm.bindings.binding_ircons.ir_cons_flags flags) {
		return Node.createWrapper(binding_cons.new_r_Load(this.ptr, block.ptr, mem.ptr, ptr.ptr, load_mode.ptr, flags.val));
	}
	
	
	
	public final Node newShr(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shr(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	
	
	
	
	public final Node newEor(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Eor(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newBad() {
		return Node.createWrapper(binding_cons.new_r_Bad(this.ptr));
	}
	
	
	
	public final Node newRotl(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Rotl(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	
	
	public final Node newShl(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shl(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newOr(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Or(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	
	
	public final Node newCmp(Block block, Node left, Node right) {
		return Node.createWrapper(binding_cons.new_r_Cmp(this.ptr, block.ptr, left.ptr, right.ptr));
	}
	
	
	
	public final Node newAnd(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_And(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newPin(Block block, Node op) {
		return Node.createWrapper(binding_cons.new_r_Pin(this.ptr, block.ptr, op.ptr));
	}
	
	
	
	public final Node newConv(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Conv(this.ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public final Node newSync(Block block, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Sync(this.ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	
	
	public final Node newIJmp(Block block, Node target) {
		return Node.createWrapper(binding_cons.new_r_IJmp(this.ptr, block.ptr, target.ptr));
	}
	
	
	
	
	
	public final Node newShrs(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shrs(this.ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public final Node newSel(Block block, Node mem, Node ptr, Node[] ins, firm.Entity entity) {
		return Node.createWrapper(binding_cons.new_r_Sel(this.ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), entity.ptr));
	}
	
	

}