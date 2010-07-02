package firm;

import java.util.Iterator;

import com.sun.jna.Pointer;

public class ClassType extends Type {
	
	ClassType(Pointer ptr) {
		super(ptr);
	}
	
	public ClassType(Ident name) {
		super(binding.new_type_class(name.ptr));
	}
	
	public ClassType(String name) {
		this(new Ident(name));
	}
	
	public Ident getIdent() {
		return new Ident(binding.get_class_ident(ptr));
	}
	
	public String getName() {
		return getIdent().toString();
	}
	
	public int getNMembers() {
		return binding.get_class_n_members(ptr);
	}
	
	public Entity getMember(int n) {
		return new Entity(binding.get_class_member(ptr, n));
	}
	
	public Iterable<Entity> getMembers() {
		return new Iterable<Entity>() {
			@Override
			public Iterator<Entity> iterator() {
				return new Iterator<Entity>() {
					int n;
					@Override
					public boolean hasNext() {
						return n < getNMembers();
					}

					@Override
					public Entity next() {
						return getMember(n++);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Entity getMemberByName(Ident name) {
		return new Entity(binding.get_class_member_by_name(ptr, name.ptr));
	}
	
	public Entity getMemberByName(String name) {
		return getMemberByName(new Ident(name));
	}

	public void addSubtype(Type subType) {
		binding.add_class_subtype(ptr, subType.ptr);
	}
	
	public int getNSubTypes() {
		return binding.get_class_n_subtypes(ptr);
	}
	
	public Type getSubType(int n) {
		return Type.createWrapper(binding.get_class_subtype(ptr, n));
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
		binding.remove_class_subtype(ptr, subType.ptr);
	}
	
	public void addSuperType(Type superType) {
		binding.add_class_supertype(ptr, superType.ptr);
	}
	
	public int getNSuperTypes() {
		return binding.get_class_n_supertypes(ptr);
	}
	
	public Type getSuperType(int n) {
		return Type.createWrapper(binding.get_class_supertype(ptr, n));
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
		binding.remove_class_supertype(ptr, superType.ptr);
	}
	
	/**
	 * Layout members of a compound type in a "default" way
	 * which should be okay for most languages.
	 */
	public void layoutFields() {
		binding.default_layout_compound_type(ptr);
	}
	
	@Override
	public void finishLayout() {
		/* you have to layout the type first.
		 * (for example by calling layoutFields)
		 * layouting should also set the size of the class 
		 */
		assert getSizeBytes() >= 0;
		
		super.finishLayout();		
	}
}
