package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_align;
import firm.bindings.binding_typerep.ir_allocation;
import firm.bindings.binding_typerep.ir_entity_usage;
import firm.bindings.binding_typerep.ir_peculiarity;
import firm.bindings.binding_typerep.ir_stickyness;
import firm.bindings.binding_typerep.ir_variability;
import firm.bindings.binding_typerep.ir_visibility;
import firm.bindings.binding_typerep.ir_volatility;

public class Entity extends JNAWrapper {
	
	protected final static binding_typerep binding = Bindings.getTypeRepBinding(); 
	
	protected Entity(Pointer ptr) {
		super(ptr);
	}
	
	public Entity(Type owner, Ident name, Type type) {
		this(binding.new_entity(owner.ptr, name.ptr, type.ptr));
	}
	
	public final void free() {
		binding.free_entity(ptr);
	}
	
	public final String getName() {
		return binding.get_entity_name(ptr);
	}

	public final Ident getIdent() {
		Pointer p = binding.get_entity_ident(ptr);
		return new Ident(p);
	}

	public final void setIdent(Ident id) {
		binding.set_entity_ident(ptr, id.ptr);
	}

	public final Ident getLdIdent() {
		Pointer p = binding.get_entity_ld_ident(ptr);
		return new Ident(p);
	}

	public final void setLdIdent(Ident ldIdent) {
		binding.set_entity_ld_ident(ptr, ldIdent.ptr);
	}

	public final String getLdName() {
		return binding.get_entity_ld_name(ptr);
	}

	public final Type getOwner() {
		Pointer p = binding.get_entity_owner(ptr);
		return new Type(p);
	}

	public final void setOwner(Type owner) {
		binding.set_entity_owner(ptr, owner.ptr);
	}

	public final Type getType() {
		Pointer p = binding.get_entity_type(ptr);
		return new Type(p);
	}

	public final void setType(Type tp) {
		binding.set_entity_type(ptr, tp.ptr);
	}

	public final ir_allocation getAllocation() {
		int val = binding.get_entity_allocation(ptr);
		return ir_allocation.getEnum(val);
	}

	public final void setAllocation(ir_allocation al) {
		binding.set_entity_allocation(ptr, al.val);
	}

	public static final String getAllocationName(ir_allocation vis) {
		return binding.get_allocation_name(vis.val);
	}

	public final ir_visibility getVisibility() {
		int val = binding.get_entity_visibility(ptr);
		return ir_visibility.getEnum(val);
	}

	public final void setVisibility(ir_visibility vis) {
		binding.set_entity_visibility(ptr, vis.val);
	}

	public static final String getVisibilityName(ir_visibility vis) {
		return binding.get_visibility_name(vis.val);
	}

	public final ir_variability getVariability() {
		int val = binding.get_entity_variability(ptr);
		return ir_variability.getEnum(val);
	}

	public final void setVariability(ir_variability var) {
		binding.set_entity_variability(ptr, var.val);
	}

	public static final String getVariabilityName(ir_variability var) {
		return binding.get_variability_name(var.val);
	}

	public final ir_volatility getVolatility() {
		int val = binding.get_entity_volatility(ptr);
		return ir_volatility.getEnum(val);
	}

	public final void setVolatility(ir_volatility vol) {
		binding.set_entity_volatility(ptr, vol.val);
	}

	public static final String getVolatilityName(ir_volatility var) {
		return binding.get_volatility_name(var.val);
	}

	public final ir_align getAlign() {
		int val = binding.get_entity_align(ptr);
		return ir_align.getEnum(val);
	}

	public final void setAlign(ir_align a) {
		binding.set_entity_align(ptr, a.val);
	}

	public static final String getAlignName(ir_align a) {
		return binding.get_align_name(a.val);
	}

	public final ir_stickyness getStickyness() {
		int val = binding.get_entity_stickyness(ptr);
		return ir_stickyness.getEnum(val);
	}

	public final void setStickyness(ir_stickyness stickyness) {
		binding.set_entity_stickyness(ptr, stickyness.val);
	}

	public final int getOffset() {
		return binding.get_entity_offset(ptr);
	}

	public final void setOffset(int offset) {
		binding.set_entity_offset(ptr, offset);
	}

	public final byte getOffsetBitsRemainder() {
		return binding.get_entity_offset_bits_remainder(ptr);
	}

	public final void setOffsetBitsRemainder(byte offset) {
		binding.set_entity_offset_bits_remainder(ptr, offset);
	}

//TODO gets and sets void pointer ...
//	public final Pointer getLink() {
//	}
//
//	public final void setLink(Pointer l) {
//	}

	public final Graph getIrg() {
		Pointer p = binding.get_entity_irg(ptr);
		return new Graph(p);
	}

	public final void setIrg(Graph irg) {
		binding.set_entity_irg(ptr, irg.ptr);
	}

	public final int getVtableNumber() {
		return binding.get_entity_vtable_number(ptr);
	}

	public final void setVtableNumber(int vtableNumber) {
		binding.set_entity_vtable_number(ptr, vtableNumber);
	}

	public final ir_peculiarity getPeculiarity() {
		int val = binding.get_entity_peculiarity(ptr);
		return ir_peculiarity.getEnum(val);
	}

	public final void setPeculiarity(ir_peculiarity pec) {
		binding.set_entity_peculiarity(ptr, pec.val);
	}

	public final boolean isFinal() {
		return 0 != binding.is_entity_final(ptr);
	}

	public final void setFinal(boolean isFinal) {
		binding.set_entity_final(ptr, (isFinal ? 1 : 0));
	}

	public final boolean isCompilerGenerated() {
		return 0 != binding.is_entity_compiler_generated(ptr);
	}

	public final void setCompilerGenerated(boolean flag) {
		binding.set_entity_compiler_generated(ptr, (flag ? 1 : 0));
	}

	public final boolean isBackendMarked() {
		return 0 != binding.is_entity_backend_marked(ptr);
	}

	public final void setBackendMarked(boolean flag) {
		binding.set_entity_backend_marked(ptr, (flag ? 1 : 0));
	}

	public final ir_entity_usage getUsage() {
		int val = binding.get_entity_usage(ptr);
		return ir_entity_usage.getEnum(val);
	}

	public final void setUsage(ir_entity_usage flag) {
		binding.set_entity_usage(ptr, flag.val);
	}

// TODO no debug info for now
//	public final Pointer getDbgInfo() {
//	}
//
//	public final void setDbgInfo(Pointer db) {
//	}

	public final Node getAtomicValue() {
		Pointer p = binding.get_atomic_ent_value(ptr);
		return new Node(p);
	}
	
	public final void setAtomicValue(Node val) {
		binding.set_atomic_ent_value(ptr, val.ptr);
	}

}
