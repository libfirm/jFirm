package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ident;

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

	public final Ident mangleUnderscore(Ident second) {
		Pointer pIdent = binding_ident.id_mangle_u(ptr, second.ptr);
		return new Ident(pIdent);
	}

	public final Ident mangleDot(Ident second) {
		Pointer pIdent = binding_ident.id_mangle_dot(ptr, second.ptr);
		return new Ident(pIdent);
	}

	public final Ident mangle(Ident second) {
		Pointer pIdent = binding_ident.id_mangle(ptr, second.ptr);
		return new Ident(pIdent);
	}

	public final Ident mangle(String prefix, String suffix) {
		Pointer pIdent = binding_ident.id_mangle3(prefix, ptr, suffix);
		return new Ident(pIdent);
	}
}
