package firm;

import java.util.Iterator;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class SegmentType extends CompoundType {

	SegmentType(Pointer ptr) {
		super(ptr);
	}

	public SegmentType(Ident name) {
		super(binding_typerep.new_type_class(name.ptr));
	}

	public SegmentType(String name) {
		this(new Ident(name));
	}

	@Override
	public Ident getIdent() {
		return new Ident(binding_typerep.get_compound_ident(ptr));
	}

	@Override
	public String getName() {
		return getIdent().toString();
	}

	@Override
	public int getNMembers() {
		return binding_typerep.get_compound_n_members(ptr).intValue();
	}

	@Override
	public Entity getMember(int n) {
		return new Entity(binding_typerep.get_compound_member(ptr, new NativeLong(n)));
	}

	public Entity getMemberByName(Ident name) {
		for (Entity member : getMembers()) {
			if (member.getIdent().equals(name)) {
				return member;
			}
		}
		return null;
	}

	public Entity getMemberByName(String name) {
		return getMemberByName(new Ident(name));
	}

	public void addSubtype(Type subType) {
		binding_typerep.add_class_subtype(ptr, subType.ptr);
	}

	public int getNSubTypes() {
		return binding_typerep.get_class_n_subtypes(ptr).intValue();
	}

	public Type getSubType(int n) {
		return Type.createWrapper(binding_typerep.get_class_subtype(ptr, new NativeLong(n)));
	}

	public Iterable<Type> getSubTypes() {
		return new Iterable<Type>() {
			@Override
			public Iterator<Type> iterator() {
				return new Iterator<Type>() {
					int n;

					@Override
					public boolean hasNext() {
						return n < getNSubTypes();
					}

					@Override
					public Type next() {
						return getSubType(n++);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public void removeSubType(Type subType) {
		binding_typerep.remove_class_subtype(ptr, subType.ptr);
	}

	public void addSuperType(Type superType) {
		binding_typerep.add_class_supertype(ptr, superType.ptr);
	}

	public int getNSuperTypes() {
		return binding_typerep.get_class_n_supertypes(ptr).intValue();
	}

	public Type getSuperType(int n) {
		return Type.createWrapper(binding_typerep.get_class_supertype(ptr, new NativeLong(n)));
	}

	public Iterable<Type> getSuperTypes() {
		return new Iterable<Type>() {
			@Override
			public Iterator<Type> iterator() {
				return new Iterator<Type>() {
					int n;

					@Override
					public boolean hasNext() {
						return n < getNSuperTypes();
					}

					@Override
					public Type next() {
						return getSuperType(n++);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public void removeSuperType(Type superType) {
		binding_typerep.remove_class_supertype(ptr, superType.ptr);
	}
}
