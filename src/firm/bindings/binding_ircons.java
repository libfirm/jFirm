package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


public interface binding_ircons extends Library {
	public static enum ip_view_state {
		ip_view_no(),
		ip_view_valid(),
		ip_view_invalid();
		public final int val;
		private static class C { static int next_val; }

		ip_view_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ip_view_state() {
			this.val = C.next_val++;
		}
		
		public static ip_view_state getEnum(int val) {
			for(ip_view_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned(),
		op_pin_state_mem_pinned();
		public final int val;
		private static class C { static int next_val; }

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		op_pin_state() {
			this.val = C.next_val++;
		}
		
		public static op_pin_state getEnum(int val) {
			for(op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum mtp_additional_property {
		mtp_no_property(0),
		mtp_property_const(1),
		mtp_property_pure(2),
		mtp_property_noreturn(4),
		mtp_property_nothrow(8),
		mtp_property_naked(16),
		mtp_property_malloc(32),
		mtp_property_weak(64),
		mtp_property_returns_twice(128),
		mtp_property_intrinsic(256),
		mtp_property_runtime(512),
		mtp_property_private(1024),
		mtp_property_has_loop(2048),
		mtp_property_inherited((1<<31));
		public final int val;
		private static class C { static int next_val; }

		mtp_additional_property(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		mtp_additional_property() {
			this.val = C.next_val++;
		}
		
		public static mtp_additional_property getEnum(int val) {
			for(mtp_additional_property entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum symconst_kind {
		symconst_type_tag(),
		symconst_type_size(),
		symconst_type_align(),
		symconst_addr_name(),
		symconst_addr_ent(),
		symconst_ofs_ent(),
		symconst_enum_const(),
		symconst_label();
		public final int val;
		private static class C { static int next_val; }

		symconst_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		symconst_kind() {
			this.val = C.next_val++;
		}
		
		public static symconst_kind getEnum(int val) {
			for(symconst_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Cmp {
		pn_Cmp_False(0),
		pn_Cmp_Eq(1),
		pn_Cmp_Lt(2),
		pn_Cmp_Le((pn_Cmp.pn_Cmp_Eq.val|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Gt(4),
		pn_Cmp_Ge((pn_Cmp.pn_Cmp_Eq.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Lg((pn_Cmp.pn_Cmp_Lt.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Leg(((pn_Cmp.pn_Cmp_Lt.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uo(8),
		pn_Cmp_Ue((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ul((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Ule(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Ug((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uge(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Ne(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_True(15);
		public final int val;
		private static class C { static int next_val; }

		pn_Cmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Cmp() {
			this.val = C.next_val++;
		}
		
		public static pn_Cmp getEnum(int val) {
			for(pn_Cmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_where_alloc {
		stack_alloc(),
		heap_alloc();
		public final int val;
		private static class C { static int next_val; }

		ir_where_alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_where_alloc() {
			this.val = C.next_val++;
		}
		
		public static ir_where_alloc getEnum(int val) {
			for(ir_where_alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_cons_flags {
		cons_none(0),
		cons_volatile((1<<0)),
		cons_unaligned((1<<1)),
		cons_floats((1<<2));
		public final int val;
		private static class C { static int next_val; }

		ir_cons_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_cons_flags() {
			this.val = C.next_val++;
		}
		
		public static ir_cons_flags getEnum(int val) {
			for(ir_cons_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer new_rd_Block(Pointer db, Pointer irg, int arity, Pointer[] in);
	Pointer new_rd_Start(Pointer db, Pointer irg, Pointer block);
	Pointer new_rd_End(Pointer db, Pointer irg, Pointer block);
	Pointer new_rd_Jmp(Pointer db, Pointer irg, Pointer block);
	Pointer new_rd_IJmp(Pointer db, Pointer irg, Pointer block, Pointer tgt);
	Pointer new_rd_Break(Pointer db, Pointer irg, Pointer block);
	Pointer new_rd_Cond(Pointer db, Pointer irg, Pointer block, Pointer c);
	Pointer new_rd_Return(Pointer db, Pointer irg, Pointer block, Pointer store, int arity, Pointer[] in);
	Pointer new_rd_Const_type(Pointer db, Pointer irg, Pointer con, Pointer tp);
	Pointer new_rd_Const(Pointer db, Pointer irg, Pointer con);
	Pointer new_rd_Const_long(Pointer db, Pointer irg, Pointer mode, NativeLong value);
	Pointer new_rd_SymConst_addr_ent(Pointer db, Pointer irg, Pointer mode, Pointer symbol, Pointer tp);
	Pointer new_rd_SymConst_ofs_ent(Pointer db, Pointer irg, Pointer mode, Pointer symbol, Pointer tp);
	Pointer new_rd_SymConst_addr_name(Pointer db, Pointer irg, Pointer mode, Pointer symbol, Pointer tp);
	Pointer new_rd_SymConst_type_tag(Pointer db, Pointer irg, Pointer mode, Pointer symbol, Pointer tp);
	Pointer new_rd_SymConst_size(Pointer db, Pointer irg, Pointer mode, Pointer symbol, Pointer tp);
	Pointer new_rd_SymConst_align(Pointer db, Pointer irg, Pointer mode, Pointer symbol, Pointer tp);
	Pointer new_rd_simpleSel(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer objptr, Pointer ent);
	Pointer new_rd_Sel(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer objptr, int n_index, Pointer[] index, Pointer ent);
	Pointer new_rd_Call(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer callee, int arity, Pointer[] in, Pointer tp);
	Pointer new_rd_Add(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Sub(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Minus(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_rd_Mul(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Mulh(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Quot(Pointer db, Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_rd_DivMod(Pointer db, Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_rd_Div(Pointer db, Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_rd_DivRL(Pointer db, Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_rd_Mod(Pointer db, Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_rd_Abs(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_rd_And(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Or(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Eor(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Not(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_rd_Cmp(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2);
	Pointer new_rd_Shl(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_rd_Shr(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_rd_Shrs(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_rd_Rotl(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_rd_Conv(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_rd_Cast(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer to_tp);
	Pointer new_rd_Carry(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Borrow(Pointer db, Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_rd_Phi(Pointer db, Pointer irg, Pointer block, int arity, Pointer[] in, Pointer mode);
	Pointer new_rd_Load(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer adr, Pointer mode, /* ir_cons_flags */int flags);
	Pointer new_rd_Store(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer adr, Pointer val, /* ir_cons_flags */int flags);
	Pointer new_rd_Alloc(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer size, Pointer alloc_type, /* ir_where_alloc */int where);
	Pointer new_rd_Free(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);
	Pointer new_rd_Sync(Pointer db, Pointer irg, Pointer block, int arity, Pointer[] in);
	Pointer new_rd_Proj(Pointer db, Pointer irg, Pointer block, Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_rd_defaultProj(Pointer db, Pointer irg, Pointer block, Pointer arg, NativeLong max_proj);
	Pointer new_rd_Tuple(Pointer db, Pointer irg, Pointer block, int arity, Pointer[] in);
	Pointer new_rd_Id(Pointer db, Pointer irg, Pointer block, Pointer val, Pointer mode);
	Pointer new_rd_Confirm(Pointer db, Pointer irg, Pointer block, Pointer val, Pointer bound, /* pn_Cmp */int cmp);
	Pointer new_rd_Unknown(Pointer irg, Pointer m);
	Pointer new_rd_CallBegin(Pointer db, Pointer irg, Pointer block, Pointer callee);
	Pointer new_rd_EndReg(Pointer db, Pointer irg, Pointer block);
	Pointer new_rd_EndExcept(Pointer db, Pointer irg, Pointer block);
	Pointer new_rd_Filter(Pointer db, Pointer irg, Pointer block, Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_rd_Mux(Pointer db, Pointer irg, Pointer block, Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);
	Pointer new_rd_CopyB(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer dst, Pointer src, Pointer data_type);
	Pointer new_rd_InstOf(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer objptr, Pointer type);
	Pointer new_rd_Raise(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer obj);
	Pointer new_rd_Bound(Pointer db, Pointer irg, Pointer block, Pointer store, Pointer idx, Pointer lower, Pointer upper);
	Pointer new_rd_Pin(Pointer db, Pointer irg, Pointer block, Pointer node);
	Pointer new_rd_ASM(Pointer db, Pointer irg, Pointer block, int arity, Pointer[] in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, Pointer[] clobber, Pointer asm_text);
	Pointer new_r_Block(Pointer irg, int arity, Pointer[] in);
	Pointer new_r_Start(Pointer irg, Pointer block);
	Pointer new_r_End(Pointer irg, Pointer block);
	Pointer new_r_Jmp(Pointer irg, Pointer block);
	Pointer new_r_IJmp(Pointer irg, Pointer block, Pointer tgt);
	Pointer new_r_Cond(Pointer irg, Pointer block, Pointer c);
	Pointer new_r_Return(Pointer irg, Pointer block, Pointer store, int arity, Pointer[] in);
	Pointer new_r_Const(Pointer irg, Pointer con);
	Pointer new_r_Const_long(Pointer irg, Pointer mode, NativeLong value);
	Pointer new_r_Const_type(Pointer irg, Pointer con, Pointer tp);
	Pointer new_r_simpleSel(Pointer irg, Pointer block, Pointer store, Pointer objptr, Pointer ent);
	Pointer new_r_Sel(Pointer irg, Pointer block, Pointer store, Pointer objptr, int n_index, Pointer[] index, Pointer ent);
	Pointer new_r_Call(Pointer irg, Pointer block, Pointer store, Pointer callee, int arity, Pointer[] in, Pointer tp);
	Pointer new_r_Add(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Sub(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Minus(Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_r_Mul(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Mulh(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Quot(Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_r_DivMod(Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_r_Div(Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_r_DivRL(Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_r_Mod(Pointer irg, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_r_Abs(Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_r_And(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Or(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Eor(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Not(Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_r_Cmp(Pointer irg, Pointer block, Pointer op1, Pointer op2);
	Pointer new_r_Shl(Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_r_Shr(Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_r_Shrs(Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_r_Rotl(Pointer irg, Pointer block, Pointer op, Pointer k, Pointer mode);
	Pointer new_r_Conv(Pointer irg, Pointer block, Pointer op, Pointer mode);
	Pointer new_r_Cast(Pointer irg, Pointer block, Pointer op, Pointer to_tp);
	Pointer new_r_Carry(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Borrow(Pointer irg, Pointer block, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_r_Phi(Pointer irg, Pointer block, int arity, Pointer[] in, Pointer mode);
	Pointer new_r_Load(Pointer irg, Pointer block, Pointer store, Pointer adr, Pointer mode, /* ir_cons_flags */int flags);
	Pointer new_r_Store(Pointer irg, Pointer block, Pointer store, Pointer adr, Pointer val, /* ir_cons_flags */int flags);
	Pointer new_r_Alloc(Pointer irg, Pointer block, Pointer store, Pointer size, Pointer alloc_type, /* ir_where_alloc */int where);
	Pointer new_r_Free(Pointer irg, Pointer block, Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);
	Pointer new_r_Sync(Pointer irg, Pointer block, int arity, Pointer[] in);
	Pointer new_r_Proj(Pointer irg, Pointer block, Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_r_defaultProj(Pointer irg, Pointer block, Pointer arg, NativeLong max_proj);
	Pointer new_r_Tuple(Pointer irg, Pointer block, int arity, Pointer[] in);
	Pointer new_r_Id(Pointer irg, Pointer block, Pointer val, Pointer mode);
	Pointer new_r_Bad(Pointer irg);
	Pointer new_r_Confirm(Pointer irg, Pointer block, Pointer val, Pointer bound, /* pn_Cmp */int cmp);
	Pointer new_r_Unknown(Pointer irg, Pointer m);
	Pointer new_r_CallBegin(Pointer irg, Pointer block, Pointer callee);
	Pointer new_r_EndReg(Pointer irg, Pointer block);
	Pointer new_r_EndExcept(Pointer irg, Pointer block);
	Pointer new_r_Break(Pointer irg, Pointer block);
	Pointer new_r_Filter(Pointer irg, Pointer block, Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_r_NoMem(Pointer irg);
	Pointer new_r_Mux(Pointer irg, Pointer block, Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);
	Pointer new_r_CopyB(Pointer irg, Pointer block, Pointer store, Pointer dst, Pointer src, Pointer data_type);
	Pointer new_r_InstOf(Pointer irg, Pointer block, Pointer store, Pointer objptr, Pointer type);
	Pointer new_r_Raise(Pointer irg, Pointer block, Pointer store, Pointer obj);
	Pointer new_r_Bound(Pointer irg, Pointer block, Pointer store, Pointer idx, Pointer lower, Pointer upper);
	Pointer new_r_Pin(Pointer irg, Pointer block, Pointer node);
	Pointer new_r_ASM(Pointer irg, Pointer block, int arity, Pointer[] in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, Pointer[] clobber, Pointer asm_text);
	void set_cur_block(Pointer target);
	Pointer get_cur_block();
	Pointer new_d_Block(Pointer db, int arity, Pointer[] in);
	Pointer new_d_Start(Pointer db);
	Pointer new_d_End(Pointer db);
	Pointer new_d_Jmp(Pointer db);
	Pointer new_d_IJmp(Pointer db, Pointer tgt);
	Pointer new_d_Cond(Pointer db, Pointer c);
	Pointer new_d_Return(Pointer db, Pointer store, int arity, Pointer[] in);
	Pointer new_d_Const_type(Pointer db, Pointer con, Pointer tp);
	Pointer new_d_Const(Pointer db, Pointer con);
	Pointer new_d_simpleSel(Pointer db, Pointer store, Pointer objptr, Pointer ent);
	Pointer new_d_Sel(Pointer db, Pointer store, Pointer objptr, int arity, Pointer[] in, Pointer ent);
	Pointer new_d_Call(Pointer db, Pointer store, Pointer callee, int arity, Pointer[] in, Pointer tp);
	Pointer new_d_Add(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Sub(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Minus(Pointer db, Pointer op, Pointer mode);
	Pointer new_d_Mul(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Mulh(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Quot(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_d_DivMod(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_d_Div(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_d_DivRL(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_d_Mod(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_d_Abs(Pointer db, Pointer op, Pointer mode);
	Pointer new_d_And(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Or(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Eor(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Not(Pointer db, Pointer op, Pointer mode);
	Pointer new_d_Shl(Pointer db, Pointer op, Pointer k, Pointer mode);
	Pointer new_d_Shr(Pointer db, Pointer op, Pointer k, Pointer mode);
	Pointer new_d_Shrs(Pointer db, Pointer op, Pointer k, Pointer mode);
	Pointer new_d_Rotl(Pointer db, Pointer op, Pointer k, Pointer mode);
	Pointer new_d_Cmp(Pointer db, Pointer op1, Pointer op2);
	Pointer new_d_Conv(Pointer db, Pointer op, Pointer mode);
	Pointer new_d_strictConv(Pointer db, Pointer op, Pointer mode);
	Pointer new_d_Cast(Pointer db, Pointer op, Pointer to_tp);
	Pointer new_d_Carry(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Borrow(Pointer db, Pointer op1, Pointer op2, Pointer mode);
	Pointer new_d_Phi(Pointer db, int arity, Pointer[] in, Pointer mode);
	Pointer new_d_Load(Pointer db, Pointer store, Pointer addr, Pointer mode, /* ir_cons_flags */int flags);
	Pointer new_d_Store(Pointer db, Pointer store, Pointer addr, Pointer val, /* ir_cons_flags */int flags);
	Pointer new_d_Alloc(Pointer db, Pointer store, Pointer size, Pointer alloc_type, /* ir_where_alloc */int where);
	Pointer new_d_Free(Pointer db, Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);
	Pointer new_d_Sync(Pointer db, int arity, Pointer[] in);
	Pointer new_d_Proj(Pointer db, Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_d_defaultProj(Pointer db, Pointer arg, NativeLong max_proj);
	Pointer new_d_Tuple(Pointer db, int arity, Pointer[] in);
	Pointer new_d_Id(Pointer db, Pointer val, Pointer mode);
	Pointer new_d_Confirm(Pointer db, Pointer val, Pointer bound, /* pn_Cmp */int cmp);
	Pointer new_d_Unknown(Pointer m);
	Pointer new_d_CallBegin(Pointer db, Pointer callee);
	Pointer new_d_EndReg(Pointer db);
	Pointer new_d_EndExcept(Pointer db);
	Pointer new_d_Break(Pointer db);
	Pointer new_d_Filter(Pointer db, Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_d_Mux(Pointer db, Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);
	Pointer new_d_CopyB(Pointer db, Pointer store, Pointer dst, Pointer src, Pointer data_type);
	Pointer new_d_InstOf(Pointer db, Pointer store, Pointer objptr, Pointer type);
	Pointer new_d_Raise(Pointer db, Pointer store, Pointer obj);
	Pointer new_d_Bound(Pointer db, Pointer store, Pointer idx, Pointer lower, Pointer upper);
	Pointer new_d_Pin(Pointer db, Pointer node);
	Pointer new_d_ASM(Pointer db, int arity, Pointer[] in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, Pointer[] clobber, Pointer asm_text);
	Pointer new_Block(int arity, Pointer[] in);
	Pointer new_Start();
	Pointer new_End();
	Pointer new_EndReg();
	Pointer new_EndExcept();
	Pointer new_Jmp();
	Pointer new_IJmp(Pointer tgt);
	Pointer new_Break();
	Pointer new_Cond(Pointer c);
	Pointer new_Return(Pointer store, int arity, Pointer[] in);
	Pointer new_Const(Pointer con);
	Pointer new_Const_long(Pointer mode, NativeLong value);
	Pointer new_Const_type(Pointer con, Pointer tp);
	Pointer new_simpleSel(Pointer store, Pointer objptr, Pointer ent);
	Pointer new_Sel(Pointer store, Pointer objptr, int arity, Pointer[] in, Pointer ent);
	Pointer new_Call(Pointer store, Pointer callee, int arity, Pointer[] in, Pointer tp);
	Pointer new_CallBegin(Pointer callee);
	Pointer new_Add(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Sub(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Minus(Pointer op, Pointer mode);
	Pointer new_Mul(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Mulh(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Quot(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_DivMod(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_Div(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_DivRL(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_Mod(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);
	Pointer new_Abs(Pointer op, Pointer mode);
	Pointer new_And(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Or(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Eor(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Not(Pointer op, Pointer mode);
	Pointer new_Shl(Pointer op, Pointer k, Pointer mode);
	Pointer new_Shr(Pointer op, Pointer k, Pointer mode);
	Pointer new_Shrs(Pointer op, Pointer k, Pointer mode);
	Pointer new_Rotl(Pointer op, Pointer k, Pointer mode);
	Pointer new_Cmp(Pointer op1, Pointer op2);
	Pointer new_Conv(Pointer op, Pointer mode);
	Pointer new_strictConv(Pointer op, Pointer mode);
	Pointer new_Cast(Pointer op, Pointer to_tp);
	Pointer new_Carry(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Borrow(Pointer op1, Pointer op2, Pointer mode);
	Pointer new_Phi(int arity, Pointer[] in, Pointer mode);
	Pointer new_Load(Pointer store, Pointer addr, Pointer mode, /* ir_cons_flags */int flags);
	Pointer new_Store(Pointer store, Pointer addr, Pointer val, /* ir_cons_flags */int flags);
	Pointer new_Alloc(Pointer store, Pointer size, Pointer alloc_type, /* ir_where_alloc */int where);
	Pointer new_Free(Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);
	Pointer new_Sync(int arity, Pointer[] in);
	Pointer new_Proj(Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_Filter(Pointer arg, Pointer mode, NativeLong proj);
	Pointer new_defaultProj(Pointer arg, NativeLong max_proj);
	Pointer new_Tuple(int arity, Pointer[] in);
	Pointer new_Id(Pointer val, Pointer mode);
	Pointer new_Bad();
	Pointer new_Confirm(Pointer val, Pointer bound, /* pn_Cmp */int cmp);
	Pointer new_Unknown(Pointer m);
	Pointer new_NoMem();
	Pointer new_Mux(Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);
	Pointer new_CopyB(Pointer store, Pointer dst, Pointer src, Pointer data_type);
	Pointer new_InstOf(Pointer store, Pointer objptr, Pointer type);
	Pointer new_Raise(Pointer store, Pointer obj);
	Pointer new_Bound(Pointer store, Pointer idx, Pointer lower, Pointer upper);
	Pointer new_Pin(Pointer node);
	Pointer new_ASM(int arity, Pointer[] in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, Pointer[] clobber, Pointer asm_text);
	Pointer new_d_immBlock(Pointer db);
	Pointer new_immBlock();
	Pointer new_d_immPartBlock(Pointer db, Pointer pred_jmp);
	Pointer new_immPartBlock(Pointer pred_jmp);
	void add_immBlock_pred(Pointer immblock, Pointer jmp);
	void mature_immBlock(Pointer block);
	Pointer get_d_value(Pointer db, int pos, Pointer mode);
	Pointer get_value(int pos, Pointer mode);
	void set_value(int pos, Pointer value);
	int find_value(Pointer value);
	Pointer get_store();
	void set_store(Pointer store);
	void keep_alive(Pointer ka);
	Pointer get_cur_frame_type();
	void irp_finalize_cons();
}
