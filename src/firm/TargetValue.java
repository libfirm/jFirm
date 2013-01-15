package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_tv;

/**
 * Represents a (numeric) architecture independent value. This allows doing
 * arithmetic of the destination machine independent of the arithmetic of the
 * host machine where the compiler is running.
 */
public class TargetValue extends JNAWrapper {

	public TargetValue(Pointer ptr) {
		super(ptr);
	}

	public TargetValue(String str, long len, Mode mode) {
		this(binding_tv.new_tarval_from_str(str, new NativeLong(len), mode.ptr));
	}

	public TargetValue(long l, Mode mode) {
		this(binding_tv.new_tarval_from_str(Long.toString(l), new NativeLong(Long.toString(l).length()), mode.ptr));
	}

	public TargetValue(int i, Mode mode) {
		this(binding_tv.new_tarval_from_long(new NativeLong(i), mode.ptr));
	}

	public TargetValue(double d, Mode mode) {
		this(binding_tv.new_tarval_from_double(d, mode.ptr));
	}

	/** return true if the value can be represented in a C long type */
	public final boolean isLong() {
		return 0 != binding_tv.tarval_is_long(ptr);
	}

	/** return value as long */
	public final long asLong() {
		NativeLong l = binding_tv.get_tarval_long(ptr);
		return l.longValue();
	}

	/**
	 * return value as int Warning: there are no overflow checks in place here
	 */
	public final int asInt() {
		return (int) asLong();
	}

	public final double getDouble() {
		return binding_tv.get_tarval_double(ptr);
	}

	public final boolean isDouble() {
		return 0 != binding_tv.tarval_is_double(ptr);
	}

	public final Mode getMode() {
		Pointer pmode = binding_tv.get_tarval_mode(ptr);
		return new Mode(pmode);
	}

	public final boolean isNegative() {
		return 0 != binding_tv.tarval_is_negative(ptr);
	}

	public final boolean isNull() {
		return 0 != binding_tv.tarval_is_null(ptr);
	}

	public final boolean isOne() {
		return 0 != binding_tv.tarval_is_one(ptr);
	}

	public final boolean isMinusOne() {
		return 0 != binding_tv.tarval_is_minus_one(ptr);
	}

	public final boolean isAllOne() {
		return 0 != binding_tv.tarval_is_all_one(ptr);
	}

	public final boolean isConstant() {
		return 0 != binding_tv.tarval_is_constant(ptr);
	}

	public static final TargetValue getBad() {
		Pointer ptr = binding_tv.get_tarval_bad();
		return new TargetValue(ptr);
	}

	public static final TargetValue getUndefined() {
		Pointer ptr = binding_tv.get_tarval_undefined();
		return new TargetValue(ptr);
	}

	public static final TargetValue getBFalse() {
		Pointer ptr = binding_tv.get_tarval_b_false();
		return new TargetValue(ptr);
	}

	public static final TargetValue getBTrue() {
		Pointer ptr = binding_tv.get_tarval_b_true();
		return new TargetValue(ptr);
	}

	public static final TargetValue getUnreachable() {
		Pointer ptr = binding_tv.get_tarval_unreachable();
		return new TargetValue(ptr);
	}

	public static final TargetValue getReachable() {
		Pointer ptr = binding_tv.get_tarval_reachable();
		return new TargetValue(ptr);
	}

