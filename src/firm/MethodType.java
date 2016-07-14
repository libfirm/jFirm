package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.mtp_additional_properties;

public class MethodType extends Type {

	MethodType(Pointer ptr) {
		super(ptr);
	}

	public MethodType(int nParameters, int nResults, boolean isVariadic, int cc_mask, int property_mask) {
		super(binding_typerep.new_type_method(new NativeLong(nParameters), new NativeLong(nResults), (isVariadic ? 1 : 0), cc_mask, property_mask));
	}

	public MethodType(int nParameters, int nResults, boolean isVariadic) {
		this(nParameters, nResults, isVariadic, 0, mtp_additional_properties.mtp_no_property.val);
	}

	public MethodType(int nParameters, int nResults) {
		this(nParameters, nResults, false);
	}

	public MethodType(Type[] parameterTypes, Type[] resultTypes, boolean isVariadic, int cc_mask, int property_mask) {
		this(parameterTypes.length, resultTypes.length, isVariadic, cc_mask, property_mask);
		for (int i = 0; i < parameterTypes.length; ++i)
			setParamType(i, parameterTypes[i]);
		for (int i = 0; i < resultTypes.length; ++i)
			setResType(i, resultTypes[i]);
	}

	public MethodType(Type[] parameterTypes, Type[] resultTypes, boolean isVariadic) {
		this(parameterTypes, resultTypes, isVariadic, 0, mtp_additional_properties.mtp_no_property.val);
	}

	public MethodType(Type[] parameterTypes, Type[] resultTypes) {
		this(parameterTypes, resultTypes, false);
	}

	public final int getNParams() {
		return binding_typerep.get_method_n_params(ptr).intValue();
	}

	public final Type getParamType(int pos) {
		Pointer p = binding_typerep.get_method_param_type(ptr, new NativeLong(pos));
		return Type.createWrapper(p);
	}

	public final void setParamType(int pos, Type tp) {
		binding_typerep.set_method_param_type(ptr, new NativeLong(pos), tp.ptr);
	}

	public final int getNRess() {
		return binding_typerep.get_method_n_ress(ptr).intValue();
	}

	public final Type getResType(int pos) {
		Pointer p = binding_typerep.get_method_res_type(ptr, new NativeLong(pos));
		return Type.createWrapper(p);
	}

	public final void setResType(int pos, Type tp) {
		binding_typerep.set_method_res_type(ptr, new NativeLong(pos), tp.ptr);
	}

	public final boolean isVariadic() {
		return 0 != binding_typerep.is_method_variadic(ptr);
	}

	public final int getAdditionalProperties() {
		return binding_typerep.get_method_additional_properties(ptr);
	}

	public final int getNRegparams() {
		return binding_typerep.get_method_n_params(ptr).intValue();
	}

	@Override
	public void finishLayout() {
		/* make sure all arguments and return types have been set */
		for (int r = 0; r < getNRess(); ++r) {
			assert getResType(r) != null;
		}
		for (int p = 0; p < getNParams(); ++p) {
			assert getParamType(p) != null;
		}

		super.finishLayout();
	}
}
