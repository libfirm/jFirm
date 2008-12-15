package firm;

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
	
	public void removeSuperType(Type superType) {
		binding.remove_class_supertype(ptr, superType.ptr);
	}
}
