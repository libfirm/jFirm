package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class UnionType extends CompoundType {
	UnionType(Pointer ptr) {
		super(ptr);
	}

	public UnionType(Ident name) {
		super(binding_typerep.new_type_union(name.ptr));
	}

	public UnionType(String name) {
		this(new Ident(name));
	}
}
