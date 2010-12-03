package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_variadicity;
import firm.bindings.binding_typerep.mtp_additional_properties;

public class MethodType extends Type {

	MethodType(Pointer ptr) {
		super(ptr);
	}

	public MethodType(int nParameters, int nResults) {
		super(binding_typerep.new_type_method(nParameters, nResults));
	}

	public MethodType(Type[] parameterTypes, Type[] resultTypes) {
		this(parameterTypes.length, resultTypes.length);
		for (int i = 0; i < parameterTypes.length; ++i)
			setParamType(i, parameterTypes[i]);
		for (int i = 0; i < resultTypes.length; ++i)
			setResType(i, resultTypes[i]);
	}

	public final int getNParams() {
		return binding_typerep.get_method_n_params(ptr);
	}

	public final Type getParamType(int pos) {
		Pointer p = binding_typerep.get_method_param_type(ptr, pos);
		return Type.createWrapper(p);
	}

	public final void setParamType(int pos, Type tp) {
		binding_typerep.set_method_param_type(ptr, pos, tp.ptr);
	}

	public final Entity getValueParamEnt(int pos) {
		Pointer p = binding_typerep.get_method_value_param_ent(ptr, pos);
		return new Entity(p);
	}

	public final Type getValueParamType() {
		Pointer p = binding_typerep.get_method_value_param_type(ptr);
		return (p == null ? null : Type.createWrapper(p));
	}

	public final Ident getParamIdent(int pos) {
		Pointer p = binding_typerep.get_method_param_ident(ptr, pos);
		return new Ident(p);
	}

	public final String getParamName(int pos) {
		return binding_typerep.get_method_param_name(ptr, pos);
	}

	public final void setParamIdent(int pos, Ident id) {
		binding_typerep.set_method_param_ident(ptr, pos, id.ptr);
	}

	public final int getNRess() {
		return binding_typerep.get_method_n_ress(ptr);
	}

	public final Type getResType(int pos) {
		Pointer p = binding_typerep.get_method_res_type(ptr, pos);
		return Type.createWrapper(p);
	}

	public final void setResType(int pos, Type tp) {
		binding_typerep.set_method_res_type(ptr, pos, tp.ptr);
	}

	public final Entity getValueResEnt(int pos) {
		Pointer p = binding_typerep.get_method_value_res_ent(ptr, pos);
		return new Entity(p);
	}

	public final Type getValueResType() {
		Pointer p = binding_typerep.get_method_value_res_type(ptr);
		return Type.createWrapper(p);
	}

	public final static String getVariadicityName(ir_variadicity vari) {
		return binding_typerep.get_variadicity_name(vari.val);
	}

	public final ir_variadicity getVariadicity() {
		int val = binding_typerep.get_method_variadicity(ptr);
		return ir_variadicity.getEnum(val);
	}

	public final void setVariadicity(ir_variadicity vari) {
		binding_typerep.set_method_variadicity(ptr, vari.val);
	}

	public final int getFirstVariadicParamIndex() {
		return binding_typerep.get_method_first_variadic_param_index(ptr);
	}

	public final void setFirstVariadicParamIndex(int index) {
		binding_typerep.set_method_first_variadic_param_index(ptr, index);
	}

	public final int getAdditionalProperties() {
		return binding_typerep.get_method_additional_properties(ptr);
	}

	public final void setAdditionalProperties(
			mtp_additional_properties properties) {
		binding_typerep.set_method_additional_properties(ptr, properties.val);
	}

	public final void addAdditionalProperties(
			mtp_additional_properties properties) {
		binding_typerep.add_method_additional_properties(ptr, properties.val);
	}

	public final int getNRegparams() {
		return binding_typerep.get_method_n_params(ptr);
	}

	public final void setNRegparams(int nRegs) {
		binding_typerep.set_method_n_regparams(ptr, nRegs);
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
