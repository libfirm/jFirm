/* Warning: automatically generated fiel */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_irnode;

class NodeWrapperConstruction {

	public static Node createWrapper(Pointer ptr) {
		switch (binding_irnode.ir_opcode.getEnum(Node.binding.get_irn_opcode(ptr))) {
		
		
		
		
			case iro_NoMem:
				return new NoMem(ptr);
		
		
		
			case iro_End:
				return new End(ptr);
		
		
		
			case iro_Sub:
				return new Sub(ptr);
		
		
		
			case iro_Confirm:
				return new Confirm(ptr);
		
		
		
			case iro_Unknown:
				return new Unknown(ptr);
		
		
		
			case iro_Mux:
				return new Mux(ptr);
		
		
		
			case iro_Start:
				return new Start(ptr);
		
		
		
			case iro_Add:
				return new Add(ptr);
		
		
		
			case iro_Abs:
				return new Abs(ptr);
		
		
		
			case iro_Call:
				return new Call(ptr);
		
		
		
			case iro_Proj:
				return new Proj(ptr);
		
		
		
			case iro_Mul:
				return new Mul(ptr);
		
		
		
			case iro_Store:
				return new Store(ptr);
		
		
		
			case iro_Mulh:
				return new Mulh(ptr);
		
		
		
			case iro_Return:
				return new Return(ptr);
		
		
		
			case iro_Tuple:
				return new Tuple(ptr);
		
		
		
			case iro_Jmp:
				return new Jmp(ptr);
		
		
		
			case iro_Minus:
				return new Minus(ptr);
		
		
		
			case iro_Not:
				return new Not(ptr);
		
		
		
			case iro_Cond:
				return new Cond(ptr);
		
		
		
			case iro_Load:
				return new Load(ptr);
		
		
		
			case iro_Shr:
				return new Shr(ptr);
		
		
		
		
		
			case iro_Phi:
				return new Phi(ptr);
		
		
		
			case iro_Eor:
				return new Eor(ptr);
		
		
		
			case iro_Bad:
				return new Bad(ptr);
		
		
		
			case iro_Rotl:
				return new Rotl(ptr);
		
		
		
			case iro_Shl:
				return new Shl(ptr);
		
		
		
			case iro_Or:
				return new Or(ptr);
		
		
		
			case iro_Cmp:
				return new Cmp(ptr);
		
		
		
			case iro_And:
				return new And(ptr);
		
		
		
			case iro_Pin:
				return new Pin(ptr);
		
		
		
			case iro_Conv:
				return new Conv(ptr);
		
		
		
			case iro_Sync:
				return new Sync(ptr);
		
		
		
			case iro_IJmp:
				return new IJmp(ptr);
		
		
		
			case iro_Anchor:
				return new Anchor(ptr);
		
		
		
			case iro_Shrs:
				return new Shrs(ptr);
		
		
		
			case iro_Sel:
				return new Sel(ptr);
		
		
			default:
				return new Node(ptr);
		}
	}

}