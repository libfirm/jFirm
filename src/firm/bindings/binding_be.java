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
		cons_floats((1 << 2)),
		cons_throws_exception((1 << 3));
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

	public static enum ir_volatility {
		volatility_non_volatile(),
		volatility_is_volatile();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_volatility(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_volatility() {
			this.val = C.next_val++;
		}

		public static ir_volatility getEnum(int val) {
			for (ir_volatility entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_align {
		align_is_aligned(0),
		align_non_aligned();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_align(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_align() {
			this.val = C.next_val++;
		}

		public static ir_align getEnum(int val) {
			for (ir_align entry : values()) {
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

	public static enum n_Add {
		n_Add_left(),
		n_Add_right(),
		n_Add_max(n_Add.n_Add_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Add(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Add() {
			this.val = C.next_val++;
		}

		public static n_Add getEnum(int val) {
			for (n_Add entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Alloc {
		n_Alloc_mem(),
		n_Alloc_count(),
		n_Alloc_max(n_Alloc.n_Alloc_count.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Alloc() {
			this.val = C.next_val++;
		}

		public static n_Alloc getEnum(int val) {
			for (n_Alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Alloc {
		pn_Alloc_M(),
		pn_Alloc_res(),
		pn_Alloc_X_regular(),
		pn_Alloc_X_except(),
		pn_Alloc_max(pn_Alloc.pn_Alloc_X_except.val);
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

	public static enum n_And {
		n_And_left(),
		n_And_right(),
		n_And_max(n_And.n_And_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_And(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_And() {
			this.val = C.next_val++;
		}

		public static n_And getEnum(int val) {
			for (n_And entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Borrow {
		n_Borrow_left(),
		n_Borrow_right(),
		n_Borrow_max(n_Borrow.n_Borrow_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Borrow(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Borrow() {
			this.val = C.next_val++;
		}

		public static n_Borrow getEnum(int val) {
			for (n_Borrow entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Bound {
		n_Bound_mem(),
		n_Bound_index(),
		n_Bound_lower(),
		n_Bound_upper(),
		n_Bound_max(n_Bound.n_Bound_upper.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Bound(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Bound() {
			this.val = C.next_val++;
		}

		public static n_Bound getEnum(int val) {
			for (n_Bound entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Bound {
		pn_Bound_M(),
		pn_Bound_res(),
		pn_Bound_X_regular(),
		pn_Bound_X_except(),
		pn_Bound_max(pn_Bound.pn_Bound_X_except.val);
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

	public static enum n_Builtin {
		n_Builtin_mem(),
		n_Builtin_max(n_Builtin.n_Builtin_mem.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Builtin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Builtin() {
			this.val = C.next_val++;
		}

		public static n_Builtin getEnum(int val) {
			for (n_Builtin entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Builtin {
		pn_Builtin_M(),
		pn_Builtin_1_result(),
		pn_Builtin_max(pn_Builtin.pn_Builtin_1_result.val);
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

	public static enum n_Call {
		n_Call_mem(),
		n_Call_ptr(),
		n_Call_max(n_Call.n_Call_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Call(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Call() {
			this.val = C.next_val++;
		}

		public static n_Call getEnum(int val) {
			for (n_Call entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Call {
		pn_Call_M(),
		pn_Call_T_result(),
		pn_Call_X_regular(),
		pn_Call_X_except(),
		pn_Call_max(pn_Call.pn_Call_X_except.val);
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

	public static enum n_Carry {
		n_Carry_left(),
		n_Carry_right(),
		n_Carry_max(n_Carry.n_Carry_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Carry(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Carry() {
			this.val = C.next_val++;
		}

		public static n_Carry getEnum(int val) {
			for (n_Carry entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Cast {
		n_Cast_op(),
		n_Cast_max(n_Cast.n_Cast_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Cast(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Cast() {
			this.val = C.next_val++;
		}

		public static n_Cast getEnum(int val) {
			for (n_Cast entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Cmp {
		n_Cmp_left(),
		n_Cmp_right(),
		n_Cmp_max(n_Cmp.n_Cmp_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Cmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Cmp() {
			this.val = C.next_val++;
		}

		public static n_Cmp getEnum(int val) {
			for (n_Cmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Cond {
		n_Cond_selector(),
		n_Cond_max(n_Cond.n_Cond_selector.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Cond(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Cond() {
			this.val = C.next_val++;
		}

		public static n_Cond getEnum(int val) {
			for (n_Cond entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Cond {
		pn_Cond_false(),
		pn_Cond_true(),
		pn_Cond_max(pn_Cond.pn_Cond_true.val);
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

	public static enum n_Confirm {
		n_Confirm_value(),
		n_Confirm_bound(),
		n_Confirm_max(n_Confirm.n_Confirm_bound.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Confirm(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Confirm() {
			this.val = C.next_val++;
		}

		public static n_Confirm getEnum(int val) {
			for (n_Confirm entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Conv {
		n_Conv_op(),
		n_Conv_max(n_Conv.n_Conv_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Conv(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Conv() {
			this.val = C.next_val++;
		}

		public static n_Conv getEnum(int val) {
			for (n_Conv entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_CopyB {
		n_CopyB_mem(),
		n_CopyB_dst(),
		n_CopyB_src(),
		n_CopyB_max(n_CopyB.n_CopyB_src.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_CopyB(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_CopyB() {
			this.val = C.next_val++;
		}

		public static n_CopyB getEnum(int val) {
			for (n_CopyB entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_CopyB {
		pn_CopyB_M(),
		pn_CopyB_X_regular(),
		pn_CopyB_X_except(),
		pn_CopyB_max(pn_CopyB.pn_CopyB_X_except.val);
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

	public static enum n_Div {
		n_Div_mem(),
		n_Div_left(),
		n_Div_right(),
		n_Div_max(n_Div.n_Div_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Div(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Div() {
			this.val = C.next_val++;
		}

		public static n_Div getEnum(int val) {
			for (n_Div entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Div {
		pn_Div_M(),
		pn_Div_res(),
		pn_Div_X_regular(),
		pn_Div_X_except(),
		pn_Div_max(pn_Div.pn_Div_X_except.val);
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

	public static enum n_Eor {
		n_Eor_left(),
		n_Eor_right(),
		n_Eor_max(n_Eor.n_Eor_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Eor(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Eor() {
			this.val = C.next_val++;
		}

		public static n_Eor getEnum(int val) {
			for (n_Eor entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Free {
		n_Free_mem(),
		n_Free_ptr(),
		n_Free_size(),
		n_Free_max(n_Free.n_Free_size.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Free(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Free() {
			this.val = C.next_val++;
		}

		public static n_Free getEnum(int val) {
			for (n_Free entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_IJmp {
		n_IJmp_target(),
		n_IJmp_max(n_IJmp.n_IJmp_target.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_IJmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_IJmp() {
			this.val = C.next_val++;
		}

		public static n_IJmp getEnum(int val) {
			for (n_IJmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Id {
		n_Id_pred(),
		n_Id_max(n_Id.n_Id_pred.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Id(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Id() {
			this.val = C.next_val++;
		}

		public static n_Id getEnum(int val) {
			for (n_Id entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_InstOf {
		n_InstOf_store(),
		n_InstOf_obj(),
		n_InstOf_max(n_InstOf.n_InstOf_obj.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_InstOf(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_InstOf() {
			this.val = C.next_val++;
		}

		public static n_InstOf getEnum(int val) {
			for (n_InstOf entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_InstOf {
		pn_InstOf_M(),
		pn_InstOf_res(),
		pn_InstOf_X_regular(),
		pn_InstOf_X_except(),
		pn_InstOf_max(pn_InstOf.pn_InstOf_X_except.val);
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

	public static enum n_Load {
		n_Load_mem(),
		n_Load_ptr(),
		n_Load_max(n_Load.n_Load_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Load(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Load() {
			this.val = C.next_val++;
		}

		public static n_Load getEnum(int val) {
			for (n_Load entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Load {
		pn_Load_M(),
		pn_Load_res(),
		pn_Load_X_regular(),
		pn_Load_X_except(),
		pn_Load_max(pn_Load.pn_Load_X_except.val);
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

	public static enum n_Minus {
		n_Minus_op(),
		n_Minus_max(n_Minus.n_Minus_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Minus(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Minus() {
			this.val = C.next_val++;
		}

		public static n_Minus getEnum(int val) {
			for (n_Minus entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Mod {
		n_Mod_mem(),
		n_Mod_left(),
		n_Mod_right(),
		n_Mod_max(n_Mod.n_Mod_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mod() {
			this.val = C.next_val++;
		}

		public static n_Mod getEnum(int val) {
			for (n_Mod entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Mod {
		pn_Mod_M(),
		pn_Mod_res(),
		pn_Mod_X_regular(),
		pn_Mod_X_except(),
		pn_Mod_max(pn_Mod.pn_Mod_X_except.val);
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

	public static enum n_Mul {
		n_Mul_left(),
		n_Mul_right(),
		n_Mul_max(n_Mul.n_Mul_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mul(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mul() {
			this.val = C.next_val++;
		}

		public static n_Mul getEnum(int val) {
			for (n_Mul entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Mulh {
		n_Mulh_left(),
		n_Mulh_right(),
		n_Mulh_max(n_Mulh.n_Mulh_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mulh(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mulh() {
			this.val = C.next_val++;
		}

		public static n_Mulh getEnum(int val) {
			for (n_Mulh entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Mux {
		n_Mux_sel(),
		n_Mux_false(),
		n_Mux_true(),
		n_Mux_max(n_Mux.n_Mux_true.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mux(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mux() {
			this.val = C.next_val++;
		}

		public static n_Mux getEnum(int val) {
			for (n_Mux entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Not {
		n_Not_op(),
		n_Not_max(n_Not.n_Not_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Not(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Not() {
			this.val = C.next_val++;
		}

		public static n_Not getEnum(int val) {
			for (n_Not entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Or {
		n_Or_left(),
		n_Or_right(),
		n_Or_max(n_Or.n_Or_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Or(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Or() {
			this.val = C.next_val++;
		}

		public static n_Or getEnum(int val) {
			for (n_Or entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Pin {
		n_Pin_op(),
		n_Pin_max(n_Pin.n_Pin_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Pin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Pin() {
			this.val = C.next_val++;
		}

		public static n_Pin getEnum(int val) {
			for (n_Pin entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Proj {
		n_Proj_pred(),
		n_Proj_max(n_Proj.n_Proj_pred.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Proj(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Proj() {
			this.val = C.next_val++;
		}

		public static n_Proj getEnum(int val) {
			for (n_Proj entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Raise {
		n_Raise_mem(),
		n_Raise_exo_ptr(),
		n_Raise_max(n_Raise.n_Raise_exo_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Raise(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Raise() {
			this.val = C.next_val++;
		}

		public static n_Raise getEnum(int val) {
			for (n_Raise entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Raise {
		pn_Raise_M(),
		pn_Raise_X(),
		pn_Raise_max(pn_Raise.pn_Raise_X.val);
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

	public static enum n_Return {
		n_Return_mem(),
		n_Return_max(n_Return.n_Return_mem.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Return(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Return() {
			this.val = C.next_val++;
		}

		public static n_Return getEnum(int val) {
			for (n_Return entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Rotl {
		n_Rotl_left(),
		n_Rotl_right(),
		n_Rotl_max(n_Rotl.n_Rotl_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Rotl(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Rotl() {
			this.val = C.next_val++;
		}

		public static n_Rotl getEnum(int val) {
			for (n_Rotl entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Sel {
		n_Sel_mem(),
		n_Sel_ptr(),
		n_Sel_max(n_Sel.n_Sel_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Sel(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Sel() {
			this.val = C.next_val++;
		}

		public static n_Sel getEnum(int val) {
			for (n_Sel entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Shl {
		n_Shl_left(),
		n_Shl_right(),
		n_Shl_max(n_Shl.n_Shl_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Shl(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Shl() {
			this.val = C.next_val++;
		}

		public static n_Shl getEnum(int val) {
			for (n_Shl entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Shr {
		n_Shr_left(),
		n_Shr_right(),
		n_Shr_max(n_Shr.n_Shr_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Shr(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Shr() {
			this.val = C.next_val++;
		}

		public static n_Shr getEnum(int val) {
			for (n_Shr entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Shrs {
		n_Shrs_left(),
		n_Shrs_right(),
		n_Shrs_max(n_Shrs.n_Shrs_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Shrs(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Shrs() {
			this.val = C.next_val++;
		}

		public static n_Shrs getEnum(int val) {
			for (n_Shrs entry : values()) {
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
		pn_Start_T_args(),
		pn_Start_max(pn_Start.pn_Start_T_args.val);
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

	public static enum n_Store {
		n_Store_mem(),
		n_Store_ptr(),
		n_Store_value(),
		n_Store_max(n_Store.n_Store_value.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Store(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Store() {
			this.val = C.next_val++;
		}

		public static n_Store getEnum(int val) {
			for (n_Store entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Store {
		pn_Store_M(),
		pn_Store_X_regular(),
		pn_Store_X_except(),
		pn_Store_max(pn_Store.pn_Store_X_except.val);
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

	public static enum n_Sub {
		n_Sub_left(),
		n_Sub_right(),
		n_Sub_max(n_Sub.n_Sub_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Sub(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Sub() {
			this.val = C.next_val++;
		}

		public static n_Sub getEnum(int val) {
			for (n_Sub entry : values()) {
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
