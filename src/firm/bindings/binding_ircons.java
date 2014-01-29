package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_ircons {
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
		k_ir_prog(),
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

	public static enum op_arity {
		oparity_invalid(0),
		oparity_binary(),
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
		irop_flag_commutative((1 << 0)),
		irop_flag_cfopcode((1 << 1)),
		irop_flag_fragile((1 << 2)),
		irop_flag_forking((1 << 3)),
		irop_flag_highlevel((1 << 4)),
		irop_flag_constlike((1 << 5)),
		irop_flag_keep((1 << 6)),
		irop_flag_start_block((1 << 7)),
		irop_flag_uses_memory((1 << 8)),
		irop_flag_dump_noblock((1 << 9)),
		irop_flag_cse_neutral((1 << 10)),
		irop_flag_unknown_jump((1 << 11));
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

	public static enum ir_mode_arithmetic {
		irma_none(1),
		irma_twos_complement(2),
		irma_ieee754(256),
		irma_x86_extended_float(),
		irma_last(ir_mode_arithmetic.irma_x86_extended_float.val);
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

	public static enum float_int_conversion_overflow_style_t {
		ir_overflow_indefinite(),
		ir_overflow_min_max();
		public final int val;

		private static class C {
			static int next_val;
		}

		float_int_conversion_overflow_style_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		float_int_conversion_overflow_style_t() {
			this.val = C.next_val++;
		}

		public static float_int_conversion_overflow_style_t getEnum(int val) {
			for (float_int_conversion_overflow_style_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_opcode {
		iro_ASM(),
		iro_Add(),
		iro_Address(),
		iro_Align(),
		iro_Alloc(),
		iro_Anchor(),
		iro_And(),
		iro_Bad(),
		iro_Block(),
		iro_Builtin(),
		iro_Call(),
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
		iro_Jmp(),
		iro_Load(),
		iro_Minus(),
		iro_Mod(),
		iro_Mul(),
		iro_Mulh(),
		iro_Mux(),
		iro_NoMem(),
		iro_Not(),
		iro_Offset(),
		iro_Or(),
		iro_Phi(),
		iro_Pin(),
		iro_Proj(),
		iro_Raise(),
		iro_Return(),
		iro_Sel(),
		iro_Shl(),
		iro_Shr(),
		iro_Shrs(),
		iro_Size(),
		iro_Start(),
		iro_Store(),
		iro_Sub(),
		iro_Switch(),
		iro_Sync(),
		iro_Tuple(),
		iro_Unknown(),
		iro_first(ir_opcode.iro_ASM.val),
		iro_last(ir_opcode.iro_Unknown.val);
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

	public static enum n_ASM {
		n_ASM_mem(),
		n_ASM_max(n_ASM.n_ASM_mem.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_ASM(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_ASM() {
			this.val = C.next_val++;
		}

		public static n_ASM getEnum(int val) {
			for (n_ASM entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Add {
		n_Add_left(),
		n_Add_right(),
		n_Add_max(n_Add.n_Add_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Add(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Add() {
			this.val = C.next_val++;
		}

		public static n_Add getEnum(int val) {
			for (n_Add entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Alloc {
		n_Alloc_mem(),
		n_Alloc_size(),
		n_Alloc_max(n_Alloc.n_Alloc_size.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Alloc() {
			this.val = C.next_val++;
		}

		public static n_Alloc getEnum(int val) {
			for (n_Alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Alloc {
		pn_Alloc_M(),
		pn_Alloc_res(),
		pn_Alloc_max(pn_Alloc.pn_Alloc_res.val);
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

	public static enum n_And {
		n_And_left(),
		n_And_right(),
		n_And_max(n_And.n_And_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_And(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_And() {
			this.val = C.next_val++;
		}

		public static n_And getEnum(int val) {
			for (n_And entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Builtin {
		n_Builtin_mem(),
		n_Builtin_max(n_Builtin.n_Builtin_mem.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Builtin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Builtin() {
			this.val = C.next_val++;
		}

		public static n_Builtin getEnum(int val) {
			for (n_Builtin entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Builtin {
		pn_Builtin_M(),
		pn_Builtin_max(pn_Builtin.pn_Builtin_M.val);
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

	public static enum n_Call {
		n_Call_mem(),
		n_Call_ptr(),
		n_Call_max(n_Call.n_Call_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Call(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Call() {
			this.val = C.next_val++;
		}

		public static n_Call getEnum(int val) {
			for (n_Call entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Call {
		pn_Call_M(),
		pn_Call_T_result(),
		pn_Call_X_regular(),
		pn_Call_X_except(),
		pn_Call_max(pn_Call.pn_Call_X_except.val);
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

	public static enum n_Cmp {
		n_Cmp_left(),
		n_Cmp_right(),
		n_Cmp_max(n_Cmp.n_Cmp_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Cmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Cmp() {
			this.val = C.next_val++;
		}

		public static n_Cmp getEnum(int val) {
			for (n_Cmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Cond {
		n_Cond_selector(),
		n_Cond_max(n_Cond.n_Cond_selector.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Cond(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Cond() {
			this.val = C.next_val++;
		}

		public static n_Cond getEnum(int val) {
			for (n_Cond entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Cond {
		pn_Cond_false(),
		pn_Cond_true(),
		pn_Cond_max(pn_Cond.pn_Cond_true.val);
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

	public static enum n_Confirm {
		n_Confirm_value(),
		n_Confirm_bound(),
		n_Confirm_max(n_Confirm.n_Confirm_bound.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Confirm(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Confirm() {
			this.val = C.next_val++;
		}

		public static n_Confirm getEnum(int val) {
			for (n_Confirm entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Conv {
		n_Conv_op(),
		n_Conv_max(n_Conv.n_Conv_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Conv(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Conv() {
			this.val = C.next_val++;
		}

		public static n_Conv getEnum(int val) {
			for (n_Conv entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_CopyB {
		n_CopyB_mem(),
		n_CopyB_dst(),
		n_CopyB_src(),
		n_CopyB_max(n_CopyB.n_CopyB_src.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_CopyB(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_CopyB() {
			this.val = C.next_val++;
		}

		public static n_CopyB getEnum(int val) {
			for (n_CopyB entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Div {
		n_Div_mem(),
		n_Div_left(),
		n_Div_right(),
		n_Div_max(n_Div.n_Div_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Div(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Div() {
			this.val = C.next_val++;
		}

		public static n_Div getEnum(int val) {
			for (n_Div entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Div {
		pn_Div_M(),
		pn_Div_res(),
		pn_Div_X_regular(),
		pn_Div_X_except(),
		pn_Div_max(pn_Div.pn_Div_X_except.val);
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

	public static enum n_Eor {
		n_Eor_left(),
		n_Eor_right(),
		n_Eor_max(n_Eor.n_Eor_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Eor(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Eor() {
			this.val = C.next_val++;
		}

		public static n_Eor getEnum(int val) {
			for (n_Eor entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Free {
		n_Free_mem(),
		n_Free_ptr(),
		n_Free_max(n_Free.n_Free_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Free(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Free() {
			this.val = C.next_val++;
		}

		public static n_Free getEnum(int val) {
			for (n_Free entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_IJmp {
		n_IJmp_target(),
		n_IJmp_max(n_IJmp.n_IJmp_target.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_IJmp(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_IJmp() {
			this.val = C.next_val++;
		}

		public static n_IJmp getEnum(int val) {
			for (n_IJmp entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Id {
		n_Id_pred(),
		n_Id_max(n_Id.n_Id_pred.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Id(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Id() {
			this.val = C.next_val++;
		}

		public static n_Id getEnum(int val) {
			for (n_Id entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Load {
		n_Load_mem(),
		n_Load_ptr(),
		n_Load_max(n_Load.n_Load_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Load(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Load() {
			this.val = C.next_val++;
		}

		public static n_Load getEnum(int val) {
			for (n_Load entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Load {
		pn_Load_M(),
		pn_Load_res(),
		pn_Load_X_regular(),
		pn_Load_X_except(),
		pn_Load_max(pn_Load.pn_Load_X_except.val);
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

	public static enum n_Minus {
		n_Minus_op(),
		n_Minus_max(n_Minus.n_Minus_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Minus(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Minus() {
			this.val = C.next_val++;
		}

		public static n_Minus getEnum(int val) {
			for (n_Minus entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Mod {
		n_Mod_mem(),
		n_Mod_left(),
		n_Mod_right(),
		n_Mod_max(n_Mod.n_Mod_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mod() {
			this.val = C.next_val++;
		}

		public static n_Mod getEnum(int val) {
			for (n_Mod entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Mod {
		pn_Mod_M(),
		pn_Mod_res(),
		pn_Mod_X_regular(),
		pn_Mod_X_except(),
		pn_Mod_max(pn_Mod.pn_Mod_X_except.val);
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

	public static enum n_Mul {
		n_Mul_left(),
		n_Mul_right(),
		n_Mul_max(n_Mul.n_Mul_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mul(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mul() {
			this.val = C.next_val++;
		}

		public static n_Mul getEnum(int val) {
			for (n_Mul entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Mulh {
		n_Mulh_left(),
		n_Mulh_right(),
		n_Mulh_max(n_Mulh.n_Mulh_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mulh(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mulh() {
			this.val = C.next_val++;
		}

		public static n_Mulh getEnum(int val) {
			for (n_Mulh entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Mux {
		n_Mux_sel(),
		n_Mux_false(),
		n_Mux_true(),
		n_Mux_max(n_Mux.n_Mux_true.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Mux(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Mux() {
			this.val = C.next_val++;
		}

		public static n_Mux getEnum(int val) {
			for (n_Mux entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Not {
		n_Not_op(),
		n_Not_max(n_Not.n_Not_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Not(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Not() {
			this.val = C.next_val++;
		}

		public static n_Not getEnum(int val) {
			for (n_Not entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Or {
		n_Or_left(),
		n_Or_right(),
		n_Or_max(n_Or.n_Or_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Or(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Or() {
			this.val = C.next_val++;
		}

		public static n_Or getEnum(int val) {
			for (n_Or entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Pin {
		n_Pin_op(),
		n_Pin_max(n_Pin.n_Pin_op.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Pin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Pin() {
			this.val = C.next_val++;
		}

		public static n_Pin getEnum(int val) {
			for (n_Pin entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Proj {
		n_Proj_pred(),
		n_Proj_max(n_Proj.n_Proj_pred.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Proj(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Proj() {
			this.val = C.next_val++;
		}

		public static n_Proj getEnum(int val) {
			for (n_Proj entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Raise {
		n_Raise_mem(),
		n_Raise_exo_ptr(),
		n_Raise_max(n_Raise.n_Raise_exo_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Raise(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Raise() {
			this.val = C.next_val++;
		}

		public static n_Raise getEnum(int val) {
			for (n_Raise entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Raise {
		pn_Raise_M(),
		pn_Raise_X(),
		pn_Raise_max(pn_Raise.pn_Raise_X.val);
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

	public static enum n_Return {
		n_Return_mem(),
		n_Return_max(n_Return.n_Return_mem.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Return(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Return() {
			this.val = C.next_val++;
		}

		public static n_Return getEnum(int val) {
			for (n_Return entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Sel {
		n_Sel_mem(),
		n_Sel_ptr(),
		n_Sel_max(n_Sel.n_Sel_ptr.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Sel(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Sel() {
			this.val = C.next_val++;
		}

		public static n_Sel getEnum(int val) {
			for (n_Sel entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Shl {
		n_Shl_left(),
		n_Shl_right(),
		n_Shl_max(n_Shl.n_Shl_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Shl(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Shl() {
			this.val = C.next_val++;
		}

		public static n_Shl getEnum(int val) {
			for (n_Shl entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Shr {
		n_Shr_left(),
		n_Shr_right(),
		n_Shr_max(n_Shr.n_Shr_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Shr(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Shr() {
			this.val = C.next_val++;
		}

		public static n_Shr getEnum(int val) {
			for (n_Shr entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Shrs {
		n_Shrs_left(),
		n_Shrs_right(),
		n_Shrs_max(n_Shrs.n_Shrs_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Shrs(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Shrs() {
			this.val = C.next_val++;
		}

		public static n_Shrs getEnum(int val) {
			for (n_Shrs entry : values()) {
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
		pn_Start_max(pn_Start.pn_Start_T_args.val);
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

	public static enum n_Store {
		n_Store_mem(),
		n_Store_ptr(),
		n_Store_value(),
		n_Store_max(n_Store.n_Store_value.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Store(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Store() {
			this.val = C.next_val++;
		}

		public static n_Store getEnum(int val) {
			for (n_Store entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Store {
		pn_Store_M(),
		pn_Store_X_regular(),
		pn_Store_X_except(),
		pn_Store_max(pn_Store.pn_Store_X_except.val);
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

	public static enum n_Sub {
		n_Sub_left(),
		n_Sub_right(),
		n_Sub_max(n_Sub.n_Sub_right.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Sub(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Sub() {
			this.val = C.next_val++;
		}

		public static n_Sub getEnum(int val) {
			for (n_Sub entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum n_Switch {
		n_Switch_selector(),
		n_Switch_max(n_Switch.n_Switch_selector.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		n_Switch(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		n_Switch() {
			this.val = C.next_val++;
		}

		public static n_Switch getEnum(int val) {
			for (n_Switch entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum pn_Switch {
		pn_Switch_default(),
		pn_Switch_max(pn_Switch.pn_Switch_default.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		pn_Switch(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		pn_Switch() {
			this.val = C.next_val++;
		}

		public static pn_Switch getEnum(int val) {
			for (pn_Switch entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native int is_ASM(Pointer node);

	public static native Pointer get_ASM_mem(Pointer node);

	public static native void set_ASM_mem(Pointer node, Pointer mem);

	public static native int get_ASM_n_inputs(Pointer node);

	public static native Pointer get_ASM_input(Pointer node, int pos);

	public static native void set_ASM_input(Pointer node, int pos, Pointer input);

	public static native Pointer get_ASM_input_constraints(Pointer node);

	public static native void set_ASM_input_constraints(Pointer node, Pointer input_constraints);

	public static native Pointer get_ASM_output_constraints(Pointer node);

	public static native void set_ASM_output_constraints(Pointer node, Pointer output_constraints);

	public static native java.nio.Buffer get_ASM_clobbers(Pointer node);

	public static native void set_ASM_clobbers(Pointer node, java.nio.Buffer clobbers);

	public static native Pointer get_ASM_text(Pointer node);

	public static native void set_ASM_text(Pointer node, Pointer text);

	public static native Pointer get_op_ASM();

	public static native Pointer new_rd_Add(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Add(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Add(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Add(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Add(Pointer node);

	public static native Pointer get_Add_left(Pointer node);

	public static native void set_Add_left(Pointer node, Pointer left);

	public static native Pointer get_Add_right(Pointer node);

	public static native void set_Add_right(Pointer node, Pointer right);

	public static native Pointer get_op_Add();

	public static native Pointer new_rd_Address(Pointer dbgi, Pointer irg, Pointer entity);

	public static native Pointer new_r_Address(Pointer irg, Pointer entity);

	public static native Pointer new_d_Address(Pointer dbgi, Pointer entity);

	public static native Pointer new_Address(Pointer entity);

	public static native int is_Address(Pointer node);

	public static native Pointer get_Address_entity(Pointer node);

	public static native void set_Address_entity(Pointer node, Pointer entity);

	public static native Pointer get_op_Address();

	public static native Pointer new_rd_Align(Pointer dbgi, Pointer irg, Pointer mode, Pointer type);

	public static native Pointer new_r_Align(Pointer irg, Pointer mode, Pointer type);

	public static native Pointer new_d_Align(Pointer dbgi, Pointer mode, Pointer type);

	public static native Pointer new_Align(Pointer mode, Pointer type);

	public static native int is_Align(Pointer node);

	public static native Pointer get_Align_type(Pointer node);

	public static native void set_Align_type(Pointer node, Pointer type);

	public static native Pointer get_op_Align();

	public static native Pointer new_rd_Alloc(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_size, int alignment);

	public static native Pointer new_r_Alloc(Pointer block, Pointer irn_mem, Pointer irn_size, int alignment);

	public static native Pointer new_d_Alloc(Pointer dbgi, Pointer irn_mem, Pointer irn_size, int alignment);

	public static native Pointer new_Alloc(Pointer irn_mem, Pointer irn_size, int alignment);

	public static native int is_Alloc(Pointer node);

	public static native Pointer get_Alloc_mem(Pointer node);

	public static native void set_Alloc_mem(Pointer node, Pointer mem);

	public static native Pointer get_Alloc_size(Pointer node);

	public static native void set_Alloc_size(Pointer node, Pointer size);

	public static native int get_Alloc_alignment(Pointer node);

	public static native void set_Alloc_alignment(Pointer node, int alignment);

	public static native Pointer get_op_Alloc();

	public static native int is_Anchor(Pointer node);

	public static native Pointer get_op_Anchor();

	public static native Pointer new_rd_And(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_And(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_And(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_And(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_And(Pointer node);

	public static native Pointer get_And_left(Pointer node);

	public static native void set_And_left(Pointer node, Pointer left);

	public static native Pointer get_And_right(Pointer node);

	public static native void set_And_right(Pointer node, Pointer right);

	public static native Pointer get_op_And();

	public static native Pointer new_rd_Bad(Pointer dbgi, Pointer irg, Pointer mode);

	public static native Pointer new_r_Bad(Pointer irg, Pointer mode);

	public static native Pointer new_d_Bad(Pointer dbgi, Pointer mode);

	public static native Pointer new_Bad(Pointer mode);

	public static native int is_Bad(Pointer node);

	public static native Pointer get_op_Bad();

	public static native Pointer new_rd_Block(Pointer dbgi, Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Block(Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Block(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_Block(int arity, java.nio.Buffer in);

	public static native int is_Block(Pointer node);

	public static native int get_Block_n_cfgpreds(Pointer node);

	public static native Pointer get_Block_cfgpred(Pointer node, int pos);

	public static native void set_Block_cfgpred(Pointer node, int pos, Pointer cfgpred);

	public static native Pointer get_Block_entity(Pointer node);

	public static native void set_Block_entity(Pointer node, Pointer entity);

	public static native Pointer get_op_Block();

	public static native Pointer new_rd_Builtin(Pointer dbgi, Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native Pointer new_r_Builtin(Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native Pointer new_d_Builtin(Pointer dbgi, Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native Pointer new_Builtin(Pointer irn_mem, int arity, java.nio.Buffer in, /* ir_builtin_kind */int kind, Pointer type);

	public static native int is_Builtin(Pointer node);

	public static native Pointer get_Builtin_mem(Pointer node);

	public static native void set_Builtin_mem(Pointer node, Pointer mem);

	public static native int get_Builtin_n_params(Pointer node);

	public static native Pointer get_Builtin_param(Pointer node, int pos);

	public static native void set_Builtin_param(Pointer node, int pos, Pointer param);

	public static native /* ir_builtin_kind */int get_Builtin_kind(Pointer node);

	public static native void set_Builtin_kind(Pointer node, /* ir_builtin_kind */int kind);

	public static native Pointer get_Builtin_type(Pointer node);

	public static native void set_Builtin_type(Pointer node, Pointer type);

	public static native Pointer get_op_Builtin();

	public static native Pointer new_rd_Call(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native Pointer new_r_Call(Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native Pointer new_d_Call(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native Pointer new_Call(Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer type);

	public static native int is_Call(Pointer node);

	public static native Pointer get_Call_mem(Pointer node);

	public static native void set_Call_mem(Pointer node, Pointer mem);

	public static native Pointer get_Call_ptr(Pointer node);

	public static native void set_Call_ptr(Pointer node, Pointer ptr);

	public static native int get_Call_n_params(Pointer node);

	public static native Pointer get_Call_param(Pointer node, int pos);

	public static native void set_Call_param(Pointer node, int pos, Pointer param);

	public static native Pointer get_Call_type(Pointer node);

	public static native void set_Call_type(Pointer node, Pointer type);

	public static native Pointer get_op_Call();

	public static native Pointer new_rd_Cmp(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native Pointer new_r_Cmp(Pointer block, Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native Pointer new_d_Cmp(Pointer dbgi, Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native Pointer new_Cmp(Pointer irn_left, Pointer irn_right, /* ir_relation */int relation);

	public static native int is_Cmp(Pointer node);

	public static native Pointer get_Cmp_left(Pointer node);

	public static native void set_Cmp_left(Pointer node, Pointer left);

	public static native Pointer get_Cmp_right(Pointer node);

	public static native void set_Cmp_right(Pointer node, Pointer right);

	public static native /* ir_relation */int get_Cmp_relation(Pointer node);

	public static native void set_Cmp_relation(Pointer node, /* ir_relation */int relation);

	public static native Pointer get_op_Cmp();

	public static native Pointer new_rd_Cond(Pointer dbgi, Pointer block, Pointer irn_selector);

	public static native Pointer new_r_Cond(Pointer block, Pointer irn_selector);

	public static native Pointer new_d_Cond(Pointer dbgi, Pointer irn_selector);

	public static native Pointer new_Cond(Pointer irn_selector);

	public static native int is_Cond(Pointer node);

	public static native Pointer get_Cond_selector(Pointer node);

	public static native void set_Cond_selector(Pointer node, Pointer selector);

	public static native /* cond_jmp_predicate */int get_Cond_jmp_pred(Pointer node);

	public static native void set_Cond_jmp_pred(Pointer node, /* cond_jmp_predicate */int jmp_pred);

	public static native Pointer get_op_Cond();

	public static native Pointer new_rd_Confirm(Pointer dbgi, Pointer block, Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native Pointer new_r_Confirm(Pointer block, Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native Pointer new_d_Confirm(Pointer dbgi, Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native Pointer new_Confirm(Pointer irn_value, Pointer irn_bound, /* ir_relation */int relation);

	public static native int is_Confirm(Pointer node);

	public static native Pointer get_Confirm_value(Pointer node);

	public static native void set_Confirm_value(Pointer node, Pointer value);

	public static native Pointer get_Confirm_bound(Pointer node);

	public static native void set_Confirm_bound(Pointer node, Pointer bound);

	public static native /* ir_relation */int get_Confirm_relation(Pointer node);

	public static native void set_Confirm_relation(Pointer node, /* ir_relation */int relation);

	public static native Pointer get_op_Confirm();

	public static native Pointer new_rd_Const(Pointer dbgi, Pointer irg, Pointer tarval);

	public static native Pointer new_r_Const(Pointer irg, Pointer tarval);

	public static native Pointer new_d_Const(Pointer dbgi, Pointer tarval);

	public static native Pointer new_Const(Pointer tarval);

	public static native int is_Const(Pointer node);

	public static native Pointer get_Const_tarval(Pointer node);

	public static native void set_Const_tarval(Pointer node, Pointer tarval);

	public static native Pointer get_op_Const();

	public static native Pointer new_rd_Conv(Pointer dbgi, Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_r_Conv(Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_d_Conv(Pointer dbgi, Pointer irn_op, Pointer mode);

	public static native Pointer new_Conv(Pointer irn_op, Pointer mode);

	public static native int is_Conv(Pointer node);

	public static native Pointer get_Conv_op(Pointer node);

	public static native void set_Conv_op(Pointer node, Pointer op);

	public static native Pointer get_op_Conv();

	public static native Pointer new_rd_CopyB(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type, /* ir_cons_flags */int flags);

	public static native Pointer new_r_CopyB(Pointer block, Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type, /* ir_cons_flags */int flags);

	public static native Pointer new_d_CopyB(Pointer dbgi, Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type, /* ir_cons_flags */int flags);

	public static native Pointer new_CopyB(Pointer irn_mem, Pointer irn_dst, Pointer irn_src, Pointer type, /* ir_cons_flags */int flags);

	public static native int is_CopyB(Pointer node);

	public static native Pointer get_CopyB_mem(Pointer node);

	public static native void set_CopyB_mem(Pointer node, Pointer mem);

	public static native Pointer get_CopyB_dst(Pointer node);

	public static native void set_CopyB_dst(Pointer node, Pointer dst);

	public static native Pointer get_CopyB_src(Pointer node);

	public static native void set_CopyB_src(Pointer node, Pointer src);

	public static native Pointer get_CopyB_type(Pointer node);

	public static native void set_CopyB_type(Pointer node, Pointer type);

	public static native /* ir_volatility */int get_CopyB_volatility(Pointer node);

	public static native void set_CopyB_volatility(Pointer node, /* ir_volatility */int volatility);

	public static native Pointer get_op_CopyB();

	public static native int is_Deleted(Pointer node);

	public static native Pointer get_op_Deleted();

	public static native Pointer new_rd_Div(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_r_Div(Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_d_Div(Pointer dbgi, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_Div(Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native int is_Div(Pointer node);

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

	public static native Pointer get_op_Div();

	public static native Pointer new_rd_Dummy(Pointer dbgi, Pointer irg, Pointer mode);

	public static native Pointer new_r_Dummy(Pointer irg, Pointer mode);

	public static native Pointer new_d_Dummy(Pointer dbgi, Pointer mode);

	public static native Pointer new_Dummy(Pointer mode);

	public static native int is_Dummy(Pointer node);

	public static native Pointer get_op_Dummy();

	public static native Pointer new_rd_End(Pointer dbgi, Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_r_End(Pointer irg, int arity, java.nio.Buffer in);

	public static native Pointer new_d_End(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_End(int arity, java.nio.Buffer in);

	public static native int is_End(Pointer node);

	public static native int get_End_n_keepalives(Pointer node);

	public static native Pointer get_End_keepalive(Pointer node, int pos);

	public static native void set_End_keepalive(Pointer node, int pos, Pointer keepalive);

	public static native Pointer get_op_End();

	public static native Pointer new_rd_Eor(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Eor(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Eor(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Eor(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Eor(Pointer node);

	public static native Pointer get_Eor_left(Pointer node);

	public static native void set_Eor_left(Pointer node, Pointer left);

	public static native Pointer get_Eor_right(Pointer node);

	public static native void set_Eor_right(Pointer node, Pointer right);

	public static native Pointer get_op_Eor();

	public static native Pointer new_rd_Free(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr);

	public static native Pointer new_r_Free(Pointer block, Pointer irn_mem, Pointer irn_ptr);

	public static native Pointer new_d_Free(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr);

	public static native Pointer new_Free(Pointer irn_mem, Pointer irn_ptr);

	public static native int is_Free(Pointer node);

	public static native Pointer get_Free_mem(Pointer node);

	public static native void set_Free_mem(Pointer node, Pointer mem);

	public static native Pointer get_Free_ptr(Pointer node);

	public static native void set_Free_ptr(Pointer node, Pointer ptr);

	public static native Pointer get_op_Free();

	public static native Pointer new_rd_IJmp(Pointer dbgi, Pointer block, Pointer irn_target);

	public static native Pointer new_r_IJmp(Pointer block, Pointer irn_target);

	public static native Pointer new_d_IJmp(Pointer dbgi, Pointer irn_target);

	public static native Pointer new_IJmp(Pointer irn_target);

	public static native int is_IJmp(Pointer node);

	public static native Pointer get_IJmp_target(Pointer node);

	public static native void set_IJmp_target(Pointer node, Pointer target);

	public static native Pointer get_op_IJmp();

	public static native Pointer new_rd_Id(Pointer dbgi, Pointer block, Pointer irn_pred, Pointer mode);

	public static native Pointer new_r_Id(Pointer block, Pointer irn_pred, Pointer mode);

	public static native Pointer new_d_Id(Pointer dbgi, Pointer irn_pred, Pointer mode);

	public static native Pointer new_Id(Pointer irn_pred, Pointer mode);

	public static native int is_Id(Pointer node);

	public static native Pointer get_Id_pred(Pointer node);

	public static native void set_Id_pred(Pointer node, Pointer pred);

	public static native Pointer get_op_Id();

	public static native Pointer new_rd_Jmp(Pointer dbgi, Pointer block);

	public static native Pointer new_r_Jmp(Pointer block);

	public static native Pointer new_d_Jmp(Pointer dbgi);

	public static native Pointer new_Jmp();

	public static native int is_Jmp(Pointer node);

	public static native Pointer get_op_Jmp();

	public static native Pointer new_rd_Load(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_r_Load(Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_d_Load(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native Pointer new_Load(Pointer irn_mem, Pointer irn_ptr, Pointer mode, /* ir_cons_flags */int flags);

	public static native int is_Load(Pointer node);

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

	public static native Pointer get_op_Load();

	public static native Pointer new_rd_Minus(Pointer dbgi, Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_r_Minus(Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_d_Minus(Pointer dbgi, Pointer irn_op, Pointer mode);

	public static native Pointer new_Minus(Pointer irn_op, Pointer mode);

	public static native int is_Minus(Pointer node);

	public static native Pointer get_Minus_op(Pointer node);

	public static native void set_Minus_op(Pointer node, Pointer op);

	public static native Pointer get_op_Minus();

	public static native Pointer new_rd_Mod(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_r_Mod(Pointer block, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_d_Mod(Pointer dbgi, Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native Pointer new_Mod(Pointer irn_mem, Pointer irn_left, Pointer irn_right, Pointer resmode, /* op_pin_state */int pin_state);

	public static native int is_Mod(Pointer node);

	public static native Pointer get_Mod_mem(Pointer node);

	public static native void set_Mod_mem(Pointer node, Pointer mem);

	public static native Pointer get_Mod_left(Pointer node);

	public static native void set_Mod_left(Pointer node, Pointer left);

	public static native Pointer get_Mod_right(Pointer node);

	public static native void set_Mod_right(Pointer node, Pointer right);

	public static native Pointer get_Mod_resmode(Pointer node);

	public static native void set_Mod_resmode(Pointer node, Pointer resmode);

	public static native Pointer get_op_Mod();

	public static native Pointer new_rd_Mul(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Mul(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Mul(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Mul(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Mul(Pointer node);

	public static native Pointer get_Mul_left(Pointer node);

	public static native void set_Mul_left(Pointer node, Pointer left);

	public static native Pointer get_Mul_right(Pointer node);

	public static native void set_Mul_right(Pointer node, Pointer right);

	public static native Pointer get_op_Mul();

	public static native Pointer new_rd_Mulh(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Mulh(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Mulh(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Mulh(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Mulh(Pointer node);

	public static native Pointer get_Mulh_left(Pointer node);

	public static native void set_Mulh_left(Pointer node, Pointer left);

	public static native Pointer get_Mulh_right(Pointer node);

	public static native void set_Mulh_right(Pointer node, Pointer right);

	public static native Pointer get_op_Mulh();

	public static native Pointer new_rd_Mux(Pointer dbgi, Pointer block, Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native Pointer new_r_Mux(Pointer block, Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native Pointer new_d_Mux(Pointer dbgi, Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native Pointer new_Mux(Pointer irn_sel, Pointer irn_false, Pointer irn_true, Pointer mode);

	public static native int is_Mux(Pointer node);

	public static native Pointer get_Mux_sel(Pointer node);

	public static native void set_Mux_sel(Pointer node, Pointer sel);

	public static native Pointer get_Mux_false(Pointer node);

	public static native void set_Mux_false(Pointer node, Pointer false_);

	public static native Pointer get_Mux_true(Pointer node);

	public static native void set_Mux_true(Pointer node, Pointer true_);

	public static native Pointer get_op_Mux();

	public static native Pointer new_rd_NoMem(Pointer dbgi, Pointer irg);

	public static native Pointer new_r_NoMem(Pointer irg);

	public static native Pointer new_d_NoMem(Pointer dbgi);

	public static native Pointer new_NoMem();

	public static native int is_NoMem(Pointer node);

	public static native Pointer get_op_NoMem();

	public static native Pointer new_rd_Not(Pointer dbgi, Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_r_Not(Pointer block, Pointer irn_op, Pointer mode);

	public static native Pointer new_d_Not(Pointer dbgi, Pointer irn_op, Pointer mode);

	public static native Pointer new_Not(Pointer irn_op, Pointer mode);

	public static native int is_Not(Pointer node);

	public static native Pointer get_Not_op(Pointer node);

	public static native void set_Not_op(Pointer node, Pointer op);

	public static native Pointer get_op_Not();

	public static native Pointer new_rd_Offset(Pointer dbgi, Pointer irg, Pointer mode, Pointer entity);

	public static native Pointer new_r_Offset(Pointer irg, Pointer mode, Pointer entity);

	public static native Pointer new_d_Offset(Pointer dbgi, Pointer mode, Pointer entity);

	public static native Pointer new_Offset(Pointer mode, Pointer entity);

	public static native int is_Offset(Pointer node);

	public static native Pointer get_Offset_entity(Pointer node);

	public static native void set_Offset_entity(Pointer node, Pointer entity);

	public static native Pointer get_op_Offset();

	public static native Pointer new_rd_Or(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Or(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Or(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Or(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Or(Pointer node);

	public static native Pointer get_Or_left(Pointer node);

	public static native void set_Or_left(Pointer node, Pointer left);

	public static native Pointer get_Or_right(Pointer node);

	public static native void set_Or_right(Pointer node, Pointer right);

	public static native Pointer get_op_Or();

	public static native Pointer new_rd_Phi(Pointer dbgi, Pointer block, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_r_Phi(Pointer block, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_d_Phi(Pointer dbgi, int arity, java.nio.Buffer in, Pointer mode);

	public static native Pointer new_Phi(int arity, java.nio.Buffer in, Pointer mode);

	public static native int is_Phi(Pointer node);

	public static native int get_Phi_n_preds(Pointer node);

	public static native Pointer get_Phi_pred(Pointer node, int pos);

	public static native void set_Phi_pred(Pointer node, int pos, Pointer pred);

	public static native Pointer get_op_Phi();

	public static native Pointer new_rd_Pin(Pointer dbgi, Pointer block, Pointer irn_op);

	public static native Pointer new_r_Pin(Pointer block, Pointer irn_op);

	public static native Pointer new_d_Pin(Pointer dbgi, Pointer irn_op);

	public static native Pointer new_Pin(Pointer irn_op);

	public static native int is_Pin(Pointer node);

	public static native Pointer get_Pin_op(Pointer node);

	public static native void set_Pin_op(Pointer node, Pointer op);

	public static native Pointer get_op_Pin();

	public static native Pointer new_rd_Proj(Pointer dbgi, Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_r_Proj(Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_d_Proj(Pointer dbgi, Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native Pointer new_Proj(Pointer irn_pred, Pointer mode, com.sun.jna.NativeLong proj);

	public static native int is_Proj(Pointer node);

	public static native Pointer get_Proj_pred(Pointer node);

	public static native void set_Proj_pred(Pointer node, Pointer pred);

	public static native com.sun.jna.NativeLong get_Proj_proj(Pointer node);

	public static native void set_Proj_proj(Pointer node, com.sun.jna.NativeLong proj);

	public static native Pointer get_op_Proj();

	public static native Pointer new_rd_Raise(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_exo_ptr);

	public static native Pointer new_r_Raise(Pointer block, Pointer irn_mem, Pointer irn_exo_ptr);

	public static native Pointer new_d_Raise(Pointer dbgi, Pointer irn_mem, Pointer irn_exo_ptr);

	public static native Pointer new_Raise(Pointer irn_mem, Pointer irn_exo_ptr);

	public static native int is_Raise(Pointer node);

	public static native Pointer get_Raise_mem(Pointer node);

	public static native void set_Raise_mem(Pointer node, Pointer mem);

	public static native Pointer get_Raise_exo_ptr(Pointer node);

	public static native void set_Raise_exo_ptr(Pointer node, Pointer exo_ptr);

	public static native Pointer get_op_Raise();

	public static native Pointer new_rd_Return(Pointer dbgi, Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Return(Pointer block, Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Return(Pointer dbgi, Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native Pointer new_Return(Pointer irn_mem, int arity, java.nio.Buffer in);

	public static native int is_Return(Pointer node);

	public static native Pointer get_Return_mem(Pointer node);

	public static native void set_Return_mem(Pointer node, Pointer mem);

	public static native int get_Return_n_ress(Pointer node);

	public static native Pointer get_Return_res(Pointer node, int pos);

	public static native void set_Return_res(Pointer node, int pos, Pointer res);

	public static native Pointer get_op_Return();

	public static native Pointer new_rd_Sel(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native Pointer new_r_Sel(Pointer block, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native Pointer new_d_Sel(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native Pointer new_Sel(Pointer irn_mem, Pointer irn_ptr, int arity, java.nio.Buffer in, Pointer entity);

	public static native int is_Sel(Pointer node);

	public static native Pointer get_Sel_mem(Pointer node);

	public static native void set_Sel_mem(Pointer node, Pointer mem);

	public static native Pointer get_Sel_ptr(Pointer node);

	public static native void set_Sel_ptr(Pointer node, Pointer ptr);

	public static native int get_Sel_n_indexs(Pointer node);

	public static native Pointer get_Sel_index(Pointer node, int pos);

	public static native void set_Sel_index(Pointer node, int pos, Pointer index);

	public static native Pointer get_Sel_entity(Pointer node);

	public static native void set_Sel_entity(Pointer node, Pointer entity);

	public static native Pointer get_op_Sel();

	public static native Pointer new_rd_Shl(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Shl(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Shl(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Shl(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Shl(Pointer node);

	public static native Pointer get_Shl_left(Pointer node);

	public static native void set_Shl_left(Pointer node, Pointer left);

	public static native Pointer get_Shl_right(Pointer node);

	public static native void set_Shl_right(Pointer node, Pointer right);

	public static native Pointer get_op_Shl();

	public static native Pointer new_rd_Shr(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Shr(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Shr(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Shr(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Shr(Pointer node);

	public static native Pointer get_Shr_left(Pointer node);

	public static native void set_Shr_left(Pointer node, Pointer left);

	public static native Pointer get_Shr_right(Pointer node);

	public static native void set_Shr_right(Pointer node, Pointer right);

	public static native Pointer get_op_Shr();

	public static native Pointer new_rd_Shrs(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Shrs(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Shrs(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Shrs(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Shrs(Pointer node);

	public static native Pointer get_Shrs_left(Pointer node);

	public static native void set_Shrs_left(Pointer node, Pointer left);

	public static native Pointer get_Shrs_right(Pointer node);

	public static native void set_Shrs_right(Pointer node, Pointer right);

	public static native Pointer get_op_Shrs();

	public static native Pointer new_rd_Size(Pointer dbgi, Pointer irg, Pointer mode, Pointer type);

	public static native Pointer new_r_Size(Pointer irg, Pointer mode, Pointer type);

	public static native Pointer new_d_Size(Pointer dbgi, Pointer mode, Pointer type);

	public static native Pointer new_Size(Pointer mode, Pointer type);

	public static native int is_Size(Pointer node);

	public static native Pointer get_Size_type(Pointer node);

	public static native void set_Size_type(Pointer node, Pointer type);

	public static native Pointer get_op_Size();

	public static native Pointer new_rd_Start(Pointer dbgi, Pointer irg);

	public static native Pointer new_r_Start(Pointer irg);

	public static native Pointer new_d_Start(Pointer dbgi);

	public static native Pointer new_Start();

	public static native int is_Start(Pointer node);

	public static native Pointer get_op_Start();

	public static native Pointer new_rd_Store(Pointer dbgi, Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native Pointer new_r_Store(Pointer block, Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native Pointer new_d_Store(Pointer dbgi, Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native Pointer new_Store(Pointer irn_mem, Pointer irn_ptr, Pointer irn_value, /* ir_cons_flags */int flags);

	public static native int is_Store(Pointer node);

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

	public static native Pointer get_op_Store();

	public static native Pointer new_rd_Sub(Pointer dbgi, Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_r_Sub(Pointer block, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_d_Sub(Pointer dbgi, Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native Pointer new_Sub(Pointer irn_left, Pointer irn_right, Pointer mode);

	public static native int is_Sub(Pointer node);

	public static native Pointer get_Sub_left(Pointer node);

	public static native void set_Sub_left(Pointer node, Pointer left);

	public static native Pointer get_Sub_right(Pointer node);

	public static native void set_Sub_right(Pointer node, Pointer right);

	public static native Pointer get_op_Sub();

	public static native Pointer new_rd_Switch(Pointer dbgi, Pointer block, Pointer irn_selector, int n_outs, Pointer table);

	public static native Pointer new_r_Switch(Pointer block, Pointer irn_selector, int n_outs, Pointer table);

	public static native Pointer new_d_Switch(Pointer dbgi, Pointer irn_selector, int n_outs, Pointer table);

	public static native Pointer new_Switch(Pointer irn_selector, int n_outs, Pointer table);

	public static native int is_Switch(Pointer node);

	public static native Pointer get_Switch_selector(Pointer node);

	public static native void set_Switch_selector(Pointer node, Pointer selector);

	public static native int get_Switch_n_outs(Pointer node);

	public static native void set_Switch_n_outs(Pointer node, int n_outs);

	public static native Pointer get_Switch_table(Pointer node);

	public static native void set_Switch_table(Pointer node, Pointer table);

	public static native Pointer get_op_Switch();

	public static native Pointer new_rd_Sync(Pointer dbgi, Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Sync(Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Sync(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_Sync(int arity, java.nio.Buffer in);

	public static native int is_Sync(Pointer node);

	public static native int get_Sync_n_preds(Pointer node);

	public static native Pointer get_Sync_pred(Pointer node, int pos);

	public static native void set_Sync_pred(Pointer node, int pos, Pointer pred);

	public static native Pointer get_op_Sync();

	public static native Pointer new_rd_Tuple(Pointer dbgi, Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_r_Tuple(Pointer block, int arity, java.nio.Buffer in);

	public static native Pointer new_d_Tuple(Pointer dbgi, int arity, java.nio.Buffer in);

	public static native Pointer new_Tuple(int arity, java.nio.Buffer in);

	public static native int is_Tuple(Pointer node);

	public static native int get_Tuple_n_preds(Pointer node);

	public static native Pointer get_Tuple_pred(Pointer node, int pos);

	public static native void set_Tuple_pred(Pointer node, int pos, Pointer pred);

	public static native Pointer get_op_Tuple();

	public static native Pointer new_rd_Unknown(Pointer dbgi, Pointer irg, Pointer mode);

	public static native Pointer new_r_Unknown(Pointer irg, Pointer mode);

	public static native Pointer new_d_Unknown(Pointer dbgi, Pointer mode);

	public static native Pointer new_Unknown(Pointer mode);

	public static native int is_Unknown(Pointer node);

	public static native Pointer get_op_Unknown();

	public static native Pointer new_rd_Const_long(Pointer db, Pointer irg, Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_r_Const_long(Pointer irg, Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_d_Const_long(Pointer db, Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_Const_long(Pointer mode, com.sun.jna.NativeLong value);

	public static native Pointer new_rd_simpleSel(Pointer db, Pointer block, Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_r_simpleSel(Pointer block, Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_d_simpleSel(Pointer db, Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_simpleSel(Pointer store, Pointer objptr, Pointer ent);

	public static native Pointer new_rd_DivRL(Pointer db, Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_r_DivRL(Pointer block, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_d_DivRL(Pointer db, Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_DivRL(Pointer memop, Pointer op1, Pointer op2, Pointer mode, /* op_pin_state */int state);

	public static native Pointer new_rd_ASM(Pointer db, Pointer block, Pointer mem, int arity, java.nio.Buffer in, Pointer inputs, com.sun.jna.NativeLong n_outs, Pointer outputs, com.sun.jna.NativeLong n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native Pointer new_r_ASM(Pointer block, Pointer mem, int arity, java.nio.Buffer in, Pointer inputs, com.sun.jna.NativeLong n_outs, Pointer outputs, com.sun.jna.NativeLong n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native Pointer new_d_ASM(Pointer db, Pointer mem, int arity, java.nio.Buffer in, Pointer inputs, com.sun.jna.NativeLong n_outs, Pointer outputs, com.sun.jna.NativeLong n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native Pointer new_ASM(Pointer mem, int arity, java.nio.Buffer in, Pointer inputs, com.sun.jna.NativeLong n_outs, Pointer outputs, com.sun.jna.NativeLong n_clobber, java.nio.Buffer clobber, Pointer asm_text);

	public static native Pointer get_current_ir_graph();

	public static native void set_current_ir_graph(Pointer graph);

	public static native Pointer new_d_immBlock(Pointer db);

	public static native Pointer new_immBlock();

	public static native Pointer new_r_immBlock(Pointer irg);

	public static native Pointer new_rd_immBlock(Pointer db, Pointer irg);

	public static native void add_immBlock_pred(Pointer immblock, Pointer jmp);

	public static native void mature_immBlock(Pointer block);

	public static native void set_cur_block(Pointer target);

	public static native void set_r_cur_block(Pointer irg, Pointer target);

	public static native Pointer get_cur_block();

	public static native Pointer get_r_cur_block(Pointer irg);

	public static native Pointer get_value(int pos, Pointer mode);

	public static native Pointer get_r_value(Pointer irg, int pos, Pointer mode);

	public static native Pointer ir_guess_mode(int pos);

	public static native Pointer ir_r_guess_mode(Pointer irg, int pos);

	public static native void set_value(int pos, Pointer value);

	public static native void set_r_value(Pointer irg, int pos, Pointer value);

	public static native Pointer get_store();

	public static native Pointer get_r_store(Pointer irg);

	public static native void set_store(Pointer store);

	public static native void set_r_store(Pointer irg, Pointer store);

	public static native void keep_alive(Pointer ka);

	public static native void irg_finalize_cons(Pointer irg);

	public static native void irp_finalize_cons();

	public static native void ir_set_uninitialized_local_variable_func(Pointer func);
}