	public static final TargetValue getMax(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_max(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getMin(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_min(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getNull(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_null(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getOne(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_one(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getMinusOne(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_minus_one(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getAllOne(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_all_one(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getNAN(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_nan(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getPlusInf(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_plus_inf(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getMinusInf(Mode mode) {
		Pointer ptr = binding_tv.get_tarval_minus_inf(mode.ptr);
		return new TargetValue(ptr);
	}

	public static enum int_overflow_mode {
		TV_OVERFLOW_BAD(),
		/** < tarval module will return bad if a overflow occurs */
		TV_OVERFLOW_WRAP(),
		/** < tarval module will overflow will be ignored, wrap around occurs */
		TV_OVERFLOW_SATURATE();
		/** < tarval module will saturate the overflow */
		public final int val;

		private static class C {
			static int next_val = 0;
		}

		int_overflow_mode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		int_overflow_mode() {
			this.val = C.next_val++;
		}

		public static int_overflow_mode getEnum(int val) {
			for (int_overflow_mode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static final void setIntegerOverflowMode(int_overflow_mode ovMode) {
		binding_tv.tarval_set_integer_overflow_mode(ovMode.val);
	}

	public static final int_overflow_mode getIntegerOverflowMode() {
		int val = binding_tv.tarval_get_integer_overflow_mode();
		return int_overflow_mode.getEnum(val);
	}

	public final Relation compare(TargetValue other) {
		return Relation.fromValue(binding_tv.tarval_cmp(ptr, other.ptr));
	}

	public final TargetValue convertTo(Mode mode) {
		Pointer ptarval = binding_tv.tarval_convert_to(ptr, mode.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue not() {
		Pointer ptarval = binding_tv.tarval_not(ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue neg() {
		Pointer ptarval = binding_tv.tarval_neg(ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue add(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_add(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue sub(TargetValue other, Mode dstMode) {
		Pointer ptarval = binding_tv.tarval_sub(ptr, other.ptr, dstMode.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue mul(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_mul(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue div(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_div(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue mod(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_mod(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue abs() {
		Pointer ptarval = binding_tv.tarval_abs(ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue and(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_and(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue or(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_or(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue eor(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_eor(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue shl(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_shl(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue shr(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_shr(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue shrs(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_shrs(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue rotl(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_rotl(ptr, other.ptr);
		return new TargetValue(ptarval);
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

	public static class ModeInfo extends JNAWrapper {
		protected ModeInfo(Pointer ptr) {
			super(ptr);
		}
	}

	/**
	 * @return true on success
	 */
	public static final boolean setModeOutputOption(Mode mode, ModeInfo modeinfo) {
		// returns 0 on success
		int status = binding_tv.set_tarval_mode_output_option(mode.ptr,
				modeinfo.ptr);
		return status == 0;
	}

	public static final ModeInfo getModeOutputOption(Mode mode) {
		Pointer pModeInfo = binding_tv.get_tarval_mode_output_option(mode.ptr);
		return new ModeInfo(pModeInfo);
	}

	public final String getBitpattern() {
		return binding_tv.get_tarval_bitpattern(ptr);
	}

	public final byte getSubBits(int byteOfs) {
		return binding_tv.get_tarval_sub_bits(ptr, byteOfs);
	}

	public final boolean isSingleBit() {
		return 0 != binding_tv.tarval_is_single_bit(ptr);
	}

	public final boolean zeroMantissa() {
		return binding_tv.tarval_zero_mantissa(ptr) != 0;
	}

	public final int getExponent() {
		return binding_tv.tarval_get_exponent(ptr);
	}

	public final boolean ieee754CanConvLossless(Mode mode) {
		return 0 != binding_tv.tarval_ieee754_can_conv_lossless(ptr, mode.ptr);
	}

	public static final int ieee754GetExact() {
		return binding_tv.tarval_ieee754_get_exact();
	}

	public final boolean isNaN() {
		return 0 != binding_tv.tarval_is_NaN(ptr);
	}

	public final boolean isPlusInf() {
		return 0 != binding_tv.tarval_is_plus_inf(ptr);
	}

	public final boolean isMinusInf() {
		return 0 != binding_tv.tarval_is_minus_inf(ptr);
	}

	public final boolean isFinite() {
		return 0 != binding_tv.tarval_is_finite(ptr);
	}

	@Override
	public String toString() {
		if (getMode().isInt()) {
			long val = binding_tv.get_tarval_long(ptr).longValue();
			return Long.toString(val);
		} else if (getMode().equals(Mode.getb())) {
			return (isNull() ? "false" : "true");
		}

		return super.toString();
	}
}
