package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_typerep {
	static {
		Native.register("firm");
	}

	public static enum ir_relation {
		ir_relation_false(0),
		ir_relation_equal((1 << 0)),
		ir_relation_less((1 << 1)),
		ir_relation_greater((1 << 2)),
		ir_relation_unordered((1 << 3)),
		ir_relation_less_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val)),
		ir_relation_greater_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_greater((ir_relation.ir_relation_less.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_equal_greater(((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_equal((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val)),
		ir_relation_unordered_less_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_greater((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_greater_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less_greater(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_true((((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_unordered.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_relation(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_relation() {
			this.val = C.next_val++;
		}

		public static ir_relation getEnum(int val) {
			for (ir_relation entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_cons_flags {
		cons_none(0),
		cons_volatile((1 << 0)),
		cons_unaligned((1 << 1)),
		cons_floats((1 << 2)),
		cons_throws_exception((1 << 3));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_cons_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_cons_flags() {
			this.val = C.next_val++;
		}

		public static ir_cons_flags getEnum(int val) {
			for (ir_cons_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned();
		public final int val;

		private static class C {
			static int next_val;
		}

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		op_pin_state() {
			this.val = C.next_val++;
		}

		public static op_pin_state getEnum(int val) {
			for (op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum cond_jmp_predicate {
		COND_JMP_PRED_NONE(),
		COND_JMP_PRED_TRUE(),
		COND_JMP_PRED_FALSE();
		public final int val;

		private static class C {
			static int next_val;
		}

		cond_jmp_predicate(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		cond_jmp_predicate() {
			this.val = C.next_val++;
		}

		public static cond_jmp_predicate getEnum(int val) {
			for (cond_jmp_predicate entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum mtp_additional_properties {
		mtp_no_property(0),
		mtp_property_const((1 << 0)),
		mtp_property_pure((1 << 1)),
		mtp_property_noreturn((1 << 2)),
		mtp_property_nothrow((1 << 3)),
		mtp_property_naked((1 << 4)),
		mtp_property_malloc((1 << 5)),
		mtp_property_returns_twice((1 << 6)),
		mtp_property_private((1 << 7)),
		mtp_property_has_loop((1 << 8)),
		mtp_property_always_inline((1 << 9)),
		mtp_property_noinline((1 << 10)),
		mtp_property_inline_recommended((1 << 11)),
		mtp_temporary((1 << 12));
		public final int val;

		private static class C {
			static int next_val;
		}

		mtp_additional_properties(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		mtp_additional_properties() {
			this.val = C.next_val++;
		}

		public static mtp_additional_properties getEnum(int val) {
			for (mtp_additional_properties entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum symconst_kind {
		symconst_type_size(),
		symconst_type_align(),
		symconst_addr_ent(),
		symconst_ofs_ent();
		public final int val;

		private static class C {
			static int next_val;
		}

		symconst_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		symconst_kind() {
			this.val = C.next_val++;
		}

		public static symconst_kind getEnum(int val) {
			for (symconst_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_builtin_kind {
		ir_bk_trap(),
		ir_bk_debugbreak(),
		ir_bk_return_address(),
		ir_bk_frame_address(),
		ir_bk_prefetch(),
		ir_bk_ffs(),
		ir_bk_clz(),
		ir_bk_ctz(),
		ir_bk_popcount(),
		ir_bk_parity(),
		ir_bk_bswap(),
		ir_bk_inport(),
		ir_bk_outport(),
		ir_bk_inner_trampoline(),
		ir_bk_saturating_increment(),
		ir_bk_compare_swap(),
		ir_bk_last(ir_builtin_kind.ir_bk_compare_swap.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_builtin_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_builtin_kind() {
			this.val = C.next_val++;
		}

		public static ir_builtin_kind getEnum(int val) {
			for (ir_builtin_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_volatility {
		volatility_non_volatile(),
		volatility_is_volatile();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_volatility(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_volatility() {
			this.val = C.next_val++;
		}

		public static ir_volatility getEnum(int val) {
			for (ir_volatility entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_align {
		align_is_aligned(0),
		align_non_aligned();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_align(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_align() {
			this.val = C.next_val++;
		}

		public static ir_align getEnum(int val) {
			for (ir_align entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_visibility {
		ir_visibility_external(),
		ir_visibility_local(),
		ir_visibility_private();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_visibility(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_visibility() {
			this.val = C.next_val++;
		}

		public static ir_visibility getEnum(int val) {
			for (ir_visibility entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_linkage {
		IR_LINKAGE_DEFAULT(0),
		IR_LINKAGE_CONSTANT((1 << 0)),
		IR_LINKAGE_WEAK((1 << 1)),
		IR_LINKAGE_GARBAGE_COLLECT((1 << 2)),
		IR_LINKAGE_MERGE((1 << 3)),
		IR_LINKAGE_HIDDEN_USER((1 << 4)),
		IR_LINKAGE_NO_CODEGEN((1 << 5));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_linkage(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_linkage() {
			this.val = C.next_val++;
		}

		public static ir_linkage getEnum(int val) {
			for (ir_linkage entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_entity_usage {
		ir_usage_none(0),
		ir_usage_address_taken((1 << 0)),
		ir_usage_write((1 << 1)),
		ir_usage_read((1 << 2)),
		ir_usage_reinterpret_cast((1 << 3)),
		ir_usage_unknown((((ir_entity_usage.ir_usage_address_taken.val | ir_entity_usage.ir_usage_write.val) | ir_entity_usage.ir_usage_read.val) | ir_entity_usage.ir_usage_reinterpret_cast.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_entity_usage(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_entity_usage() {
			this.val = C.next_val++;
		}

		public static ir_entity_usage getEnum(int val) {
			for (ir_entity_usage entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_initializer_kind_t {
		IR_INITIALIZER_CONST(),
		IR_INITIALIZER_TARVAL(),
		IR_INITIALIZER_NULL(),
		IR_INITIALIZER_COMPOUND();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_initializer_kind_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_initializer_kind_t() {
			this.val = C.next_val++;
		}

		public static ir_initializer_kind_t getEnum(int val) {
			for (ir_initializer_kind_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_allocation {
		allocation_automatic(),
		allocation_parameter(),
		allocation_dynamic(),
		allocation_static();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_allocation(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_allocation() {
			this.val = C.next_val++;
		}

		public static ir_allocation getEnum(int val) {
			for (ir_allocation entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_peculiarity {
		peculiarity_existent(),
		peculiarity_description(),
		peculiarity_inherited();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_peculiarity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_peculiarity() {
			this.val = C.next_val++;
		}

		public static ir_peculiarity getEnum(int val) {
			for (ir_peculiarity entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ptr_access_kind {
		ptr_access_none(0),
		ptr_access_read(1),
		ptr_access_write(2),
		ptr_access_rw((ptr_access_kind.ptr_access_read.val | ptr_access_kind.ptr_access_write.val)),
		ptr_access_store(4),
		ptr_access_all((ptr_access_kind.ptr_access_rw.val | ptr_access_kind.ptr_access_store.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ptr_access_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ptr_access_kind() {
			this.val = C.next_val++;
		}

		public static ptr_access_kind getEnum(int val) {
			for (ptr_access_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum tp_opcode {
		tpo_uninitialized(0),
		tpo_class(),
		tpo_struct(),
		tpo_method(),
		tpo_union(),
		tpo_array(),
		tpo_pointer(),
		tpo_primitive(),
		tpo_code(),
		tpo_unknown(),
		tpo_last(tp_opcode.tpo_unknown.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		tp_opcode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		tp_opcode() {
			this.val = C.next_val++;
		}

		public static tp_opcode getEnum(int val) {
			for (tp_opcode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum inh_transitive_closure_state {
		inh_transitive_closure_none(),
		inh_transitive_closure_valid(),
		inh_transitive_closure_invalid(),
		inh_transitive_closure_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		inh_transitive_closure_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		inh_transitive_closure_state() {
			this.val = C.next_val++;
		}

		public static inh_transitive_closure_state getEnum(int val) {
			for (inh_transitive_closure_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_type_state {
		layout_undefined(),
		layout_fixed();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_type_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_type_state() {
			this.val = C.next_val++;
		}

		public static ir_type_state getEnum(int val) {
			for (ir_type_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_variadicity {
		variadicity_non_variadic(),
		variadicity_variadic();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_variadicity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_variadicity() {
			this.val = C.next_val++;
		}

		public static ir_variadicity getEnum(int val) {
			for (ir_variadicity entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum calling_convention {
		cc_reg_param(0x01000000),
		cc_last_on_top(0x02000000),
		cc_callee_clear_stk(0x04000000),
		cc_this_call(0x08000000),
		cc_compound_ret(0x10000000),
		cc_frame_on_caller_stk(0x20000000),
		cc_fpreg_param(0x40000000),
		cc_bits((0xFF << 24));
		public final int val;

		private static class C {
			static int next_val;
		}

		calling_convention(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		calling_convention() {
			this.val = C.next_val++;
		}

		public static calling_convention getEnum(int val) {
			for (calling_convention entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native /* ir_visibility */int get_entity_visibility(Pointer entity);

	public static native void set_entity_visibility(Pointer entity, /* ir_visibility */int visibility);

	public static native int entity_is_externally_visible(Pointer entity);

	public static native int entity_has_definition(Pointer entity);

	public static native Pointer new_entity(Pointer owner, Pointer name, Pointer tp);

	public static native Pointer new_parameter_entity(Pointer owner, com.sun.jna.NativeLong pos, Pointer type);

	public static native Pointer new_alias_entity(Pointer owner, Pointer name, Pointer alias, Pointer type);

	public static native void set_entity_alias(Pointer alias, Pointer aliased);

	public static native Pointer get_entity_alias(Pointer alias);

	public static native int check_entity(Pointer ent);

	public static native Pointer copy_entity_own(Pointer old, Pointer new_owner);

	public static native Pointer copy_entity_name(Pointer old, Pointer new_name);

	public static native void free_entity(Pointer ent);

	public static native String get_entity_name(Pointer ent);

	public static native Pointer get_entity_ident(Pointer ent);

	public static native void set_entity_ident(Pointer ent, Pointer id);

	public static native Pointer get_entity_ld_ident(Pointer ent);

	public static native void set_entity_ld_ident(Pointer ent, Pointer ld_ident);

	public static native String get_entity_ld_name(Pointer ent);

	public static native int entity_has_ld_ident(Pointer entity);

	public static native Pointer get_entity_owner(Pointer ent);

	public static native void set_entity_owner(Pointer ent, Pointer owner);

	public static native Pointer get_entity_type(Pointer ent);

	public static native void set_entity_type(Pointer ent, Pointer tp);

	public static native /* ir_linkage */int get_entity_linkage(Pointer entity);

	public static native void set_entity_linkage(Pointer entity, /* ir_linkage */int linkage);

	public static native void add_entity_linkage(Pointer entity, /* ir_linkage */int linkage);

	public static native void remove_entity_linkage(Pointer entity, /* ir_linkage */int linkage);

	public static native /* ir_volatility */int get_entity_volatility(Pointer ent);

	public static native void set_entity_volatility(Pointer ent, /* ir_volatility */int vol);

	public static native String get_volatility_name(/* ir_volatility */int var);

	public static native int get_entity_alignment(Pointer entity);

	public static native void set_entity_alignment(Pointer entity, int alignment);

	public static native /* ir_align */int get_entity_aligned(Pointer ent);

	public static native void set_entity_aligned(Pointer ent, /* ir_align */int a);

	public static native String get_align_name(/* ir_align */int a);

	public static native int get_entity_offset(Pointer entity);

	public static native void set_entity_offset(Pointer entity, int offset);

	public static native int get_entity_bitfield_offset(Pointer entity);

	public static native void set_entity_bitfield_offset(Pointer entity, int offset);

	public static native void set_entity_bitfield_size(Pointer entity, int size);

	public static native int get_entity_bitfield_size(Pointer entity);

	public static native Pointer get_entity_link(Pointer ent);

	public static native void set_entity_link(Pointer ent, Pointer l);

	public static native Pointer get_entity_irg(Pointer ent);

	public static native int get_entity_vtable_number(Pointer ent);

	public static native void set_entity_vtable_number(Pointer ent, int vtable_number);

	public static native void set_entity_label(Pointer ent, com.sun.jna.NativeLong label);

	public static native com.sun.jna.NativeLong get_entity_label(Pointer ent);

	public static native int is_entity_compiler_generated(Pointer ent);

	public static native void set_entity_compiler_generated(Pointer ent, int flag);

	public static native /* ir_entity_usage */int get_entity_usage(Pointer ent);

	public static native void set_entity_usage(Pointer ent, /* ir_entity_usage */int flag);

	public static native Pointer get_entity_dbg_info(Pointer ent);

	public static native void set_entity_dbg_info(Pointer ent, Pointer db);

	public static native int is_parameter_entity(Pointer entity);

	public static native com.sun.jna.NativeLong get_entity_parameter_number(Pointer entity);

	public static native void set_entity_parameter_number(Pointer entity, com.sun.jna.NativeLong n);

	public static native Pointer get_atomic_ent_value(Pointer ent);

	public static native void set_atomic_ent_value(Pointer ent, Pointer val);

	public static native /* ir_initializer_kind_t */int get_initializer_kind(Pointer initializer);

	public static native String get_initializer_kind_name(/* ir_initializer_kind_t */int ini);

	public static native Pointer get_initializer_null();

	public static native Pointer create_initializer_const(Pointer value);

	public static native Pointer create_initializer_tarval(Pointer tv);

	public static native Pointer get_initializer_const_value(Pointer initializer);

	public static native Pointer get_initializer_tarval_value(Pointer initialzier);

	public static native Pointer create_initializer_compound(com.sun.jna.NativeLong n_entries);

	public static native com.sun.jna.NativeLong get_initializer_compound_n_entries(Pointer initializer);

	public static native void set_initializer_compound_value(Pointer initializer, com.sun.jna.NativeLong index, Pointer value);

	public static native Pointer get_initializer_compound_value(Pointer initializer, com.sun.jna.NativeLong index);

	public static native void set_entity_initializer(Pointer entity, Pointer initializer);

	public static native int has_entity_initializer(Pointer entity);

	public static native Pointer get_entity_initializer(Pointer entity);

	public static native void add_entity_overwrites(Pointer ent, Pointer overwritten);

	public static native com.sun.jna.NativeLong get_entity_n_overwrites(Pointer ent);

	public static native com.sun.jna.NativeLong get_entity_overwrites_index(Pointer ent, Pointer overwritten);

	public static native Pointer get_entity_overwrites(Pointer ent, com.sun.jna.NativeLong pos);

	public static native void set_entity_overwrites(Pointer ent, com.sun.jna.NativeLong pos, Pointer overwritten);

	public static native void remove_entity_overwrites(Pointer ent, Pointer overwritten);

	public static native com.sun.jna.NativeLong get_entity_n_overwrittenby(Pointer ent);

	public static native com.sun.jna.NativeLong get_entity_overwrittenby_index(Pointer ent, Pointer overwrites);

	public static native Pointer get_entity_overwrittenby(Pointer ent, com.sun.jna.NativeLong pos);

	public static native void set_entity_overwrittenby(Pointer ent, com.sun.jna.NativeLong pos, Pointer overwrites);

	public static native void remove_entity_overwrittenby(Pointer ent, Pointer overwrites);

	public static native int is_entity(Pointer thing);

	public static native int is_atomic_entity(Pointer ent);

	public static native int is_compound_entity(Pointer ent);

	public static native int is_method_entity(Pointer ent);

	public static native com.sun.jna.NativeLong get_entity_nr(Pointer ent);

	public static native com.sun.jna.NativeLong get_entity_visited(Pointer ent);

	public static native void set_entity_visited(Pointer ent, com.sun.jna.NativeLong num);

	public static native void mark_entity_visited(Pointer ent);

	public static native int entity_visited(Pointer ent);

	public static native int entity_not_visited(Pointer ent);

	public static native /* mtp_additional_properties */int get_entity_additional_properties(Pointer ent);

	public static native void set_entity_additional_properties(Pointer ent, /* mtp_additional_properties */int prop);

	public static native void add_entity_additional_properties(Pointer ent, /* mtp_additional_properties */int flag);

	public static native Pointer get_unknown_entity();

	public static native int is_unknown_entity(Pointer entity);

	public static native /* ir_allocation */int get_entity_allocation(Pointer ent);

	public static native void set_entity_allocation(Pointer ent, /* ir_allocation */int al);

	public static native /* ir_peculiarity */int get_entity_peculiarity(Pointer ent);

	public static native void set_entity_peculiarity(Pointer ent, /* ir_peculiarity */int pec);

	public static native int is_entity_final(Pointer ent);

	public static native void set_entity_final(Pointer ent, int _final);

	public static native /* ir_peculiarity */int get_class_peculiarity(Pointer clss);

	public static native void set_class_peculiarity(Pointer clss, /* ir_peculiarity */int pec);

	public static native String get_tpop_name(Pointer op);

	public static native /* tp_opcode */int get_tpop_code(Pointer op);

	public static native int is_SubClass_of(Pointer low, Pointer high);

	public static native int is_SubClass_ptr_of(Pointer low, Pointer high);

	public static native int is_overwritten_by(Pointer high, Pointer low);

	public static native Pointer resolve_ent_polymorphy(Pointer dynamic_class, Pointer static_ent);

	public static native Pointer default_mangle_inherited_name(Pointer ent, Pointer clss);

	public static native void resolve_inheritance(Pointer mfunc);

	public static native void set_irp_inh_transitive_closure_state(/* inh_transitive_closure_state */int s);

	public static native void invalidate_irp_inh_transitive_closure_state();

	public static native /* inh_transitive_closure_state */int get_irp_inh_transitive_closure_state();

	public static native void compute_inh_transitive_closure();

	public static native void free_inh_transitive_closure();

	public static native Pointer get_class_trans_subtype_first(Pointer tp);

	public static native Pointer get_class_trans_subtype_next(Pointer tp);

	public static native int is_class_trans_subtype(Pointer tp, Pointer subtp);

	public static native Pointer get_class_trans_supertype_first(Pointer tp);

	public static native Pointer get_class_trans_supertype_next(Pointer tp);

	public static native Pointer get_entity_trans_overwrittenby_first(Pointer ent);

	public static native Pointer get_entity_trans_overwrittenby_next(Pointer ent);

	public static native Pointer get_entity_trans_overwrites_first(Pointer ent);

	public static native Pointer get_entity_trans_overwrites_next(Pointer ent);

	public static native int check_type(Pointer tp);

	public static native int tr_verify();

	public static native void free_type(Pointer tp);

	public static native Pointer get_type_tpop(Pointer tp);

	public static native Pointer get_type_tpop_nameid(Pointer tp);

	public static native String get_type_tpop_name(Pointer tp);

	public static native /* tp_opcode */int get_type_tpop_code(Pointer tp);

	public static native void ir_print_type(String buffer, com.sun.jna.NativeLong buffer_size, Pointer tp);

	public static native String get_type_state_name(/* ir_type_state */int s);

	public static native /* ir_type_state */int get_type_state(Pointer tp);

	public static native void set_type_state(Pointer tp, /* ir_type_state */int state);

	public static native Pointer get_type_mode(Pointer tp);

	public static native void set_type_mode(Pointer tp, Pointer m);

	public static native int get_type_size_bytes(Pointer tp);

	public static native void set_type_size_bytes(Pointer tp, int size);

	public static native int get_type_alignment_bytes(Pointer tp);

	public static native void set_type_alignment_bytes(Pointer tp, int align);

	public static native com.sun.jna.NativeLong get_type_visited(Pointer tp);

	public static native void set_type_visited(Pointer tp, com.sun.jna.NativeLong num);

	public static native void mark_type_visited(Pointer tp);

	public static native int type_visited(Pointer tp);

	public static native int type_not_visited(Pointer tp);

	public static native Pointer get_type_link(Pointer tp);

	public static native void set_type_link(Pointer tp, Pointer l);

	public static native void inc_master_type_visited();

	public static native void set_master_type_visited(com.sun.jna.NativeLong val);

	public static native com.sun.jna.NativeLong get_master_type_visited();

	public static native void set_type_dbg_info(Pointer tp, Pointer db);

	public static native Pointer get_type_dbg_info(Pointer tp);

	public static native int is_type(Pointer thing);

	public static native com.sun.jna.NativeLong get_type_nr(Pointer tp);

	public static native int is_segment_type(Pointer tp);

	public static native Pointer new_type_class(Pointer name);

	public static native Pointer get_class_ident(Pointer clss);

	public static native String get_class_name(Pointer clss);

	public static native com.sun.jna.NativeLong get_class_n_members(Pointer clss);

	public static native Pointer get_class_member(Pointer clss, com.sun.jna.NativeLong pos);

	public static native com.sun.jna.NativeLong get_class_member_index(Pointer clss, Pointer mem);

	public static native Pointer get_class_member_by_name(Pointer clss, Pointer name);

	public static native void add_class_subtype(Pointer clss, Pointer subtype);

	public static native com.sun.jna.NativeLong get_class_n_subtypes(Pointer clss);

	public static native Pointer get_class_subtype(Pointer clss, com.sun.jna.NativeLong pos);

	public static native com.sun.jna.NativeLong get_class_subtype_index(Pointer clss, Pointer subclass);

	public static native void set_class_subtype(Pointer clss, Pointer subtype, com.sun.jna.NativeLong pos);

	public static native void remove_class_subtype(Pointer clss, Pointer subtype);

	public static native void add_class_supertype(Pointer clss, Pointer supertype);

	public static native com.sun.jna.NativeLong get_class_n_supertypes(Pointer clss);

	public static native com.sun.jna.NativeLong get_class_supertype_index(Pointer clss, Pointer super_clss);

	public static native Pointer get_class_supertype(Pointer clss, com.sun.jna.NativeLong pos);

	public static native void set_class_supertype(Pointer clss, Pointer supertype, com.sun.jna.NativeLong pos);

	public static native void remove_class_supertype(Pointer clss, Pointer supertype);

	public static native int get_class_vtable_size(Pointer clss);

	public static native void set_class_vtable_size(Pointer clss, int size);

	public static native int is_class_final(Pointer clss);

	public static native void set_class_final(Pointer clss, int flag);

	public static native int is_class_interface(Pointer clss);

	public static native void set_class_interface(Pointer clss, int flag);

	public static native int is_class_abstract(Pointer clss);

	public static native void set_class_abstract(Pointer clss, int flag);

	public static native int is_Class_type(Pointer clss);

	public static native Pointer get_tpop_class();

	public static native Pointer new_type_struct(Pointer name);

	public static native Pointer get_struct_ident(Pointer strct);

	public static native String get_struct_name(Pointer strct);

	public static native com.sun.jna.NativeLong get_struct_n_members(Pointer strct);

	public static native Pointer get_struct_member(Pointer strct, com.sun.jna.NativeLong pos);

	public static native com.sun.jna.NativeLong get_struct_member_index(Pointer strct, Pointer member);

	public static native int is_Struct_type(Pointer strct);

	public static native Pointer get_tpop_struct();

	public static native Pointer new_type_union(Pointer name);

	public static native Pointer get_union_ident(Pointer uni);

	public static native String get_union_name(Pointer uni);

	public static native com.sun.jna.NativeLong get_union_n_members(Pointer uni);

	public static native Pointer get_union_member(Pointer uni, com.sun.jna.NativeLong pos);

	public static native com.sun.jna.NativeLong get_union_member_index(Pointer uni, Pointer member);

	public static native int is_Union_type(Pointer uni);

	public static native Pointer get_tpop_union();

	public static native Pointer new_type_method(com.sun.jna.NativeLong n_param, com.sun.jna.NativeLong n_res);

	public static native com.sun.jna.NativeLong get_method_n_params(Pointer method);

	public static native Pointer get_method_param_type(Pointer method, com.sun.jna.NativeLong pos);

	public static native void set_method_param_type(Pointer method, com.sun.jna.NativeLong pos, Pointer tp);

	public static native com.sun.jna.NativeLong get_method_n_ress(Pointer method);

	public static native Pointer get_method_res_type(Pointer method, com.sun.jna.NativeLong pos);

	public static native void set_method_res_type(Pointer method, com.sun.jna.NativeLong pos, Pointer tp);

	public static native String get_variadicity_name(/* ir_variadicity */int vari);

	public static native /* ir_variadicity */int get_method_variadicity(Pointer method);

	public static native void set_method_variadicity(Pointer method, /* ir_variadicity */int vari);

	public static native /* mtp_additional_properties */int get_method_additional_properties(Pointer method);

	public static native void set_method_additional_properties(Pointer method, /* mtp_additional_properties */int property_mask);

	public static native void add_method_additional_properties(Pointer method, /* mtp_additional_properties */int flag);

	public static native int get_method_calling_convention(Pointer method);

	public static native void set_method_calling_convention(Pointer method, int cc_mask);

	public static native int get_method_n_regparams(Pointer method);

	public static native void set_method_n_regparams(Pointer method, int n_regs);

	public static native int is_Method_type(Pointer method);

	public static native Pointer get_tpop_method();

	public static native Pointer new_type_array(com.sun.jna.NativeLong n_dims, Pointer element_type);

	public static native com.sun.jna.NativeLong get_array_n_dimensions(Pointer array);

	public static native void set_array_bounds_int(Pointer array, com.sun.jna.NativeLong dimension, int lower_bound, int upper_bound);

	public static native void set_array_bounds(Pointer array, com.sun.jna.NativeLong dimension, Pointer lower_bound, Pointer upper_bound);

	public static native void set_array_lower_bound(Pointer array, com.sun.jna.NativeLong dimension, Pointer lower_bound);

	public static native void set_array_lower_bound_int(Pointer array, com.sun.jna.NativeLong dimension, int lower_bound);

	public static native void set_array_upper_bound(Pointer array, com.sun.jna.NativeLong dimension, Pointer upper_bound);

	public static native void set_array_upper_bound_int(Pointer array, com.sun.jna.NativeLong dimension, int upper_bound);

	public static native int has_array_lower_bound(Pointer array, com.sun.jna.NativeLong dimension);

	public static native Pointer get_array_lower_bound(Pointer array, com.sun.jna.NativeLong dimension);

	public static native com.sun.jna.NativeLong get_array_lower_bound_int(Pointer array, com.sun.jna.NativeLong dimension);

	public static native int has_array_upper_bound(Pointer array, com.sun.jna.NativeLong dimension);

	public static native Pointer get_array_upper_bound(Pointer array, com.sun.jna.NativeLong dimension);

	public static native com.sun.jna.NativeLong get_array_upper_bound_int(Pointer array, com.sun.jna.NativeLong dimension);

	public static native void set_array_order(Pointer array, com.sun.jna.NativeLong dimension, com.sun.jna.NativeLong order);

	public static native com.sun.jna.NativeLong get_array_order(Pointer array, com.sun.jna.NativeLong dimension);

	public static native com.sun.jna.NativeLong find_array_dimension(Pointer array, com.sun.jna.NativeLong order);

	public static native void set_array_element_type(Pointer array, Pointer tp);

	public static native Pointer get_array_element_type(Pointer array);

	public static native void set_array_element_entity(Pointer array, Pointer ent);

	public static native Pointer get_array_element_entity(Pointer array);

	public static native void set_array_variable_size(Pointer array, int variable_size_flag);

	public static native int is_array_variable_size(Pointer array);

	public static native int is_Array_type(Pointer array);

	public static native Pointer get_tpop_array();

	public static native Pointer new_type_pointer(Pointer points_to);

	public static native void set_pointer_points_to_type(Pointer pointer, Pointer tp);

	public static native Pointer get_pointer_points_to_type(Pointer pointer);

	public static native int is_Pointer_type(Pointer pointer);

	public static native Pointer find_pointer_type_to_type(Pointer tp);

	public static native Pointer get_tpop_pointer();

	public static native Pointer new_type_primitive(Pointer mode);

	public static native int is_Primitive_type(Pointer primitive);

	public static native Pointer get_tpop_primitive();

	public static native Pointer get_code_type();

	public static native int is_code_type(Pointer tp);

	public static native Pointer get_tpop_code_type();

	public static native Pointer get_unknown_type();

	public static native int is_unknown_type(Pointer type);

	public static native Pointer get_tpop_unknown();

	public static native int is_atomic_type(Pointer tp);

	public static native Pointer get_compound_ident(Pointer tp);

	public static native String get_compound_name(Pointer tp);

	public static native com.sun.jna.NativeLong get_compound_n_members(Pointer tp);

	public static native Pointer get_compound_member(Pointer tp, com.sun.jna.NativeLong pos);

	public static native com.sun.jna.NativeLong get_compound_member_index(Pointer tp, Pointer member);

	public static native void remove_compound_member(Pointer compound, Pointer entity);

	public static native void set_compound_variable_size(Pointer compound, int variable_size);

	public static native int is_compound_variable_size(Pointer compound);

	public static native void default_layout_compound_type(Pointer tp);

	public static native int is_compound_type(Pointer tp);

	public static native Pointer new_type_frame();

	public static native int is_frame_type(Pointer tp);

	public static native Pointer clone_frame_type(Pointer type);

	public static native Pointer frame_alloc_area(Pointer frame_type, int size, int alignment, int at_start);

	public static native void type_walk(Pointer pre, Pointer post, Pointer env);

	public static native void type_walk_irg(Pointer irg, Pointer pre, Pointer post, Pointer env);

	public static native void type_walk_super2sub(Pointer pre, Pointer post, Pointer env);

	public static native void type_walk_super(Pointer pre, Pointer post, Pointer env);

	public static native void class_walk_super2sub(Pointer pre, Pointer post, Pointer env);

	public static native void walk_types_entities(Pointer tp, Pointer doit, Pointer env);

	public static native void types_calc_finalization();

	public static native /* ir_visibility */int get_type_visibility(Pointer tp);

	public static native void set_type_visibility(Pointer tp, /* ir_visibility */int v);
}
