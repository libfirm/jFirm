/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.nodes.Node;
import firm.bindings.binding_ircons;

class ConstructionBase {

	protected final Graph graph;

	protected ConstructionBase(Graph graph) {
		this.graph = graph;
	}

	public Node newAdd(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Add(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newAddress(firm.Entity entity) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Address(graph.ptr, entity.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newAlign(firm.Mode mode, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Align(graph.ptr, mode.ptr, type.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newAlloc(Node mem, Node size, int alignment) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Alloc(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, size.ptr, alignment);
		return Node.createWrapper(result_ptr);
	}

	public Node newAnd(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_And(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newBad(firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Bad(graph.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newBitcast(Node op, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Bitcast(binding_ircons.get_r_cur_block(graph.ptr), op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newBlock(Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Block(graph.ptr, ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}

	public Node newBuiltin(Node mem, Node[] ins, firm.bindings.binding_ircons.ir_builtin_kind kind, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Builtin(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, ins.length, Node.getBufferFromNodeList(ins), kind.val, type.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newCall(Node mem, Node _ptr, Node[] ins, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Call(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, _ptr.ptr, ins.length, Node.getBufferFromNodeList(ins), type.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newCmp(Node left, Node right, firm.Relation relation) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Cmp(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, relation.value());
		return Node.createWrapper(result_ptr);
	}

	public Node newCond(Node selector) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Cond(binding_ircons.get_r_cur_block(graph.ptr), selector.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newConfirm(Node value, Node bound, firm.Relation relation) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Confirm(binding_ircons.get_r_cur_block(graph.ptr), value.ptr, bound.ptr, relation.value());
		return Node.createWrapper(result_ptr);
	}

	public Node newConst(firm.TargetValue tarval) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Const(graph.ptr, tarval.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newConv(Node op, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Conv(binding_ircons.get_r_cur_block(graph.ptr), op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newCopyB(Node mem, Node dst, Node src, firm.Type type, firm.bindings.binding_ircons.ir_cons_flags flags) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_CopyB(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, dst.ptr, src.ptr, type.ptr, flags.val);
		return Node.createWrapper(result_ptr);
	}

	public Node newDiv(Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Div(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val);
		return Node.createWrapper(result_ptr);
	}

	public Node newDummy(firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Dummy(graph.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newEnd(Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_End(graph.ptr, ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}

	public Node newEor(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Eor(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newFree(Node mem, Node _ptr) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Free(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, _ptr.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newIJmp(Node target) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_IJmp(binding_ircons.get_r_cur_block(graph.ptr), target.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newJmp() {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Jmp(binding_ircons.get_r_cur_block(graph.ptr));
		return Node.createWrapper(result_ptr);
	}

	public Node newLoad(Node mem, Node _ptr, firm.Mode load_mode, firm.Type type, firm.bindings.binding_ircons.ir_cons_flags flags) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Load(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, _ptr.ptr, load_mode.ptr, type.ptr, flags.val);
		return Node.createWrapper(result_ptr);
	}

	public Node newMember(Node _ptr, firm.Entity entity) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Member(binding_ircons.get_r_cur_block(graph.ptr), _ptr.ptr, entity.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newMinus(Node op, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Minus(binding_ircons.get_r_cur_block(graph.ptr), op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newMod(Node mem, Node left, Node right, firm.Mode resmode, firm.bindings.binding_ircons.op_pin_state pin_state) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Mod(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, left.ptr, right.ptr, resmode.ptr, pin_state.val);
		return Node.createWrapper(result_ptr);
	}

	public Node newMul(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Mul(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newMulh(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Mulh(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newMux(Node sel, Node _false, Node _true, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Mux(binding_ircons.get_r_cur_block(graph.ptr), sel.ptr, _false.ptr, _true.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newNoMem() {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_NoMem(graph.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newNot(Node op, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Not(binding_ircons.get_r_cur_block(graph.ptr), op.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newOffset(firm.Mode mode, firm.Entity entity) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Offset(graph.ptr, mode.ptr, entity.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newOr(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Or(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newPhi(Node[] ins, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Phi(binding_ircons.get_r_cur_block(graph.ptr), ins.length, Node.getBufferFromNodeList(ins), mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newPin(Node op) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Pin(binding_ircons.get_r_cur_block(graph.ptr), op.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newProj(Node pred, firm.Mode mode, int num) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Proj(pred.ptr, mode.ptr, num);
		return Node.createWrapper(result_ptr);
	}

	public Node newRaise(Node mem, Node exo_ptr) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Raise(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, exo_ptr.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newReturn(Node mem, Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Return(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}

	public Node newSel(Node _ptr, Node index, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Sel(binding_ircons.get_r_cur_block(graph.ptr), _ptr.ptr, index.ptr, type.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newShl(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Shl(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newShr(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Shr(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newShrs(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Shrs(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newSize(firm.Mode mode, firm.Type type) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Size(graph.ptr, mode.ptr, type.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newStart() {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Start(graph.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newStore(Node mem, Node _ptr, Node value, firm.Type type, firm.bindings.binding_ircons.ir_cons_flags flags) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Store(binding_ircons.get_r_cur_block(graph.ptr), mem.ptr, _ptr.ptr, value.ptr, type.ptr, flags.val);
		return Node.createWrapper(result_ptr);
	}

	public Node newSub(Node left, Node right, firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Sub(binding_ircons.get_r_cur_block(graph.ptr), left.ptr, right.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}

	public Node newSwitch(Node selector, int n_outs, Pointer table) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Switch(binding_ircons.get_r_cur_block(graph.ptr), selector.ptr, n_outs, table);
		return Node.createWrapper(result_ptr);
	}

	public Node newSync(Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Sync(binding_ircons.get_r_cur_block(graph.ptr), ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}

	public Node newTuple(Node[] ins) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Tuple(binding_ircons.get_r_cur_block(graph.ptr), ins.length, Node.getBufferFromNodeList(ins));
		return Node.createWrapper(result_ptr);
	}

	public Node newUnknown(firm.Mode mode) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_Unknown(graph.ptr, mode.ptr);
		return Node.createWrapper(result_ptr);
	}
}
