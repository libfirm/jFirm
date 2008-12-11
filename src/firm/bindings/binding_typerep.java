package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


public interface binding_typerep extends Library {
	public static enum ip_view_state {
		ip_view_no(),
		ip_view_valid(),
		ip_view_invalid();
		public final int val;
		private static class C { static int next_val; }

		ip_view_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ip_view_state() {
			this.val = C.next_val++;
		}
		
		public static ip_view_state getEnum(int val) {
			for(ip_view_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned(),
		op_pin_state_mem_pinned();
		public final int val;
		private static class C { static int next_val; }

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		op_pin_state() {
			this.val = C.next_val++;
		}
		
		public static op_pin_state getEnum(int val) {
			for(op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum mtp_additional_property {
		mtp_no_property(0),
		mtp_property_const(1),
		mtp_property_pure(2),
		mtp_property_noreturn(4),
		mtp_property_nothrow(8),
		mtp_property_naked(16),
		mtp_property_malloc(32),
		mtp_property_weak(64),
		mtp_property_returns_twice(128),
		mtp_property_intrinsic(256),
		mtp_property_runtime(512),
		mtp_property_private(1024),
		mtp_property_has_loop(2048),
		mtp_property_inherited((1<<31));
		public final int val;
		private static class C { static int next_val; }

		mtp_additional_property(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		mtp_additional_property() {
			this.val = C.next_val++;
		}
		
		public static mtp_additional_property getEnum(int val) {
			for(mtp_additional_property entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum symconst_kind {
		symconst_type_tag(),
		symconst_type_size(),
		symconst_type_align(),
		symconst_addr_name(),
		symconst_addr_ent(),
		symconst_ofs_ent(),
		symconst_enum_const(),
		symconst_label();
		public final int val;
		private static class C { static int next_val; }

		symconst_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		symconst_kind() {
			this.val = C.next_val++;
		}
		
		public static symconst_kind getEnum(int val) {
			for(symconst_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_Cmp {
		pn_Cmp_False(0),
		pn_Cmp_Eq(1),
		pn_Cmp_Lt(2),
		pn_Cmp_Le((pn_Cmp.pn_Cmp_Eq.val|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Gt(4),
		pn_Cmp_Ge((pn_Cmp.pn_Cmp_Eq.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Lg((pn_Cmp.pn_Cmp_Lt.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Leg(((pn_Cmp.pn_Cmp_Lt.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uo(8),
		pn_Cmp_Ue((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ul((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Ule(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Ug((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uge(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Eq.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Ne(((pn_Cmp.pn_Cmp_Uo.val|pn_Cmp.pn_Cmp_Lt.val)|pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_True(15);
		public final int val;
		private static class C { static int next_val; }

		pn_Cmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Cmp() {
			this.val = C.next_val++;
		}
		
		public static pn_Cmp getEnum(int val) {
			for(pn_Cmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_where_alloc {
		stack_alloc(),
		heap_alloc();
		public final int val;
		private static class C { static int next_val; }

		ir_where_alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_where_alloc() {
			this.val = C.next_val++;
		}
		
		public static ir_where_alloc getEnum(int val) {
			for(ir_where_alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_resources_enum_t {
		IR_RESOURCE_BLOCK_VISITED((1<<0)),
		IR_RESOURCE_BLOCK_MARK((1<<1)),
		IR_RESOURCE_IRN_VISITED((1<<2)),
		IR_RESOURCE_IRN_LINK((1<<3)),
		IR_RESOURCE_LOOP_LINK((1<<4)),
		IR_RESOURCE_PHI_LIST((1<<5)),
		IR_RESOURCE_IRG_LINK((1<<6)),
		IR_RESOURCE_ENTITY_LINK((1<<8)),
		IR_RESOURCE_LOCAL_MASK(255),
		IR_RESOURCE_GLOBAL_MASK(65280);
		public final int val;
		private static class C { static int next_val; }

		ir_resources_enum_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_resources_enum_t() {
			this.val = C.next_val++;
		}
		
		public static ir_resources_enum_t getEnum(int val) {
			for(ir_resources_enum_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_visibility {
		visibility_local(),
		visibility_external_visible(),
		visibility_external_allocated();
		public final int val;
		private static class C { static int next_val; }

		ir_visibility(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_visibility() {
			this.val = C.next_val++;
		}
		
		public static ir_visibility getEnum(int val) {
			for(ir_visibility entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_peculiarity {
		peculiarity_description(),
		peculiarity_inherited(),
		peculiarity_existent();
		public final int val;
		private static class C { static int next_val; }

		ir_peculiarity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_peculiarity() {
			this.val = C.next_val++;
		}
		
		public static ir_peculiarity getEnum(int val) {
			for(ir_peculiarity entry : values()) {
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
		private static class C { static int next_val; }

		ir_allocation(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_allocation() {
			this.val = C.next_val++;
		}
		
		public static ir_allocation getEnum(int val) {
			for(ir_allocation entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_variability {
		variability_uninitialized(),
		variability_initialized(),
		variability_part_constant(),
		variability_constant();
		public final int val;
		private static class C { static int next_val; }

		ir_variability(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_variability() {
			this.val = C.next_val++;
		}
		
		public static ir_variability getEnum(int val) {
			for(ir_variability entry : values()) {
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
		private static class C { static int next_val; }

		ir_volatility(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_volatility() {
			this.val = C.next_val++;
		}
		
		public static ir_volatility getEnum(int val) {
			for(ir_volatility entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_align {
		align_non_aligned(),
		align_is_aligned();
		public final int val;
		private static class C { static int next_val; }

		ir_align(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_align() {
			this.val = C.next_val++;
		}
		
		public static ir_align getEnum(int val) {
			for(ir_align entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_stickyness {
		stickyness_unsticky(),
		stickyness_sticky();
		public final int val;
		private static class C { static int next_val; }

		ir_stickyness(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_stickyness() {
			this.val = C.next_val++;
		}
		
		public static ir_stickyness getEnum(int val) {
			for(ir_stickyness entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_entity_usage {
		ir_usage_none(0),
		ir_usage_address_taken((1<<0)),
		ir_usage_write((1<<1)),
		ir_usage_read((1<<2)),
		ir_usage_reinterpret_cast((1<<3)),
		ir_usage_unknown((((ir_entity_usage.ir_usage_address_taken.val|ir_entity_usage.ir_usage_write.val)|ir_entity_usage.ir_usage_read.val)|ir_entity_usage.ir_usage_reinterpret_cast.val));
		public final int val;
		private static class C { static int next_val; }

		ir_entity_usage(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_entity_usage() {
			this.val = C.next_val++;
		}
		
		public static ir_entity_usage getEnum(int val) {
			for(ir_entity_usage entry : values()) {
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
		private static class C { static int next_val; }

		ir_initializer_kind_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_initializer_kind_t() {
			this.val = C.next_val++;
		}
		
		public static ir_initializer_kind_t getEnum(int val) {
			for(ir_initializer_kind_t entry : values()) {
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
		ptr_access_rw((ptr_access_kind.ptr_access_read.val|ptr_access_kind.ptr_access_write.val)),
		ptr_access_store(4),
		ptr_access_all((ptr_access_kind.ptr_access_rw.val|ptr_access_kind.ptr_access_store.val));
		public final int val;
		private static class C { static int next_val; }

		ptr_access_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ptr_access_kind() {
			this.val = C.next_val++;
		}
		
		public static ptr_access_kind getEnum(int val) {
			for(ptr_access_kind entry : values()) {
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
		tpo_enumeration(),
		tpo_pointer(),
		tpo_primitive(),
		tpo_id(),
		tpo_none(),
		tpo_unknown(),
		tpo_max();
		public final int val;
		private static class C { static int next_val; }

		tp_opcode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		tp_opcode() {
			this.val = C.next_val++;
		}
		
		public static tp_opcode getEnum(int val) {
			for(tp_opcode entry : values()) {
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
		private static class C { static int next_val; }

		inh_transitive_closure_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		inh_transitive_closure_state() {
			this.val = C.next_val++;
		}
		
		public static inh_transitive_closure_state getEnum(int val) {
			for(inh_transitive_closure_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_class_cast_state {
		ir_class_casts_any(0),
		ir_class_casts_transitive(1),
		ir_class_casts_normalized(2),
		ir_class_casts_state_max();
		public final int val;
		private static class C { static int next_val; }

		ir_class_cast_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_class_cast_state() {
			this.val = C.next_val++;
		}
		
		public static ir_class_cast_state getEnum(int val) {
			for(ir_class_cast_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum trvrfy_error_codes {
		no_error(0),
		error_ent_not_cont(),
		error_null_mem(),
		error_const_on_wrong_irg(),
		error_existent_entity_without_irg(),
		error_wrong_ent_overwrites(),
		error_inherited_ent_without_const(),
		error_glob_ent_allocation(),
		error_ent_const_mode(),
		error_ent_wrong_owner();
		public final int val;
		private static class C { static int next_val; }

		trvrfy_error_codes(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		trvrfy_error_codes() {
			this.val = C.next_val++;
		}
		
		public static trvrfy_error_codes getEnum(int val) {
			for(trvrfy_error_codes entry : values()) {
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
		private static class C { static int next_val; }

		ir_type_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_type_state() {
			this.val = C.next_val++;
		}
		
		public static ir_type_state getEnum(int val) {
			for(ir_type_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum variadicity {
		variadicity_non_variadic(),
		variadicity_variadic();
		public final int val;
		private static class C { static int next_val; }

		variadicity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		variadicity() {
			this.val = C.next_val++;
		}
		
		public static variadicity getEnum(int val) {
			for(variadicity entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum calling_convention {
		cc_reg_param(16777216),
		cc_last_on_top(33554432),
		cc_callee_clear_stk(67108864),
		cc_this_call(134217728),
		cc_compound_ret(268435456),
		cc_frame_on_caller_stk(536870912),
		cc_fpreg_param(1073741824),
		cc_bits((255<<24));
		public final int val;
		private static class C { static int next_val; }

		calling_convention(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		calling_convention() {
			this.val = C.next_val++;
		}
		
		public static calling_convention getEnum(int val) {
			for(calling_convention entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer new_entity(Pointer owner, Pointer name, Pointer tp);
	Pointer new_d_entity(Pointer owner, Pointer name, Pointer tp, Pointer db);
	Pointer copy_entity_own(Pointer old, Pointer new_owner);
	Pointer copy_entity_name(Pointer old, Pointer new_name);
	void free_entity(Pointer ent);
	String get_entity_name(Pointer ent);
	Pointer get_entity_ident(Pointer ent);
	void set_entity_ident(Pointer ent, Pointer id);
	Pointer get_entity_ld_ident(Pointer ent);
	void set_entity_ld_ident(Pointer ent, Pointer ld_ident);
	String get_entity_ld_name(Pointer ent);
	Pointer get_entity_owner(Pointer ent);
	void set_entity_owner(Pointer ent, Pointer owner);
	Pointer get_entity_type(Pointer ent);
	void set_entity_type(Pointer ent, Pointer tp);
	/* ir_allocation */int get_entity_allocation(Pointer ent);
	void set_entity_allocation(Pointer ent, /* ir_allocation */int al);
	String get_allocation_name(/* ir_allocation */int vis);
	/* ir_visibility */int get_entity_visibility(Pointer ent);
	void set_entity_visibility(Pointer ent, /* ir_visibility */int vis);
	String get_visibility_name(/* ir_visibility */int vis);
	/* ir_variability */int get_entity_variability(Pointer ent);
	void set_entity_variability(Pointer ent, /* ir_variability */int var);
	String get_variability_name(/* ir_variability */int var);
	/* ir_volatility */int get_entity_volatility(Pointer ent);
	void set_entity_volatility(Pointer ent, /* ir_volatility */int vol);
	String get_volatility_name(/* ir_volatility */int var);
	/* ir_align */int get_entity_align(Pointer ent);
	void set_entity_align(Pointer ent, /* ir_align */int a);
	String get_align_name(/* ir_align */int a);
	/* ir_stickyness */int get_entity_stickyness(Pointer ent);
	void set_entity_stickyness(Pointer ent, /* ir_stickyness */int stickyness);
	int get_entity_offset(Pointer ent);
	void set_entity_offset(Pointer ent, int offset);
	byte get_entity_offset_bits_remainder(Pointer ent);
	void set_entity_offset_bits_remainder(Pointer ent, byte offset);
	Pointer get_entity_link(Pointer ent);
	void set_entity_link(Pointer ent, Pointer l);
	Pointer get_entity_irg(Pointer ent);
	void set_entity_irg(Pointer ent, Pointer irg);
	int get_entity_vtable_number(Pointer ent);
	void set_entity_vtable_number(Pointer ent, int vtable_number);
	/* ir_peculiarity */int get_entity_peculiarity(Pointer ent);
	void set_entity_peculiarity(Pointer ent, /* ir_peculiarity */int pec);
	int is_entity_final(Pointer ent);
	void set_entity_final(Pointer ent, int _final);
	int is_entity_compiler_generated(Pointer ent);
	void set_entity_compiler_generated(Pointer ent, int flag);
	int is_entity_backend_marked(Pointer ent);
	void set_entity_backend_marked(Pointer ent, int flag);
	/* ir_entity_usage */int get_entity_usage(Pointer ent);
	void set_entity_usage(Pointer ent, /* ir_entity_usage */int flag);
	Pointer get_entity_dbg_info(Pointer ent);
	void set_entity_dbg_info(Pointer ent, Pointer db);
	int is_irn_const_expression(Pointer n);
	Pointer copy_const_value(Pointer dbg, Pointer n);
	Pointer get_atomic_ent_value(Pointer ent);
	void set_atomic_ent_value(Pointer ent, Pointer val);
	/* ir_initializer_kind_t */int get_initializer_kind(Pointer initializer);
	Pointer get_initializer_null();
	Pointer create_initializer_const(Pointer value);
	Pointer create_initializer_tarval(Pointer tv);
	Pointer get_initializer_const_value(Pointer initializer);
	Pointer get_initializer_tarval_value(Pointer initialzier);
	Pointer create_initializer_compound(int n_entries);
	int get_initializer_compound_n_entries(Pointer initializer);
	void set_initializer_compound_value(Pointer initializer, int index, Pointer value);
	Pointer get_initializer_compound_value(Pointer initializer, int index);
	Pointer new_compound_graph_path(Pointer tp, int length);
	int is_compound_graph_path(Pointer thing);
	void free_compound_graph_path(Pointer gr);
	int get_compound_graph_path_length(Pointer gr);
	Pointer get_compound_graph_path_node(Pointer gr, int pos);
	void set_compound_graph_path_node(Pointer gr, int pos, Pointer node);
	int get_compound_graph_path_array_index(Pointer gr, int pos);
	void set_compound_graph_path_array_index(Pointer gr, int pos, int index);
	Pointer get_compound_graph_path_type(Pointer gr);
	int is_proper_compound_graph_path(Pointer gr, int pos);
	void add_compound_ent_value_w_path(Pointer ent, Pointer val, Pointer path);
	void set_compound_ent_value_w_path(Pointer ent, Pointer val, Pointer path, int pos);
	int get_compound_ent_n_values(Pointer ent);
	Pointer get_compound_ent_value(Pointer ent, int pos);
	Pointer get_compound_ent_value_path(Pointer ent, int pos);
	Pointer get_compound_ent_value_by_path(Pointer ent, Pointer path);
	void remove_compound_ent_value(Pointer ent, Pointer value_ent);
	void add_compound_ent_value(Pointer ent, Pointer val, Pointer member);
	Pointer get_compound_ent_value_member(Pointer ent, int pos);
	void set_compound_ent_value(Pointer ent, Pointer val, Pointer member, int pos);
	void set_entity_initializer(Pointer entity, Pointer initializer);
	Pointer get_entity_initializer(Pointer entity);
	void set_array_entity_values(Pointer ent, Pointer[] values, int num_vals);
	int get_compound_ent_value_offset_bit_remainder(Pointer ent, int pos);
	int get_compound_ent_value_offset_bytes(Pointer ent, int pos);
	void add_entity_overwrites(Pointer ent, Pointer overwritten);
	int get_entity_n_overwrites(Pointer ent);
	int get_entity_overwrites_index(Pointer ent, Pointer overwritten);
	Pointer get_entity_overwrites(Pointer ent, int pos);
	void set_entity_overwrites(Pointer ent, int pos, Pointer overwritten);
	void remove_entity_overwrites(Pointer ent, Pointer overwritten);
	void add_entity_overwrittenby(Pointer ent, Pointer overwrites);
	int get_entity_n_overwrittenby(Pointer ent);
	int get_entity_overwrittenby_index(Pointer ent, Pointer overwrites);
	Pointer get_entity_overwrittenby(Pointer ent, int pos);
	void set_entity_overwrittenby(Pointer ent, int pos, Pointer overwrites);
	void remove_entity_overwrittenby(Pointer ent, Pointer overwrites);
	int is_entity(Pointer thing);
	int is_atomic_entity(Pointer ent);
	int is_compound_entity(Pointer ent);
	int is_method_entity(Pointer ent);
	int equal_entity(Pointer ent1, Pointer ent2);
	NativeLong get_entity_nr(Pointer ent);
	NativeLong get_entity_visited(Pointer ent);
	void set_entity_visited(Pointer ent, NativeLong num);
	void mark_entity_visited(Pointer ent);
	int entity_visited(Pointer ent);
	int entity_not_visited(Pointer ent);
	int get_entity_additional_properties(Pointer ent);
	void set_entity_additional_properties(Pointer ent, int property_mask);
	void set_entity_additional_property(Pointer ent, /* mtp_additional_property */int flag);
	Pointer get_entity_repr_class(Pointer ent);
	Pointer get_unknown_entity();
	String get_tpop_name(Pointer op);
	/* tp_opcode */int get_tpop_code(Pointer op);
	Pointer get_tpop_ident(Pointer op);
	Pointer get_tpop_class();
	Pointer get_tpop_struct();
	Pointer get_tpop_method();
	Pointer get_tpop_union();
	Pointer get_tpop_array();
	Pointer get_tpop_enumeration();
	Pointer get_tpop_pointer();
	Pointer get_tpop_primitive();
	Pointer get_tpop_id();
	Pointer get_tpop_none();
	Pointer get_tpop_unknown();
	int is_SubClass_of(Pointer low, Pointer high);
	int is_SubClass_ptr_of(Pointer low, Pointer high);
	int is_overwritten_by(Pointer high, Pointer low);
	Pointer resolve_ent_polymorphy(Pointer dynamic_class, Pointer static_ent);
	Pointer default_mangle_inherited_name(Pointer ent, Pointer clss);
	void resolve_inheritance(Pointer mfunc);
	void set_irp_inh_transitive_closure_state(/* inh_transitive_closure_state */int s);
	void invalidate_irp_inh_transitive_closure_state();
	/* inh_transitive_closure_state */int get_irp_inh_transitive_closure_state();
	void compute_inh_transitive_closure();
	void free_inh_transitive_closure();
	Pointer get_class_trans_subtype_first(Pointer tp);
	Pointer get_class_trans_subtype_next(Pointer tp);
	int is_class_trans_subtype(Pointer tp, Pointer subtp);
	Pointer get_class_trans_supertype_first(Pointer tp);
	Pointer get_class_trans_supertype_next(Pointer tp);
	Pointer get_entity_trans_overwrittenby_first(Pointer ent);
	Pointer get_entity_trans_overwrittenby_next(Pointer ent);
	Pointer get_entity_trans_overwrites_first(Pointer ent);
	Pointer get_entity_trans_overwrites_next(Pointer ent);
	String get_class_cast_state_string(/* ir_class_cast_state */int s);
	void set_irg_class_cast_state(Pointer irg, /* ir_class_cast_state */int s);
	/* ir_class_cast_state */int get_irg_class_cast_state(Pointer irg);
	void set_irp_class_cast_state(/* ir_class_cast_state */int s);
	/* ir_class_cast_state */int get_irp_class_cast_state();
	void verify_irg_class_cast_state(Pointer irg);
	int check_type(Pointer tp);
	int check_entity(Pointer ent);
	int tr_vrfy();
	void exchange_types(Pointer old_type, Pointer new_type);
	Pointer skip_tid(Pointer tp);
	void free_type_entities(Pointer tp);
	void free_type(Pointer tp);
	Pointer get_type_tpop(Pointer tp);
	Pointer get_type_tpop_nameid(Pointer tp);
	String get_type_tpop_name(Pointer tp);
	/* tp_opcode */int get_type_tpop_code(Pointer tp);
	Pointer get_type_ident(Pointer tp);
	void set_type_ident(Pointer tp, Pointer id);
	String get_type_name(Pointer tp);
	/* ir_visibility */int get_type_visibility(Pointer tp);
	void set_type_visibility(Pointer tp, /* ir_visibility */int v);
	String get_type_state_name(/* ir_type_state */int s);
	/* ir_type_state */int get_type_state(Pointer tp);
	void set_type_state(Pointer tp, /* ir_type_state */int state);
	Pointer get_type_mode(Pointer tp);
	void set_type_mode(Pointer tp, Pointer m);
	int get_type_size_bytes(Pointer tp);
	void set_type_size_bytes(Pointer tp, int size);
	int get_type_alignment_bytes(Pointer tp);
	void set_type_alignment_bytes(Pointer tp, int align);
	NativeLong get_type_visited(Pointer tp);
	void set_type_visited(Pointer tp, NativeLong num);
	void mark_type_visited(Pointer tp);
	int type_visited(Pointer tp);
	int type_not_visited(Pointer tp);
	Pointer get_type_link(Pointer tp);
	void set_type_link(Pointer tp, Pointer l);
	void set_master_type_visited(NativeLong val);
	NativeLong get_master_type_visited();
	void inc_master_type_visited();
	void set_type_dbg_info(Pointer tp, Pointer db);
	Pointer get_type_dbg_info(Pointer tp);
	int is_type(Pointer thing);
	int equal_type(Pointer typ1, Pointer typ2);
	int smaller_type(Pointer st, Pointer lt);
	Pointer new_type_class(Pointer name);
	Pointer new_d_type_class(Pointer name, Pointer db);
	void add_class_member(Pointer clss, Pointer member);
	int get_class_n_members(Pointer clss);
	Pointer get_class_member(Pointer clss, int pos);
	int get_class_member_index(Pointer clss, Pointer mem);
	Pointer get_class_member_by_name(Pointer clss, Pointer name);
	void set_class_member(Pointer clss, Pointer member, int pos);
	void set_class_members(Pointer clss, Pointer[] members, int arity);
	void remove_class_member(Pointer clss, Pointer member);
	void add_class_subtype(Pointer clss, Pointer subtype);
	int get_class_n_subtypes(Pointer clss);
	Pointer get_class_subtype(Pointer clss, int pos);
	int get_class_subtype_index(Pointer clss, Pointer subclass);
	void set_class_subtype(Pointer clss, Pointer subtype, int pos);
	void remove_class_subtype(Pointer clss, Pointer subtype);
	void add_class_supertype(Pointer clss, Pointer supertype);
	int get_class_n_supertypes(Pointer clss);
	int get_class_supertype_index(Pointer clss, Pointer super_clss);
	Pointer get_class_supertype(Pointer clss, int pos);
	void set_class_supertype(Pointer clss, Pointer supertype, int pos);
	void remove_class_supertype(Pointer clss, Pointer supertype);
	String get_peculiarity_name(/* ir_peculiarity */int p);
	/* ir_peculiarity */int get_class_peculiarity(Pointer clss);
	void set_class_peculiarity(Pointer clss, /* ir_peculiarity */int pec);
	Pointer get_class_type_info(Pointer clss);
	void set_class_type_info(Pointer clss, Pointer ent);
	int get_class_vtable_size(Pointer clss);
	void set_class_vtable_size(Pointer clss, int size);
	int is_class_final(Pointer clss);
	void set_class_final(Pointer clss, int flag);
	int is_class_interface(Pointer clss);
	void set_class_interface(Pointer clss, int flag);
	int is_class_abstract(Pointer clss);
	void set_class_abstract(Pointer clss, int flag);
	void set_class_dfn(Pointer clss, int dfn);
	int get_class_dfn(Pointer clss);
	int is_Class_type(Pointer clss);
	Pointer new_type_struct(Pointer name);
	Pointer new_d_type_struct(Pointer name, Pointer db);
	void add_struct_member(Pointer strct, Pointer member);
	int get_struct_n_members(Pointer strct);
	Pointer get_struct_member(Pointer strct, int pos);
	int get_struct_member_index(Pointer strct, Pointer member);
	void set_struct_member(Pointer strct, int pos, Pointer member);
	void remove_struct_member(Pointer strct, Pointer member);
	int is_Struct_type(Pointer strct);
	Pointer new_type_method(Pointer name, int n_param, int n_res);
	Pointer new_d_type_method(Pointer name, int n_param, int n_res, Pointer db);
	Pointer clone_type_method(Pointer tp, Pointer prefix);
	int get_method_n_params(Pointer method);
	Pointer get_method_param_type(Pointer method, int pos);
	void set_method_param_type(Pointer method, int pos, Pointer tp);
	Pointer get_method_value_param_ent(Pointer method, int pos);
	Pointer get_method_value_param_type(Pointer method);
	Pointer get_method_param_ident(Pointer method, int pos);
	String get_method_param_name(Pointer method, int pos);
	void set_method_param_ident(Pointer method, int pos, Pointer id);
	int get_method_n_ress(Pointer method);
	Pointer get_method_res_type(Pointer method, int pos);
	void set_method_res_type(Pointer method, int pos, Pointer tp);
	Pointer get_method_value_res_ent(Pointer method, int pos);
	Pointer get_method_value_res_type(Pointer method);
	String get_variadicity_name(/* variadicity */int vari);
	/* variadicity */int get_method_variadicity(Pointer method);
	void set_method_variadicity(Pointer method, /* variadicity */int vari);
	int get_method_first_variadic_param_index(Pointer method);
	void set_method_first_variadic_param_index(Pointer method, int index);
	int get_method_additional_properties(Pointer method);
	void set_method_additional_properties(Pointer method, int property_mask);
	void set_method_additional_property(Pointer method, /* mtp_additional_property */int flag);
	int get_default_cc_mask();
	int get_method_calling_convention(Pointer method);
	void set_method_calling_convention(Pointer method, int cc_mask);
	int get_method_n_regparams(Pointer method);
	void set_method_n_regparams(Pointer method, int n_regs);
	int is_Method_type(Pointer method);
	Pointer new_type_union(Pointer name);
	Pointer new_d_type_union(Pointer name, Pointer db);
	int get_union_n_members(Pointer uni);
	void add_union_member(Pointer uni, Pointer member);
	Pointer get_union_member(Pointer uni, int pos);
	int get_union_member_index(Pointer uni, Pointer member);
	void set_union_member(Pointer uni, int pos, Pointer member);
	void remove_union_member(Pointer uni, Pointer member);
	int is_Union_type(Pointer uni);
	Pointer new_type_array(Pointer name, int n_dims, Pointer element_type);
	Pointer new_d_type_array(Pointer name, int n_dims, Pointer element_type, Pointer db);
	int get_array_n_dimensions(Pointer array);
	void set_array_bounds_int(Pointer array, int dimension, int lower_bound, int upper_bound);
	void set_array_bounds(Pointer array, int dimension, Pointer lower_bound, Pointer upper_bound);
	void set_array_lower_bound(Pointer array, int dimension, Pointer lower_bound);
	void set_array_lower_bound_int(Pointer array, int dimension, int lower_bound);
	void set_array_upper_bound(Pointer array, int dimension, Pointer upper_bound);
	void set_array_upper_bound_int(Pointer array, int dimension, int upper_bound);
	int has_array_lower_bound(Pointer array, int dimension);
	Pointer get_array_lower_bound(Pointer array, int dimension);
	NativeLong get_array_lower_bound_int(Pointer array, int dimension);
	int has_array_upper_bound(Pointer array, int dimension);
	Pointer get_array_upper_bound(Pointer array, int dimension);
	NativeLong get_array_upper_bound_int(Pointer array, int dimension);
	void set_array_order(Pointer array, int dimension, int order);
	int get_array_order(Pointer array, int dimension);
	int find_array_dimension(Pointer array, int order);
	void set_array_element_type(Pointer array, Pointer tp);
	Pointer get_array_element_type(Pointer array);
	void set_array_element_entity(Pointer array, Pointer ent);
	Pointer get_array_element_entity(Pointer array);
	int is_Array_type(Pointer array);
	Pointer new_type_enumeration(Pointer name, int n_enums);
	Pointer new_d_type_enumeration(Pointer name, int n_enums, Pointer db);
	void set_enumeration_const(Pointer enumeration, int pos, Pointer nameid, Pointer con);
	int get_enumeration_n_enums(Pointer enumeration);
	Pointer get_enumeration_const(Pointer enumeration, int pos);
	Pointer get_enumeration_owner(Pointer enum_cnst);
	void set_enumeration_value(Pointer enum_cnst, Pointer con);
	Pointer get_enumeration_value(Pointer enum_cnst);
	void set_enumeration_nameid(Pointer enum_cnst, Pointer id);
	Pointer get_enumeration_nameid(Pointer enum_cnst);
	String get_enumeration_name(Pointer enum_cnst);
	int is_Enumeration_type(Pointer enumeration);
	Pointer new_type_pointer(Pointer name, Pointer points_to, Pointer ptr_mode);
	Pointer new_d_type_pointer(Pointer name, Pointer points_to, Pointer ptr_mode, Pointer db);
	void set_pointer_points_to_type(Pointer pointer, Pointer tp);
	Pointer get_pointer_points_to_type(Pointer pointer);
	int is_Pointer_type(Pointer pointer);
	Pointer find_pointer_type_to_type(Pointer tp);
	Pointer new_type_primitive(Pointer name, Pointer mode);
	Pointer new_d_type_primitive(Pointer name, Pointer mode, Pointer db);
	int is_Primitive_type(Pointer primitive);
	Pointer get_primitive_base_type(Pointer tp);
	void set_primitive_base_type(Pointer tp, Pointer base_tp);
	Pointer get_none_type();
	Pointer get_unknown_type();
	int is_atomic_type(Pointer tp);
	int get_compound_n_members(Pointer tp);
	Pointer get_compound_member(Pointer tp, int pos);
	int get_compound_member_index(Pointer tp, Pointer member);
	int is_compound_type(Pointer tp);
	int is_frame_type(Pointer tp);
	int is_value_param_type(Pointer tp);
	int is_lowered_type(Pointer tp);
	Pointer new_type_frame(Pointer name);
	Pointer clone_frame_type(Pointer type);
	void set_lowered_type(Pointer tp, Pointer lowered_type);
	Pointer get_associated_type(Pointer tp);
	Pointer frame_alloc_area(Pointer frame_type, int size, int alignment, int at_start);
	NativeLong get_type_nr(Pointer tp);
	int compare_names(Pointer tp1, Pointer tp2);
	int compare_strict(Pointer tp1, Pointer tp2);
	int firm_hash_name(Pointer tp);
	Pointer mature_type(Pointer tp);
	Pointer mature_type_free(Pointer tp);
	Pointer mature_type_free_entities(Pointer tp);
	void init_type_identify(Pointer ti_if);
	void type_walk(Pointer pre, Pointer post, Pointer env);
	void type_walk_irg(Pointer irg, Pointer pre, Pointer post, Pointer env);
	void type_walk_super2sub(Pointer pre, Pointer post, Pointer env);
	void type_walk_super(Pointer pre, Pointer post, Pointer env);
	void class_walk_super2sub(Pointer pre, Pointer post, Pointer env);
	void walk_types_entities(Pointer tp, Pointer doit, Pointer env);
	void types_calc_finalization();
}
