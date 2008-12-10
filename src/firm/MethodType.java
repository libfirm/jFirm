package firm;

import com.sun.jna.Pointer;

public class MethodType extends Type {

	protected MethodType(Pointer ptr) {
		super(ptr);
	}
	
	public MethodType(Ident name, int nParameters, int nResults) {
		this(binding.new_type_method(name.ptr, nParameters, nResults));
	}
}
