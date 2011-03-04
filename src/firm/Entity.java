package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_align;
import firm.bindings.binding_typerep.ir_visibility;
import firm.nodes.Node;

public class Entity extends JNAWrapper {

	public Entity(Pointer ptr) {
		super(ptr);
	}

	public Entity(Type owner, Ident name, Type type) {
		this(binding_typerep.new_entity(owner.ptr, name.ptr, type.ptr));
	}

	public Entity(Type owner, String name, Type type) {
		this(owner, new Ident(name), type);
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

	public final int getLinkage() {
		return binding_typerep.get_entity_linkage(ptr);
	}

	public final void setLinkage(int linkage) {
		binding_typerep.set_entity_linkage(ptr, linkage);
	}

	public final void addLinkage(int linkage) {
		binding_typerep.add_entity_linkage(ptr, linkage);
	}

	public final void removeLinkage(int linkage) {
		binding_typerep.remove_entity_linkage(ptr, linkage);
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

	public final byte getOffsetBitsRemainder() {
		return binding_typerep.get_entity_offset_bits_remainder(ptr);
	}

	public final void setOffsetBitsRemainder(byte offset) {
		binding_typerep.set_entity_offset_bits_remainder(ptr, offset);
	}

	public final Graph getGraph() {
		Pointer p = binding_typerep.get_entity_irg(ptr);
		if (p == null)
			return null;

		return new Graph(p);
	}

	public final void setIrg(Graph irg) {
		binding_typerep.set_entity_irg(ptr, irg.ptr);
	}

	public final boolean isCompilerGenerated() {
		return 0 != binding_typerep.is_entity_compiler_generated(ptr);
	}

	public final void setCompilerGenerated(boolean flag) {
		binding_typerep.set_entity_compiler_generated(ptr, (flag ? 1 : 0));
	}

	public final Node getAtomicValue() {
		Pointer node_ptr = binding_typerep.get_atomic_ent_value(ptr);
		return Node.createWrapper(node_ptr);
	}

	public final void setAtomicValue(Node val) {
		binding_typerep.set_atomic_ent_value(ptr, val.ptr);
	}

	public final void setInitializer(Initializer initializer) {
		binding_typerep.set_entity_initializer(ptr, initializer.ptr);
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
}
