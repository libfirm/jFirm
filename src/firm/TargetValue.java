package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.TargetValueBinding;

/**
 * Represents a (numeric) architecture independent value. This allows doing
 * arithmetic of the destination machine independent of the arithmetic of
 * the host machine where the compiler is running.
 */
public class TargetValue extends JNAWrapper {

	private static final TargetValueBinding b = Bindings.getTargetValueBinding();
	
	public TargetValue(Pointer ptr) {
		super(ptr);
	}
	
	
	public TargetValue(String str, long len, Mode mode) {
		this(b.new_tarval_from_str(str, new NativeLong(len), mode.ptr));
	}
	
	public TargetValue(long l, Mode mode) {
		this(b.new_tarval_from_long(new NativeLong(l), mode.ptr));
	}
	
	public TargetValue(int i, Mode mode) {
		this((long) i, mode);
	}
	
	
	/** return true if the value can be represented in a C long type */
	public final boolean isLong() {
		return 0 != b.tarval_is_long(ptr);
	}
	
	/** return value as long */
	public final long asLong() {
		NativeLong l = b.get_tarval_long(ptr);
		return l.longValue();
	}
	
	/**
	 * return value as int
	 * Warning: there are no overflow checks in place here
	 */
	public final int asInt() {
		return (int) asLong();
	}
	
	public final static TargetValue newFromDouble(double d, Mode mode) {
		Pointer ptr = b.new_tarval_from_double(d, mode.ptr);
		return new TargetValue(ptr);
	}
	
	public final double getDouble() {
		return b.get_tarval_double(ptr);
	}
	
	public final boolean isDouble() {
		return 0 != b.tarval_is_double(ptr);
	}
	
	public final Mode getMode() {
		Pointer pmode = b.get_tarval_mode(ptr);
		return new Mode(pmode);
	}
	
	public final boolean isNegative() {
		return 0 != b.tarval_is_negative(ptr); 
	}

	public final boolean isNull() {
		return 0 != b.tarval_is_null(ptr);
	}

	public final boolean isOne() {
		return 0 != b.tarval_is_one(ptr);
	}

	public final boolean isMinusOne() {
		return 0 != b.tarval_is_minus_one(ptr);
	}

	public final boolean isAllOne() {
		return 0 != b.tarval_is_all_one(ptr);
	}

	public final boolean isConstant() {
		return 0 != b.tarval_is_constant(ptr);
	}

	public static final TargetValue getBad() {
		Pointer ptr = b.get_tarval_bad();
		return new TargetValue(ptr);
	}

	public static final TargetValue getUndefined() {
		Pointer ptr = b.get_tarval_undefined();
		return new TargetValue(ptr);
	}

	public static final TargetValue getBFalse() {
		Pointer ptr = b.get_tarval_b_false();
		return new TargetValue(ptr);
	}

	public static final TargetValue getBTrue() {
		Pointer ptr = b.get_tarval_b_true();
		return new TargetValue(ptr);
	}

	public static final TargetValue getUnreachable() {
		Pointer ptr = b.get_tarval_unreachable();
		return new TargetValue(ptr);
	}

	public static final TargetValue getReachable() {
		Pointer ptr = b.get_tarval_reachable();
		return new TargetValue(ptr);
	}

