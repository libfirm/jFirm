/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.nodes.Node;

class ConstructionBase {

	protected ConstructionBase() {
	}

	
	
	public Node newAdd(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Add(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newAlloc(Node mem, Node count, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Alloc(mem.ptr, count.ptr, type.ptr, where.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newAnd(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_And(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newBad() {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Bad();
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newBlock(Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Block(ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newBorrow(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Borrow(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newBound(Node mem, Node index, Node lower, Node upper) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Bound(mem.ptr, index.ptr, lower.ptr, upper.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newBuiltin(Node mem, Node[] ins, firm.bindings.binding_ircons.ir_builtin_kind kind, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Builtin(mem.ptr, ins.length, Node.getBufferFromNodeList(ins), kind.val, type.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCall(Node mem, Node ptr, Node[] ins, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Call(mem.ptr, ptr.ptr, ins.length, Node.getBufferFromNodeList(ins), type.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCarry(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Carry(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCast(Node op, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Cast(op.ptr, type.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCmp(Node left, Node right) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Cmp(left.ptr, right.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCond(Node selector) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Cond(selector.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newConfirm(Node value, Node bound, int cmp) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Confirm(value.ptr, bound.ptr, cmp);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newConst(firm.TargetValue tarval) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Const(tarval.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newConv(Node op, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Conv(op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCopyB(Node mem, Node dst, Node src, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_CopyB(mem.ptr, dst.ptr, src.ptr, type.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newDiv(Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Div(mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newDivMod(Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_DivMod(mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newDummy(firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Dummy(mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newEor(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Eor(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newFree(Node mem, Node ptr, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Free(mem.ptr, ptr.ptr, size.ptr, type.ptr, where.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newIJmp(Node target) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_IJmp(target.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newId(Node pred, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Id(pred.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newInstOf(Node store, Node obj, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_InstOf(store.ptr, obj.ptr, type.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newJmp() {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Jmp();
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newLoad(Node mem, Node ptr, firm.Mode load_mode, firm.bindings.binding_ircons.ir_cons_flags flags) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Load(mem.ptr, ptr.ptr, load_mode.ptr, flags.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMinus(Node op, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Minus(op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMod(Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Mod(mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMul(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Mul(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMulh(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Mulh(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMux(Node sel, Node _false, Node _true, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Mux(sel.ptr, _false.ptr, _true.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newNoMem() {
		Pointer result_ptr = firm.bindings.binding_ircons.new_NoMem();
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newNot(Node op, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Not(op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newOr(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Or(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newPhi(Node[] ins, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Phi(ins.length, Node.getBufferFromNodeList(ins), mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newPin(Node op) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Pin(op.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newProj(Node pred, firm.Mode mode, int proj) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Proj(pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newQuot(Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Quot(mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newRaise(Node mem, Node exo_ptr) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Raise(mem.ptr, exo_ptr.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newReturn(Node mem, Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Return(mem.ptr, ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newRotl(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Rotl(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newSel(Node mem, Node ptr, Node[] ins, firm.Entity entity) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Sel(mem.ptr, ptr.ptr, ins.length, Node.getBufferFromNodeList(ins), entity.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newShl(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Shl(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newShr(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Shr(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newShrs(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Shrs(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newStart() {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Start();
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newStore(Node mem, Node ptr, Node value, firm.bindings.binding_ircons.ir_cons_flags flags) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Store(mem.ptr, ptr.ptr, value.ptr, flags.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newSub(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Sub(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newSync(Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Sync(ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newTuple(Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Tuple(ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newUnknown(firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_Unknown(mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	
}