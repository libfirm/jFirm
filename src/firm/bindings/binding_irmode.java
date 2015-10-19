package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_irmode {
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
		mtp_property_no_write((1 << 0)),
		mtp_property_pure((1 << 1)),
		mtp_property_noreturn((1 << 2)),
		mtp_property_terminates((1 << 3)),
		mtp_property_nothrow((1 << 4)),
		mtp_property_naked((1 << 5)),
		mtp_property_malloc((1 << 6)),
		mtp_property_returns_twice((1 << 7)),
		mtp_property_private((1 << 8)),
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
		ir_bk_saturating_increment(),
		ir_bk_compare_swap(),
		ir_bk_may_alias(),
		ir_bk_va_start(),
		ir_bk_va_arg(),
		ir_bk_last(ir_builtin_kind.ir_bk_va_arg.val);
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

	public static enum ir_mode_arithmetic {
		irma_none(1),
		irma_twos_complement(2),
		irma_ieee754(256),
		irma_x86_extended_float(),
		irma_last(ir_mode_arithmetic.irma_x86_extended_float.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_mode_arithmetic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_mode_arithmetic() {
			this.val = C.next_val++;
		}

		public static ir_mode_arithmetic getEnum(int val) {
			for (ir_mode_arithmetic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum float_int_conversion_overflow_style_t {
		ir_overflow_indefinite(),
		ir_overflow_min_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		float_int_conversion_overflow_style_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		float_int_conversion_overflow_style_t() {
			this.val = C.next_val++;
		}

		public static float_int_conversion_overflow_style_t getEnum(int val) {
			for (float_int_conversion_overflow_style_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native Pointer new_int_mode(String name, /* ir_mode_arithmetic */int arithmetic, int bit_size, int sign, int modulo_shift);

	public static native Pointer new_reference_mode(String name, /* ir_mode_arithmetic */int arithmetic, int bit_size, int modulo_shift);

	public static native Pointer new_float_mode(String name, /* ir_mode_arithmetic */int arithmetic, int exponent_size, int mantissa_size, /* float_int_conversion_overflow_style_t */int int_conv_overflow);

	public static native Pointer new_non_arithmetic_mode(String name, int bit_size);

	public static native Pointer get_mode_ident(Pointer mode);

	public static native String get_mode_name(Pointer mode);

	public static native int get_mode_size_bits(Pointer mode);

	public static native int get_mode_size_bytes(Pointer mode);

	public static native /* ir_mode_arithmetic */int get_mode_arithmetic(Pointer mode);

	public static native int get_mode_modulo_shift(Pointer mode);

	public static native Pointer get_mode_min(Pointer mode);

	public static native Pointer get_mode_max(Pointer mode);

	public static native Pointer get_mode_null(Pointer mode);

	public static native Pointer get_mode_one(Pointer mode);

	public static native Pointer get_mode_all_one(Pointer mode);

	public static native Pointer get_mode_infinite(Pointer mode);

	public static native Pointer get_modeF();

	public static native Pointer get_modeD();

	public static native Pointer get_modeBs();

	public static native Pointer get_modeBu();

	public static native Pointer get_modeHs();

	public static native Pointer get_modeHu();

	public static native Pointer get_modeIs();

	public static native Pointer get_modeIu();

	public static native Pointer get_modeLs();

	public static native Pointer get_modeLu();

	public static native Pointer get_modeP();

	public static native Pointer get_modeb();

	public static native Pointer get_modeX();

	public static native Pointer get_modeBB();

	public static native Pointer get_modeM();

	public static native Pointer get_modeT();

	public static native Pointer get_modeANY();

	public static native Pointer get_modeBAD();

	public static native void set_modeP(Pointer p);

	public static native int mode_is_signed(Pointer mode);

	public static native int mode_is_float(Pointer mode);

	public static native int mode_is_int(Pointer mode);

	public static native int mode_is_reference(Pointer mode);

	public static native int mode_is_num(Pointer mode);

	public static native int mode_is_data(Pointer mode);

	public static native int smaller_mode(Pointer sm, Pointer lm);

	public static native int values_in_mode(Pointer sm, Pointer lm);

	public static native Pointer find_unsigned_mode(Pointer mode);

	public static native Pointer find_signed_mode(Pointer mode);

	public static native Pointer find_double_bits_int_mode(Pointer mode);

	public static native int mode_has_signed_zero(Pointer mode);

	public static native int mode_overflow_on_unary_Minus(Pointer mode);

	public static native int mode_wrap_around(Pointer mode);

	public static native Pointer get_reference_offset_mode(Pointer mode);

	public static native void set_reference_offset_mode(Pointer ref_mode, Pointer int_mode);

	public static native int get_mode_mantissa_size(Pointer mode);

	public static native int get_mode_exponent_size(Pointer mode);

	public static native /* float_int_conversion_overflow_style_t */int get_mode_float_int_overflow(Pointer mode);

	public static native int is_reinterpret_cast(Pointer src, Pointer dst);

	public static native Pointer get_type_for_mode(Pointer mode);

	public static native com.sun.jna.NativeLong ir_get_n_modes();

	public static native Pointer ir_get_mode(com.sun.jna.NativeLong num);
}
