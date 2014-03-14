package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_align;
import firm.bindings.binding_typerep.ir_linkage;
import firm.bindings.binding_typerep.ir_visibility;
import firm.nodes.Node;

public class Entity extends JNAWrapper {

	public Entity(Pointer ptr) {
		super(ptr);
	}

	public Entity(CompoundType owner, Ident name, Type type) {
		this(binding_typerep.new_entity(owner.ptr, name.ptr, type.ptr));
	}

	public Entity(CompoundType owner, String name, Type type) {
		this(owner, new Ident(name), type);
	}

	public static Entity createParameterEntity(Type owner, int parameterNumber, Type type) {
		Pointer ptr = binding_typerep.new_parameter_entity(owner.ptr, new NativeLong(parameterNumber), type.ptr);
		return new Entity(ptr);
	}

	public final void free() {
		binding_typerep.free_entity(ptr);
	}

	public final String getName() {
		return binding_typerep.get_entity_name(ptr);
	}

	@Override
	public String toString() {
		return getName();
	}

	public final Ident getIdent() {
		Pointer p = binding_typerep.get_entity_ident(ptr);
		return new Ident(p);
	}

	public final void setIdent(Ident id) {
		binding_typerep.set_entity_ident(ptr, id.ptr);
	}

	public final void setIdent(String ident) {
		setIdent(new Ident(ident));
	}

	public final Ident getLdIdent() {
		Pointer p = binding_typerep.get_entity_ld_ident(ptr);
		return new Ident(p);
	}

	public final void setLdIdent(Ident ldIdent) {
		binding_typerep.set_entity_ld_ident(ptr, ldIdent.ptr);
	}

	public final void setLdIdent(String ldIdent) {
		setLdIdent(new Ident(ldIdent));
	}

	public final String getLdName() {
		return binding_typerep.get_entity_ld_name(ptr);
	}

	public final Type getOwner() {
		Pointer p = binding_typerep.get_entity_owner(ptr);
		return Type.createWrapper(p);
	}

	public final void setOwner(Type owner) {
		binding_typerep.set_entity_owner(ptr, owner.ptr);
	}

	public final Type getType() {
		Pointer p = binding_typerep.get_entity_type(ptr);
		return Type.createWrapper(p);
	}

	public final void setType(Type tp) {
		binding_typerep.set_entity_type(ptr, tp.ptr);
	}

	public final int getLinkageBits() {
		return binding_typerep.get_entity_linkage(ptr);
	}

	public final void setLinkageBits(int linkage) {
		binding_typerep.set_entity_linkage(ptr, linkage);
	}

	public final void addLinkageBits(int linkage) {
		binding_typerep.add_entity_linkage(ptr, linkage);
	}

	public final void removeLinkageBits(int linkage) {
		binding_typerep.remove_entity_linkage(ptr, linkage);
	}

	public final void addLinkage(ir_linkage linkage) {
		addLinkageBits(linkage.val);
	}

	public final void removeLinkage(ir_linkage linkage) {
		removeLinkageBits(linkage.val);
	}

	public final boolean hasLinkage(ir_linkage linkage) {
		return (getLinkageBits() & linkage.val) != 0;
	}

	public final ir_visibility getVisibility() {
		int val = binding_typerep.get_entity_visibility(ptr);
		return ir_visibility.getEnum(val);
	}

	public final void setVisibility(ir_visibility vis) {
		binding_typerep.set_entity_visibility(ptr, vis.val);
	}

	public final ir_align getAlign() {
		int val = binding_typerep.get_entity_alignment(ptr);
		return ir_align.getEnum(val);
	}

	public final void setAlign(ir_align a) {
		binding_typerep.set_entity_alignment(ptr, a.val);
	}

	public static final String getAlignName(ir_align a) {
		return binding_typerep.get_align_name(a.val);
	}

	public final int getOffset() {
		return binding_typerep.get_entity_offset(ptr);
	}

	public final void setOffset(int offset) {
		binding_typerep.set_entity_offset(ptr, offset);
	}

	public final int getBitfieldOffset() {
		return binding_typerep.get_entity_bitfield_offset(ptr);
	}

	public final void setBitfieldOffset(int offset) {
		binding_typerep.set_entity_bitfield_offset(ptr, offset);
	}

	public final int getBitfieldSize() {
		return binding_typerep.get_entity_bitfield_size(ptr);
	}

	public final void setBitfieldSize(int size) {
		binding_typerep.set_entity_bitfield_size(ptr, size);
	}

	public final Graph getGraph() {
		Pointer p = binding_typerep.get_entity_irg(ptr);
		if (p == null)
			return null;

		return new Graph(p);
	}

	public final boolean isCompilerGenerated() {
		return 0 != binding_typerep.is_entity_compiler_generated(ptr);
	}

	public final void setCompilerGenerated(boolean flag) {
		binding_typerep.set_entity_compiler_generated(ptr, (flag ? 1 : 0));
	}

	public final boolean isParameterEntity() {
		return 0 != binding_typerep.is_parameter_entity(ptr);
	}

	public final int getParameterNumber() {
		return binding_typerep.get_entity_parameter_number(ptr).intValue();
	}

	public final Node getAtomicValue() {
		Pointer node_ptr = binding_typerep.get_atomic_ent_value(ptr);
		return Node.createWrapper(node_ptr);
	}

	public final void setAtomicValue(Node val) {
		binding_typerep.set_atomic_ent_value(ptr, val.ptr);
	}

	public final void setInitializer(Initializer initializer) {
		binding_typerep.set_entity_initializer(ptr, initializer != null ? initializer.ptr : Pointer.NULL);
	}

	public final void addEntityOverwrites(Entity overwritten) {
		binding_typerep.add_entity_overwrites(ptr, overwritten.ptr);
	}

	public final int getNOverwrites() {
		return binding_typerep.get_entity_n_overwrites(ptr).intValue();
	}

	public final Entity getOverwrites(int index) {
		return new Entity(binding_typerep.get_entity_overwrites(ptr, new NativeLong(index)));
	}

	public final boolean hasDefinition() {
		return binding_typerep.entity_has_definition(ptr) != 0;
	}
}
