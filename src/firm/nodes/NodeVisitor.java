/* Warning: automatically generated file */
package firm.nodes;

/**
 * Visitor interface for firm nodes
 */
public interface NodeVisitor {

	/** called when accept is called on a Abs node */
	void visit(Abs node);
	/** called when accept is called on a Add node */
	void visit(Add node);
	/** called when accept is called on a Alloc node */
	void visit(Alloc node);
	/** called when accept is called on a Anchor node */
	void visit(Anchor node);
	/** called when accept is called on a And node */
	void visit(And node);
	/** called when accept is called on a Bad node */
	void visit(Bad node);
	/** called when accept is called on a Block node */
	void visit(Block node);
	/** called when accept is called on a Bound node */
	void visit(Bound node);
	/** called when accept is called on a Break node */
	void visit(Break node);
	/** called when accept is called on a Builtin node */
	void visit(Builtin node);
	/** called when accept is called on a Call node */
	void visit(Call node);
	/** called when accept is called on a Cast node */
	void visit(Cast node);
	/** called when accept is called on a Cmp node */
	void visit(Cmp node);
	/** called when accept is called on a Cond node */
	void visit(Cond node);
	/** called when accept is called on a Confirm node */
	void visit(Confirm node);
	/** called when accept is called on a Const node */
	void visit(Const node);
	/** called when accept is called on a Conv node */
	void visit(Conv node);
	/** called when accept is called on a CopyB node */
	void visit(CopyB node);
	/** called when accept is called on a Div node */
	void visit(Div node);
	/** called when accept is called on a DivMod node */
	void visit(DivMod node);
	/** called when accept is called on a Dummy node */
	void visit(Dummy node);
	/** called when accept is called on a End node */
	void visit(End node);
	/** called when accept is called on a Eor node */
	void visit(Eor node);
	/** called when accept is called on a Filter node */
	void visit(Filter node);
	/** called when accept is called on a Free node */
	void visit(Free node);
	/** called when accept is called on a IJmp node */
	void visit(IJmp node);
	/** called when accept is called on a Id node */
	void visit(Id node);
	/** called when accept is called on a InstOf node */
	void visit(InstOf node);
	/** called when accept is called on a Jmp node */
	void visit(Jmp node);
	/** called when accept is called on a Load node */
	void visit(Load node);
	/** called when accept is called on a Minus node */
	void visit(Minus node);
	/** called when accept is called on a Mod node */
	void visit(Mod node);
	/** called when accept is called on a Mul node */
	void visit(Mul node);
	/** called when accept is called on a Mulh node */
	void visit(Mulh node);
	/** called when accept is called on a Mux node */
	void visit(Mux node);
	/** called when accept is called on a NoMem node */
	void visit(NoMem node);
	/** called when accept is called on a Not node */
	void visit(Not node);
	/** called when accept is called on a Or node */
	void visit(Or node);
	/** called when accept is called on a Phi node */
	void visit(Phi node);
	/** called when accept is called on a Pin node */
	void visit(Pin node);
	/** called when accept is called on a Proj node */
	void visit(Proj node);
	/** called when accept is called on a Quot node */
	void visit(Quot node);
	/** called when accept is called on a Raise node */
	void visit(Raise node);
	/** called when accept is called on a Return node */
	void visit(Return node);
	/** called when accept is called on a Rotl node */
	void visit(Rotl node);
	/** called when accept is called on a Sel node */
	void visit(Sel node);
	/** called when accept is called on a Shl node */
	void visit(Shl node);
	/** called when accept is called on a Shr node */
	void visit(Shr node);
	/** called when accept is called on a Shrs node */
	void visit(Shrs node);
	/** called when accept is called on a Start node */
	void visit(Start node);
	/** called when accept is called on a Store node */
	void visit(Store node);
	/** called when accept is called on a Sub node */
	void visit(Sub node);
	/** called when accept is called on a SymConst node */
	void visit(SymConst node);
	/** called when accept is called on a Sync node */
	void visit(Sync node);
	/** called when accept is called on a Tuple node */
	void visit(Tuple node);
	/** called when accept is called on a Unknown node */
	void visit(Unknown node);
	

	/**
	 * Default Visitor: A class which implements every visit function of
	 * the NodeVisitor interface with a call to the defaultVisit function.
	 * Usefull as base for own visitors which need to treat all nodes
	 * equally or only need to override some visit functions.
	 */
	public static abstract class Default implements NodeVisitor {

		public void defaultVisit(Node n) {}
		
	
		@Override
		public void visit(Abs node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Add node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Alloc node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Anchor node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(And node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Bad node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Block node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Bound node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Break node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Builtin node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Call node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Cast node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Cmp node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Cond node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Confirm node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Const node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Conv node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(CopyB node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Div node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(DivMod node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Dummy node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(End node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Eor node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Filter node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Free node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(IJmp node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Id node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(InstOf node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Jmp node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Load node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Minus node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Mod node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Mul node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Mulh node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Mux node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(NoMem node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Not node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Or node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Phi node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Pin node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Proj node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Quot node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Raise node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Return node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Rotl node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Sel node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Shl node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Shr node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Shrs node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Start node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Store node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Sub node) {
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
		public void visit(Tuple node) {
			defaultVisit(node);
		}
	
		@Override
		public void visit(Unknown node) {
			defaultVisit(node);
		}
		
	}

}