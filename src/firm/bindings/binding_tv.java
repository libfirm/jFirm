package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_tv {
	static {
		Native.register("firm");
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
		ir_bk_inner_trampoline(),
		ir_bk_last(ir_builtin_kind.ir_bk_inner_trampoline.val);
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

	public static enum tarval_int_overflow_mode_t {
		TV_OVERFLOW_BAD(),
		TV_OVERFLOW_WRAP(),
		TV_OVERFLOW_SATURATE();
		public final int val;

		private static class C {
			static int next_val;
		}

		tarval_int_overflow_mode_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		tarval_int_overflow_mode_t() {
			this.val = C.next_val++;
		}

		public static tarval_int_overflow_mode_t getEnum(int val) {
			for (tarval_int_overflow_mode_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum tv_output_mode {
		TVO_NATIVE(),
		TVO_HEX(),
		TVO_DECIMAL(),
		TVO_OCTAL(),
		TVO_BINARY(),
		TVO_FLOAT(),
		TVO_HEXFLOAT();
		public final int val;

		private static class C {
			static int next_val;
		}

		tv_output_mode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		tv_output_mode() {
			this.val = C.next_val++;
		}

		public static tv_output_mode getEnum(int val) {
			for (tv_output_mode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native Pointer new_tarval_from_str(String str, com.sun.jna.NativeLong len, Pointer mode);

	public static native Pointer new_integer_tarval_from_str(String str, com.sun.jna.NativeLong len, byte sign, byte base, Pointer mode);

	public static native Pointer new_tarval_from_long(com.sun.jna.NativeLong l, Pointer mode);

	public static native com.sun.jna.NativeLong get_tarval_long(Pointer tv);

	public static native int tarval_is_long(Pointer tv);

	public static native Pointer new_tarval_from_double(double d, Pointer mode);

	public static native double get_tarval_double(Pointer tv);

	public static native int tarval_is_double(Pointer tv);

	public static native Pointer get_tarval_mode(Pointer tv);

	public static native int tarval_is_negative(Pointer tv);

	public static native int tarval_is_null(Pointer tv);

	public static native int tarval_is_one(Pointer tv);

	public static native int tarval_is_minus_one(Pointer tv);

	public static native int tarval_is_all_one(Pointer tv);

	public static native int tarval_is_constant(Pointer tv);

	public static native Pointer get_tarval_bad();

	public static native Pointer get_tarval_undefined();

	public static native Pointer get_tarval_b_false();

	public static native Pointer get_tarval_b_true();

	public static native Pointer get_tarval_unreachable();

	public static native Pointer get_tarval_reachable();

	public static native Pointer get_tarval_max(Pointer mode);

	public static native Pointer get_tarval_min(Pointer mode);

	public static native Pointer get_tarval_null(Pointer mode);

	public static native Pointer get_tarval_one(Pointer mode);

	public static native Pointer get_tarval_minus_one(Pointer mode);

	public static native Pointer get_tarval_all_one(Pointer mode);

	public static native Pointer get_tarval_nan(Pointer mode);

	public static native Pointer get_tarval_plus_inf(Pointer mode);

	public static native Pointer get_tarval_minus_inf(Pointer mode);

	public static native void tarval_set_integer_overflow_mode(/* tarval_int_overflow_mode_t */int ov_mode);

	public static native /* tarval_int_overflow_mode_t */int tarval_get_integer_overflow_mode();

	public static native /* ir_relation */int tarval_cmp(Pointer a, Pointer b);

	public static native Pointer tarval_convert_to(Pointer src, Pointer mode);

	public static native Pointer tarval_not(Pointer a);

	public static native Pointer tarval_neg(Pointer a);

	public static native Pointer tarval_add(Pointer a, Pointer b);

	public static native Pointer tarval_sub(Pointer a, Pointer b, Pointer dst_mode);

	public static native Pointer tarval_mul(Pointer a, Pointer b);

	public static native Pointer tarval_div(Pointer a, Pointer b);

	public static native Pointer tarval_mod(Pointer a, Pointer b);

	public static native Pointer tarval_divmod(Pointer a, Pointer b, java.nio.Buffer mod_res);

	public static native Pointer tarval_abs(Pointer a);

	public static native Pointer tarval_and(Pointer a, Pointer b);

	public static native Pointer tarval_andnot(Pointer a, Pointer b);

	public static native Pointer tarval_or(Pointer a, Pointer b);

	public static native Pointer tarval_eor(Pointer a, Pointer b);

	public static native Pointer tarval_shl(Pointer a, Pointer b);

	public static native Pointer tarval_shr(Pointer a, Pointer b);

	public static native Pointer tarval_shrs(Pointer a, Pointer b);

	public static native Pointer tarval_rotl(Pointer a, Pointer b);

	public static native int tarval_carry();

	public static native int set_tarval_mode_output_option(Pointer mode, Pointer modeinfo);

	public static native Pointer get_tarval_mode_output_option(Pointer mode);

	public static native String get_tarval_bitpattern(Pointer tv);

	public static native byte get_tarval_sub_bits(Pointer tv, int byte_ofs);

	public static native int tarval_is_single_bit(Pointer tv);

	public static native int get_tarval_popcount(Pointer tv);

	public static native int get_tarval_lowest_bit(Pointer tv);

	public static native int tarval_snprintf(String buf, com.sun.jna.NativeLong buflen, Pointer tv);

	public static native int tarval_printf(Pointer tv);

	public static native int tarval_zero_mantissa(Pointer tv);

	public static native int tarval_get_exponent(Pointer tv);

	public static native int tarval_ieee754_can_conv_lossless(Pointer tv, Pointer mode);

	public static native int tarval_ieee754_get_exact();

	public static native void tarval_enable_fp_ops(int enable);

	public static native int tarval_fp_ops_enabled();

	public static native int tarval_is_NaN(Pointer tv);

	public static native int tarval_is_plus_inf(Pointer tv);

	public static native int tarval_is_minus_inf(Pointer tv);

	public static native int tarval_is_finite(Pointer tv);

	public static native int is_tarval(Pointer thing);
}
