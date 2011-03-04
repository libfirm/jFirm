package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_be {
	static {
		Native.register("firm");
	}

	public static enum __codecvt_result {
		__codecvt_ok(),
		__codecvt_partial(),
		__codecvt_error(),
		__codecvt_noconv();
		public final int val;

		private static class C {
			static int next_val;
		}

		__codecvt_result(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		__codecvt_result() {
			this.val = C.next_val++;
		}

		public static __codecvt_result getEnum(int val) {
			for (__codecvt_result entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_relation {
		ir_relation_false(0),
		ir_relation_equal((1 << 0)),
		ir_relation_less((1 << 1)),
		ir_relation_greater((1 << 2)),
		ir_relation_unordered((1 << 3)),
		ir_relation_less_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val)),
		ir_relation_greater_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_greater((ir_relation.ir_relation_less.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_equal_greater(((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_equal((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val)),
		ir_relation_unordered_less_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_greater((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_greater_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less_greater(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_true((((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_unordered.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_relation(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_relation() {
			this.val = C.next_val++;
		}

		public static ir_relation getEnum(int val) {
			for (ir_relation entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_cons_flags {
		cons_none(0),
		cons_volatile((1 << 0)),
		cons_unaligned((1 << 1)),
		cons_floats((1 << 2));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_cons_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_cons_flags() {
			this.val = C.next_val++;
		}

		public static ir_cons_flags getEnum(int val) {
			for (ir_cons_flags entry : values()) {
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

		private static class C {
			static int next_val;
		}

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		op_pin_state() {
			this.val = C.next_val++;
		}

		public static op_pin_state getEnum(int val) {
			for (op_pin_state entry : values()) {
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

		private static class C {
			static int next_val;
		}

		cond_jmp_predicate(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		cond_jmp_predicate() {
			this.val = C.next_val++;
		}

		public static cond_jmp_predicate getEnum(int val) {
			for (cond_jmp_predicate entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum mtp_additional_properties {
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
		mtp_property_inherited((1 << 31));
		public final int val;

		private static class C {
			static int next_val;
		}

		mtp_additional_properties(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		mtp_additional_properties() {
			this.val = C.next_val++;
		}

		public static mtp_additional_properties getEnum(int val) {
			for (mtp_additional_properties entry : values()) {
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

		private static class C {
			static int next_val;
		}

		symconst_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		symconst_kind() {
			this.val = C.next_val++;
		}

		public static symconst_kind getEnum(int val) {
			for (symconst_kind entry : values()) {
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

		private static class C {
			static int next_val;
		}

		ir_where_alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_where_alloc() {
			this.val = C.next_val++;
		}

		public static ir_where_alloc getEnum(int val) {
			for (ir_where_alloc entry : values()) {
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

		private static class C {
			static int next_val;
		}

		ir_builtin_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_builtin_kind() {
			this.val = C.next_val++;
		}

		public static ir_builtin_kind getEnum(int val) {
			for (ir_builtin_kind entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_generic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_generic() {
			this.val = C.next_val++;
		}

		public static pn_generic getEnum(int val) {
			for (pn_generic entry : values()) {
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

		private static class C {
			static int next_val;
		}

		ir_value_classify_sign(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_value_classify_sign() {
			this.val = C.next_val++;
		}

		public static ir_value_classify_sign getEnum(int val) {
			for (ir_value_classify_sign entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum insn_kind {
		LEA(),
		SHIFT(),
		SUB(),
		ADD(),
		ZERO(),
		MUL(),
		ROOT();
		public final int val;

		private static class C {
			static int next_val;
		}

		insn_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		insn_kind() {
			this.val = C.next_val++;
		}

		public static insn_kind getEnum(int val) {
			for (insn_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum arch_dep_opts_t {
		arch_dep_none(0),
		arch_dep_mul_to_shift(1),
		arch_dep_div_by_const(2),
		arch_dep_mod_by_const(4);
		public final int val;

		private static class C {
			static int next_val;
		}

		arch_dep_opts_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		arch_dep_opts_t() {
			this.val = C.next_val++;
		}

		public static arch_dep_opts_t getEnum(int val) {
			for (arch_dep_opts_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum add_hidden {
		ADD_HIDDEN_ALWAYS_IN_FRONT(0),
		ADD_HIDDEN_ALWAYS_LAST(1),
		ADD_HIDDEN_SMART(2);
		public final int val;

		private static class C {
			static int next_val;
		}

		add_hidden(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		add_hidden() {
			this.val = C.next_val++;
		}

		public static add_hidden getEnum(int val) {
			for (add_hidden entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum lowering_flags {
		LF_NONE(0),
		LF_COMPOUND_PARAM(1),
		LF_COMPOUND_RETURN(2),
		LF_RETURN_HIDDEN(4),
		LF_SMALL_CMP_IN_REGS(8);
		public final int val;

		private static class C {
			static int next_val;
		}

		lowering_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		lowering_flags() {
			this.val = C.next_val++;
		}

		public static lowering_flags getEnum(int val) {
			for (lowering_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ikind {
		INTRINSIC_CALL(0),
		INTRINSIC_INSTR();
		public final int val;

		private static class C {
			static int next_val;
		}

		ikind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ikind() {
			this.val = C.next_val++;
		}

		public static ikind getEnum(int val) {
			for (ikind entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Alloc() {
			this.val = C.next_val++;
		}

		public static pn_Alloc getEnum(int val) {
			for (pn_Alloc entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Bound(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Bound() {
			this.val = C.next_val++;
		}

		public static pn_Bound getEnum(int val) {
			for (pn_Bound entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Builtin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Builtin() {
			this.val = C.next_val++;
		}

		public static pn_Builtin getEnum(int val) {
			for (pn_Builtin entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Call(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Call() {
			this.val = C.next_val++;
		}

		public static pn_Call getEnum(int val) {
			for (pn_Call entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Cond(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Cond() {
			this.val = C.next_val++;
		}

		public static pn_Cond getEnum(int val) {
			for (pn_Cond entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_CopyB(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_CopyB() {
			this.val = C.next_val++;
		}

		public static pn_CopyB getEnum(int val) {
			for (pn_CopyB entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Div(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Div() {
			this.val = C.next_val++;
		}

		public static pn_Div getEnum(int val) {
			for (pn_Div entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_InstOf(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_InstOf() {
			this.val = C.next_val++;
		}

		public static pn_InstOf getEnum(int val) {
			for (pn_InstOf entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Load(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Load() {
			this.val = C.next_val++;
		}

		public static pn_Load getEnum(int val) {
			for (pn_Load entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Mod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Mod() {
			this.val = C.next_val++;
		}

		public static pn_Mod getEnum(int val) {
			for (pn_Mod entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Raise(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Raise() {
			this.val = C.next_val++;
		}

		public static pn_Raise getEnum(int val) {
			for (pn_Raise entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Start(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Start() {
			this.val = C.next_val++;
		}

		public static pn_Start getEnum(int val) {
			for (pn_Start entry : values()) {
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

		private static class C {
			static int next_val;
		}

		pn_Store(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Store() {
			this.val = C.next_val++;
		}

		public static pn_Store getEnum(int val) {
			for (pn_Store entry : values()) {
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

		private static class C {
			static int next_val;
		}

		osr_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		osr_flags() {
			this.val = C.next_val++;
		}

		public static osr_flags getEnum(int val) {
			for (osr_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum asm_constraint_flags_t {
		ASM_CONSTRAINT_FLAG_NONE(0),
		ASM_CONSTRAINT_FLAG_SUPPORTS_REGISTER((1 << 0)),
		ASM_CONSTRAINT_FLAG_SUPPORTS_MEMOP((1 << 1)),
		ASM_CONSTRAINT_FLAG_SUPPORTS_IMMEDIATE((1 << 2)),
		ASM_CONSTRAINT_FLAG_NO_SUPPORT((1 << 3)),
		ASM_CONSTRAINT_FLAG_MODIFIER_WRITE((1 << 4)),
		ASM_CONSTRAINT_FLAG_MODIFIER_NO_WRITE((1 << 5)),
		ASM_CONSTRAINT_FLAG_MODIFIER_READ((1 << 6)),
		ASM_CONSTRAINT_FLAG_MODIFIER_NO_READ((1 << 7)),
		ASM_CONSTRAINT_FLAG_MODIFIER_EARLYCLOBBER((1 << 8)),
		ASM_CONSTRAINT_FLAG_MODIFIER_COMMUTATIVE((1 << 9)),
		ASM_CONSTRAINT_FLAG_INVALID((1 << 10));
		public final int val;

		private static class C {
			static int next_val;
		}

		asm_constraint_flags_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		asm_constraint_flags_t() {
			this.val = C.next_val++;
		}

		public static asm_constraint_flags_t getEnum(int val) {
			for (asm_constraint_flags_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native void be_opt_register();

	public static native int be_parse_arg(String arg);

	public static native Pointer be_get_backend_param();

	public static native void be_lower_for_target();

	public static native Pointer lower_for_target_pass(String name);

	public static native void be_main(Pointer output, String compilation_unit_name);

	public static native /* asm_constraint_flags_t */int be_parse_asm_constraints(String constraints);

	public static native int be_is_valid_clobber(String clobber);
}
