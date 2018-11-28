package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ident;
import firm.bindings.binding_target;

public class Ident extends JNAWrapper {

	public Ident(Pointer ptr) {
		super(ptr);
	}

	public Ident(String string) {
		this(binding_ident.new_id_from_str(string));
	}

	@Override
	public String toString() {
		return binding_ident.get_id_str(ptr);
	}

	@Override
	public boolean equals(Object object) {
		/*
		 * this is to prevent you from doing stupid things, use toString()
		 * before comparing with a string
		 */
		assert !(object instanceof String);
		return super.equals(object);
	}

	/**
	 * create an identifier that is different from any other identifier created
	 * by createUnique. You must specify %u inside the tag which is replaced by
	 * a unique number.
	 *
	 * @param tag
	 * @return
	 */
	public final static Ident createUnique(String tag) {
		Pointer pIdent = binding_ident.id_unique(tag);
		return new Ident(pIdent);
	}

	/**
	 * Creates an identifier that follows the rules of the target
	 * architecture for function/method labels.
	 *
	 * This method does not handle name mangling for overloading,
	 * classes etc.
	 *
	 * @see Backend#getPlatformUserLabelPrefix()
	 */
	public final static Ident mangleGlobal(String name) {
		Pointer pIdent = binding_target.ir_platform_mangle_global(name);
		return new Ident(pIdent);
	}

	/**
	 * Creates an identifier that follows the rules of the target
	 * architecture for function/method labels.
	 *
	 * This method does not handle name mangling for overloading,
	 * classes etc.
	 *
	 * @see Backend#getPlatformUserLabelPrefix()
	 */
	public final static Ident mangleGlobal(Ident ident) {
		Pointer pResult = binding_target.ir_platform_mangle_global(ident.toString());
		return new Ident(pResult);
	}
}
