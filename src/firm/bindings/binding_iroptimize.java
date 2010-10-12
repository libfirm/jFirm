package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.nio.Buffer;


public class binding_iroptimize {
	static { Native.register("firm"); }
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
	public static enum cond_jmp_predicate {
		COND_JMP_PRED_NONE(),
		COND_JMP_PRED_TRUE(),
		COND_JMP_PRED_FALSE();
		public final int val;
		private static class C { static int next_val; }

		cond_jmp_predicate(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		cond_jmp_predicate() {
			this.val = C.next_val++;
		}
		
		public static cond_jmp_predicate getEnum(int val) {
			for(cond_jmp_predicate entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum mtp_additional_property {
		mtp_no_property(0x00000000),
		mtp_property_const(0x00000001),
		mtp_property_pure(0x00000002),
		mtp_property_noreturn(0x00000004),
		mtp_property_nothrow(0x00000008),
		mtp_property_naked(0x00000010),
		mtp_property_malloc(0x00000020),
		mtp_property_returns_twice(0x00000040),
		mtp_property_intrinsic(0x00000080),
		mtp_property_runtime(0x00000100),
		mtp_property_private(0x00000200),
		mtp_property_has_loop(0x00000400),
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
		symconst_addr_ent(),
		symconst_ofs_ent(),
		symconst_enum_const();
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
	public static enum ir_builtin_kind {
		ir_bk_trap(),
		ir_bk_debugbreak(),
		ir_bk_return_address(),
		ir_bk_frame_address(),
		ir_bk_prefetch(),
		ir_bk_ffs(),
		ir_bk_clz(),
		ir_bk_ctz(),
		ir_bk_popcount(),
		ir_bk_parity(),
		ir_bk_bswap(),
		ir_bk_inport(),
		ir_bk_outport(),
		ir_bk_inner_trampoline();
		public final int val;
		private static class C { static int next_val; }

		ir_builtin_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_builtin_kind() {
			this.val = C.next_val++;
		}
		
		public static ir_builtin_kind getEnum(int val) {
			for(ir_builtin_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_generic {
		pn_Generic_M(0),
		pn_Generic_X_regular(1),
		pn_Generic_X_except(2),
		pn_Generic_other(3);
		public final int val;
		private static class C { static int next_val; }

		pn_generic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_generic() {
			this.val = C.next_val++;
		}
		
		public static pn_generic getEnum(int val) {
			for(pn_generic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_value_classify_sign {
		value_classified_unknown(0),
		value_classified_positive(1),
		value_classified_negative(-1);
		public final int val;
		private static class C { static int next_val; }

		ir_value_classify_sign(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_value_classify_sign() {
			this.val = C.next_val++;
		}
		
		public static ir_value_classify_sign getEnum(int val) {
			for(ir_value_classify_sign entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Alloc {
		pn_Alloc_M(pn_generic.pn_Generic_M.val),
		pn_Alloc_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Alloc_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Alloc_res(pn_generic.pn_Generic_other.val),
		pn_Alloc_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Alloc() {
			this.val = C.next_val++;
		}
		
		public static pn_Alloc getEnum(int val) {
			for(pn_Alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Bound {
		pn_Bound_M(pn_generic.pn_Generic_M.val),
		pn_Bound_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Bound_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Bound_res(pn_generic.pn_Generic_other.val),
		pn_Bound_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Bound(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Bound() {
			this.val = C.next_val++;
		}
		
		public static pn_Bound getEnum(int val) {
			for(pn_Bound entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Builtin {
		pn_Builtin_M(pn_generic.pn_Generic_M.val),
		pn_Builtin_1_result(pn_generic.pn_Generic_other.val),
		pn_Builtin_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Builtin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Builtin() {
			this.val = C.next_val++;
		}
		
		public static pn_Builtin getEnum(int val) {
			for(pn_Builtin entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Call {
		pn_Call_M(pn_generic.pn_Generic_M.val),
		pn_Call_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Call_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Call_T_result(pn_generic.pn_Generic_other.val),
		pn_Call_P_value_res_base(),
		pn_Call_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Call(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Call() {
			this.val = C.next_val++;
		}
		
		public static pn_Call getEnum(int val) {
			for(pn_Call entry : values()) {
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
		pn_Cmp_Ule(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)|pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ug((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uge(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Gt.val)|pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ne(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_True(15),
		pn_Cmp_max();
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
	public static enum pn_Cond {
		pn_Cond_false(),
		pn_Cond_true(),
		pn_Cond_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Cond(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Cond() {
			this.val = C.next_val++;
		}
		
		public static pn_Cond getEnum(int val) {
			for(pn_Cond entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_CopyB {
		pn_CopyB_M(pn_generic.pn_Generic_M.val),
		pn_CopyB_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_CopyB_X_except(pn_generic.pn_Generic_X_except.val),
		pn_CopyB_max();
		public final int val;
		private static class C { static int next_val; }

		pn_CopyB(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_CopyB() {
			this.val = C.next_val++;
		}
		
		public static pn_CopyB getEnum(int val) {
			for(pn_CopyB entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Div {
		pn_Div_M(pn_generic.pn_Generic_M.val),
		pn_Div_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Div_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Div_res(pn_generic.pn_Generic_other.val),
		pn_Div_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Div(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Div() {
			this.val = C.next_val++;
		}
		
		public static pn_Div getEnum(int val) {
			for(pn_Div entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_DivMod {
		pn_DivMod_M(pn_generic.pn_Generic_M.val),
		pn_DivMod_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_DivMod_X_except(pn_generic.pn_Generic_X_except.val),
		pn_DivMod_res_div(pn_generic.pn_Generic_other.val),
		pn_DivMod_res_mod(),
		pn_DivMod_max();
		public final int val;
		private static class C { static int next_val; }

		pn_DivMod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_DivMod() {
			this.val = C.next_val++;
		}
		
		public static pn_DivMod getEnum(int val) {
			for(pn_DivMod entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_InstOf {
		pn_InstOf_M(pn_generic.pn_Generic_M.val),
		pn_InstOf_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_InstOf_X_except(pn_generic.pn_Generic_X_except.val),
		pn_InstOf_res(pn_generic.pn_Generic_other.val),
		pn_InstOf_max();
		public final int val;
		private static class C { static int next_val; }

		pn_InstOf(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_InstOf() {
			this.val = C.next_val++;
		}
		
		public static pn_InstOf getEnum(int val) {
			for(pn_InstOf entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Load {
		pn_Load_M(pn_generic.pn_Generic_M.val),
		pn_Load_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Load_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Load_res(pn_generic.pn_Generic_other.val),
		pn_Load_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Load(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Load() {
			this.val = C.next_val++;
		}
		
		public static pn_Load getEnum(int val) {
			for(pn_Load entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Mod {
		pn_Mod_M(pn_generic.pn_Generic_M.val),
		pn_Mod_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Mod_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Mod_res(pn_generic.pn_Generic_other.val),
		pn_Mod_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Mod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Mod() {
			this.val = C.next_val++;
		}
		
		public static pn_Mod getEnum(int val) {
			for(pn_Mod entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Quot {
		pn_Quot_M(pn_generic.pn_Generic_M.val),
		pn_Quot_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Quot_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Quot_res(pn_generic.pn_Generic_other.val),
		pn_Quot_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Quot(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Quot() {
			this.val = C.next_val++;
		}
		
		public static pn_Quot getEnum(int val) {
			for(pn_Quot entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Raise {
		pn_Raise_M(pn_generic.pn_Generic_M.val),
		pn_Raise_X(pn_generic.pn_Generic_X_regular.val),
		pn_Raise_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Raise(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Raise() {
			this.val = C.next_val++;
		}
		
		public static pn_Raise getEnum(int val) {
			for(pn_Raise entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Start {
		pn_Start_X_initial_exec(),
		pn_Start_M(),
		pn_Start_P_frame_base(),
		pn_Start_P_tls(),
		pn_Start_T_args(),
		pn_Start_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Start(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Start() {
			this.val = C.next_val++;
		}
		
		public static pn_Start getEnum(int val) {
			for(pn_Start entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Store {
		pn_Store_M(pn_generic.pn_Generic_M.val),
		pn_Store_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Store_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Store_max();
		public final int val;
		private static class C { static int next_val; }

		pn_Store(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Store() {
			this.val = C.next_val++;
		}
		
		public static pn_Store getEnum(int val) {
			for(pn_Store entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum osr_flags {
		osr_flag_none(0),
		osr_flag_lftr_with_ov_check(1),
		osr_flag_ignore_x86_shift(2),
		osr_flag_keep_reg_pressure(4);
		public final int val;
		private static class C { static int next_val; }

		osr_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		osr_flags() {
			this.val = C.next_val++;
		}
		
		public static osr_flags getEnum(int val) {
			for(osr_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static native int is_ASM(Pointer node);
	public static native int is_Add(Pointer node);
	public static native int is_Alloc(Pointer node);
	public static native int is_Anchor(Pointer node);
	public static native int is_And(Pointer node);
	public static native int is_Bad(Pointer node);
	public static native int is_Block(Pointer node);
	public static native int is_Borrow(Pointer node);
	public static native int is_Bound(Pointer node);
	public static native int is_Builtin(Pointer node);
	public static native int is_Call(Pointer node);
	public static native int is_Carry(Pointer node);
	public static native int is_Cast(Pointer node);
	public static native int is_Cmp(Pointer node);
	public static native int is_Cond(Pointer node);
	public static native int is_Confirm(Pointer node);
	public static native int is_Const(Pointer node);
	public static native int is_Conv(Pointer node);
	public static native int is_CopyB(Pointer node);
	public static native int is_Deleted(Pointer node);
	public static native int is_Div(Pointer node);
	public static native int is_DivMod(Pointer node);
	public static native int is_Dummy(Pointer node);
	public static native int is_End(Pointer node);
	public static native int is_Eor(Pointer node);
	public static native int is_Free(Pointer node);
	public static native int is_IJmp(Pointer node);
	public static native int is_Id(Pointer node);
	public static native int is_InstOf(Pointer node);
	public static native int is_Jmp(Pointer node);
	public static native int is_Load(Pointer node);
	public static native int is_Minus(Pointer node);
	public static native int is_Mod(Pointer node);
	public static native int is_Mul(Pointer node);
	public static native int is_Mulh(Pointer node);
	public static native int is_Mux(Pointer node);
	public static native int is_NoMem(Pointer node);
	public static native int is_Not(Pointer node);
	public static native int is_Or(Pointer node);
	public static native int is_Phi(Pointer node);
	public static native int is_Pin(Pointer node);
	public static native int is_Proj(Pointer node);
	public static native int is_Quot(Pointer node);
	public static native int is_Raise(Pointer node);
	public static native int is_Return(Pointer node);
	public static native int is_Rotl(Pointer node);
	public static native int is_Sel(Pointer node);
	public static native int is_Shl(Pointer node);
	public static native int is_Shr(Pointer node);
	public static native int is_Shrs(Pointer node);
	public static native int is_Start(Pointer node);
	public static native int is_Store(Pointer node);
	public static native int is_Sub(Pointer node);
	public static native int is_SymConst(Pointer node);
	public static native int is_Sync(Pointer node);
	public static native int is_Tuple(Pointer node);
	public static native int is_Unknown(Pointer node);
	public static native Pointer get_ASM_input_constraints(Pointer node);
	public static native void set_ASM_input_constraints(Pointer node, Pointer input_constraints);
	public static native Pointer get_ASM_output_constraints(Pointer node);
	public static native void set_ASM_output_constraints(Pointer node, Pointer output_constraints);
	public static native Buffer get_ASM_clobbers(Pointer node);
	public static native void set_ASM_clobbers(Pointer node, Buffer clobbers);
	public static native Pointer get_ASM_text(Pointer node);
	public static native void set_ASM_text(Pointer node, Pointer text);
	public static native Pointer get_Add_left(Pointer node);
	public static native void set_Add_left(Pointer node, Pointer left);
	public static native Pointer get_Add_right(Pointer node);
	public static native void set_Add_right(Pointer node, Pointer right);
	public static native Pointer get_Alloc_mem(Pointer node);
	public static native void set_Alloc_mem(Pointer node, Pointer mem);
	public static native Pointer get_Alloc_count(Pointer node);
	public static native void set_Alloc_count(Pointer node, Pointer count);
	public static native Pointer get_Alloc_type(Pointer node);
	public static native void set_Alloc_type(Pointer node, Pointer type);
	public static native /* ir_where_alloc */int get_Alloc_where(Pointer node);
	public static native void set_Alloc_where(Pointer node, /* ir_where_alloc */int where);
	public static native Pointer get_And_left(Pointer node);
	public static native void set_And_left(Pointer node, Pointer left);
	public static native Pointer get_And_right(Pointer node);
	public static native void set_And_right(Pointer node, Pointer right);
	public static native Pointer get_Borrow_left(Pointer node);
	public static native void set_Borrow_left(Pointer node, Pointer left);
	public static native Pointer get_Borrow_right(Pointer node);
	public static native void set_Borrow_right(Pointer node, Pointer right);
	public static native Pointer get_Bound_mem(Pointer node);
	public static native void set_Bound_mem(Pointer node, Pointer mem);
	public static native Pointer get_Bound_index(Pointer node);
	public static native void set_Bound_index(Pointer node, Pointer index);
	public static native Pointer get_Bound_lower(Pointer node);
	public static native void set_Bound_lower(Pointer node, Pointer lower);
	public static native Pointer get_Bound_upper(Pointer node);
	public static native void set_Bound_upper(Pointer node, Pointer upper);
	public static native Pointer get_Builtin_mem(Pointer node);
	public static native void set_Builtin_mem(Pointer node, Pointer mem);
	public static native /* ir_builtin_kind */int get_Builtin_kind(Pointer node);
	public static native void set_Builtin_kind(Pointer node, /* ir_builtin_kind */int kind);
	public static native Pointer get_Builtin_type(Pointer node);
	public static native void set_Builtin_type(Pointer node, Pointer type);
	public static native Pointer get_Call_mem(Pointer node);
	public static native void set_Call_mem(Pointer node, Pointer mem);
	public static native Pointer get_Call_ptr(Pointer node);
	public static native void set_Call_ptr(Pointer node, Pointer ptr);
	public static native Pointer get_Call_type(Pointer node);
	public static native void set_Call_type(Pointer node, Pointer type);
	public static native int get_Call_tail_call(Pointer node);
	public static native void set_Call_tail_call(Pointer node, int tail_call);
	public static native Pointer get_Carry_left(Pointer node);
	public static native void set_Carry_left(Pointer node, Pointer left);
	public static native Pointer get_Carry_right(Pointer node);
	public static native void set_Carry_right(Pointer node, Pointer right);
	public static native Pointer get_Cast_op(Pointer node);
	public static native void set_Cast_op(Pointer node, Pointer op);
	public static native Pointer get_Cast_type(Pointer node);
	public static native void set_Cast_type(Pointer node, Pointer type);
	public static native Pointer get_Cmp_left(Pointer node);
	public static native void set_Cmp_left(Pointer node, Pointer left);
	public static native Pointer get_Cmp_right(Pointer node);
	public static native void set_Cmp_right(Pointer node, Pointer right);
	public static native Pointer get_Cond_selector(Pointer node);
	public static native void set_Cond_selector(Pointer node, Pointer selector);
	public static native com.sun.jna.NativeLong get_Cond_default_proj(Pointer node);
	public static native void set_Cond_default_proj(Pointer node, com.sun.jna.NativeLong default_proj);
	public static native /* cond_jmp_predicate */int get_Cond_jmp_pred(Pointer node);
	public static native void set_Cond_jmp_pred(Pointer node, /* cond_jmp_predicate */int jmp_pred);
	public static native Pointer get_Confirm_value(Pointer node);
	public static native void set_Confirm_value(Pointer node, Pointer value);
	public static native Pointer get_Confirm_bound(Pointer node);
	public static native void set_Confirm_bound(Pointer node, Pointer bound);
	public static native /* pn_Cmp */int get_Confirm_cmp(Pointer node);
	public static native void set_Confirm_cmp(Pointer node, /* pn_Cmp */int cmp);
	public static native Pointer get_Const_tarval(Pointer node);
	public static native void set_Const_tarval(Pointer node, Pointer tarval);
	public static native Pointer get_Conv_op(Pointer node);
	public static native void set_Conv_op(Pointer node, Pointer op);
	public static native int get_Conv_strict(Pointer node);
	public static native void set_Conv_strict(Pointer node, int strict);
	public static native Pointer get_CopyB_mem(Pointer node);
	public static native void set_CopyB_mem(Pointer node, Pointer mem);
	public static native Pointer get_CopyB_dst(Pointer node);
	public static native void set_CopyB_dst(Pointer node, Pointer dst);
	public static native Pointer get_CopyB_src(Pointer node);
	public static native void set_CopyB_src(Pointer node, Pointer src);
	public static native Pointer get_CopyB_type(Pointer node);
	public static native void set_CopyB_type(Pointer node, Pointer type);
	public static native Pointer get_Div_mem(Pointer node);
	public static native void set_Div_mem(Pointer node, Pointer mem);
	public static native Pointer get_Div_left(Pointer node);
	public static native void set_Div_left(Pointer node, Pointer left);
	public static native Pointer get_Div_right(Pointer node);
	public static native void set_Div_right(Pointer node, Pointer right);
	public static native Pointer get_Div_resmode(Pointer node);
	public static native void set_Div_resmode(Pointer node, Pointer resmode);
	public static native int get_Div_no_remainder(Pointer node);
	public static native void set_Div_no_remainder(Pointer node, int no_remainder);
	public static native Pointer get_DivMod_mem(Pointer node);
	public static native void set_DivMod_mem(Pointer node, Pointer mem);
	public static native Pointer get_DivMod_left(Pointer node);
	public static native void set_DivMod_left(Pointer node, Pointer left);
	public static native Pointer get_DivMod_right(Pointer node);
	public static native void set_DivMod_right(Pointer node, Pointer right);
	public static native Pointer get_DivMod_resmode(Pointer node);
	public static native void set_DivMod_resmode(Pointer node, Pointer resmode);
	public static native Pointer get_Eor_left(Pointer node);
	public static native void set_Eor_left(Pointer node, Pointer left);
	public static native Pointer get_Eor_right(Pointer node);
	public static native void set_Eor_right(Pointer node, Pointer right);
	public static native Pointer get_Free_mem(Pointer node);
	public static native void set_Free_mem(Pointer node, Pointer mem);
	public static native Pointer get_Free_ptr(Pointer node);
	public static native void set_Free_ptr(Pointer node, Pointer ptr);
	public static native Pointer get_Free_size(Pointer node);
	public static native void set_Free_size(Pointer node, Pointer size);
	public static native Pointer get_Free_type(Pointer node);
	public static native void set_Free_type(Pointer node, Pointer type);
	public static native /* ir_where_alloc */int get_Free_where(Pointer node);
	public static native void set_Free_where(Pointer node, /* ir_where_alloc */int where);
	public static native Pointer get_IJmp_target(Pointer node);
	public static native void set_IJmp_target(Pointer node, Pointer target);
	public static native Pointer get_Id_pred(Pointer node);
	public static native void set_Id_pred(Pointer node, Pointer pred);
	public static native Pointer get_InstOf_store(Pointer node);
	public static native void set_InstOf_store(Pointer node, Pointer store);
	public static native Pointer get_InstOf_obj(Pointer node);
	public static native void set_InstOf_obj(Pointer node, Pointer obj);
	public static native Pointer get_InstOf_type(Pointer node);
	public static native void set_InstOf_type(Pointer node, Pointer type);
	public static native Pointer get_Load_mem(Pointer node);
	public static native void set_Load_mem(Pointer node, Pointer mem);
	public static native Pointer get_Load_ptr(Pointer node);
	public static native void set_Load_ptr(Pointer node, Pointer ptr);
	public static native Pointer get_Load_mode(Pointer node);
	public static native void set_Load_mode(Pointer node, Pointer mode);
	public static native Pointer get_Minus_op(Pointer node);
	public static native void set_Minus_op(Pointer node, Pointer op);
	public static native Pointer get_Mod_mem(Pointer node);
	public static native void set_Mod_mem(Pointer node, Pointer mem);
	public static native Pointer get_Mod_left(Pointer node);
	public static native void set_Mod_left(Pointer node, Pointer left);
	public static native Pointer get_Mod_right(Pointer node);
	public static native void set_Mod_right(Pointer node, Pointer right);
	public static native Pointer get_Mod_resmode(Pointer node);
	public static native void set_Mod_resmode(Pointer node, Pointer resmode);
	public static native Pointer get_Mul_left(Pointer node);
	public static native void set_Mul_left(Pointer node, Pointer left);
	public static native Pointer get_Mul_right(Pointer node);
	public static native void set_Mul_right(Pointer node, Pointer right);
	public static native Pointer get_Mulh_left(Pointer node);
	public static native void set_Mulh_left(Pointer node, Pointer left);
	public static native Pointer get_Mulh_right(Pointer node);
	public static native void set_Mulh_right(Pointer node, Pointer right);
	public static native Pointer get_Mux_sel(Pointer node);
	public static native void set_Mux_sel(Pointer node, Pointer sel);
	public static native Pointer get_Mux_false(Pointer node);
	public static native void set_Mux_false(Pointer node, Pointer false_);
	public static native Pointer get_Mux_true(Pointer node);
	public static native void set_Mux_true(Pointer node, Pointer true_);
	public static native Pointer get_Not_op(Pointer node);
	public static native void set_Not_op(Pointer node, Pointer op);
	public static native Pointer get_Or_left(Pointer node);
	public static native void set_Or_left(Pointer node, Pointer left);
	public static native Pointer get_Or_right(Pointer node);
	public static native void set_Or_right(Pointer node, Pointer right);
	public static native Pointer get_Pin_op(Pointer node);
	public static native void set_Pin_op(Pointer node, Pointer op);
	public static native Pointer get_Proj_pred(Pointer node);
	public static native void set_Proj_pred(Pointer node, Pointer pred);
	public static native Pointer get_Quot_mem(Pointer node);
	public static native void set_Quot_mem(Pointer node, Pointer mem);
	public static native Pointer get_Quot_left(Pointer node);
	public static native void set_Quot_left(Pointer node, Pointer left);
	public static native Pointer get_Quot_right(Pointer node);
	public static native void set_Quot_right(Pointer node, Pointer right);
	public static native Pointer get_Quot_resmode(Pointer node);
	public static native void set_Quot_resmode(Pointer node, Pointer resmode);
	public static native Pointer get_Raise_mem(Pointer node);
	public static native void set_Raise_mem(Pointer node, Pointer mem);
	public static native Pointer get_Raise_exo_ptr(Pointer node);
	public static native void set_Raise_exo_ptr(Pointer node, Pointer exo_ptr);
	public static native Pointer get_Return_mem(Pointer node);
	public static native void set_Return_mem(Pointer node, Pointer mem);
	public static native Pointer get_Rotl_left(Pointer node);
	public static native void set_Rotl_left(Pointer node, Pointer left);
	public static native Pointer get_Rotl_right(Pointer node);
	public static native void set_Rotl_right(Pointer node, Pointer right);
	public static native Pointer get_Sel_mem(Pointer node);
	public static native void set_Sel_mem(Pointer node, Pointer mem);
	public static native Pointer get_Sel_ptr(Pointer node);
	public static native void set_Sel_ptr(Pointer node, Pointer ptr);
	public static native Pointer get_Sel_entity(Pointer node);
	public static native void set_Sel_entity(Pointer node, Pointer entity);
	public static native Pointer get_Shl_left(Pointer node);
	public static native void set_Shl_left(Pointer node, Pointer left);
	public static native Pointer get_Shl_right(Pointer node);
	public static native void set_Shl_right(Pointer node, Pointer right);
	public static native Pointer get_Shr_left(Pointer node);
	public static native void set_Shr_left(Pointer node, Pointer left);
	public static native Pointer get_Shr_right(Pointer node);
	public static native void set_Shr_right(Pointer node, Pointer right);
	public static native Pointer get_Shrs_left(Pointer node);
	public static native void set_Shrs_left(Pointer node, Pointer left);
	public static native Pointer get_Shrs_right(Pointer node);
	public static native void set_Shrs_right(Pointer node, Pointer right);
	public static native Pointer get_Store_mem(Pointer node);
	public static native void set_Store_mem(Pointer node, Pointer mem);
	public static native Pointer get_Store_ptr(Pointer node);
	public static native void set_Store_ptr(Pointer node, Pointer ptr);
	public static native Pointer get_Store_value(Pointer node);
	public static native void set_Store_value(Pointer node, Pointer value);
	public static native Pointer get_Sub_left(Pointer node);
	public static native void set_Sub_left(Pointer node, Pointer left);
	public static native Pointer get_Sub_right(Pointer node);
	public static native void set_Sub_right(Pointer node, Pointer right);
	public static native void optimize_cf(Pointer irg);
	public static native Pointer optimize_cf_pass(String name);
	public static native void opt_jumpthreading(Pointer irg);
	public static native Pointer opt_jumpthreading_pass(String name);
	public static native void opt_bool(Pointer irg);
	public static native Pointer opt_bool_pass(String name);
	public static native int conv_opt(Pointer irg);
	public static native Pointer conv_opt_pass(String name);
	public static native void escape_enalysis_irg(Pointer irg, Pointer callback);
	public static native void escape_analysis(int run_scalar_replace, Pointer callback);
	public static native void optimize_funccalls(int force_run, Pointer callback);
	public static native Pointer optimize_funccalls_pass(String name, int force_run, Pointer callback);
	public static native void do_gvn_pre(Pointer irg);
	public static native Pointer do_gvn_pre_pass(String name);
	public static native void opt_if_conv(Pointer irg);
	public static native Pointer opt_if_conv_pass(String name);
	public static native void opt_parallelize_mem(Pointer irg);
	public static native Pointer opt_parallelize_mem_pass(String name);
	public static native Pointer can_replace_load_by_const(Pointer load, Pointer c);
	public static native int optimize_load_store(Pointer irg);
	public static native Pointer optimize_load_store_pass(String name);
	public static native int opt_ldst(Pointer irg);
	public static native Pointer opt_ldst_pass(String name);
	public static native void loop_optimization(Pointer irg);
	public static native void opt_frame_irg(Pointer irg);
	public static native Pointer opt_frame_irg_pass(String name);
	public static native void opt_osr(Pointer irg, int flags);
	public static native Pointer opt_osr_pass(String name, int flags);
	public static native void remove_phi_cycles(Pointer irg);
	public static native Pointer remove_phi_cycles_pass(String name);
	public static native void proc_cloning(float threshold);
	public static native Pointer proc_cloning_pass(String name, float threshold);
	public static native int optimize_reassociation(Pointer irg);
	public static native Pointer optimize_reassociation_pass(String name);
	public static native void normalize_one_return(Pointer irg);
	public static native Pointer normalize_one_return_pass(String name);
	public static native void normalize_n_returns(Pointer irg);
	public static native Pointer normalize_n_returns_pass(String name);
	public static native int scalar_replacement_opt(Pointer irg);
	public static native Pointer scalar_replacement_opt_pass(String name);
	public static native int opt_tail_rec_irg(Pointer irg);
	public static native Pointer opt_tail_rec_irg_pass(String name);
	public static native void opt_tail_recursion();
	public static native Pointer opt_tail_recursion_pass(String name);
	public static native void normalize_irp_class_casts(Pointer gppt_fct);
	public static native void normalize_irg_class_casts(Pointer irg, Pointer gppt_fct);
	public static native void optimize_class_casts();
	public static native void combo(Pointer irg);
	public static native Pointer combo_pass(String name);
	public static native void inline_small_irgs(Pointer irg, int size);
	public static native Pointer inline_small_irgs_pass(String name, int size);
	public static native void inline_leave_functions(int maxsize, int leavesize, int size, int ignore_runtime);
	public static native Pointer inline_leave_functions_pass(String name, int maxsize, int leavesize, int size, int ignore_runtime);
	public static native void inline_functions(int maxsize, int inline_threshold, Pointer after_inline_opt);
	public static native Pointer inline_functions_pass(String name, int maxsize, int inline_threshold, Pointer after_inline_opt);
	public static native int shape_blocks(Pointer irg);
	public static native Pointer shape_blocks_pass(String name);
	public static native void do_loop_inversion(Pointer irg);
	public static native void do_loop_unrolling(Pointer irg);
	public static native void do_loop_peeling(Pointer irg);
	public static native Pointer loop_inversion_pass(String name);
	public static native Pointer loop_unroll_pass(String name);
	public static native Pointer loop_peeling_pass(String name);
	public static native Pointer firm_set_Alloc_func(Pointer newf);
	public static native Pointer set_vrp_pass(String name);
	public static native void garbage_collect_entities();
	public static native Pointer garbage_collect_entities_pass(String name);
	public static native void dead_node_elimination(Pointer irg);
	public static native Pointer dead_node_elimination_pass(String name);
	public static native int inline_method(Pointer call, Pointer called_graph);
	public static native void place_code(Pointer irg);
	public static native Pointer place_code_pass(String name);
	public static native void fixpoint_vrp(Pointer _0);
	public static native Pointer fixpoint_vrp_irg_pass(String name);
	public static native int value_not_zero(Pointer n, Buffer confirm);
	public static native int value_not_null(Pointer n, Buffer confirm);
	public static native /* ir_value_classify_sign */int classify_value_sign(Pointer n);
	public static native Pointer computed_value_Cmp_Confirm(Pointer cmp, Pointer left, Pointer right, /* pn_Cmp */int pnc);
}
