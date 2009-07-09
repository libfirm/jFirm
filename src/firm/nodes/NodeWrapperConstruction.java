/* Warning: automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_irnode;

class NodeWrapperConstruction {

	public static Node createWrapper(Pointer ptr) {
		final binding_irnode.ir_opcode opcode = 
			binding_irnode.ir_opcode.getEnum(Node.binding.get_irn_opcode(ptr));

		switch (opcode) {
		
		
			case iro_Abs:
				return new Abs(ptr);
		
		
		
			case iro_Add:
				return new Add(ptr);
		
		
		
			case iro_Alloc:
				return new Alloc(ptr);
		
		
		
			case iro_Anchor:
				return new Anchor(ptr);
		
		
		
			case iro_And:
				return new And(ptr);
		
		
		
			case iro_Bad:
				return new Bad(ptr);
		
		
		
			case iro_Block:
				return new Block(ptr);
		
		
		
			case iro_Bound:
				return new Bound(ptr);
		
		
		
			case iro_Break:
				return new Break(ptr);
		
		
		
			case iro_Builtin:
				return new Builtin(ptr);
		
		
		
			case iro_Call:
				return new Call(ptr);
		
		
		
			case iro_Cast:
				return new Cast(ptr);
		
		
		
			case iro_Cmp:
				return new Cmp(ptr);
		
		
		
			case iro_Cond:
				return new Cond(ptr);
		
		
		
			case iro_Confirm:
				return new Confirm(ptr);
		
		
		
			case iro_Const:
				return new Const(ptr);
		
		
		
			case iro_Conv:
				return new Conv(ptr);
		
		
		
			case iro_CopyB:
				return new CopyB(ptr);
		
		
		
			case iro_Div:
				return new Div(ptr);
		
		
		
			case iro_DivMod:
				return new DivMod(ptr);
		
		
		
			case iro_Dummy:
				return new Dummy(ptr);
		
		
		
			case iro_End:
				return new End(ptr);
		
		
		
			case iro_Eor:
				return new Eor(ptr);
		
		
		
			case iro_Filter:
				return new Filter(ptr);
		
		
		
			case iro_Free:
				return new Free(ptr);
		
		
		
			case iro_IJmp:
				return new IJmp(ptr);
		
		
		
			case iro_Id:
				return new Id(ptr);
		
		
		
			case iro_InstOf:
				return new InstOf(ptr);
		
		
		
			case iro_Jmp:
				return new Jmp(ptr);
		
		
		
			case iro_Load:
				return new Load(ptr);
		
		
		
			case iro_Minus:
				return new Minus(ptr);
		
		
		
			case iro_Mod:
				return new Mod(ptr);
		
		
		
			case iro_Mul:
				return new Mul(ptr);
		
		
		
			case iro_Mulh:
				return new Mulh(ptr);
		
		
		
			case iro_Mux:
				return new Mux(ptr);
		
		
		
			case iro_NoMem:
				return new NoMem(ptr);
		
		
		
			case iro_Not:
				return new Not(ptr);
		
		
		
			case iro_Or:
				return new Or(ptr);
		
		
		
			case iro_Phi:
				return new Phi(ptr);
		
		
		
			case iro_Pin:
				return new Pin(ptr);
		
		
		
			case iro_Proj:
				return new Proj(ptr);
		
		
		
			case iro_Quot:
				return new Quot(ptr);
		
		
		
			case iro_Raise:
				return new Raise(ptr);
		
		
		
			case iro_Return:
				return new Return(ptr);
		
		
		
			case iro_Rotl:
				return new Rotl(ptr);
		
		
		
			case iro_Sel:
				return new Sel(ptr);
		
		
		
			case iro_Shl:
				return new Shl(ptr);
		
		
		
			case iro_Shr:
				return new Shr(ptr);
		
		
		
			case iro_Shrs:
				return new Shrs(ptr);
		
		
		
			case iro_Start:
				return new Start(ptr);
		
		
		
			case iro_Store:
				return new Store(ptr);
		
		
		
			case iro_Sub:
				return new Sub(ptr);
		
		
		
			case iro_SymConst:
				return new SymConst(ptr);
		
		
		
			case iro_Sync:
				return new Sync(ptr);
		
		
		
			case iro_Tuple:
				return new Tuple(ptr);
		
		
		
			case iro_Unknown:
				return new Unknown(ptr);
		
		
		
		
		
		
			default:
				throw new IllegalStateException("Unkown node type: " + opcode);
		}
	}
}