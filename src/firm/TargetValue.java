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

	public final boolean isAllOne() {
		return 0 != binding_tv.tarval_is_all_one(ptr);
	}

	public final boolean isConstant() {
		return 0 != binding_tv.tarval_is_constant(ptr);
	}

	/**
	 * Returns the tarval representing a Bad value (a value that can't
	 * be produced by calculations). This may be used to represent results
	 * of unreachable code or of invalid calculations like a division by zero.
	 * This may be used in dataflow optimizations as top/bottom.
	 */
	public static final TargetValue getBad() {
		Pointer ptr = binding_tv.get_tarval_bad();
		return new TargetValue(ptr);
	}

	/**
	 * Returns the tarval representing a Unknown (but otherwise valid)
	 * value.
	 * This may be used in dataflow optimizations as top/bottom.
	 */
	public static final TargetValue getUnknown() {
		Pointer ptr = binding_tv.get_tarval_unknown();
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

	public static final boolean getWrapOnOverflow() {
		return 0 != binding_tv.tarval_get_wrap_on_overflow();
	}

	public static final void setWrapOnOverflow(boolean wrapOnOverflow) {
		binding_tv.tarval_set_wrap_on_overflow(wrapOnOverflow ? 1 : 0);
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

	public final TargetValue sub(TargetValue other) {
		Pointer ptarval = binding_tv.tarval_sub(ptr, other.ptr);
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

	public final int popcount() {
		return binding_tv.get_tarval_popcount(ptr);
	}

	public final int lowest_bit() {
		return binding_tv.get_tarval_lowest_bit(ptr);
	}

	public final int highest_bit() {
		return binding_tv.get_tarval_highest_bit(ptr);
	}

	public final byte getSubBits(int byteOfs) {
		return binding_tv.get_tarval_sub_bits(ptr, byteOfs);
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
		return 0 != binding_tv.tarval_is_nan(ptr);
	}

	public final boolean isQuietNaN() {
		return 0 != binding_tv.tarval_is_quiet_nan(ptr);
	}

	public final boolean isSignalingNaN() {
		return 0 != binding_tv.tarval_is_quiet_nan(ptr);
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
