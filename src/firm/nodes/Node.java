/* Warning: automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Node extends NodeBase {

	public Node(Pointer pointer) {
		super(pointer);
	}

	
	
	
	
	public static Node newNoMem() {
		return Node.createWrapper(binding_cons.new_r_NoMem(firm.Graph.getCurrent().ptr));
	}
	
	
	
	public static Node newConst(firm.TargetValue tarval) {
		return Node.createWrapper(binding_cons.new_r_Const(firm.Graph.getCurrent().ptr, tarval.ptr));
	}
	
	
	
	public static Node newSub(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Sub(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newConfirm(Block block, Node value, Node bound, int cmp) {
		return Node.createWrapper(binding_cons.new_r_Confirm(firm.Graph.getCurrent().ptr, block.ptr, value.ptr, bound.ptr, cmp));
	}
	
	
	
	public static Node newUnknown(firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Unknown(firm.Graph.getCurrent().ptr, mode.ptr));
	}
	
	
	
	public static Node newMux(Block block, Node sel, Node _false, Node _true, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mux(firm.Graph.getCurrent().ptr, block.ptr, sel.ptr, _false.ptr, _true.ptr, mode.ptr));
	}
	
	
	
	
	
	public static Node newAlloc(Block block, Node mem, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		return Node.createWrapper(binding_cons.new_r_Alloc(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, size.ptr, type.ptr, where.val));
	}
	
	
	
	
	
	public static Node newAdd(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Add(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newAbs(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Abs(firm.Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public static Node newCall(Block block, Node mem, Node ptr, Node[] ins, firm.Type type) {
		return Node.createWrapper(binding_cons.new_r_Call(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), type.ptr));
	}
	
	
	
	public static Node newProj(Block block, Node pred, firm.Mode mode, int proj) {
		return Node.createWrapper(binding_cons.new_r_Proj(firm.Graph.getCurrent().ptr, block.ptr, pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj)));
	}
	
	
	
	public static Node newMul(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mul(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newStore(Block block, Node mem, Node ptr, Node value, firm.bindings.binding_ircons.cons_flags flags) {
		return Node.createWrapper(binding_cons.new_r_Store(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, value.ptr, flags.val));
	}
	
	
	
	public static Node newMulh(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Mulh(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newReturn(Block block, Node mem, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Return(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	
	
	public static Node newTuple(Block block, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Tuple(firm.Graph.getCurrent().ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	
	
	public static Node newJmp(Block block) {
		return Node.createWrapper(binding_cons.new_r_Jmp(firm.Graph.getCurrent().ptr, block.ptr));
	}
	
	
	
	public static Node newFree(Block block, Node mem, Node ptr, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		return Node.createWrapper(binding_cons.new_r_Free(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, size.ptr, type.ptr, where.val));
	}
	
	
	
	public static Node newMinus(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Minus(firm.Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public static Node newNot(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Not(firm.Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public static Node newCond(Block block, Node selector) {
		return Node.createWrapper(binding_cons.new_r_Cond(firm.Graph.getCurrent().ptr, block.ptr, selector.ptr));
	}
	
	
	
	public static Node newLoad(Block block, Node mem, Node ptr, firm.Mode mode, firm.bindings.binding_ircons.cons_flags flags) {
		return Node.createWrapper(binding_cons.new_r_Load(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, mode.ptr, flags.val));
	}
	
	
	
	public static Node newShr(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shr(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	
	
	
	
	public static Node newEor(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Eor(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newBad() {
		return Node.createWrapper(binding_cons.new_r_Bad(firm.Graph.getCurrent().ptr));
	}
	
	
	
	public static Node newRotl(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Rotl(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	
	
	public static Node newShl(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shl(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newOr(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Or(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	
	
	public static Node newCmp(Block block, Node left, Node right) {
		return Node.createWrapper(binding_cons.new_r_Cmp(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr));
	}
	
	
	
	public static Node newAnd(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_And(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newPin(Block block, Node op) {
		return Node.createWrapper(binding_cons.new_r_Pin(firm.Graph.getCurrent().ptr, block.ptr, op.ptr));
	}
	
	
	
	public static Node newConv(Block block, Node op, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Conv(firm.Graph.getCurrent().ptr, block.ptr, op.ptr, mode.ptr));
	}
	
	
	
	public static Node newSync(Block block, Node[] ins) {
		return Node.createWrapper(binding_cons.new_r_Sync(firm.Graph.getCurrent().ptr, block.ptr, ins.length, Node.getPointerListFromNodeList(ins)));
	}
	
	
	
	public static Node newIJmp(Block block, Node target) {
		return Node.createWrapper(binding_cons.new_r_IJmp(firm.Graph.getCurrent().ptr, block.ptr, target.ptr));
	}
	
	
	
	
	
	public static Node newShrs(Block block, Node left, Node right, firm.Mode mode) {
		return Node.createWrapper(binding_cons.new_r_Shrs(firm.Graph.getCurrent().ptr, block.ptr, left.ptr, right.ptr, mode.ptr));
	}
	
	
	
	public static Node newSel(Block block, Node mem, Node ptr, Node[] ins, firm.Entity entity) {
		return Node.createWrapper(binding_cons.new_r_Sel(firm.Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), entity.ptr));
	}
	
	

}