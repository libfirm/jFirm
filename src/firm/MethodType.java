package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep.mtp_additional_property;
import firm.bindings.binding_typerep.ir_variadicity;

public class MethodType extends Type {

	public MethodType(Pointer ptr) {
		super(ptr);
	}
	
	public MethodType(Ident name, int nParameters, int nResults) {
		super(binding.new_type_method(name.ptr, nParameters, nResults));
	}
	
	public MethodType(String name, int nParameters, int nResults) {
		this(new Ident(name), nParameters, nResults);
	}
	
//	Pointer new_d_type_method(Pointer name, int n_param, int n_res, Pointer db);
	
	public final MethodType clone(Ident prefix) {
		Pointer p = binding.clone_type_method(ptr, prefix.ptr);
		return new MethodType(p);
	}

	public final int getNParams() {
		return binding.get_method_n_params(ptr);
	}

	public final Type getParamType(int pos) {
		Pointer p = binding.get_method_param_type(ptr, pos);
		return Type.createWrapper(p);
	}
	
	public final void setParamType(int pos, Type tp) {
		binding.set_method_param_type(ptr, pos, tp.ptr);
	}
	
	public final Entity getValueParamEnt(int pos) {
		Pointer p = binding.get_method_value_param_ent(ptr, pos);
		return new Entity(p);
	}
	
	public final Type getValueParamType() {
		Pointer p = binding.get_method_value_param_type(ptr);
		return (p == null || p == Pointer.NULL ? null : Type.createWrapper(p));
	}

	public final Ident getParamIdent(int pos) {
		Pointer p = binding.get_method_param_ident(ptr, pos);
		return new Ident(p);
	}

	public final String getParamName(int pos) {
		return binding.get_method_param_name(ptr, pos);
	}

	public final void setParamIdent(int pos, Ident id) {
		binding.set_method_param_ident(ptr, pos, id.ptr);
	}

	public final int getNRess() {
		return binding.get_method_n_ress(ptr);
	}

	public final Type getResType(int pos) {
		Pointer p = binding.get_method_res_type(ptr, pos);
		return Type.createWrapper(p);
	}
	
	public final void setResType(int pos, Type tp) {
		binding.set_method_res_type(ptr, pos, tp.ptr);
	}

	public final Entity getValueResEnt(int pos) {
		Pointer p = binding.get_method_value_res_ent(ptr, pos);
		return new Entity(p);
	}

	public final Type getValueResType() {
		Pointer p = binding.get_method_value_res_type(ptr);
		return Type.createWrapper(p);
	}

	public final static String getVariadicityName(ir_variadicity vari) {
		return binding.get_variadicity_name(vari.val);
	}
	
	public final ir_variadicity getVariadicity() {
		int val = binding.get_method_variadicity(ptr);
		return ir_variadicity.getEnum(val);
	}
	
	public final void setVariadicity(ir_variadicity vari) {
		binding.set_method_variadicity(ptr, vari.val);
	}

	public final int getFirstVariadicParamIndex() {
		return binding.get_method_first_variadic_param_index(ptr);
	}

	public final void setFirstVariadicParamIndex(int index) {
		binding.set_method_first_variadic_param_index(ptr, index);
	}

	public final int getAdditionalProperties() {
		return binding.get_method_additional_properties(ptr);
	}

	public final void setAdditionalProperties(int propertyMask) {
		binding.set_method_additional_properties(ptr, propertyMask);
	}

	public final void setAdditionalProperty(mtp_additional_property flag) {
		binding.set_method_additional_property(ptr, flag.val);
	}

//TODO calling conventions are macros in libfirm
//	int get_default_cc_mask();
//	int get_method_calling_convention(Pointer method);
//	void set_method_calling_convention(Pointer method, int cc_mask);

	public final int getNRegparams() {
		return binding.get_method_n_params(ptr);
	}

	public final void setNRegparams(int nRegs) {
		binding.set_method_n_regparams(ptr, nRegs);
	}

	@Override
	public void fixed() {
		/* make sure all arguments and return types have been set */
		for (int r = 0; r < getNRess(); ++r) {
			assert getResType(r) != null;
		}
		for (int p = 0; p < getNParams(); ++p) {
			assert getParamType(p) != null;
		}
		
		super.fixed();		
	}
}
