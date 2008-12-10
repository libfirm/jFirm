package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.ModeBinding;

public final class Mode {

	private static final ModeBinding b = Bindings.getModeBinding();
	
	/**
	 * Pointer to the ir_mode in lib
	 */
	private final Pointer p;
	
	protected Mode(Pointer p) {
		this.p = p;
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
		private static class C { static int next_val; }

		ir_modecode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_modecode() {
			this.val = C.next_val++;
		}
		
		public static ir_modecode getEnum(int val) {
			for(ir_modecode entry : values()) {
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
		private static class C { static int next_val; }

		ir_mode_sort_helper(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_sort_helper() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_sort_helper getEnum(int val) {
			for(ir_mode_sort_helper entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_mode_sort {
		irms_auxiliary(0),
		irms_control_flow(1),
		irms_memory((2|ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_internal_boolean((3|ir_mode_sort_helper.irmsh_is_datab.val)),
		irms_reference((((4|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_int_number(((((5|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)|ir_mode_sort_helper.irmsh_is_num.val)),
		irms_float_number(((((6|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)|ir_mode_sort_helper.irmsh_is_num.val));
		public final int val;
		private static class C { static int next_val; }

		ir_mode_sort(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_sort() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_sort getEnum(int val) {
			for(ir_mode_sort entry : values()) {
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
		private static class C { static int next_val; }

		ir_mode_arithmetic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_arithmetic() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_arithmetic getEnum(int val) {
			for(ir_mode_arithmetic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	
	
	public static final Mode newIrMode(String name, ir_mode_sort sort, int bitSize, 
			int sign, ir_mode_arithmetic arithmetic, int moduloShift) {
		Pointer p = b.new_ir_mode(name, sort.val, bitSize, sign, arithmetic.val, moduloShift);
		
		Mode mode = new Mode(p);
		
		return mode;
	}
	
	public static final Mode newIrVectorMode(String name, ir_mode_sort sort, 
			int bitSize, int numOfElem, int sign, ir_mode_arithmetic arithmetic, 
			int moduloShift) {
		Pointer p = b.new_ir_vector_mode(name, sort.val, bitSize, numOfElem, sign, arithmetic.val, moduloShift);
		
		Mode mode = new Mode(p);
		
		return mode;
	}
	
	public final String getName() {
		return b.get_mode_name(p);
	}
	
	public final ir_mode_sort getSort() {
		int sort = b.get_mode_sort(p);
		return ir_mode_sort.getEnum(sort);
	}
	
	public final int getSizeBits() {
		return b.get_mode_size_bits(p);
	}
	
	public final int getSizeBytes() {
		return b.get_mode_size_bytes(p);
	}
	
	public final int getSign() {
		return b.get_mode_sign(p);
	}
	
	public final ir_mode_arithmetic getArithmetic() {
		int val = b.get_mode_arithmetic(p);
		return ir_mode_arithmetic.getEnum(val);
	}
	
	public final int getModuloShift() {
		return b.get_mode_modulo_shift(p);
	}
	
	public final int getNVectorElements() {
		return b.get_mode_n_vector_elems(p);
	}
	
	public final TargetValue getMin() {
		Pointer tarval = b.get_mode_min(p);
		return new TargetValue(tarval);
	}

	public final TargetValue getMax() {
		Pointer tarval = b.get_mode_max(p);
		return new TargetValue(tarval);
	}
	
	public final TargetValue getNull() {
		Pointer tarval = b.get_mode_null(p);
		return new TargetValue(tarval);
	}
	
	public final TargetValue getOne() {
		Pointer tarval = b.get_mode_one(p);
		return new TargetValue(tarval);
	}
	
	public final TargetValue getMinusOne() {
		Pointer tarval = b.get_mode_minus_one(p);
		return new TargetValue(tarval);
	}
	
	public final TargetValue getAllOne() {
		Pointer tarval = b.get_mode_all_one(p);
		return new TargetValue(tarval);
	}
	
	public final TargetValue getInfinite() {
		Pointer tarval = b.get_mode_infinite(p);
		return new TargetValue(tarval);
	}
	
	public final TargetValue getNAN() {
		Pointer tarval = b.get_mode_NAN(p);
		return new TargetValue(tarval);
	}

	public static final Mode getF() {
		Pointer modePtr = b.get_modeF();
		return new Mode(modePtr);
	}

	public static final Mode getD() {
		Pointer modePtr = b.get_modeD();
		return new Mode(modePtr);
	}

	public static final Mode getE() {
		Pointer modePtr = b.get_modeE();
		return new Mode(modePtr);
	}

	public static final Mode getBs() {
		Pointer modePtr = b.get_modeBs();
		return new Mode(modePtr);
	}

	public static final Mode getBu() {
		Pointer modePtr = b.get_modeBu();
		return new Mode(modePtr);
	}

	public static final Mode getHs() {
		Pointer modePtr = b.get_modeHs();
		return new Mode(modePtr);
	}

	public static final Mode getHu() {
		Pointer modePtr = b.get_modeHu();
		return new Mode(modePtr);
	}

	public static final Mode getIs() {
		Pointer modePtr = b.get_modeIs();
		return new Mode(modePtr);
	}

	public static final Mode getIu() {
		Pointer modePtr = b.get_modeIu();
		return new Mode(modePtr);
	}

	public static final Mode getLs() {
		Pointer modePtr = b.get_modeLs();
		return new Mode(modePtr);
	}

	public static final Mode getLu() {
		Pointer modePtr = b.get_modeLu();
		return new Mode(modePtr);
	}

	public static final Mode getLLs() {
		Pointer modePtr = b.get_modeLLs();
		return new Mode(modePtr);
	}

	public static final Mode getLLu() {
		Pointer modePtr = b.get_modeLLu();
		return new Mode(modePtr);
	}

	public static final Mode getP() {
		Pointer modePtr = b.get_modeP();
		return new Mode(modePtr);
	}

	public static final Mode getb() {
		Pointer modePtr = b.get_modeb();
		return new Mode(modePtr);
	}

	public static final Mode getX() {
		Pointer modePtr = b.get_modeX();
		return new Mode(modePtr);
	}

	public static final Mode getBB() {
		Pointer modePtr = b.get_modeBB();
		return new Mode(modePtr);
	}

	public static final Mode getM() {
		Pointer modePtr = b.get_modeM();
		return new Mode(modePtr);
	}

	public static final Mode getT() {
		Pointer modePtr = b.get_modeT();
		return new Mode(modePtr);
	}

	public static final Mode getANY() {
		Pointer modePtr = b.get_modeANY();
		return new Mode(modePtr);
	}

	public static final Mode getBAD() {
		Pointer modePtr = b.get_modeBAD();
		return new Mode(modePtr);
	}

	public static final Mode getPCode() {
		Pointer modePtr = b.get_modeP_code();
		return new Mode(modePtr);
	}

	public static final Mode getPData() {
		Pointer modePtr = b.get_modeP_data();
		return new Mode(modePtr);
	}

	public static final void setPCode(final Mode mode) {
		b.set_modeP_code(mode.p);
	}

	public static final void setPData(final Mode mode) {
		b.set_modeP_data(mode.p);
	}

	public final boolean isSigned() {
		return 0 != b.mode_is_signed(p);
	}

	public final boolean isFloat() {
		return 0 != b.mode_is_float(p);
	}

	public final boolean isInt() {
		return 0 != b.mode_is_int(p);
	}

	public final boolean isReference() {
		return 0 != b.mode_is_reference(p);
	}

	public final boolean isNum() {
		return 0 != b.mode_is_num(p);
	}

	public final boolean isData() {
		return 0 != b.mode_is_data(p);
	}

	public final boolean isDatab() {
		return 0 != b.mode_is_datab(p);
	}

	public final boolean isDataM() {
		return 0 != b.mode_is_dataM(p);
	}

	public final boolean isFloatVector() {
		return 0 != b.mode_is_float_vector(p);
	}

	public final boolean isIntVector() {
		return 0 != b.mode_is_int_vector(p);
	}

	public final boolean isSmallerThan(Mode compareTo) {
		int val = b.smaller_mode(p, compareTo.p);
		return 0 != val;
	}
	
	
}
