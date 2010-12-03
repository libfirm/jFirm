package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_ircons {
	static {
		Native.register("firm");
	}

	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned(),
		op_pin_state_mem_pinned();
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
		mtp_no_property(0x00000000),
		mtp_property_const(0x00000001),
		mtp_property_pure(0x00000002),
		mtp_property_noreturn(0x00000004),
		mtp_property_nothrow(0x00000008),
		mtp_property_naked(0x00000010),
		mtp_property_malloc(0x00000020),
		mtp_property_returns_twice(0x00000040),
		mtp_property_intrinsic(0x00000080),
		mtp_property_runtime(0x00000100),
		mtp_property_private(0x00000200),
		mtp_property_has_loop(0x00000400),
		mtp_property_inherited((1 << 31));
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
		symconst_type_tag(),
		symconst_type_size(),
		symconst_type_align(),
		symconst_addr_ent(),
		symconst_ofs_ent(),
		symconst_enum_const();
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

	public static enum ir_where_alloc {
		stack_alloc(),
		heap_alloc();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_where_alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_where_alloc() {
			this.val = C.next_val++;
		}

		public static ir_where_alloc getEnum(int val) {
			for (ir_where_alloc entry : values()) {
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
		ir_bk_inner_trampoline();
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

	public static enum pn_generic {
		pn_Generic_M(0),
		pn_Generic_X_regular(1),
		pn_Generic_X_except(2),
		pn_Generic_other(3);
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_generic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_generic() {
			this.val = C.next_val++;
		}

		public static pn_generic getEnum(int val) {
			for (pn_generic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_value_classify_sign {
		value_classified_unknown(0),
		value_classified_positive(1),
		value_classified_negative(-1);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_value_classify_sign(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_value_classify_sign() {
			this.val = C.next_val++;
		}

		public static ir_value_classify_sign getEnum(int val) {
			for (ir_value_classify_sign entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum firm_kind {
		k_BAD(0),
		k_entity(),
		k_type(),
		k_ir_graph(),
		k_ir_node(),
		k_ir_mode(),
		k_ir_op(),
		k_tarval(),
		k_ir_loop(),
		k_ir_compound_graph_path(),
		k_ir_extblk(),
		k_ir_prog(),
		k_ir_region(),
		k_ir_graph_pass(),
		k_ir_prog_pass(),
		k_ir_graph_pass_mgr(),
		k_ir_prog_pass_mgr(),
		k_ir_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		firm_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		firm_kind() {
			this.val = C.next_val++;
		}

		public static firm_kind getEnum(int val) {
			for (firm_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_visibility {
		ir_visibility_default(),
		ir_visibility_local(),
		ir_visibility_external(),
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
		IR_LINKAGE_HIDDEN_USER((1 << 4));
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
		align_non_aligned(),
		align_is_aligned();
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
		tpo_enumeration(),
		tpo_pointer(),
		tpo_primitive(),
		tpo_code(),
		tpo_none(),
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

	public static enum ir_class_cast_state {
		ir_class_casts_any(0),
		ir_class_casts_transitive(1),
		ir_class_casts_normalized(2),
		ir_class_casts_state_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_class_cast_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_class_cast_state() {
			this.val = C.next_val++;
		}

		public static ir_class_cast_state getEnum(int val) {
			for (ir_class_cast_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum trverify_error_codes {
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

		private static class C {
			static int next_val;
		}

		trverify_error_codes(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		trverify_error_codes() {
			this.val = C.next_val++;
		}

		public static trverify_error_codes getEnum(int val) {
			for (trverify_error_codes entry : values()) {
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

	public static enum __codecvt_result {
		__codecvt_ok(),
		__codecvt_partial(),
		__codecvt_error(),
		__codecvt_noconv();
		public final int val;

		private static class C {
			static int next_val;
		}

		__codecvt_result(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		__codecvt_result() {
			this.val = C.next_val++;
		}

		public static __codecvt_result getEnum(int val) {
			for (__codecvt_result entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_opcode {
		iro_ASM(),
		iro_Add(),
		iro_Alloc(),
		iro_Anchor(),
		iro_And(),
		iro_Bad(),
		iro_Block(),
		iro_Borrow(),
		iro_Bound(),
		iro_Builtin(),
		iro_Call(),
		iro_Carry(),
		iro_Cast(),
		iro_Cmp(),
		iro_Cond(),
		iro_Confirm(),
		iro_Const(),
		iro_Conv(),
		iro_CopyB(),
		iro_Deleted(),
		iro_Div(),
		iro_DivMod(),
		iro_Dummy(),
		iro_End(),
		iro_Eor(),
		iro_Free(),
		iro_IJmp(),
		iro_Id(),
		iro_InstOf(),
		iro_Jmp(),
		iro_Load(),
		iro_Minus(),
		iro_Mod(),
		iro_Mul(),
		iro_Mulh(),
		iro_Mux(),
		iro_NoMem(),
		iro_Not(),
		iro_Or(),
		iro_Phi(),
		iro_Pin(),
		iro_Proj(),
		iro_Quot(),
		iro_Raise(),
		iro_Return(),
		iro_Rotl(),
		iro_Sel(),
		iro_Shl(),
		iro_Shr(),
		iro_Shrs(),
		iro_Start(),
		iro_Store(),
		iro_Sub(),
		iro_SymConst(),
		iro_Sync(),
		iro_Tuple(),
		iro_Unknown(),
		iro_First(ir_opcode.iro_ASM.val),
		iro_Last(ir_opcode.iro_Unknown.val),
		beo_First(),
		beo_Spill(ir_opcode.beo_First.val),
		beo_Reload(),
		beo_Perm(),
		beo_MemPerm(),
		beo_Copy(),
		beo_Keep(),
		beo_CopyKeep(),
		beo_Call(),
		beo_Return(),
		beo_AddSP(),
		beo_SubSP(),
		beo_IncSP(),
		beo_Start(),
		beo_FrameAddr(),
		beo_Barrier(),
		beo_Last(ir_opcode.beo_Barrier.val),
		iro_MaxOpcode();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_opcode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_opcode() {
			this.val = C.next_val++;
		}

		public static ir_opcode getEnum(int val) {
			for (ir_opcode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum op_arity {
		oparity_invalid(0),
		oparity_unary(),
		oparity_binary(),
		oparity_trinary(),
		oparity_zero(),
		oparity_variable(),
		oparity_dynamic(),
		oparity_any();
		public final int val;

		private static class C {
			static int next_val;
		}

		op_arity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		op_arity() {
			this.val = C.next_val++;
		}

		public static op_arity getEnum(int val) {
			for (op_arity entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum irop_flags {
		irop_flag_none(0),
		irop_flag_labeled((1 << 0)),
		irop_flag_commutative((1 << 1)),
		irop_flag_cfopcode((1 << 2)),
		irop_flag_fragile((1 << 3)),
		irop_flag_forking((1 << 4)),
		irop_flag_highlevel((1 << 5)),
		irop_flag_constlike((1 << 6)),
		irop_flag_always_opt((1 << 7)),
		irop_flag_keep((1 << 8)),
		irop_flag_start_block((1 << 9)),
		irop_flag_uses_memory((1 << 10)),
		irop_flag_dump_noblock((1 << 11)),
		irop_flag_dump_noinput((1 << 12)),
		irop_flag_machine((1 << 13)),
		irop_flag_machine_op((1 << 14)),
		irop_flag_cse_neutral((1 << 15)),
		irop_flag_user((1 << 16));
		public final int val;

		private static class C {
			static int next_val;
		}

		irop_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irop_flags() {
			this.val = C.next_val++;
		}

		public static irop_flags getEnum(int val) {
			for (irop_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum dump_reason_t {
		dump_node_opcode_txt(),
		dump_node_mode_txt(),
		dump_node_nodeattr_txt(),
		dump_node_info_txt();
		public final int val;

		private static class C {
			static int next_val;
		}

		dump_reason_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		dump_reason_t() {
			this.val = C.next_val++;
		}

		public static dump_reason_t getEnum(int val) {
			for (dump_reason_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_mode_sort_helper {
		irmsh_is_num(0x10),
		irmsh_is_data(0x20),
		irmsh_is_datab(0x40),
		irmsh_is_dataM(0x80);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_mode_sort_helper(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_mode_sort_helper() {
			this.val = C.next_val++;
		}

		public static ir_mode_sort_helper getEnum(int val) {
			for (ir_mode_sort_helper entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_mode_sort {
		irms_auxiliary(0),
		irms_control_flow(1),
		irms_memory((2 | ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_internal_boolean((3 | ir_mode_sort_helper.irmsh_is_datab.val)),
		irms_reference((((4 | ir_mode_sort_helper.irmsh_is_data.val) | ir_mode_sort_helper.irmsh_is_datab.val) | ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_int_number(((((5 | ir_mode_sort_helper.irmsh_is_data.val) | ir_mode_sort_helper.irmsh_is_datab.val) | ir_mode_sort_helper.irmsh_is_dataM.val) | ir_mode_sort_helper.irmsh_is_num.val)),
		irms_float_number(((((6 | ir_mode_sort_helper.irmsh_is_data.val) | ir_mode_sort_helper.irmsh_is_datab.val) | ir_mode_sort_helper.irmsh_is_dataM.val) | ir_mode_sort_helper.irmsh_is_num.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_mode_sort(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_mode_sort() {
			this.val = C.next_val++;
		}

		public static ir_mode_sort getEnum(int val) {
			for (ir_mode_sort entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_mode_arithmetic {
		irma_uninitialized(0),
		irma_none(1),
		irma_twos_complement(2),
		irma_ones_complement(),
		irma_int_BCD(),
		irma_ieee754(256),
		irma_float_BCD(),
		irma_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_mode_arithmetic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_mode_arithmetic() {
			this.val = C.next_val++;
		}

		public static ir_mode_arithmetic getEnum(int val) {
			for (ir_mode_arithmetic entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Alloc {
		pn_Alloc_M(pn_generic.pn_Generic_M.val),
		pn_Alloc_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Alloc_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Alloc_res(pn_generic.pn_Generic_other.val),
		pn_Alloc_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Alloc() {
			this.val = C.next_val++;
		}

		public static pn_Alloc getEnum(int val) {
			for (pn_Alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Bound {
		pn_Bound_M(pn_generic.pn_Generic_M.val),
		pn_Bound_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Bound_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Bound_res(pn_generic.pn_Generic_other.val),
		pn_Bound_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Bound(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Bound() {
			this.val = C.next_val++;
		}

		public static pn_Bound getEnum(int val) {
			for (pn_Bound entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Builtin {
		pn_Builtin_M(pn_generic.pn_Generic_M.val),
		pn_Builtin_1_result(pn_generic.pn_Generic_other.val),
		pn_Builtin_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Builtin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Builtin() {
			this.val = C.next_val++;
		}

		public static pn_Builtin getEnum(int val) {
			for (pn_Builtin entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Call {
		pn_Call_M(pn_generic.pn_Generic_M.val),
		pn_Call_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Call_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Call_T_result(pn_generic.pn_Generic_other.val),
		pn_Call_P_value_res_base(),
		pn_Call_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Call(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Call() {
			this.val = C.next_val++;
		}

		public static pn_Call getEnum(int val) {
			for (pn_Call entry : values()) {
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
		pn_Cmp_Le((pn_Cmp.pn_Cmp_Eq.val | pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Gt(4),
		pn_Cmp_Ge((pn_Cmp.pn_Cmp_Eq.val | pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Lg((pn_Cmp.pn_Cmp_Lt.val | pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Leg(((pn_Cmp.pn_Cmp_Lt.val | pn_Cmp.pn_Cmp_Eq.val) | pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uo(8),
		pn_Cmp_Ue((pn_Cmp.pn_Cmp_Uo.val | pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ul((pn_Cmp.pn_Cmp_Uo.val | pn_Cmp.pn_Cmp_Lt.val)),
		pn_Cmp_Ule(((pn_Cmp.pn_Cmp_Uo.val | pn_Cmp.pn_Cmp_Lt.val) | pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ug((pn_Cmp.pn_Cmp_Uo.val | pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_Uge(((pn_Cmp.pn_Cmp_Uo.val | pn_Cmp.pn_Cmp_Gt.val) | pn_Cmp.pn_Cmp_Eq.val)),
		pn_Cmp_Ne(((pn_Cmp.pn_Cmp_Uo.val | pn_Cmp.pn_Cmp_Lt.val) | pn_Cmp.pn_Cmp_Gt.val)),
		pn_Cmp_True(15),
		pn_Cmp_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Cmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Cmp() {
			this.val = C.next_val++;
		}

		public static pn_Cmp getEnum(int val) {
			for (pn_Cmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Cond {
		pn_Cond_false(),
		pn_Cond_true(),
		pn_Cond_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Cond(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Cond() {
			this.val = C.next_val++;
		}

		public static pn_Cond getEnum(int val) {
			for (pn_Cond entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_CopyB {
		pn_CopyB_M(pn_generic.pn_Generic_M.val),
		pn_CopyB_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_CopyB_X_except(pn_generic.pn_Generic_X_except.val),
		pn_CopyB_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_CopyB(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_CopyB() {
			this.val = C.next_val++;
		}

		public static pn_CopyB getEnum(int val) {
			for (pn_CopyB entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Div {
		pn_Div_M(pn_generic.pn_Generic_M.val),
		pn_Div_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Div_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Div_res(pn_generic.pn_Generic_other.val),
		pn_Div_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Div(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Div() {
			this.val = C.next_val++;
		}

		public static pn_Div getEnum(int val) {
			for (pn_Div entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_DivMod {
		pn_DivMod_M(pn_generic.pn_Generic_M.val),
		pn_DivMod_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_DivMod_X_except(pn_generic.pn_Generic_X_except.val),
		pn_DivMod_res_div(pn_generic.pn_Generic_other.val),
		pn_DivMod_res_mod(),
		pn_DivMod_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_DivMod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_DivMod() {
			this.val = C.next_val++;
		}

		public static pn_DivMod getEnum(int val) {
			for (pn_DivMod entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_InstOf {
		pn_InstOf_M(pn_generic.pn_Generic_M.val),
		pn_InstOf_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_InstOf_X_except(pn_generic.pn_Generic_X_except.val),
		pn_InstOf_res(pn_generic.pn_Generic_other.val),
		pn_InstOf_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_InstOf(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_InstOf() {
			this.val = C.next_val++;
		}

		public static pn_InstOf getEnum(int val) {
			for (pn_InstOf entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Load {
		pn_Load_M(pn_generic.pn_Generic_M.val),
		pn_Load_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Load_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Load_res(pn_generic.pn_Generic_other.val),
		pn_Load_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Load(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Load() {
			this.val = C.next_val++;
		}

		public static pn_Load getEnum(int val) {
			for (pn_Load entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Mod {
		pn_Mod_M(pn_generic.pn_Generic_M.val),
		pn_Mod_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Mod_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Mod_res(pn_generic.pn_Generic_other.val),
		pn_Mod_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Mod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Mod() {
			this.val = C.next_val++;
		}

		public static pn_Mod getEnum(int val) {
			for (pn_Mod entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Quot {
		pn_Quot_M(pn_generic.pn_Generic_M.val),
		pn_Quot_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Quot_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Quot_res(pn_generic.pn_Generic_other.val),
		pn_Quot_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Quot(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Quot() {
			this.val = C.next_val++;
		}

		public static pn_Quot getEnum(int val) {
			for (pn_Quot entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Raise {
		pn_Raise_M(pn_generic.pn_Generic_M.val),
		pn_Raise_X(pn_generic.pn_Generic_X_regular.val),
		pn_Raise_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Raise(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Raise() {
			this.val = C.next_val++;
		}

		public static pn_Raise getEnum(int val) {
			for (pn_Raise entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Start {
		pn_Start_X_initial_exec(),
		pn_Start_M(),
		pn_Start_P_frame_base(),
		pn_Start_P_tls(),
		pn_Start_T_args(),
		pn_Start_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Start(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Start() {
			this.val = C.next_val++;
		}

		public static pn_Start getEnum(int val) {
			for (pn_Start entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Store {
		pn_Store_M(pn_generic.pn_Generic_M.val),
		pn_Store_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_Store_X_except(pn_generic.pn_Generic_X_except.val),
		pn_Store_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Store(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Store() {
			this.val = C.next_val++;
		}

		public static pn_Store getEnum(int val) {
			for (pn_Store entry : values()) {
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
		cons_floats((1 << 2));
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


	public static native Pointer new_rd_Block(Pointer db, Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Start(Pointer db, Pointer irg);

	public static native Pointer new_rd_End(Pointer db, Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Jmp(Pointer db, Pointer block);

	public static native Pointer new_rd_IJmp(Pointer db, Pointer block, Pointer tgt);

	public static native Pointer new_rd_Cond(Pointer db, Pointer block, Pointer c);

	public static native Pointer new_rd_Return(Pointer db, Pointer block, Pointer store, int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Const(Pointer db, Pointer irg, Pointer con);

	public static native Pointer new_rd_Const_long(Pointer db, Pointer irg, Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_rd_SymConst_addr_ent(Pointer db, Pointer irg, Pointer mode, Pointer symbol);

	public static native Pointer new_rd_SymConst_ofs_ent(Pointer db, Pointer irg, Pointer mode, Pointer symbol);

	public static native Pointer new_rd_SymConst_type_tag(Pointer db, Pointer irg, Pointer mode, Pointer symbol);

	public static native Pointer new_rd_SymConst_size(Pointer db, Pointer irg, Pointer mode, Pointer symbol);

	public static native Pointer new_rd_SymConst_align(Pointer db, Pointer irg, Pointer mode, Pointer symbol);

	public static native Pointer new_rd_simpleSel(Pointer db, Pointer block, Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_rd_Sel(Pointer db, Pointer block, Pointer store, Pointer objptr, int n_index, java.nio.Buffer index, Pointer ent);

	public static native Pointer new_rd_Call(Pointer db, Pointer block, Pointer store, Pointer callee, int arity, java.nio.Buffer in, Pointer tp);

	public static native Pointer new_rd_Builtin(Pointer db, Pointer block, Pointer store, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer tp);

	public static native Pointer new_rd_Add(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Sub(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Minus(Pointer db, Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_rd_Mul(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Mulh(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Quot(Pointer db, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_rd_DivMod(Pointer db, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_rd_Div(Pointer db, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_rd_DivRL(Pointer db, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_rd_Mod(Pointer db, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_rd_And(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Or(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Eor(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Not(Pointer db, Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_rd_Cmp(Pointer db, Pointer block, Pointer op1, Pointer op2);

	public static native Pointer new_rd_Shl(Pointer db, Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_rd_Shr(Pointer db, Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_rd_Shrs(Pointer db, Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_rd_Rotl(Pointer db, Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_rd_Conv(Pointer db, Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_rd_strictConv(Pointer db, Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_rd_Cast(Pointer db, Pointer block, Pointer op, Pointer to_tp);

	public static native Pointer new_rd_Carry(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Borrow(Pointer db, Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_rd_Phi(Pointer db, Pointer block, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_rd_Load(Pointer db, Pointer block, Pointer store, Pointer adr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_rd_Store(Pointer db, Pointer block, Pointer store, Pointer adr, Pointer val, /* ir_cons_flags */int flags);

	public static native Pointer new_rd_Alloc(Pointer db, Pointer block, Pointer store, Pointer count, Pointer alloc_type, /* ir_where_alloc */int where);

	public static native Pointer new_rd_Free(Pointer db, Pointer block, Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);

	public static native Pointer new_rd_Sync(Pointer db, Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Proj(Pointer db, Pointer arg, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_rd_defaultProj(Pointer db, Pointer arg, com.sun.jna.NativeLong max_proj);

	public static native Pointer new_rd_Tuple(Pointer db, Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Id(Pointer db, Pointer block, Pointer val, Pointer mode);

	public static native Pointer new_rd_Bad(Pointer db, Pointer irg);

	public static native Pointer new_rd_Confirm(Pointer db, Pointer block, Pointer val, Pointer bound, /* pn_Cmp */int cmp);

	public static native Pointer new_rd_Unknown(Pointer db, Pointer irg, Pointer m);

	public static native Pointer new_rd_NoMem(Pointer db, Pointer irg);

	public static native Pointer new_rd_Mux(Pointer db, Pointer block, Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);

	public static native Pointer new_rd_CopyB(Pointer db, Pointer block, Pointer store, Pointer dst, Pointer src, Pointer data_type);

	public static native Pointer new_rd_InstOf(Pointer db, Pointer block, Pointer store, Pointer objptr, Pointer type);

	public static native Pointer new_rd_Raise(Pointer db, Pointer block, Pointer store, Pointer obj);

	public static native Pointer new_rd_Bound(Pointer db, Pointer block, Pointer store, Pointer idx, Pointer lower, Pointer upper);

	public static native Pointer new_rd_Pin(Pointer db, Pointer block, Pointer node);

	public static native Pointer new_rd_ASM(Pointer db, Pointer block, int arity, java.nio.Buffer in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native Pointer new_r_Block(Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Start(Pointer irg);

	public static native Pointer new_r_End(Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Jmp(Pointer block);

	public static native Pointer new_r_IJmp(Pointer block, Pointer tgt);

	public static native Pointer new_r_Cond(Pointer block, Pointer c);

	public static native Pointer new_r_Return(Pointer block, Pointer store, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Const(Pointer irg, Pointer con);

	public static native Pointer new_r_Const_long(Pointer irg, Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_r_simpleSel(Pointer block, Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_r_Sel(Pointer block, Pointer store, Pointer objptr, int n_index, java.nio.Buffer index, Pointer ent);

	public static native Pointer new_r_Call(Pointer block, Pointer store, Pointer callee, int arity, java.nio.Buffer in, Pointer tp);

	public static native Pointer new_r_Builtin(Pointer block, Pointer store, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer tp);

	public static native Pointer new_r_Add(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Sub(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Minus(Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_r_Mul(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Mulh(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Quot(Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_r_DivMod(Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_r_Div(Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_r_DivRL(Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_r_Mod(Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_r_And(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Or(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Eor(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Not(Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_r_Cmp(Pointer block, Pointer op1, Pointer op2);

	public static native Pointer new_r_Shl(Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_r_Shr(Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_r_Shrs(Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_r_Rotl(Pointer block, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_r_Conv(Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_r_strictConv(Pointer block, Pointer op, Pointer mode);

	public static native Pointer new_r_Cast(Pointer block, Pointer op, Pointer to_tp);

	public static native Pointer new_r_Carry(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Borrow(Pointer block, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_r_Phi(Pointer block, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_r_Load(Pointer block, Pointer store, Pointer adr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_r_Store(Pointer block, Pointer store, Pointer adr, Pointer val, /* ir_cons_flags */int flags);

	public static native Pointer new_r_Alloc(Pointer block, Pointer store, Pointer count, Pointer alloc_type, /* ir_where_alloc */int where);

	public static native Pointer new_r_Free(Pointer block, Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);

	public static native Pointer new_r_Sync(Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Proj(Pointer arg, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_r_defaultProj(Pointer arg, com.sun.jna.NativeLong max_proj);

	public static native Pointer new_r_Tuple(Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Id(Pointer block, Pointer val, Pointer mode);

	public static native Pointer new_r_Bad(Pointer irg);

	public static native Pointer new_r_Confirm(Pointer block, Pointer val, Pointer bound, /* pn_Cmp */int cmp);

	public static native Pointer new_r_Unknown(Pointer irg, Pointer m);

	public static native Pointer new_r_NoMem(Pointer irg);

	public static native Pointer new_r_Mux(Pointer block, Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);

	public static native Pointer new_r_CopyB(Pointer block, Pointer store, Pointer dst, Pointer src, Pointer data_type);

	public static native Pointer new_r_InstOf(Pointer block, Pointer store, Pointer objptr, Pointer type);

	public static native Pointer new_r_Raise(Pointer block, Pointer store, Pointer obj);

	public static native Pointer new_r_Bound(Pointer block, Pointer store, Pointer idx, Pointer lower, Pointer upper);

	public static native Pointer new_r_Pin(Pointer block, Pointer node);

	public static native Pointer new_r_ASM(Pointer block, int arity, java.nio.Buffer in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native void set_cur_block(Pointer target);

	public static native void set_r_cur_block(Pointer irg, Pointer target);

	public static native Pointer get_cur_block();

	public static native Pointer get_r_cur_block(Pointer irg);

	public static native Pointer new_d_Block(Pointer db, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Start(Pointer db);

	public static native Pointer new_d_End(Pointer db, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Jmp(Pointer db);

	public static native Pointer new_d_IJmp(Pointer db, Pointer tgt);

	public static native Pointer new_d_Cond(Pointer db, Pointer c);

	public static native Pointer new_d_Return(Pointer db, Pointer store, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Const(Pointer db, Pointer con);

	public static native Pointer new_d_Const_long(Pointer db, Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_d_simpleSel(Pointer db, Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_d_Sel(Pointer db, Pointer store, Pointer objptr, int arity, java.nio.Buffer in, Pointer ent);

	public static native Pointer new_d_Call(Pointer db, Pointer store, Pointer callee, int arity, java.nio.Buffer in, Pointer tp);

	public static native Pointer new_d_Builtin(Pointer db, Pointer store, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer tp);

	public static native Pointer new_d_Add(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Sub(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Minus(Pointer db, Pointer op, Pointer mode);

	public static native Pointer new_d_Mul(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Mulh(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Quot(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_d_DivMod(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_d_Div(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_d_DivRL(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_d_Mod(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_d_And(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Or(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Eor(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Not(Pointer db, Pointer op, Pointer mode);

	public static native Pointer new_d_Shl(Pointer db, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_d_Shr(Pointer db, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_d_Shrs(Pointer db, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_d_Rotl(Pointer db, Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_d_Cmp(Pointer db, Pointer op1, Pointer op2);

	public static native Pointer new_d_Conv(Pointer db, Pointer op, Pointer mode);

	public static native Pointer new_d_strictConv(Pointer db, Pointer op, Pointer mode);

	public static native Pointer new_d_Cast(Pointer db, Pointer op, Pointer to_tp);

	public static native Pointer new_d_Carry(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Borrow(Pointer db, Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_d_Phi(Pointer db, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_d_Load(Pointer db, Pointer store, Pointer addr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_d_Store(Pointer db, Pointer store, Pointer addr, Pointer val, /* ir_cons_flags */int flags);

	public static native Pointer new_d_Alloc(Pointer db, Pointer store, Pointer count, Pointer alloc_type, /* ir_where_alloc */int where);

	public static native Pointer new_d_Free(Pointer db, Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);

	public static native Pointer new_d_Sync(Pointer db, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Proj(Pointer db, Pointer arg, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_d_defaultProj(Pointer db, Pointer arg, com.sun.jna.NativeLong max_proj);

	public static native Pointer new_d_Tuple(Pointer db, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Id(Pointer db, Pointer val, Pointer mode);

	public static native Pointer new_d_Bad(Pointer db);

	public static native Pointer new_d_Confirm(Pointer db, Pointer val, Pointer bound, /* pn_Cmp */int cmp);

	public static native Pointer new_d_Unknown(Pointer db, Pointer m);

	public static native Pointer new_d_NoMem(Pointer db);

	public static native Pointer new_d_Mux(Pointer db, Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);

	public static native Pointer new_d_CopyB(Pointer db, Pointer store, Pointer dst, Pointer src, Pointer data_type);

	public static native Pointer new_d_InstOf(Pointer db, Pointer store, Pointer objptr, Pointer type);

	public static native Pointer new_d_Raise(Pointer db, Pointer store, Pointer obj);

	public static native Pointer new_d_Bound(Pointer db, Pointer store, Pointer idx, Pointer lower, Pointer upper);

	public static native Pointer new_d_Pin(Pointer db, Pointer node);

	public static native Pointer new_d_ASM(Pointer db, int arity, java.nio.Buffer in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native Pointer new_Block(int arity, java.nio.Buffer in);

	public static native Pointer new_Start();

	public static native Pointer new_End(int arity, java.nio.Buffer in);

	public static native Pointer new_Jmp();

	public static native Pointer new_IJmp(Pointer tgt);

	public static native Pointer new_Cond(Pointer c);

	public static native Pointer new_Return(Pointer store, int arity, java.nio.Buffer in);

	public static native Pointer new_Const(Pointer con);

	public static native Pointer new_Const_long(Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_simpleSel(Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_Sel(Pointer store, Pointer objptr, int arity, java.nio.Buffer in, Pointer ent);

	public static native Pointer new_Call(Pointer store, Pointer callee, int arity, java.nio.Buffer in, Pointer tp);

	public static native Pointer new_Builtin(Pointer store, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer tp);

	public static native Pointer new_Add(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Sub(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Minus(Pointer op, Pointer mode);

	public static native Pointer new_Mul(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Mulh(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Quot(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_DivMod(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_Div(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_DivRL(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_Mod(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_And(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Or(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Eor(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Not(Pointer op, Pointer mode);

	public static native Pointer new_Shl(Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_Shr(Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_Shrs(Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_Rotl(Pointer op, Pointer k, Pointer mode);

	public static native Pointer new_Cmp(Pointer op1, Pointer op2);

	public static native Pointer new_Conv(Pointer op, Pointer mode);

	public static native Pointer new_strictConv(Pointer op, Pointer mode);

	public static native Pointer new_Cast(Pointer op, Pointer to_tp);

	public static native Pointer new_Carry(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Borrow(Pointer op1, Pointer op2, Pointer mode);

	public static native Pointer new_Phi(int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_Load(Pointer store, Pointer addr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_Store(Pointer store, Pointer addr, Pointer val, /* ir_cons_flags */int flags);

	public static native Pointer new_Alloc(Pointer store, Pointer count, Pointer alloc_type, /* ir_where_alloc */int where);

	public static native Pointer new_Free(Pointer store, Pointer ptr, Pointer size, Pointer free_type, /* ir_where_alloc */int where);

	public static native Pointer new_Sync(int arity, java.nio.Buffer in);

	public static native Pointer new_Proj(Pointer arg, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_defaultProj(Pointer arg, com.sun.jna.NativeLong max_proj);

	public static native Pointer new_Tuple(int arity, java.nio.Buffer in);

	public static native Pointer new_Id(Pointer val, Pointer mode);

	public static native Pointer new_Bad();

	public static native Pointer new_Confirm(Pointer val, Pointer bound, /* pn_Cmp */int cmp);

	public static native Pointer new_Unknown(Pointer m);

	public static native Pointer new_NoMem();

	public static native Pointer new_Mux(Pointer sel, Pointer ir_false, Pointer ir_true, Pointer mode);

	public static native Pointer new_CopyB(Pointer store, Pointer dst, Pointer src, Pointer data_type);

	public static native Pointer new_InstOf(Pointer store, Pointer objptr, Pointer type);

	public static native Pointer new_Raise(Pointer store, Pointer obj);

	public static native Pointer new_Bound(Pointer store, Pointer idx, Pointer lower, Pointer upper);

	public static native Pointer new_Pin(Pointer node);

	public static native Pointer new_ASM(int arity, java.nio.Buffer in, Pointer inputs, int n_outs, Pointer outputs, int n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native Pointer new_rd_Dummy(Pointer db, Pointer irg, Pointer mode);

	public static native Pointer new_r_Dummy(Pointer irg, Pointer mode);

	public static native Pointer new_d_Dummy(Pointer db, Pointer mode);

	public static native Pointer new_Dummy(Pointer mode);

	public static native Pointer new_d_immBlock(Pointer db);

	public static native Pointer new_immBlock();

	public static native Pointer new_r_immBlock(Pointer irg);

	public static native Pointer new_rd_immBlock(Pointer db, Pointer irg);

	public static native void add_immBlock_pred(Pointer immblock, Pointer jmp);

	public static native void mature_immBlock(Pointer block);

	public static native Pointer get_value(int pos, Pointer mode);

	public static native Pointer get_r_value(Pointer irg, int pos, Pointer mode);

	public static native Pointer ir_guess_mode(int pos);

	public static native void set_value(int pos, Pointer value);

	public static native void set_r_value(Pointer irg, int pos, Pointer value);

	public static native int find_value(Pointer value);

	public static native Pointer get_store();

	public static native Pointer get_r_store(Pointer irg);

	public static native void set_store(Pointer store);

	public static native void set_r_store(Pointer irg, Pointer store);

	public static native void keep_alive(Pointer ka);

	public static native void irg_finalize_cons(Pointer irg);

	public static native void irp_finalize_cons();

	public static native void ir_set_uninitialized_local_variable_func(Pointer func);
}
