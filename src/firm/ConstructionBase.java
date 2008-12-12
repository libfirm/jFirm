/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
import firm.bindings.Bindings;
import firm.nodes.*;

public class ConstructionBase {

	protected static final binding_ircons binding_cons = Bindings.getIrConsBinding();
	protected static final binding_irnode binding = Bindings.getIrNodeBinding();

	protected ConstructionBase() {
	}

	
	
	
	
	public NoMem newNoMem() {
		Pointer result_ptr = binding_cons.new_NoMem();
		return new NoMem(result_ptr);
	}
	
	
	
	
	
	public Sub newSub(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Sub(left.ptr, right.ptr, mode.ptr);
		return new Sub(result_ptr);
	}
	
	
	
	public Confirm newConfirm(Node value, Node bound, int cmp) {
		Pointer result_ptr = binding_cons.new_Confirm(value.ptr, bound.ptr, cmp);
		return new Confirm(result_ptr);
	}
	
	
	
	public Unknown newUnknown(Mode mode) {
		Pointer result_ptr = binding_cons.new_Unknown(mode.ptr);
		return new Unknown(result_ptr);
	}
	
	
	
	public Mux newMux(Node sel, Node _false, Node _true, Mode mode) {
		Pointer result_ptr = binding_cons.new_Mux(sel.ptr, _false.ptr, _true.ptr, mode.ptr);
		return new Mux(result_ptr);
	}
	
	
	
	
	
	public Add newAdd(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Add(left.ptr, right.ptr, mode.ptr);
		return new Add(result_ptr);
	}
	
	
	
	public Abs newAbs(Node op, Mode mode) {
		Pointer result_ptr = binding_cons.new_Abs(op.ptr, mode.ptr);
		return new Abs(result_ptr);
	}
	
	
	
	public Call newCall(Node mem, Node ptr, Node[] ins, Type type) {
		Pointer result_ptr = binding_cons.new_Call(mem.ptr, ptr.ptr, ins.length, Node.getPointerListFromNodeList(ins), type.ptr);
		return new Call(result_ptr);
	}
	
	
	
	public Proj newProj(Node pred, Mode mode, int proj) {
		Pointer result_ptr = binding_cons.new_Proj(pred.ptr, mode.ptr, new com.sun.jna.NativeLong(proj));
		return new Proj(result_ptr);
	}
	
	
	
	public Mul newMul(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Mul(left.ptr, right.ptr, mode.ptr);
		return new Mul(result_ptr);
	}
	
	
	
	public Store newStore(Node mem, Node ptr, Node value) {
		Pointer result_ptr = binding_cons.new_Store(mem.ptr, ptr.ptr, value.ptr);
		return new Store(result_ptr);
	}
	
	
	
	public Mulh newMulh(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Mulh(left.ptr, right.ptr, mode.ptr);
		return new Mulh(result_ptr);
	}
	
	
	
	public Return newReturn(Node mem, Node[] ins) {
		Pointer result_ptr = binding_cons.new_Return(mem.ptr, ins.length, Node.getPointerListFromNodeList(ins));
		return new Return(result_ptr);
	}
	
	
	
	public Tuple newTuple(Node[] ins) {
		Pointer result_ptr = binding_cons.new_Tuple(ins.length, Node.getPointerListFromNodeList(ins));
		return new Tuple(result_ptr);
	}
	
	
	
	public Jmp newJmp() {
		Pointer result_ptr = binding_cons.new_Jmp();
		return new Jmp(result_ptr);
	}
	
	
	
	public Minus newMinus(Node op, Mode mode) {
		Pointer result_ptr = binding_cons.new_Minus(op.ptr, mode.ptr);
		return new Minus(result_ptr);
	}
	
	
	
	public Not newNot(Node op, Mode mode) {
		Pointer result_ptr = binding_cons.new_Not(op.ptr, mode.ptr);
		return new Not(result_ptr);
	}
	
	
	
	public Cond newCond(Node selector) {
		Pointer result_ptr = binding_cons.new_Cond(selector.ptr);
		return new Cond(result_ptr);
	}
	
	
	
	public Load newLoad(Node mem, Node ptr, Mode mode) {
		Pointer result_ptr = binding_cons.new_Load(mem.ptr, ptr.ptr, mode.ptr);
		return new Load(result_ptr);
	}
	
	
	
	public Shr newShr(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Shr(left.ptr, right.ptr, mode.ptr);
		return new Shr(result_ptr);
	}
	
	
	
	
	
	public Eor newEor(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Eor(left.ptr, right.ptr, mode.ptr);
		return new Eor(result_ptr);
	}
	
	
	
	public Bad newBad() {
		Pointer result_ptr = binding_cons.new_Bad();
		return new Bad(result_ptr);
	}
	
	
	
	public Rotl newRotl(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Rotl(left.ptr, right.ptr, mode.ptr);
		return new Rotl(result_ptr);
	}
	
	
	
	public Shl newShl(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Shl(left.ptr, right.ptr, mode.ptr);
		return new Shl(result_ptr);
	}
	
	
	
	public Or newOr(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Or(left.ptr, right.ptr, mode.ptr);
		return new Or(result_ptr);
	}
	
	
	
	public Cmp newCmp(Node left, Node right) {
		Pointer result_ptr = binding_cons.new_Cmp(left.ptr, right.ptr);
		return new Cmp(result_ptr);
	}
	
	
	
	public And newAnd(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_And(left.ptr, right.ptr, mode.ptr);
		return new And(result_ptr);
	}
	
	
	
	public Pin newPin(Node op) {
		Pointer result_ptr = binding_cons.new_Pin(op.ptr);
		return new Pin(result_ptr);
	}
	
	
	
	public Conv newConv(Node op, Mode mode) {
		Pointer result_ptr = binding_cons.new_Conv(op.ptr, mode.ptr);
		return new Conv(result_ptr);
	}
	
	
	
	public Sync newSync(Node[] ins) {
		Pointer result_ptr = binding_cons.new_Sync(ins.length, Node.getPointerListFromNodeList(ins));
		return new Sync(result_ptr);
	}
	
	
	
	public IJmp newIJmp(Node target) {
		Pointer result_ptr = binding_cons.new_IJmp(target.ptr);
		return new IJmp(result_ptr);
	}
	
	
	
	
	
	public Shrs newShrs(Node left, Node right, Mode mode) {
		Pointer result_ptr = binding_cons.new_Shrs(left.ptr, right.ptr, mode.ptr);
		return new Shrs(result_ptr);
	}
	
	
}