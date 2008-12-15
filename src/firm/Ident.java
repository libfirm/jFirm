package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_ident;

public class Ident extends JNAWrapper {
	
	private final static binding_ident binding = Bindings.getIdentBinding();
	
	public Ident(Pointer ptr) {
		super(ptr);
	}
	
	public Ident(String string) {
		this(binding.new_id_from_str(string));
	}
	
	public String getString() {
		return binding.get_id_str(ptr);
	}
	
	public String toString() {
		return getString();
	}
	
	public final static Ident createUnique(String tag) {
		Pointer pIdent = binding.id_unique(tag);
		return new Ident(pIdent);
	}
	
	public final static void initMangle() {
		binding.firm_init_mangle();
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