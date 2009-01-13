package firm;

import java.util.Iterator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.sun.jna.Pointer;

public class ClassType extends Type {
	
	protected ClassType(Pointer ptr) {
		super(ptr);
	}
	
	public ClassType(Ident name) {
		super(binding.new_type_class(name.ptr));
	}
	
	public ClassType(String name) {
		this(new Ident(name));
	}
	
	public void addMember(Entity entity) {
		binding.add_class_member(ptr, entity.ptr);
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
						throw new NotImplementedException();
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

	public void removeMember(Entity member) {
		binding.remove_class_member(ptr, member.ptr);
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
						throw new NotImplementedException();
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
						// TODO Auto-generated method stub
						return getSuperType(n++);
					}

					@Override
					public void remove() {
						throw new NotImplementedException();
					}	
				};
			}
		};
	}
	
	public void removeSuperType(Type superType) {
		binding.remove_class_supertype(ptr, superType.ptr);
	}
	
	public void layoutFields() {
		int offset = 0;
		int alignment = 1;
		
		for (int m = 0; m < getNMembers(); ++m) {
			Entity entity = getMember(m);
			if (entity.getType() instanceof MethodType)
				continue;
			
			/* align entity */
			int align = entity.getType().getAlignmentBytes();
			if (align > 0 && offset % align != 0) {
				offset += align - (offset % align);
			}
			/* remember maximum alignment */
			if (align > alignment)
				alignment = align;
			
			entity.setOffset(offset);
			offset += entity.getType().getSizeBytes();
		}
		setAlignmentBytes(alignment);
	}
	
	@Override
	public void fixed() {
		/* frontend should have set the offsets of the data entities... */
		/* I don't know a way to test if this has happened... */
		
		/* At least we should have a size >= 0 */
		assert getSizeBytes() >= 0;
		
		super.fixed();		
	}
}
