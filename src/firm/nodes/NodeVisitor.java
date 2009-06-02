/* Warning: automatically generated file */
package firm.nodes;

public interface NodeVisitor {

	
	
	
	
	void visit(NoMem node);
	
	
	
	void visit(End node);
	
	
	
	void visit(Sub node);
	
	
	
	void visit(Quot node);
	
	
	
	void visit(Unknown node);
	
	
	
	void visit(Mux node);
	
	
	
	void visit(SymConst node);
	
	
	
	void visit(Sync node);
	
	
	
	void visit(Start node);
	
	
	
	void visit(Builtin node);
	
	
	
	void visit(Abs node);
	
	
	
	void visit(Call node);
	
	
	
	void visit(Proj node);
	
	
	
	void visit(Shr node);
	
	
	
	void visit(Mul node);
	
	
	
	void visit(Add node);
	
	
	
	void visit(Store node);
	
	
	
	void visit(Raise node);
	
	
	
	void visit(Phi node);
	
	
	
	void visit(Return node);
	
	
	
	void visit(Tuple node);
	
	
	
	void visit(Jmp node);
	
	
	
	void visit(Confirm node);
	
	
	
	void visit(Free node);
	
	
	
	void visit(Or node);
	
	
	
	void visit(Break node);
	
	
	
	void visit(Not node);
	
	
	
	void visit(Shrs node);
	
	
	
	void visit(CopyB node);
	
	
	
	void visit(InstOf node);
	
	
	
	void visit(Mod node);
	
	
	
	void visit(Load node);
	
	
	
	void visit(Alloc node);
	
	
	
	
	
	void visit(Mulh node);
	
	
	
	void visit(Const node);
	
	
	
	void visit(Borrow node);
	
	
	
	void visit(Filter node);
	
	
	
	void visit(Eor node);
	
	
	
	void visit(Bad node);
	
	
	
	void visit(Rotl node);
	
	
	
	void visit(Div node);
	
	
	
	void visit(Shl node);
	
	
	
	void visit(Minus node);
	
	
	
	void visit(Block node);
	
	
	
	void visit(Cmp node);
	
	
	
	void visit(And node);
	
	
	
	void visit(Pin node);
	
	
	
	void visit(Conv node);
	
	
	
	void visit(Cast node);
	
	
	
	void visit(Bound node);
	
	
	
	void visit(IJmp node);
	
	
	
	void visit(Anchor node);
	
	
	
	void visit(Cond node);
	
	
	
	void visit(Carry node);
	
	
	
	void visit(Sel node);
	
	
	
	void visit(Id node);
	
	
	
	void visit(DivMod node);
	
	

	public static abstract class Default implements NodeVisitor {

		public abstract void defaultVisit(Node n);
		
	
	
	
	
		@Override
		public void visit(NoMem node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(End node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Sub node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Quot node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Unknown node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Mux node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(SymConst node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Sync node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Start node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Builtin node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Abs node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Call node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Proj node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Shr node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Mul node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Add node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Store node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Raise node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Phi node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Return node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Tuple node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Jmp node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Confirm node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Free node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Or node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Break node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Not node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Shrs node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(CopyB node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(InstOf node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Mod node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Load node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Alloc node) {
			defaultVisit(node);
		}
	
	
	
	
	
		@Override
		public void visit(Mulh node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Const node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Borrow node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Filter node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Eor node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Bad node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Rotl node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Div node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Shl node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Minus node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Block node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Cmp node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(And node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Pin node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Conv node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Cast node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Bound node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(IJmp node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Anchor node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Cond node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Carry node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Sel node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(Id node) {
			defaultVisit(node);
		}
	
	
	
		@Override
		public void visit(DivMod node) {
			defaultVisit(node);
		}
	
	
	
	}

}