	public static final TargetValue getMax(Mode mode) {
		Pointer ptr = b.get_tarval_max(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getMin(Mode mode) {
		Pointer ptr = b.get_tarval_min(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getNull(Mode mode) {
		Pointer ptr = b.get_tarval_null(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getOne(Mode mode) {
		Pointer ptr = b.get_tarval_one(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getMinusOne(Mode mode) {
		Pointer ptr = b.get_tarval_minus_one(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getAllOne(Mode mode) {
		Pointer ptr = b.get_tarval_all_one(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getNAN(Mode mode) {
		Pointer ptr = b.get_tarval_nan(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getPlusInf(Mode mode) {
		Pointer ptr = b.get_tarval_plus_inf(mode.ptr);
		return new TargetValue(ptr);
	}

	public static final TargetValue getMinusInf(Mode mode) {
		Pointer ptr = b.get_tarval_minus_inf(mode.ptr);
		return new TargetValue(ptr);
	}
	
	public static enum int_overflow_mode {
		TV_OVERFLOW_BAD(),      /**< tarval module will return bad if a overflow occurs */
		TV_OVERFLOW_WRAP(),     /**< tarval module will overflow will be ignored, wrap around occurs */
		TV_OVERFLOW_SATURATE();  /**< tarval module will saturate the overflow */
		public final int val;
		private static class C { static int next_val = 0; }

		int_overflow_mode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		int_overflow_mode() {
			this.val = C.next_val++;
		}
		
		public static int_overflow_mode getEnum(int val) {
			for(int_overflow_mode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static final void setIntegerOverflowMode(int_overflow_mode ovMode) {
		b.tarval_set_integer_overflow_mode(ovMode.val);
	}

	public static final int_overflow_mode getIntegerOverflowMode() {
		int val = b.tarval_get_integer_overflow_mode();
		return int_overflow_mode.getEnum(val);
	}
	
	public final CompareResult compare(TargetValue other) {
		return CompareResult.fromProjNum(b.tarval_cmp(ptr, other.ptr));
	}
	
	public final TargetValue convertTo(Mode mode) {
		Pointer ptarval = b.tarval_convert_to(ptr, mode.ptr);
		return new TargetValue(ptarval);
	}
	
	public final TargetValue not() {
		Pointer ptarval = b.tarval_not(ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue neg() {
		Pointer ptarval = b.tarval_neg(ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue add(TargetValue other) {
		Pointer ptarval = b.tarval_add(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue sub(TargetValue other, Mode dstMode) {
		Pointer ptarval = b.tarval_sub(ptr, other.ptr, dstMode.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue mul(TargetValue other) {
		Pointer ptarval = b.tarval_mul(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue quo(TargetValue other) {
		Pointer ptarval = b.tarval_quo(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue div(TargetValue other) {
		Pointer ptarval = b.tarval_div(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue mod(TargetValue other) {
		Pointer ptarval = b.tarval_mod(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue abs() {
		Pointer ptarval = b.tarval_abs(ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue and(TargetValue other) {
		Pointer ptarval = b.tarval_and(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue or(TargetValue other) {
		Pointer ptarval = b.tarval_or(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue eor(TargetValue other) {
		Pointer ptarval = b.tarval_eor(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue shl(TargetValue other) {
		Pointer ptarval = b.tarval_shl(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue shr(TargetValue other) {
		Pointer ptarval = b.tarval_shr(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue shrs(TargetValue other) {
		Pointer ptarval = b.tarval_shrs(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final TargetValue rotl(TargetValue other) {
		Pointer ptarval = b.tarval_rotl(ptr, other.ptr);
		return new TargetValue(ptarval);
	}

	public final int carry() {
		return b.tarval_carry();
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
		private static class C { static int next_val; }

		tv_output_mode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		tv_output_mode() {
			this.val = C.next_val++;
		}
		
		public static tv_output_mode getEnum(int val) {
			for(tv_output_mode entry : values()) {
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
		int status = b.set_tarval_mode_output_option(mode.ptr, modeinfo.ptr);
		return status == 0;
	}

	public static final ModeInfo getModeOutputOption(Mode mode) {
		Pointer pModeInfo = b.get_tarval_mode_output_option(mode.ptr);
		return new ModeInfo(pModeInfo);
	}

	public final String getBitpattern() {
		return b.get_tarval_bitpattern(ptr);
	}

	public final byte getSubBits(int byteOfs) {
		return b.get_tarval_sub_bits(ptr, byteOfs);
	}

	public final boolean isSingleBit() {
		return 0 != b.tarval_is_single_bit(ptr);
	}

	public final boolean ieee754ZeroMantissa() {
		return b.tarval_ieee754_zero_mantissa(ptr) != 0;
	}

	public final int ieee754GetExponent() {
		return b.tarval_ieee754_get_exponent(ptr);
	}

	public final boolean ieee754CanConvLossless(Mode mode) {
		return 0 != b.tarval_ieee754_can_conv_lossless(ptr, mode.ptr);
	}

	public static final int ieee754SetImmediatePrecision(int bits) {
		return b.tarval_ieee754_set_immediate_precision(bits);
	}

	public static final int ieee754GetExact() {
		return b.tarval_ieee754_get_exact();
	}

	public static final int ieee754GetMantissaSize(Mode mode) {
		return b.tarval_ieee754_get_mantissa_size(mode.ptr);
	}

	public final void setEnableFpOps(boolean enable) {
		int valEnable = (enable ? 1 : 0);
		b.tarval_enable_fp_ops(valEnable);
	}

	public final boolean isNaN() {
		return 0 != b.tarval_is_NaN(ptr);
	}

	public final boolean isPlusInf() {
		return 0 != b.tarval_is_plus_inf(ptr);
	}

	public final boolean isMinusInf() {
		return 0 != b.tarval_is_minus_inf(ptr);
	}

	public final boolean isFinite() {
		return 0 != b.tarval_is_finite(ptr);
	}
	
	@Override
	public String toString() {
		if (getMode().isInt()) {
			long val = b.get_tarval_long(ptr).longValue();
			return Long.toString(val);
		} else if (getMode().equals(Mode.getb())) {
			return (isNull() ? "false" : "true");
		}
		
		return super.toString();
	}
}
