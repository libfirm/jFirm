package firm;

import java.util.Iterator;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_be;
import firm.bindings.binding_irmode;
import firm.bindings.binding_irmode.ir_mode_arithmetic;

/**
 * Mode represents values that can be produced by firm nodes. There are modes
 * describing numbers and their arithmetic operations on them. As well as some
 * special nodes for representing control-flow, memory/side-effects, or
 * (internal) truth-values.
 *
 * There are a number of predefined modes available in the static getX()
 * functions.
 */
public final class Mode extends JNAWrapper {

	public Mode(Pointer p) {
		super(p);
	}

	public static enum Arithmetic {
		None(ir_mode_arithmetic.irma_none.val),
		TwosComplement(ir_mode_arithmetic.irma_twos_complement.val),
		IEE754(ir_mode_arithmetic.irma_ieee754.val),
		X86ExtendedFloat(ir_mode_arithmetic.irma_x86_extended_float.val);

		public final int val;
		private Arithmetic(int val) {
			this.val = val;
		}

		public static Arithmetic getEnum(int val) {
			for (Arithmetic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static Mode createIntMode(String name, int bitSize, boolean sign, int moduloShift) {
		return new Mode(binding_irmode.new_int_mode(name, bitSize, sign?1:0, moduloShift));
	}

	public static Mode createFloatMode(String name, Arithmetic arithmetic, int exponentSize, int mantissaSize) {
		return new Mode(binding_irmode.new_float_mode(name, arithmetic.val, exponentSize, mantissaSize,
		                binding_be.be_get_float_int_overflow()));
	}

	public static Mode createReferenceMode(String name, int bitSize, int moduloShift) {
		/** we use a modulo_shift of 0, because cparser does so. */
		return new Mode(binding_irmode.new_reference_mode(name, bitSize, moduloShift));
	}

	public final String getName() {
		return binding_irmode.get_mode_name(ptr);
	}

	@Override
	public String toString() {
		return getName();
	}

	public final int getSizeBits() {
		return binding_irmode.get_mode_size_bits(ptr);
	}

	public final int getSizeBytes() {
		return binding_irmode.get_mode_size_bytes(ptr);
	}

	public final boolean hasSign() {
		return binding_irmode.mode_is_signed(ptr) == 1;
	}

	public final int getMantissaSize() {
		return binding_irmode.get_mode_mantissa_size(ptr);
	}

	public final int getExponentSize() {
		return binding_irmode.get_mode_exponent_size(ptr);
	}

	public final Arithmetic getArithmetic() {
		int val = binding_irmode.get_mode_arithmetic(ptr);
		return Arithmetic.getEnum(val);
	}

	public final int getModuloShift() {
		return binding_irmode.get_mode_modulo_shift(ptr);
	}

	/** returns the smallest representable value of a mode */
	public final TargetValue getMin() {
		Pointer tarval = binding_irmode.get_mode_min(ptr);
		return new TargetValue(tarval);
	}

	/** returns the biggest representable value of a mode */
	public final TargetValue getMax() {
		Pointer tarval = binding_irmode.get_mode_max(ptr);
		return new TargetValue(tarval);
	}

	/** returns the neutral element of the addition (aka 0) */
	public final TargetValue getNull() {
		Pointer tarval = binding_irmode.get_mode_null(ptr);
		return new TargetValue(tarval);
	}

	/** returns the neutral element of multiplication (aka 1) */
	public final TargetValue getOne() {
		Pointer tarval = binding_irmode.get_mode_one(ptr);
		return new TargetValue(tarval);
	}

	/** return the value where all bits are set to 1 */
	public final TargetValue getAllOne() {
		Pointer tarval = binding_irmode.get_mode_all_one(ptr);
		return new TargetValue(tarval);
	}

	/** returns infinite (for float modes) */
	public final TargetValue getInfinite() {
		Pointer tarval = binding_irmode.get_mode_infinite(ptr);
		return new TargetValue(tarval);
	}

	public static final Mode getF() {
		Pointer modePtr = binding_irmode.get_modeF();
		return new Mode(modePtr);
	}

	public static final Mode getD() {
		Pointer modePtr = binding_irmode.get_modeD();
		return new Mode(modePtr);
	}

	public static final Mode getBs() {
		Pointer modePtr = binding_irmode.get_modeBs();
		return new Mode(modePtr);
	}

	public static final Mode getBu() {
		Pointer modePtr = binding_irmode.get_modeBu();
		return new Mode(modePtr);
	}

	public static final Mode getHs() {
		Pointer modePtr = binding_irmode.get_modeHs();
		return new Mode(modePtr);
	}

	public static final Mode getHu() {
		Pointer modePtr = binding_irmode.get_modeHu();
		return new Mode(modePtr);
	}

	public static final Mode getIs() {
		Pointer modePtr = binding_irmode.get_modeIs();
		return new Mode(modePtr);
	}

	public static final Mode getIu() {
		Pointer modePtr = binding_irmode.get_modeIu();
		return new Mode(modePtr);
	}

	public static final Mode getLs() {
		Pointer modePtr = binding_irmode.get_modeLs();
		return new Mode(modePtr);
	}

	public static final Mode getLu() {
		Pointer modePtr = binding_irmode.get_modeLu();
		return new Mode(modePtr);
	}

	public static final Mode getP() {
		Pointer modePtr = binding_irmode.get_modeP();
		return new Mode(modePtr);
	}

	public static final Mode getb() {
		Pointer modePtr = binding_irmode.get_modeb();
		return new Mode(modePtr);
	}

	public static final Mode getX() {
		Pointer modePtr = binding_irmode.get_modeX();
		return new Mode(modePtr);
	}

	public static final Mode getBB() {
		Pointer modePtr = binding_irmode.get_modeBB();
		return new Mode(modePtr);
	}

	public static final Mode getM() {
		Pointer modePtr = binding_irmode.get_modeM();
		return new Mode(modePtr);
	}

	public static final Mode getT() {
		Pointer modePtr = binding_irmode.get_modeT();
		return new Mode(modePtr);
	}

	public static final Mode getANY() {
		Pointer modePtr = binding_irmode.get_modeANY();
		return new Mode(modePtr);
	}

	public static final Mode getBAD() {
		Pointer modePtr = binding_irmode.get_modeBAD();
		return new Mode(modePtr);
	}

	public final boolean isSigned() {
		return 0 != binding_irmode.mode_is_signed(ptr);
	}

	public final boolean isFloat() {
		return 0 != binding_irmode.mode_is_float(ptr);
	}

	public final boolean isInt() {
		return 0 != binding_irmode.mode_is_int(ptr);
	}

	public final boolean isReference() {
		return 0 != binding_irmode.mode_is_reference(ptr);
	}

	public final boolean isNum() {
		return 0 != binding_irmode.mode_is_num(ptr);
	}

	public final boolean isData() {
		return 0 != binding_irmode.mode_is_data(ptr);
	}

	public final boolean isSmallerThan(Mode compareTo) {
		int val = binding_irmode.smaller_mode(ptr, compareTo.ptr);
		return 0 != val;
	}

	public final boolean isValuesInMode(Mode compareTo) {
		int val = binding_irmode.values_in_mode(ptr, compareTo.ptr);
		return 0 != val;
	}

	public final Mode findUnsigned() {
		Pointer modep = binding_irmode.find_unsigned_mode(ptr);
		return new Mode(modep);
	}

	public final Mode findSigned() {
		Pointer modep = binding_irmode.find_signed_mode(ptr);
		return new Mode(modep);
	}

	public final Mode findDoubleBitsInt() {
		Pointer modep = binding_irmode.find_double_bits_int_mode(ptr);
		return new Mode(modep);
	}

	public final boolean hasSignedZero() {
		return 0 != binding_irmode.mode_has_signed_zero(ptr);
	}

	public final boolean overflowOnUnaryMinus() {
		return 0 != binding_irmode.mode_overflow_on_unary_Minus(ptr);
	}

	public final boolean wrapAround() {
		return 0 != binding_irmode.mode_wrap_around(ptr);
	}

	public final Mode getReferenceOffsetMode() {
		Pointer modep = binding_irmode.get_reference_offset_mode(ptr);
		return new Mode(modep);
	}

	public final void setReferenceOffsetMode(Mode intMode) {
		binding_irmode.set_reference_offset_mode(ptr, intMode.ptr);
	}

	public static void setDefaultModeP(Mode mode) {
		binding_irmode.set_modeP(mode.ptr);
	}

	public final boolean isReinterpretCast(Mode castTo) {
		return 0 != binding_irmode.is_reinterpret_cast(ptr, castTo.ptr);
	}

	public final Type getType() {
		return Type.createWrapper(binding_irmode.get_type_for_mode(ptr));
	}

	public static int getNModes() {
		return binding_irmode.ir_get_n_modes().intValue();
	}

	public static Mode getMode(int n) {
		return new Mode(binding_irmode.ir_get_mode(new NativeLong(n)));
	}

	public static Iterable<Mode> getModes() {
		return new Iterable<Mode>() {
			@Override
			public Iterator<Mode> iterator() {
				return new Iterator<Mode>() {
					int n;

					@Override
					public boolean hasNext() {
						return n < getNModes();
					}

					@Override
					public Mode next() {
						return getMode(n++);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException(
								"mode remove not available");
					}
				};
			}
		};
	}
}
