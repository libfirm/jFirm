package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_tv {
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

	public static enum tarval_int_overflow_mode_t {
		TV_OVERFLOW_BAD(),
		TV_OVERFLOW_WRAP(),
		TV_OVERFLOW_SATURATE();
		public final int val;

		private static class C {
			static int next_val;
		}

		tarval_int_overflow_mode_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		tarval_int_overflow_mode_t() {
			this.val = C.next_val++;
		}

		public static tarval_int_overflow_mode_t getEnum(int val) {
			for (tarval_int_overflow_mode_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum tv_output_mode {
		TVO_NATIVE(),
		TVO_HEX(),
		TVO_DECIMAL(),
		TVO_OCTAL(),
		TVO_BINARY(),
		TVO_FLOAT(),
		TVO_HEXFLOAT();
		public final int val;

		private static class C {
			static int next_val;
		}

		tv_output_mode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		tv_output_mode() {
			this.val = C.next_val++;
		}

		public static tv_output_mode getEnum(int val) {
			for (tv_output_mode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native Pointer new_tarval_from_str(String str, com.sun.jna.NativeLong len, Pointer mode);

	public static native Pointer new_integer_tarval_from_str(String str, com.sun.jna.NativeLong len, byte sign, byte base, Pointer mode);

	public static native Pointer new_tarval_from_long(com.sun.jna.NativeLong l, Pointer mode);

	public static native com.sun.jna.NativeLong get_tarval_long(Pointer tv);

	public static native int tarval_is_long(Pointer tv);

	public static native Pointer new_tarval_from_double(double d, Pointer mode);

	public static native double get_tarval_double(Pointer tv);

	public static native int tarval_is_double(Pointer tv);

	public static native Pointer get_tarval_mode(Pointer tv);

	public static native int tarval_is_negative(Pointer tv);

	public static native int tarval_is_null(Pointer tv);

	public static native int tarval_is_one(Pointer tv);

	public static native int tarval_is_minus_one(Pointer tv);

	public static native int tarval_is_all_one(Pointer tv);

	public static native int tarval_is_constant(Pointer tv);

	public static native Pointer get_tarval_bad();

	public static native Pointer get_tarval_undefined();

	public static native Pointer get_tarval_b_false();

	public static native Pointer get_tarval_b_true();

	public static native Pointer get_tarval_unreachable();

	public static native Pointer get_tarval_reachable();

	public static native Pointer get_tarval_max(Pointer mode);

	public static native Pointer get_tarval_min(Pointer mode);

	public static native Pointer get_tarval_null(Pointer mode);

	public static native Pointer get_tarval_one(Pointer mode);

	public static native Pointer get_tarval_minus_one(Pointer mode);

	public static native Pointer get_tarval_all_one(Pointer mode);

	public static native Pointer get_tarval_nan(Pointer mode);

	public static native Pointer get_tarval_plus_inf(Pointer mode);

	public static native Pointer get_tarval_minus_inf(Pointer mode);

	public static native void tarval_set_integer_overflow_mode(/* tarval_int_overflow_mode_t */int ov_mode);

	public static native /* tarval_int_overflow_mode_t */int tarval_get_integer_overflow_mode();

	public static native /* pn_Cmp */int tarval_cmp(Pointer a, Pointer b);

	public static native Pointer tarval_convert_to(Pointer src, Pointer mode);

	public static native Pointer tarval_not(Pointer a);

	public static native Pointer tarval_neg(Pointer a);

	public static native Pointer tarval_add(Pointer a, Pointer b);

	public static native Pointer tarval_sub(Pointer a, Pointer b, Pointer dst_mode);

	public static native Pointer tarval_mul(Pointer a, Pointer b);

	public static native Pointer tarval_quo(Pointer a, Pointer b);

	public static native Pointer tarval_div(Pointer a, Pointer b);

	public static native Pointer tarval_mod(Pointer a, Pointer b);

	public static native Pointer tarval_divmod(Pointer a, Pointer b, java.nio.Buffer mod_res);

	public static native Pointer tarval_abs(Pointer a);

	public static native Pointer tarval_and(Pointer a, Pointer b);

	public static native Pointer tarval_andnot(Pointer a, Pointer b);

	public static native Pointer tarval_or(Pointer a, Pointer b);

	public static native Pointer tarval_eor(Pointer a, Pointer b);

	public static native Pointer tarval_shl(Pointer a, Pointer b);

	public static native Pointer tarval_shr(Pointer a, Pointer b);

	public static native Pointer tarval_shrs(Pointer a, Pointer b);

	public static native Pointer tarval_rotl(Pointer a, Pointer b);

	public static native int tarval_carry();

	public static native int set_tarval_mode_output_option(Pointer mode, Pointer modeinfo);

	public static native Pointer get_tarval_mode_output_option(Pointer mode);

	public static native String get_tarval_bitpattern(Pointer tv);

	public static native byte get_tarval_sub_bits(Pointer tv, int byte_ofs);

	public static native int tarval_is_single_bit(Pointer tv);

	public static native int get_tarval_popcount(Pointer tv);

	public static native int get_tarval_lowest_bit(Pointer tv);

	public static native int tarval_snprintf(String buf, com.sun.jna.NativeLong buflen, Pointer tv);

	public static native int tarval_printf(Pointer tv);

	public static native int tarval_ieee754_zero_mantissa(Pointer tv);

	public static native int tarval_ieee754_get_exponent(Pointer tv);

	public static native int tarval_ieee754_can_conv_lossless(Pointer tv, Pointer mode);

	public static native int tarval_ieee754_set_immediate_precision(int bits);

	public static native int tarval_ieee754_get_exact();

	public static native int tarval_ieee754_get_mantissa_size(Pointer mode);

	public static native void tarval_enable_fp_ops(int enable);

	public static native int tarval_fp_ops_enabled();

	public static native int tarval_is_NaN(Pointer tv);

	public static native int tarval_is_plus_inf(Pointer tv);

	public static native int tarval_is_minus_inf(Pointer tv);

	public static native int tarval_is_finite(Pointer tv);

	public static native int is_tarval(Pointer thing);
}
