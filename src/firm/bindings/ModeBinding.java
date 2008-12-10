package firm.bindings;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface ModeBinding extends Library {
	Pointer new_ir_mode(String name, /* ir_mode_sort */int sort, int bit_size, int sign, /* ir_mode_arithmetic */int arithmetic, int modulo_shift);
	Pointer new_ir_vector_mode(String name, /* ir_mode_sort */int sort, int bit_size, int num_of_elem, int sign, /* ir_mode_arithmetic */int arithmetic, int modulo_shift);
//	int is_mode(Pointer thing);
//	/* ir_modecode */int get_mode_modecode(Pointer mode);
//	Pointer get_mode_ident(Pointer mode);
	String get_mode_name(Pointer mode);
	/* ir_mode_sort */int get_mode_sort(Pointer mode);
	int get_mode_size_bits(Pointer mode);
	int get_mode_size_bytes(Pointer mode);
	int get_mode_sign(Pointer mode);
	/* ir_mode_arithmetic */int get_mode_arithmetic(Pointer mode);
	int get_mode_modulo_shift(Pointer mode);
	int get_mode_n_vector_elems(Pointer mode);
//	Pointer get_mode_link(Pointer mode);
//	void set_mode_link(Pointer mode, Pointer l);
	Pointer get_mode_min(Pointer mode);
	Pointer get_mode_max(Pointer mode);
	Pointer get_mode_null(Pointer mode);
	Pointer get_mode_one(Pointer mode);
	Pointer get_mode_minus_one(Pointer mode);
	Pointer get_mode_all_one(Pointer mode);
	Pointer get_mode_infinite(Pointer mode);
	Pointer get_mode_NAN(Pointer mode);
	Pointer get_modeF();
	Pointer get_modeD();
	Pointer get_modeE();
	Pointer get_modeBs();
	Pointer get_modeBu();
	Pointer get_modeHs();
	Pointer get_modeHu();
	Pointer get_modeIs();
	Pointer get_modeIu();
	Pointer get_modeLs();
	Pointer get_modeLu();
	Pointer get_modeLLs();
	Pointer get_modeLLu();
	Pointer get_modeP();
	Pointer get_modeb();
	Pointer get_modeX();
	Pointer get_modeBB();
	Pointer get_modeM();
	Pointer get_modeT();
	Pointer get_modeANY();
	Pointer get_modeBAD();
	Pointer get_modeP_code();
	Pointer get_modeP_data();
	void set_modeP_code(Pointer p);
	void set_modeP_data(Pointer p);

	int mode_is_signed(Pointer mode);
	int mode_is_float(Pointer mode);
	int mode_is_int(Pointer mode);
	int mode_is_reference(Pointer mode);
	int mode_is_num(Pointer mode);
	int mode_is_data(Pointer mode);
	int mode_is_datab(Pointer mode);
	int mode_is_dataM(Pointer mode);
	int mode_is_float_vector(Pointer mode);
	int mode_is_int_vector(Pointer mode);

	
	int smaller_mode(Pointer sm, Pointer lm);
	int values_in_mode(Pointer sm, Pointer lm);

	Pointer find_unsigned_mode(Pointer mode);
	Pointer find_signed_mode(Pointer mode);
	Pointer find_double_bits_int_mode(Pointer mode);
	int mode_honor_signed_zeros(Pointer mode);
	int mode_overflow_on_unary_Minus(Pointer mode);
	int mode_wrap_around(Pointer mode);
	Pointer get_reference_mode_signed_eq(Pointer mode);
	void set_reference_mode_signed_eq(Pointer ref_mode, Pointer int_mode);
	Pointer get_reference_mode_unsigned_eq(Pointer mode);
	void set_reference_mode_unsigned_eq(Pointer ref_mode, Pointer int_mode);
	int is_reinterpret_cast(Pointer src, Pointer dst);

}
