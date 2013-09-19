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
		op_pin_state_exc_pinned();
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
		mtp_no_property(0),
		mtp_property_const((1 << 0)),
		mtp_property_pure((1 << 1)),
		mtp_property_noreturn((1 << 2)),
		mtp_property_nothrow((1 << 3)),
		mtp_property_naked((1 << 4)),
		mtp_property_malloc((1 << 5)),
		mtp_property_returns_twice((1 << 6)),
		mtp_property_private((1 << 7)),
		mtp_property_has_loop((1 << 8)),
		mtp_property_always_inline((1 << 9)),
		mtp_property_noinline((1 << 10)),
		mtp_property_inline_recommended((1 << 11)),
		mtp_temporary((1 << 12));
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
		symconst_type_size(),
		symconst_type_align(),
		symconst_addr_ent(),
		symconst_ofs_ent();
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
		ir_bk_inner_trampoline(),
		ir_bk_saturating_increment(),
		ir_bk_compare_swap(),
		ir_bk_last(ir_builtin_kind.ir_bk_compare_swap.val);
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
		arch_dep_mul_to_shift((1 << 0)),
		arch_dep_div_by_const((1 << 1)),
		arch_dep_mod_by_const((1 << 2));
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

	public static enum dwarf_source_language {
		DW_LANG_C89(0x0001),
		DW_LANG_C(0x0002),
		DW_LANG_Ada83(0x0003),
		DW_LANG_C_plus_plus(0x0004),
		DW_LANG_Cobol74(0x0005),
		DW_LANG_Cobol85(0x0006),
		DW_LANG_Fortran77(0x0007),
		DW_LANG_Fortran90(0x0008),
		DW_LANG_Pascal83(0x0009),
		DW_LANG_Modula2(0x000a),
		DW_LANG_Java(0x000b),
		DW_LANG_C99(0x000c),
		DW_LANG_Ada95(0x000d),
		DW_LANG_Fortran95(0x000e),
		DW_LANG_PLI(0x000f),
		DW_LANG_ObjC(0x0010),
		DW_LANG_ObjC_plus_plus(0x0011),
		DW_LANG_UPC(0x0012),
		DW_LANG_D(0x0013),
		DW_LANG_Python(0x0014),
		DW_LANG_Go(0x0016);
		public final int val;

		private static class C {
			static int next_val;
		}

		dwarf_source_language(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		dwarf_source_language() {
			this.val = C.next_val++;
		}

		public static dwarf_source_language getEnum(int val) {
			for (dwarf_source_language entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native int be_parse_arg(String arg);

	public static native int be_is_big_endian();

	public static native int be_get_machine_size();

	public static native Pointer be_get_mode_float_arithmetic();

	public static native Pointer be_get_type_long_long();

	public static native Pointer be_get_type_unsigned_long_long();

	public static native Pointer be_get_type_long_double();

	public static native Pointer be_get_backend_param();

	public static native void be_lower_for_target();

	public static native void be_main(Pointer output, String compilation_unit_name);

	public static native /* asm_constraint_flags_t */int be_parse_asm_constraints(String constraints);

	public static native int be_is_valid_clobber(String clobber);

	public static native void be_dwarf_set_source_language(/* dwarf_source_language */int language);

	public static native void be_dwarf_set_compilation_directory(String directory);
}
