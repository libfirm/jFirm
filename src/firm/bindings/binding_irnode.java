package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_irnode {
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
		beo_Last(ir_opcode.beo_FrameAddr.val),
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
		irop_flag_unknown_jump((1 << 16)),
		irop_flag_user((1 << 17));
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


	public static native Pointer new_rd_Add(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Add(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Add(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Add(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Alloc(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_count, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_r_Alloc(Pointer block, Pointer irn_mem, Pointer irn_count, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_d_Alloc(Pointer dbgi, Pointer irn_mem, Pointer irn_count, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_Alloc(Pointer irn_mem, Pointer irn_count, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_rd_And(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_And(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_And(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_And(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Bad(Pointer dbgi, Pointer irg);

	public static native Pointer new_r_Bad(Pointer irg);

	public static native Pointer new_d_Bad(Pointer dbgi);

	public static native Pointer new_Bad();

	public static native Pointer new_rd_Block(Pointer dbgi, Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Block(Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Block(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_Block(int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Borrow(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Borrow(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Borrow(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Borrow(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Bound(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_index, Pointer irn_lower, Pointer irn_upper);

	public static native Pointer new_r_Bound(Pointer block, Pointer irn_mem, Pointer irn_index, Pointer irn_lower, Pointer irn_upper);

	public static native Pointer new_d_Bound(Pointer dbgi, Pointer irn_mem, Pointer irn_index, Pointer irn_lower, Pointer irn_upper);

	public static native Pointer new_Bound(Pointer irn_mem, Pointer irn_index, Pointer irn_lower, Pointer irn_upper);

	public static native Pointer new_rd_Builtin(Pointer dbgi, Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native Pointer new_r_Builtin(Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native Pointer new_d_Builtin(Pointer dbgi, Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native Pointer new_Builtin(Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native Pointer new_rd_Call(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native Pointer new_r_Call(Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native Pointer new_d_Call(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native Pointer new_Call(Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native Pointer new_rd_Carry(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Carry(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Carry(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Carry(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Cast(Pointer dbgi, Pointer block, Pointer irn_op, Pointer type);

	public static native Pointer new_r_Cast(Pointer block, Pointer irn_op, Pointer type);

	public static native Pointer new_d_Cast(Pointer dbgi, Pointer irn_op, Pointer type);

	public static native Pointer new_Cast(Pointer irn_op, Pointer type);

	public static native Pointer new_rd_Cmp(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native Pointer new_r_Cmp(Pointer block, Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native Pointer new_d_Cmp(Pointer dbgi, Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native Pointer new_Cmp(Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native Pointer new_rd_Cond(Pointer dbgi, Pointer block, Pointer irn_selector);

	public static native Pointer new_r_Cond(Pointer block, Pointer irn_selector);

	public static native Pointer new_d_Cond(Pointer dbgi, Pointer irn_selector);

	public static native Pointer new_Cond(Pointer irn_selector);

	public static native Pointer new_rd_Confirm(Pointer dbgi, Pointer block, Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native Pointer new_r_Confirm(Pointer block, Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native Pointer new_d_Confirm(Pointer dbgi, Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native Pointer new_Confirm(Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native Pointer new_rd_Const(Pointer dbgi, Pointer irg, Pointer tarval);

	public static native Pointer new_r_Const(Pointer irg, Pointer tarval);

	public static native Pointer new_d_Const(Pointer dbgi, Pointer tarval);

	public static native Pointer new_Const(Pointer tarval);

	public static native Pointer new_rd_Conv(Pointer dbgi, Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_r_Conv(Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_d_Conv(Pointer dbgi, Pointer irn_op, Pointer mode);

	public static native Pointer new_Conv(Pointer irn_op, Pointer mode);

	public static native Pointer new_rd_CopyB(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type);

	public static native Pointer new_r_CopyB(Pointer block, Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type);

	public static native Pointer new_d_CopyB(Pointer dbgi, Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type);

	public static native Pointer new_CopyB(Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type);

	public static native Pointer new_rd_Div(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_r_Div(Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_d_Div(Pointer dbgi, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_Div(Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_rd_Dummy(Pointer dbgi, Pointer irg, Pointer mode);

	public static native Pointer new_r_Dummy(Pointer irg, Pointer mode);

	public static native Pointer new_d_Dummy(Pointer dbgi, Pointer mode);

	public static native Pointer new_Dummy(Pointer mode);

	public static native Pointer new_rd_End(Pointer dbgi, Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_r_End(Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_d_End(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_End(int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Eor(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Eor(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Eor(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Eor(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Free(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer irn_size, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_r_Free(Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer irn_size, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_d_Free(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, Pointer irn_size, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_Free(Pointer irn_mem, Pointer irn_ptr, Pointer irn_size, Pointer type, /* ir_where_alloc */int where);

	public static native Pointer new_rd_IJmp(Pointer dbgi, Pointer block, Pointer irn_target);

	public static native Pointer new_r_IJmp(Pointer block, Pointer irn_target);

	public static native Pointer new_d_IJmp(Pointer dbgi, Pointer irn_target);

	public static native Pointer new_IJmp(Pointer irn_target);

	public static native Pointer new_rd_Id(Pointer dbgi, Pointer block, Pointer irn_pred, Pointer mode);

	public static native Pointer new_r_Id(Pointer block, Pointer irn_pred, Pointer mode);

	public static native Pointer new_d_Id(Pointer dbgi, Pointer irn_pred, Pointer mode);

	public static native Pointer new_Id(Pointer irn_pred, Pointer mode);

	public static native Pointer new_rd_InstOf(Pointer dbgi, Pointer block, Pointer irn_store, Pointer irn_obj, Pointer type);

	public static native Pointer new_r_InstOf(Pointer block, Pointer irn_store, Pointer irn_obj, Pointer type);

	public static native Pointer new_d_InstOf(Pointer dbgi, Pointer irn_store, Pointer irn_obj, Pointer type);

	public static native Pointer new_InstOf(Pointer irn_store, Pointer irn_obj, Pointer type);

	public static native Pointer new_rd_Jmp(Pointer dbgi, Pointer block);

	public static native Pointer new_r_Jmp(Pointer block);

	public static native Pointer new_d_Jmp(Pointer dbgi);

	public static native Pointer new_Jmp();

	public static native Pointer new_rd_Load(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_r_Load(Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_d_Load(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_Load(Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_rd_Minus(Pointer dbgi, Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_r_Minus(Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_d_Minus(Pointer dbgi, Pointer irn_op, Pointer mode);

	public static native Pointer new_Minus(Pointer irn_op, Pointer mode);

	public static native Pointer new_rd_Mod(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_r_Mod(Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_d_Mod(Pointer dbgi, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_Mod(Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_rd_Mul(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Mul(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Mul(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Mul(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Mulh(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Mulh(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Mulh(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Mulh(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Mux(Pointer dbgi, Pointer block, Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native Pointer new_r_Mux(Pointer block, Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native Pointer new_d_Mux(Pointer dbgi, Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native Pointer new_Mux(Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native Pointer new_rd_NoMem(Pointer dbgi, Pointer irg);

	public static native Pointer new_r_NoMem(Pointer irg);

	public static native Pointer new_d_NoMem(Pointer dbgi);

	public static native Pointer new_NoMem();

	public static native Pointer new_rd_Not(Pointer dbgi, Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_r_Not(Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_d_Not(Pointer dbgi, Pointer irn_op, Pointer mode);

	public static native Pointer new_Not(Pointer irn_op, Pointer mode);

	public static native Pointer new_rd_Or(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Or(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Or(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Or(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Phi(Pointer dbgi, Pointer block, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_r_Phi(Pointer block, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_d_Phi(Pointer dbgi, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_Phi(int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_rd_Pin(Pointer dbgi, Pointer block, Pointer irn_op);

	public static native Pointer new_r_Pin(Pointer block, Pointer irn_op);

	public static native Pointer new_d_Pin(Pointer dbgi, Pointer irn_op);

	public static native Pointer new_Pin(Pointer irn_op);

	public static native Pointer new_rd_Proj(Pointer dbgi, Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_r_Proj(Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_d_Proj(Pointer dbgi, Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_Proj(Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_rd_Raise(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_exo_ptr);

	public static native Pointer new_r_Raise(Pointer block, Pointer irn_mem, Pointer irn_exo_ptr);

	public static native Pointer new_d_Raise(Pointer dbgi, Pointer irn_mem, Pointer irn_exo_ptr);

	public static native Pointer new_Raise(Pointer irn_mem, Pointer irn_exo_ptr);

	public static native Pointer new_rd_Return(Pointer dbgi, Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Return(Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Return(Pointer dbgi, Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native Pointer new_Return(Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Rotl(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Rotl(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Rotl(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Rotl(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Sel(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native Pointer new_r_Sel(Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native Pointer new_d_Sel(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native Pointer new_Sel(Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native Pointer new_rd_Shl(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Shl(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Shl(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Shl(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Shr(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Shr(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Shr(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Shr(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Shrs(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Shrs(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Shrs(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Shrs(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Start(Pointer dbgi, Pointer irg);

	public static native Pointer new_r_Start(Pointer irg);

	public static native Pointer new_d_Start(Pointer dbgi);

	public static native Pointer new_Start();

	public static native Pointer new_rd_Store(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native Pointer new_r_Store(Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native Pointer new_d_Store(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native Pointer new_Store(Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native Pointer new_rd_Sub(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Sub(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Sub(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Sub(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_rd_Sync(Pointer dbgi, Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Sync(Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Sync(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_Sync(int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Tuple(Pointer dbgi, Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Tuple(Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Tuple(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_Tuple(int arity, java.nio.Buffer in);

	public static native Pointer new_rd_Unknown(Pointer dbgi, Pointer irg, Pointer mode);

	public static native Pointer new_r_Unknown(Pointer irg, Pointer mode);

	public static native Pointer new_d_Unknown(Pointer dbgi, Pointer mode);

	public static native Pointer new_Unknown(Pointer mode);

	public static native int is_ASM(Pointer node);

	public static native int is_Add(Pointer node);

	public static native int is_Alloc(Pointer node);

	public static native int is_Anchor(Pointer node);

	public static native int is_And(Pointer node);

	public static native int is_Bad(Pointer node);

	public static native int is_Block(Pointer node);

	public static native int is_Borrow(Pointer node);

	public static native int is_Bound(Pointer node);

	public static native int is_Builtin(Pointer node);

	public static native int is_Call(Pointer node);

	public static native int is_Carry(Pointer node);

	public static native int is_Cast(Pointer node);

	public static native int is_Cmp(Pointer node);

	public static native int is_Cond(Pointer node);

	public static native int is_Confirm(Pointer node);

	public static native int is_Const(Pointer node);

	public static native int is_Conv(Pointer node);

	public static native int is_CopyB(Pointer node);

	public static native int is_Deleted(Pointer node);

	public static native int is_Div(Pointer node);

	public static native int is_Dummy(Pointer node);

	public static native int is_End(Pointer node);

	public static native int is_Eor(Pointer node);

	public static native int is_Free(Pointer node);

	public static native int is_IJmp(Pointer node);

	public static native int is_Id(Pointer node);

	public static native int is_InstOf(Pointer node);

	public static native int is_Jmp(Pointer node);

	public static native int is_Load(Pointer node);

	public static native int is_Minus(Pointer node);

	public static native int is_Mod(Pointer node);

	public static native int is_Mul(Pointer node);

	public static native int is_Mulh(Pointer node);

	public static native int is_Mux(Pointer node);

	public static native int is_NoMem(Pointer node);

	public static native int is_Not(Pointer node);

	public static native int is_Or(Pointer node);

	public static native int is_Phi(Pointer node);

	public static native int is_Pin(Pointer node);

	public static native int is_Proj(Pointer node);

	public static native int is_Raise(Pointer node);

	public static native int is_Return(Pointer node);

	public static native int is_Rotl(Pointer node);

	public static native int is_Sel(Pointer node);

	public static native int is_Shl(Pointer node);

	public static native int is_Shr(Pointer node);

	public static native int is_Shrs(Pointer node);

	public static native int is_Start(Pointer node);

	public static native int is_Store(Pointer node);

	public static native int is_Sub(Pointer node);

	public static native int is_SymConst(Pointer node);

	public static native int is_Sync(Pointer node);

	public static native int is_Tuple(Pointer node);

	public static native int is_Unknown(Pointer node);

	public static native Pointer get_ASM_input_constraints(Pointer node);

	public static native void set_ASM_input_constraints(Pointer node, Pointer input_constraints);

	public static native Pointer get_ASM_output_constraints(Pointer node);

	public static native void set_ASM_output_constraints(Pointer node, Pointer output_constraints);

	public static native java.nio.Buffer get_ASM_clobbers(Pointer node);

	public static native void set_ASM_clobbers(Pointer node, java.nio.Buffer clobbers);

	public static native Pointer get_ASM_text(Pointer node);

	public static native void set_ASM_text(Pointer node, Pointer text);

	public static native Pointer get_Add_left(Pointer node);

	public static native void set_Add_left(Pointer node, Pointer left);

	public static native Pointer get_Add_right(Pointer node);

	public static native void set_Add_right(Pointer node, Pointer right);

	public static native Pointer get_Alloc_mem(Pointer node);

	public static native void set_Alloc_mem(Pointer node, Pointer mem);

	public static native Pointer get_Alloc_count(Pointer node);

	public static native void set_Alloc_count(Pointer node, Pointer count);

	public static native Pointer get_Alloc_type(Pointer node);

	public static native void set_Alloc_type(Pointer node, Pointer type);

	public static native /* ir_where_alloc */int get_Alloc_where(Pointer node);

	public static native void set_Alloc_where(Pointer node, /* ir_where_alloc */int where);

	public static native Pointer get_And_left(Pointer node);

	public static native void set_And_left(Pointer node, Pointer left);

	public static native Pointer get_And_right(Pointer node);

	public static native void set_And_right(Pointer node, Pointer right);

	public static native Pointer get_Borrow_left(Pointer node);

	public static native void set_Borrow_left(Pointer node, Pointer left);

	public static native Pointer get_Borrow_right(Pointer node);

	public static native void set_Borrow_right(Pointer node, Pointer right);

	public static native Pointer get_Bound_mem(Pointer node);

	public static native void set_Bound_mem(Pointer node, Pointer mem);

	public static native Pointer get_Bound_index(Pointer node);

	public static native void set_Bound_index(Pointer node, Pointer index);

	public static native Pointer get_Bound_lower(Pointer node);

	public static native void set_Bound_lower(Pointer node, Pointer lower);

	public static native Pointer get_Bound_upper(Pointer node);

	public static native void set_Bound_upper(Pointer node, Pointer upper);

	public static native Pointer get_Builtin_mem(Pointer node);

	public static native void set_Builtin_mem(Pointer node, Pointer mem);

	public static native /* ir_builtin_kind */int get_Builtin_kind(Pointer node);

	public static native void set_Builtin_kind(Pointer node, /* ir_builtin_kind */int kind);

	public static native Pointer get_Builtin_type(Pointer node);

	public static native void set_Builtin_type(Pointer node, Pointer type);

	public static native Pointer get_Call_mem(Pointer node);

	public static native void set_Call_mem(Pointer node, Pointer mem);

	public static native Pointer get_Call_ptr(Pointer node);

	public static native void set_Call_ptr(Pointer node, Pointer ptr);

	public static native Pointer get_Call_type(Pointer node);

	public static native void set_Call_type(Pointer node, Pointer type);

	public static native int get_Call_tail_call(Pointer node);

	public static native void set_Call_tail_call(Pointer node, int tail_call);

	public static native Pointer get_Carry_left(Pointer node);

	public static native void set_Carry_left(Pointer node, Pointer left);

	public static native Pointer get_Carry_right(Pointer node);

	public static native void set_Carry_right(Pointer node, Pointer right);

	public static native Pointer get_Cast_op(Pointer node);

	public static native void set_Cast_op(Pointer node, Pointer op);

	public static native Pointer get_Cast_type(Pointer node);

	public static native void set_Cast_type(Pointer node, Pointer type);

	public static native Pointer get_Cmp_left(Pointer node);

	public static native void set_Cmp_left(Pointer node, Pointer left);

	public static native Pointer get_Cmp_right(Pointer node);

	public static native void set_Cmp_right(Pointer node, Pointer right);

	public static native /* ir_relation */int get_Cmp_relation(Pointer node);

	public static native void set_Cmp_relation(Pointer node, /* ir_relation */int relation);

	public static native Pointer get_Cond_selector(Pointer node);

	public static native void set_Cond_selector(Pointer node, Pointer selector);

	public static native com.sun.jna.NativeLong get_Cond_default_proj(Pointer node);

	public static native void set_Cond_default_proj(Pointer node, com.sun.jna.NativeLong default_proj);

	public static native /* cond_jmp_predicate */int get_Cond_jmp_pred(Pointer node);

	public static native void set_Cond_jmp_pred(Pointer node, /* cond_jmp_predicate */int jmp_pred);

	public static native Pointer get_Confirm_value(Pointer node);

	public static native void set_Confirm_value(Pointer node, Pointer value);

	public static native Pointer get_Confirm_bound(Pointer node);

	public static native void set_Confirm_bound(Pointer node, Pointer bound);

	public static native /* ir_relation */int get_Confirm_relation(Pointer node);

	public static native void set_Confirm_relation(Pointer node, /* ir_relation */int relation);

	public static native Pointer get_Const_tarval(Pointer node);

	public static native void set_Const_tarval(Pointer node, Pointer tarval);

	public static native Pointer get_Conv_op(Pointer node);

	public static native void set_Conv_op(Pointer node, Pointer op);

	public static native int get_Conv_strict(Pointer node);

	public static native void set_Conv_strict(Pointer node, int strict);

	public static native Pointer get_CopyB_mem(Pointer node);

	public static native void set_CopyB_mem(Pointer node, Pointer mem);

	public static native Pointer get_CopyB_dst(Pointer node);

	public static native void set_CopyB_dst(Pointer node, Pointer dst);

	public static native Pointer get_CopyB_src(Pointer node);

	public static native void set_CopyB_src(Pointer node, Pointer src);

	public static native Pointer get_CopyB_type(Pointer node);

	public static native void set_CopyB_type(Pointer node, Pointer type);

	public static native Pointer get_Div_mem(Pointer node);

	public static native void set_Div_mem(Pointer node, Pointer mem);

	public static native Pointer get_Div_left(Pointer node);

	public static native void set_Div_left(Pointer node, Pointer left);

	public static native Pointer get_Div_right(Pointer node);

	public static native void set_Div_right(Pointer node, Pointer right);

	public static native Pointer get_Div_resmode(Pointer node);

	public static native void set_Div_resmode(Pointer node, Pointer resmode);

	public static native int get_Div_no_remainder(Pointer node);

	public static native void set_Div_no_remainder(Pointer node, int no_remainder);

	public static native Pointer get_Eor_left(Pointer node);

	public static native void set_Eor_left(Pointer node, Pointer left);

	public static native Pointer get_Eor_right(Pointer node);

	public static native void set_Eor_right(Pointer node, Pointer right);

	public static native Pointer get_Free_mem(Pointer node);

	public static native void set_Free_mem(Pointer node, Pointer mem);

	public static native Pointer get_Free_ptr(Pointer node);

	public static native void set_Free_ptr(Pointer node, Pointer ptr);

	public static native Pointer get_Free_size(Pointer node);

	public static native void set_Free_size(Pointer node, Pointer size);

	public static native Pointer get_Free_type(Pointer node);

	public static native void set_Free_type(Pointer node, Pointer type);

	public static native /* ir_where_alloc */int get_Free_where(Pointer node);

	public static native void set_Free_where(Pointer node, /* ir_where_alloc */int where);

	public static native Pointer get_IJmp_target(Pointer node);

	public static native void set_IJmp_target(Pointer node, Pointer target);

	public static native Pointer get_Id_pred(Pointer node);

	public static native void set_Id_pred(Pointer node, Pointer pred);

	public static native Pointer get_InstOf_store(Pointer node);

	public static native void set_InstOf_store(Pointer node, Pointer store);

	public static native Pointer get_InstOf_obj(Pointer node);

	public static native void set_InstOf_obj(Pointer node, Pointer obj);

	public static native Pointer get_InstOf_type(Pointer node);

	public static native void set_InstOf_type(Pointer node, Pointer type);

	public static native Pointer get_Load_mem(Pointer node);

	public static native void set_Load_mem(Pointer node, Pointer mem);

	public static native Pointer get_Load_ptr(Pointer node);

	public static native void set_Load_ptr(Pointer node, Pointer ptr);

	public static native Pointer get_Load_mode(Pointer node);

	public static native void set_Load_mode(Pointer node, Pointer mode);

	public static native /* ir_volatility */int get_Load_volatility(Pointer node);

	public static native void set_Load_volatility(Pointer node, /* ir_volatility */int volatility);

	public static native /* ir_align */int get_Load_unaligned(Pointer node);

	public static native void set_Load_unaligned(Pointer node, /* ir_align */int unaligned);

	public static native Pointer get_Minus_op(Pointer node);

	public static native void set_Minus_op(Pointer node, Pointer op);

	public static native Pointer get_Mod_mem(Pointer node);

	public static native void set_Mod_mem(Pointer node, Pointer mem);

	public static native Pointer get_Mod_left(Pointer node);

	public static native void set_Mod_left(Pointer node, Pointer left);

	public static native Pointer get_Mod_right(Pointer node);

	public static native void set_Mod_right(Pointer node, Pointer right);

	public static native Pointer get_Mod_resmode(Pointer node);

	public static native void set_Mod_resmode(Pointer node, Pointer resmode);

	public static native Pointer get_Mul_left(Pointer node);

	public static native void set_Mul_left(Pointer node, Pointer left);

	public static native Pointer get_Mul_right(Pointer node);

	public static native void set_Mul_right(Pointer node, Pointer right);

	public static native Pointer get_Mulh_left(Pointer node);

	public static native void set_Mulh_left(Pointer node, Pointer left);

	public static native Pointer get_Mulh_right(Pointer node);

	public static native void set_Mulh_right(Pointer node, Pointer right);

	public static native Pointer get_Mux_sel(Pointer node);

	public static native void set_Mux_sel(Pointer node, Pointer sel);

	public static native Pointer get_Mux_false(Pointer node);

	public static native void set_Mux_false(Pointer node, Pointer false_);

	public static native Pointer get_Mux_true(Pointer node);

	public static native void set_Mux_true(Pointer node, Pointer true_);

	public static native Pointer get_Not_op(Pointer node);

	public static native void set_Not_op(Pointer node, Pointer op);

	public static native Pointer get_Or_left(Pointer node);

	public static native void set_Or_left(Pointer node, Pointer left);

	public static native Pointer get_Or_right(Pointer node);

	public static native void set_Or_right(Pointer node, Pointer right);

	public static native Pointer get_Pin_op(Pointer node);

	public static native void set_Pin_op(Pointer node, Pointer op);

	public static native Pointer get_Proj_pred(Pointer node);

	public static native void set_Proj_pred(Pointer node, Pointer pred);

	public static native com.sun.jna.NativeLong get_Proj_proj(Pointer node);

	public static native void set_Proj_proj(Pointer node, com.sun.jna.NativeLong proj);

	public static native Pointer get_Raise_mem(Pointer node);

	public static native void set_Raise_mem(Pointer node, Pointer mem);

	public static native Pointer get_Raise_exo_ptr(Pointer node);

	public static native void set_Raise_exo_ptr(Pointer node, Pointer exo_ptr);

	public static native Pointer get_Return_mem(Pointer node);

	public static native void set_Return_mem(Pointer node, Pointer mem);

	public static native Pointer get_Rotl_left(Pointer node);

	public static native void set_Rotl_left(Pointer node, Pointer left);

	public static native Pointer get_Rotl_right(Pointer node);

	public static native void set_Rotl_right(Pointer node, Pointer right);

	public static native Pointer get_Sel_mem(Pointer node);

	public static native void set_Sel_mem(Pointer node, Pointer mem);

	public static native Pointer get_Sel_ptr(Pointer node);

	public static native void set_Sel_ptr(Pointer node, Pointer ptr);

	public static native Pointer get_Sel_entity(Pointer node);

	public static native void set_Sel_entity(Pointer node, Pointer entity);

	public static native Pointer get_Shl_left(Pointer node);

	public static native void set_Shl_left(Pointer node, Pointer left);

	public static native Pointer get_Shl_right(Pointer node);

	public static native void set_Shl_right(Pointer node, Pointer right);

	public static native Pointer get_Shr_left(Pointer node);

	public static native void set_Shr_left(Pointer node, Pointer left);

	public static native Pointer get_Shr_right(Pointer node);

	public static native void set_Shr_right(Pointer node, Pointer right);

	public static native Pointer get_Shrs_left(Pointer node);

	public static native void set_Shrs_left(Pointer node, Pointer left);

	public static native Pointer get_Shrs_right(Pointer node);

	public static native void set_Shrs_right(Pointer node, Pointer right);

	public static native Pointer get_Store_mem(Pointer node);

	public static native void set_Store_mem(Pointer node, Pointer mem);

	public static native Pointer get_Store_ptr(Pointer node);

	public static native void set_Store_ptr(Pointer node, Pointer ptr);

	public static native Pointer get_Store_value(Pointer node);

	public static native void set_Store_value(Pointer node, Pointer value);

	public static native /* ir_volatility */int get_Store_volatility(Pointer node);

	public static native void set_Store_volatility(Pointer node, /* ir_volatility */int volatility);

	public static native /* ir_align */int get_Store_unaligned(Pointer node);

	public static native void set_Store_unaligned(Pointer node, /* ir_align */int unaligned);

	public static native Pointer get_Sub_left(Pointer node);

	public static native void set_Sub_left(Pointer node, Pointer left);

	public static native Pointer get_Sub_right(Pointer node);

	public static native void set_Sub_right(Pointer node, Pointer right);

	public static native int is_ir_node(Pointer thing);

	public static native int get_irn_arity(Pointer node);

	public static native void set_irn_in(Pointer node, int arity, java.nio.Buffer in);

	public static native Pointer get_irn_n(Pointer node, int n);

	public static native int add_irn_dep(Pointer node, Pointer dep);

	public static native void add_irn_deps(Pointer tgt, Pointer src);

	public static native int get_irn_deps(Pointer node);

	public static native Pointer get_irn_dep(Pointer node, int pos);

	public static native void set_irn_dep(Pointer node, int pos, Pointer dep);

	public static native void set_irn_n(Pointer node, int n, Pointer in);

	public static native int add_irn_n(Pointer node, Pointer in);

	public static native void del_Sync_n(Pointer n, int i);

	public static native void set_irn_mode(Pointer node, Pointer mode);

	public static native Pointer get_irn_mode(Pointer node);

	public static native Pointer get_irn_op(Pointer node);

	public static native void set_irn_op(Pointer node, Pointer op);

	public static native int get_irn_opcode(Pointer node);

	public static native String get_irn_opname(Pointer node);

	public static native Pointer get_irn_opident(Pointer node);

	public static native int get_irn_pred_pos(Pointer node, Pointer arg);

	public static native com.sun.jna.NativeLong get_irn_visited(Pointer node);

	public static native void set_irn_visited(Pointer node, com.sun.jna.NativeLong visited);

	public static native void mark_irn_visited(Pointer node);

	public static native int irn_visited(Pointer node);

	public static native int irn_visited_else_mark(Pointer node);

	public static native void set_irn_link(Pointer node, Pointer link);

	public static native Pointer get_irn_link(Pointer node);

	public static native Pointer get_irn_irg(Pointer node);

	public static native com.sun.jna.NativeLong get_irn_node_nr(Pointer node);

	public static native /* op_pin_state */int get_irn_pinned(Pointer node);

	public static native void set_irn_pinned(Pointer node, /* op_pin_state */int state);

	public static native /* op_pin_state */int is_irn_pinned_in_irg(Pointer node);

	public static native Pointer new_ir_node(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer mode, int arity, java.nio.Buffer in);

	public static native Pointer get_nodes_block(Pointer node);

	public static native void set_nodes_block(Pointer node, Pointer block);

	public static native Pointer is_frame_pointer(Pointer n);

	public static native int get_Block_n_cfgpreds(Pointer block);

	public static native Pointer get_Block_cfgpred(Pointer block, int pos);

	public static native void set_Block_cfgpred(Pointer block, int pos, Pointer pred);

	public static native int get_Block_cfgpred_pos(Pointer block, Pointer pred);

	public static native Pointer get_Block_cfgpred_block(Pointer node, int pos);

	public static native int get_Block_matured(Pointer block);

	public static native void set_Block_matured(Pointer block, int matured);

	public static native com.sun.jna.NativeLong get_Block_block_visited(Pointer block);

	public static native void set_Block_block_visited(Pointer block, com.sun.jna.NativeLong visit);

	public static native void mark_Block_block_visited(Pointer node);

	public static native int Block_block_visited(Pointer node);

	public static native Pointer get_Block_extbb(Pointer block);

	public static native void set_Block_extbb(Pointer block, Pointer extblk);

	public static native Pointer get_Block_irg(Pointer block);

	public static native int has_Block_entity(Pointer block);

	public static native Pointer get_Block_entity(Pointer block);

	public static native Pointer create_Block_entity(Pointer block);

	public static native void set_Block_entity(Pointer block, Pointer entity);

	public static native Pointer get_Block_phis(Pointer block);

	public static native void set_Block_phis(Pointer block, Pointer phi);

	public static native void add_Block_phi(Pointer block, Pointer phi);

	public static native int get_Block_mark(Pointer block);

	public static native void set_Block_mark(Pointer block, int mark);

	public static native int get_End_n_keepalives(Pointer end);

	public static native Pointer get_End_keepalive(Pointer end, int pos);

	public static native void add_End_keepalive(Pointer end, Pointer ka);

	public static native void set_End_keepalive(Pointer end, int pos, Pointer ka);

	public static native void set_End_keepalives(Pointer end, int n, java.nio.Buffer in);

	public static native void remove_End_keepalive(Pointer end, Pointer irn);

	public static native void remove_End_Bads_and_doublets(Pointer end);

	public static native void free_End(Pointer end);

	public static native java.nio.Buffer get_Return_res_arr(Pointer node);

	public static native com.sun.jna.NativeLong get_Return_n_ress(Pointer node);

	public static native Pointer get_Return_res(Pointer node, int pos);

	public static native void set_Return_res(Pointer node, int pos, Pointer res);

	public static native int is_Const_null(Pointer node);

	public static native int is_Const_one(Pointer node);

	public static native int is_Const_all_one(Pointer node);

	public static native int is_strictConv(Pointer node);

	public static native int is_SymConst_addr_ent(Pointer node);

	public static native /* symconst_kind */int get_SymConst_kind(Pointer node);

	public static native void set_SymConst_kind(Pointer node, /* symconst_kind */int num);

	public static native Pointer get_SymConst_type(Pointer node);

	public static native void set_SymConst_type(Pointer node, Pointer tp);

	public static native Pointer get_SymConst_entity(Pointer node);

	public static native void set_SymConst_entity(Pointer node, Pointer ent);

	public static native Pointer get_SymConst_enum(Pointer node);

	public static native void set_SymConst_enum(Pointer node, Pointer ec);

	public static native java.nio.Buffer get_Sel_index_arr(Pointer node);

	public static native int get_Sel_n_indexs(Pointer node);

	public static native Pointer get_Sel_index(Pointer node, int pos);

	public static native void set_Sel_index(Pointer node, int pos, Pointer index);

	public static native java.nio.Buffer get_Call_param_arr(Pointer node);

	public static native com.sun.jna.NativeLong get_Call_n_params(Pointer node);

	public static native Pointer get_Call_param(Pointer node, int pos);

	public static native void set_Call_param(Pointer node, int pos, Pointer param);

	public static native int is_self_recursive_Call(Pointer call);

	public static native int Call_has_callees(Pointer node);

	public static native com.sun.jna.NativeLong get_Call_n_callees(Pointer node);

	public static native Pointer get_Call_callee(Pointer node, com.sun.jna.NativeLong pos);

	public static native void set_Call_callee_arr(Pointer node, com.sun.jna.NativeLong n, java.nio.Buffer arr);

	public static native void remove_Call_callee_arr(Pointer node);

	public static native java.nio.Buffer get_Builtin_param_arr(Pointer node);

	public static native int get_Builtin_n_params(Pointer node);

	public static native Pointer get_Builtin_param(Pointer node, int pos);

	public static native void set_Builtin_param(Pointer node, int pos, Pointer param);

	public static native String get_builtin_kind_name(/* ir_builtin_kind */int kind);

	public static native int is_unop(Pointer node);

	public static native Pointer get_unop_op(Pointer node);

	public static native void set_unop_op(Pointer node, Pointer op);

	public static native int is_binop(Pointer node);

	public static native Pointer get_binop_left(Pointer node);

	public static native void set_binop_left(Pointer node, Pointer left);

	public static native Pointer get_binop_right(Pointer node);

	public static native void set_binop_right(Pointer node, Pointer right);

	public static native String get_relation_string(/* ir_relation */int relation);

	public static native /* ir_relation */int get_negated_relation(/* ir_relation */int relation);

	public static native /* ir_relation */int get_inversed_relation(/* ir_relation */int relation);

	public static native int is_Cast_upcast(Pointer node);

	public static native int is_Cast_downcast(Pointer node);

	public static native int is_Phi0(Pointer n);

	public static native java.nio.Buffer get_Phi_preds_arr(Pointer node);

	public static native int get_Phi_n_preds(Pointer node);

	public static native Pointer get_Phi_pred(Pointer node, int pos);

	public static native void set_Phi_pred(Pointer node, int pos, Pointer pred);

	public static native Pointer get_Phi_next(Pointer phi);

	public static native void set_Phi_next(Pointer phi, Pointer next);

	public static native int is_memop(Pointer node);

	public static native Pointer get_memop_mem(Pointer node);

	public static native void set_memop_mem(Pointer node, Pointer mem);

	public static native Pointer get_memop_ptr(Pointer node);

	public static native void set_memop_ptr(Pointer node, Pointer ptr);

	public static native java.nio.Buffer get_Sync_preds_arr(Pointer node);

	public static native int get_Sync_n_preds(Pointer node);

	public static native Pointer get_Sync_pred(Pointer node, int pos);

	public static native void set_Sync_pred(Pointer node, int pos, Pointer pred);

	public static native void add_Sync_pred(Pointer node, Pointer pred);

	public static native int is_arg_Proj(Pointer node);

	public static native java.nio.Buffer get_Tuple_preds_arr(Pointer node);

	public static native int get_Tuple_n_preds(Pointer node);

	public static native Pointer get_Tuple_pred(Pointer node, int pos);

	public static native void set_Tuple_pred(Pointer node, int pos, Pointer pred);

	public static native int get_ASM_n_input_constraints(Pointer node);

	public static native int get_ASM_n_output_constraints(Pointer node);

	public static native int get_ASM_n_clobbers(Pointer node);

	public static native Pointer skip_Proj(Pointer node);

	public static native Pointer skip_Proj_const(Pointer node);

	public static native Pointer skip_Id(Pointer node);

	public static native Pointer skip_Tuple(Pointer node);

	public static native Pointer skip_Cast(Pointer node);

	public static native Pointer skip_Cast_const(Pointer node);

	public static native Pointer skip_Pin(Pointer node);

	public static native Pointer skip_Confirm(Pointer node);

	public static native Pointer skip_HighLevel_ops(Pointer node);

	public static native int is_cfop(Pointer node);

	public static native int is_unknown_jump(Pointer node);

	public static native int is_fragile_op(Pointer node);

	public static native Pointer get_fragile_op_mem(Pointer node);

	public static native int is_irn_forking(Pointer node);

	public static native void copy_node_attr(Pointer irg, Pointer old_node, Pointer new_node);

	public static native Pointer get_irn_type_attr(Pointer n);

	public static native Pointer get_irn_entity_attr(Pointer n);

	public static native int is_irn_constlike(Pointer node);

	public static native int is_irn_keep(Pointer node);

	public static native int is_irn_start_block_placed(Pointer node);

	public static native int is_irn_machine_op(Pointer node);

	public static native int is_irn_machine_operand(Pointer node);

	public static native int is_irn_machine_user(Pointer node, int n);

	public static native int is_irn_cse_neutral(Pointer node);

	public static native String get_cond_jmp_predicate_name(/* cond_jmp_predicate */int pred);

	public static native int is_Global(Pointer node);

	public static native Pointer get_Global_entity(Pointer node);

	public static native int firm_register_additional_node_data(int size);

	public static native Pointer get_irn_generic_attr(Pointer node);

	public static native Pointer get_irn_generic_attr_const(Pointer node);

	public static native int get_irn_idx(Pointer node);

	public static native void set_irn_dbg_info(Pointer n, Pointer db);

	public static native Pointer get_irn_dbg_info(Pointer n);

	public static native int firm_default_hash(Pointer node);

	public static native String gdb_node_helper(Pointer firm_object);
}
