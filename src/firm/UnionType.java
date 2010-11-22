package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_tv;

public class UnionType extends CompoundType {
	UnionType(Pointer ptr) {
		super(ptr);
	}

	public UnionType(Ident name) {
		super(binding_tv.new_type_union(name.ptr));
	}

	public UnionType(String name) {
		this(new Ident(name));
	}
}
