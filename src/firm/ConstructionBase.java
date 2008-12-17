/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
import firm.bindings.Bindings;
import firm.nodes.Node;

class ConstructionBase {

	protected static final binding_ircons binding_cons = Bindings.getIrConsBinding();
	protected static final binding_irnode binding = Bindings.getIrNodeBinding();

	protected ConstructionBase() {
	}

	
	
	
	
	public Node newNoMem() {
		Pointer result_ptr = binding_cons.new_NoMem();
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newConst(firm.TargetValue tarval) {
		Pointer result_ptr = binding_cons.new_Const(tarval.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newSub(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Sub(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newConfirm(Node value, Node bound, int cmp) {
		Pointer result_ptr = binding_cons.new_Confirm(value.ptr, bound.ptr, cmp);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newUnknown(firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Unknown(mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMux(Node sel, Node _false, Node _true, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Mux(sel.ptr, _false.ptr, _true.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newAlloc(Node mem, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		Pointer result_ptr = binding_cons.new_Alloc(mem.ptr, size.ptr, type.ptr, where.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newAdd(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Add(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newAbs(Node op, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Abs(op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCall(Node mem, Node ptr, Node[] ins, firm.Type type) {
		Pointer result_ptr = binding_cons.new_Call(mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), type.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newProj(Node pred, firm.Mode mode, int proj) {
		Pointer result_ptr = binding_cons.new_Proj(pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMul(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Mul(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newStore(Node mem, Node ptr, Node value, firm.bindings.binding_ircons.ir_cons_flags flags) {
		Pointer result_ptr = binding_cons.new_Store(mem.ptr, ptr.ptr, value.ptr, flags.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMulh(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Mulh(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newReturn(Node mem, Node[] ins) {
		Pointer result_ptr = binding_cons.new_Return(mem.ptr, ins.length, Node.getPointerListFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newTuple(Node[] ins) {
		Pointer result_ptr = binding_cons.new_Tuple(ins.length, Node.getPointerListFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newJmp() {
		Pointer result_ptr = binding_cons.new_Jmp();
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newFree(Node mem, Node ptr, Node size, firm.Type type, firm.bindings.binding_ircons.ir_where_alloc where) {
		Pointer result_ptr = binding_cons.new_Free(mem.ptr, ptr.ptr, size.ptr, type.ptr, where.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newMinus(Node op, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Minus(op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newNot(Node op, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Not(op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newCond(Node selector) {
		Pointer result_ptr = binding_cons.new_Cond(selector.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newLoad(Node mem, Node ptr, firm.Mode mode, firm.bindings.binding_ircons.ir_cons_flags flags) {
		Pointer result_ptr = binding_cons.new_Load(mem.ptr, ptr.ptr, mode.ptr, flags.val);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newShr(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Shr(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	
	
	public Node newEor(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Eor(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newBad() {
		Pointer result_ptr = binding_cons.new_Bad();
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newRotl(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Rotl(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newShl(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Shl(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newOr(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Or(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newCmp(Node left, Node right) {
		Pointer result_ptr = binding_cons.new_Cmp(left.ptr, right.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newAnd(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_And(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newPin(Node op) {
		Pointer result_ptr = binding_cons.new_Pin(op.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newConv(Node op, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Conv(op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newSync(Node[] ins) {
		Pointer result_ptr = binding_cons.new_Sync(ins.length, Node.getPointerListFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newIJmp(Node target) {
		Pointer result_ptr = binding_cons.new_IJmp(target.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	
	
	public Node newShrs(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = binding_cons.new_Shrs(left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
	
	public Node newSel(Node mem, Node ptr, Node[] ins, firm.Entity entity) {
		Pointer result_ptr = binding_cons.new_Sel(mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), entity.ptr);
		return Node.createWrapper(result_ptr);
	}
	
	
}