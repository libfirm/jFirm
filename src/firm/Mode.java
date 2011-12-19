package firm;

import java.util.Iterator;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_irmode;

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

	public static enum ir_modecode {
		irm_BB(),
		irm_X(),
		irm_F(),
		irm_D(),
		irm_E(),
		irm_Bs(),
		irm_Bu(),
		irm_Hs(),
		irm_Hu(),
		irm_Is(),
		irm_Iu(),
		irm_Ls(),
		irm_Lu(),
		irm_LLs(),
		irm_LLu(),
		irm_P(),
		irm_b(),
		irm_M(),
		irm_T(),
		irm_ANY(),
		irm_BAD(),
		irm_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_modecode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_modecode() {
			this.val = C.next_val++;
		}

		public static ir_modecode getEnum(int val) {
			for (ir_modecode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_mode_sort_helper {
		irmsh_is_num(16),
		irmsh_is_data(32),
		irmsh_is_datab(64),
		irmsh_is_dataM(128);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_mode_sort_helper(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_mode_sort_helper() {
			this.val = C.next_val++;
		}

		public static ir_mode_sort_helper getEnum(int val) {
			for (ir_mode_sort_helper entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_mode_sort {
		irms_auxiliary(0),
		irms_control_flow(1),
		irms_memory((2 | ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_internal_boolean((3 | ir_mode_sort_helper.irmsh_is_datab.val)),
		irms_reference(
				(((4 | ir_mode_sort_helper.irmsh_is_data.val) | ir_mode_sort_helper.irmsh_is_datab.val) | ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_int_number(
				((((5 | ir_mode_sort_helper.irmsh_is_data.val) | ir_mode_sort_helper.irmsh_is_datab.val) | ir_mode_sort_helper.irmsh_is_dataM.val) | ir_mode_sort_helper.irmsh_is_num.val)),
		irms_float_number(
				((((6 | ir_mode_sort_helper.irmsh_is_data.val) | ir_mode_sort_helper.irmsh_is_datab.val) | ir_mode_sort_helper.irmsh_is_dataM.val) | ir_mode_sort_helper.irmsh_is_num.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_mode_sort(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_mode_sort() {
			this.val = C.next_val++;
		}

		public static ir_mode_sort getEnum(int val) {
			for (ir_mode_sort entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_mode_arithmetic {
		irma_uninitialized(0),
		irma_none(1),
		irma_twos_complement(2),
		irma_ones_complement(),
		irma_int_BCD(),
		irma_ieee754(256),
		irma_float_BCD(),
		irma_max();
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

	public static Mode createIntMode(String name, ir_mode_arithmetic arithmetic, int bitSize, boolean sign, int moduloShift) {
		return new Mode(binding_irmode.new_int_mode(name, arithmetic.val, bitSize, sign?1:0, moduloShift));
	}

	public static Mode createFloatMode(String name, ir_mode_arithmetic arithmetic, int exponentSize, int mantissaSize) {
		return new Mode(binding_irmode.new_float_mode(name, arithmetic.val, exponentSize, mantissaSize));
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
		return binding_irmode.get_mode_sign(ptr) != 0;
	}

	public final int getMantissaSize() {
		return binding_irmode.get_mode_mantissa_size(ptr);
	}

	public final int getExponentSize() {
		return binding_irmode.get_mode_exponent_size(ptr);
	}

	public final ir_mode_arithmetic getArithmetic() {
		int val = binding_irmode.get_mode_arithmetic(ptr);
		return ir_mode_arithmetic.getEnum(val);
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

	/** returns a -1 (if the mode has one) */
	public final TargetValue getMinusOne() {
		Pointer tarval = binding_irmode.get_mode_minus_one(ptr);
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

	/** returns Not A Number (for float modes) */
	public final TargetValue getNAN() {
		Pointer tarval = binding_irmode.get_mode_NAN(ptr);
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

	public static final Mode getQ() {
		Pointer modePtr = binding_irmode.get_modeQ();
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

	public static final Mode getLLs() {
		Pointer modePtr = binding_irmode.get_modeLLs();
		return new Mode(modePtr);
	}

	public static final Mode getLLu() {
		Pointer modePtr = binding_irmode.get_modeLLu();
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

	public final boolean isDatab() {
		return 0 != binding_irmode.mode_is_datab(ptr);
	}

	public final boolean isDataM() {
		return 0 != binding_irmode.mode_is_dataM(ptr);
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

	public final boolean honorSignedZeros() {
		return 0 != binding_irmode.mode_honor_signed_zeros(ptr);
	}

	public final boolean overflowOnUnaryMinus() {
		return 0 != binding_irmode.mode_overflow_on_unary_Minus(ptr);
	}

	public final boolean wrapAround() {
		return 0 != binding_irmode.mode_wrap_around(ptr);
	}

	public final Mode getReferenceSignedEq() {
		Pointer modep = binding_irmode.get_reference_mode_signed_eq(ptr);
		return new Mode(modep);
	}

	public final void setReferenceSignedEq(Mode intMode) {
		binding_irmode.set_reference_mode_signed_eq(ptr, intMode.ptr);
	}

	public final Mode getReferenceUnsignedEq() {
		Pointer modep = binding_irmode.get_reference_mode_unsigned_eq(ptr);
		return new Mode(modep);
	}

	public final void setReferenceUnsignedEq(Mode intMode) {
		binding_irmode.set_reference_mode_signed_eq(ptr, intMode.ptr);
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
