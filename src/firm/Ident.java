package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_ident;

public class Ident extends JNAWrapper {
	
	private final static binding_ident binding = Bindings.getIdentBinding();
	
	Ident(Pointer ptr) {
		super(ptr);
	}
	
	public Ident(String string) {
		this(binding.new_id_from_str(string));
	}
	
	public String getString() {
		return binding.get_id_str(ptr);
	}
	
	@Override
	public String toString() {
		return getString();
	}
	
	@Override
	public boolean equals(Object object) {
		/* this is to prevent you from doing stupid things, use toString() before
		 * comparing with a string */
		assert ! (object instanceof String);
		return super.equals(object);
	}
	
	/**
	 * create an identifier that is different from any other identifier
	 * created by createUnique. You must specify %u inside the tag which
	 * is replaced by a unique number.
	 * @param tag
	 * @return
	 */
	public final static Ident createUnique(String tag) {
		Pointer pIdent = binding.id_unique(tag);
		return new Ident(pIdent);
	}
	
	public final static Ident mangleEntity(Entity ent) {
		Pointer pIdent = binding.id_mangle_entity(ent.ptr);
		return new Ident(pIdent);
	}

	public final static Ident mangleUnderscore(Ident first, Ident second) {
		Pointer pIdent = binding.id_mangle_u(first.ptr, second.ptr);
		return new Ident(pIdent);
	}

	public final static Ident mangleDot(Ident first, Ident second) {
		Pointer pIdent = binding.id_mangle_dot(first.ptr, second.ptr);
		return new Ident(pIdent);
	}

	public final static Ident mangle(Ident first, Ident second) {
		Pointer pIdent = binding.id_mangle(first.ptr, second.ptr);
		return new Ident(pIdent);
	}

	public final static Ident mangle(String prefix, Ident ident, String suffix) {
		Pointer pIdent = binding.id_mangle3(prefix, ident.ptr, suffix);
		return new Ident(pIdent);
	}

	public final static Ident decorateWin32CFkt(Entity ent, Ident id) {
		Pointer pIdent = binding.id_decorate_win32_c_fkt(ent.ptr, id.ptr);
		return new Ident(pIdent);
	}

}
