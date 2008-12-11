package firm.bindings;

import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

public interface TargetValueBinding extends Library {

	Pointer new_tarval_from_str(String str, NativeLong len, Pointer mode);
	Pointer new_tarval_from_long(NativeLong l, Pointer mode);
	NativeLong get_tarval_long(Pointer tv);
	int tarval_is_long(Pointer tv);
	Pointer new_tarval_from_double(double d, Pointer mode);
	double get_tarval_double(Pointer tv);
	int tarval_is_double(Pointer tv);
	Pointer get_tarval_mode(Pointer tv);
	int tarval_is_negative(Pointer tv);
	int tarval_is_null(Pointer tv);
	int tarval_is_one(Pointer tv);
	int tarval_is_minus_one(Pointer tv);
	int tarval_is_all_one(Pointer tv);
	int tarval_is_constant(Pointer tv);
	
	Pointer get_tarval_bad();
	Pointer get_tarval_undefined();
	Pointer get_tarval_b_false();
	Pointer get_tarval_b_true();
	Pointer get_tarval_unreachable();
	Pointer get_tarval_reachable();
	
	Pointer get_tarval_max(Pointer mode);
	Pointer get_tarval_min(Pointer mode);
	Pointer get_tarval_null(Pointer mode);
	Pointer get_tarval_one(Pointer mode);
	Pointer get_tarval_minus_one(Pointer mode);
	Pointer get_tarval_all_one(Pointer mode);
	Pointer get_tarval_nan(Pointer mode);
	Pointer get_tarval_plus_inf(Pointer mode);
	Pointer get_tarval_minus_inf(Pointer mode);
	void tarval_set_integer_overflow_mode(/* tarval_int_overflow_mode_t */int ov_mode);
	/* tarval_int_overflow_mode_t */int tarval_get_integer_overflow_mode();
	/* pn_Cmp */int tarval_cmp(Pointer a, Pointer b);
	Pointer tarval_convert_to(Pointer src, Pointer mode);
	Pointer tarval_not(Pointer a);
	Pointer tarval_neg(Pointer a);
	Pointer tarval_add(Pointer a, Pointer b);
	Pointer tarval_sub(Pointer a, Pointer b, Pointer dst_mode);
	Pointer tarval_mul(Pointer a, Pointer b);
	Pointer tarval_quo(Pointer a, Pointer b);
	Pointer tarval_div(Pointer a, Pointer b);
	Pointer tarval_mod(Pointer a, Pointer b);
	Pointer tarval_divmod(Pointer a, Pointer b, Pointer mod_res);
	Pointer tarval_abs(Pointer a);
	Pointer tarval_and(Pointer a, Pointer b);
	Pointer tarval_or(Pointer a, Pointer b);
	Pointer tarval_eor(Pointer a, Pointer b);
	Pointer tarval_shl(Pointer a, Pointer b);
	Pointer tarval_shr(Pointer a, Pointer b);
	Pointer tarval_shrs(Pointer a, Pointer b);
	Pointer tarval_rotl(Pointer a, Pointer b);
	
	int tarval_carry();
	int set_tarval_mode_output_option(Pointer mode, Pointer modeinfo);
	Pointer get_tarval_mode_output_option(Pointer mode);
	String get_tarval_bitpattern(Pointer tv);
	byte get_tarval_sub_bits(Pointer tv, int byte_ofs);
	int tarval_is_single_bit(Pointer tv);
	int tarval_snprintf(String buf, NativeLong buflen, Pointer tv);
	int tarval_printf(Pointer tv);
	int tarval_ieee754_zero_mantissa(Pointer tv);
	int tarval_ieee754_get_exponent(Pointer tv);
	int tarval_ieee754_can_conv_lossless(Pointer tv, Pointer mode);
	int tarval_ieee754_set_immediate_precision(int bits);
	int tarval_ieee754_get_exact();
	int tarval_ieee754_get_mantissa_size(Pointer mode);
	int tarval_enable_fp_ops(int enable);
	int tarval_is_NaN(Pointer tv);
	int tarval_is_plus_inf(Pointer tv);
	int tarval_is_minus_inf(Pointer tv);
	int tarval_is_finite(Pointer tv);

}
