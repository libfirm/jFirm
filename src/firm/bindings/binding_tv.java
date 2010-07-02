package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Pointer;


public interface binding_tv extends Library {
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
		symconst_addr_ent(),
		symconst_ofs_ent(),
		symconst_enum_const();
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
		private static class C { static int next_val; }

		ir_builtin_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_builtin_kind() {
			this.val = C.next_val++;
		}
		
		public static ir_builtin_kind getEnum(int val) {
			for(ir_builtin_kind entry : values()) {
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
		private static class C { static int next_val; }

		firm_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		firm_kind() {
			this.val = C.next_val++;
		}
		
		public static firm_kind getEnum(int val) {
			for(firm_kind entry : values()) {
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
	public static enum ir_linkage {
		IR_LINKAGE_DEFAULT(0),
		IR_LINKAGE_CONSTANT((1<<0)),
		IR_LINKAGE_WEAK((1<<1)),
		IR_LINKAGE_GARBAGE_COLLECT((1<<2)),
		IR_LINKAGE_MERGE((1<<3)),
		IR_LINKAGE_HIDDEN_USER((1<<4));
		public final int val;
		private static class C { static int next_val; }

		ir_linkage(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_linkage() {
			this.val = C.next_val++;
		}
		
		public static ir_linkage getEnum(int val) {
			for(ir_linkage entry : values()) {
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
		tpo_code(),
		tpo_none(),
		tpo_unknown(),
		tpo_last(tp_opcode.tpo_unknown.val);
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
	public static enum ir_variadicity {
		variadicity_non_variadic(),
		variadicity_variadic();
		public final int val;
		private static class C { static int next_val; }

		ir_variadicity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_variadicity() {
			this.val = C.next_val++;
		}
		
		public static ir_variadicity getEnum(int val) {
			for(ir_variadicity entry : values()) {
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
		cc_bits((0xFF<<24));
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
	public static enum ir_peculiarity {
		peculiarity_existent(),
		peculiarity_description(),
		peculiarity_inherited();
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
	public static enum __codecvt_result {
		__codecvt_ok(),
		__codecvt_partial(),
		__codecvt_error(),
		__codecvt_noconv();
		public final int val;
		private static class C { static int next_val; }

		__codecvt_result(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		__codecvt_result() {
			this.val = C.next_val++;
		}
		
		public static __codecvt_result getEnum(int val) {
			for(__codecvt_result entry : values()) {
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
		private static class C { static int next_val; }

		op_arity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		op_arity() {
			this.val = C.next_val++;
		}
		
		public static op_arity getEnum(int val) {
			for(op_arity entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irop_flags {
		irop_flag_none(0x00000000),
		irop_flag_labeled(0x00000001),
		irop_flag_commutative(0x00000002),
		irop_flag_cfopcode(0x00000004),
		irop_flag_ip_cfopcode(0x00000008),
		irop_flag_fragile(0x00000010),
		irop_flag_forking(0x00000020),
		irop_flag_highlevel(0x00000040),
		irop_flag_constlike(0x00000080),
		irop_flag_always_opt(0x00000100),
		irop_flag_keep(0x00000200),
		irop_flag_start_block(0x00000400),
		irop_flag_uses_memory(0x00000800),
		irop_flag_dump_noblock(0x00001000),
		irop_flag_dump_noinput(0x00002000),
		irop_flag_machine(0x00010000),
		irop_flag_machine_op(0x00020000),
		irop_flag_cse_neutral(0x00040000),
		irop_flag_user(0x00080000);
		public final int val;
		private static class C { static int next_val; }

		irop_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irop_flags() {
			this.val = C.next_val++;
		}
		
		public static irop_flags getEnum(int val) {
			for(irop_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_opcode {
		iro_Block(),
		iro_First(ir_opcode.iro_Block.val),
		iro_Start(),
		iro_End(),
		iro_Jmp(),
		iro_IJmp(),
		iro_Cond(),
		iro_Return(),
		iro_Const(),
		iro_SymConst(),
		iro_Sel(),
		iro_Call(),
		iro_Add(),
		iro_Sub(),
		iro_Minus(),
		iro_Mul(),
		iro_Mulh(),
		iro_Quot(),
		iro_DivMod(),
		iro_Div(),
		iro_Mod(),
		iro_Abs(),
		iro_And(),
		iro_Or(),
		iro_Eor(),
		iro_Not(),
		iro_Cmp(),
		iro_Shl(),
		iro_Shr(),
		iro_Shrs(),
		iro_Rotl(),
		iro_Conv(),
		iro_Cast(),
		iro_Carry(),
		iro_Borrow(),
		iro_Phi(),
		iro_Load(),
		iro_Store(),
		iro_Alloc(),
		iro_Free(),
		iro_Sync(),
		iro_Proj(),
		iro_Tuple(),
		iro_Id(),
		iro_Bad(),
		iro_Confirm(),
		iro_Unknown(),
		iro_Filter(),
		iro_Break(),
		iro_CallBegin(),
		iro_EndReg(),
		iro_EndExcept(),
		iro_NoMem(),
		iro_Mux(),
		iro_CopyB(),
		iro_InstOf(),
		iro_Raise(),
		iro_Bound(),
		iro_Pin(),
		iro_ASM(),
		iro_Builtin(),
		iro_Dummy(),
		iro_Anchor(),
		iro_Last(ir_opcode.iro_Anchor.val),
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
		private static class C { static int next_val; }

		ir_opcode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_opcode() {
			this.val = C.next_val++;
		}
		
		public static ir_opcode getEnum(int val) {
			for(ir_opcode entry : values()) {
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
		private static class C { static int next_val; }

		dump_reason_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		dump_reason_t() {
			this.val = C.next_val++;
		}
		
		public static dump_reason_t getEnum(int val) {
			for(dump_reason_t entry : values()) {
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
		private static class C { static int next_val; }

		ir_mode_sort_helper(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_sort_helper() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_sort_helper getEnum(int val) {
			for(ir_mode_sort_helper entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_mode_sort {
		irms_auxiliary(0),
		irms_control_flow(1),
		irms_memory((2|ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_internal_boolean((3|ir_mode_sort_helper.irmsh_is_datab.val)),
		irms_reference((((4|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)),
		irms_int_number(((((5|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)|ir_mode_sort_helper.irmsh_is_num.val)),
		irms_float_number(((((6|ir_mode_sort_helper.irmsh_is_data.val)|ir_mode_sort_helper.irmsh_is_datab.val)|ir_mode_sort_helper.irmsh_is_dataM.val)|ir_mode_sort_helper.irmsh_is_num.val));
		public final int val;
		private static class C { static int next_val; }

		ir_mode_sort(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_sort() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_sort getEnum(int val) {
			for(ir_mode_sort entry : values()) {
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
		private static class C { static int next_val; }

		ir_mode_arithmetic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_mode_arithmetic() {
			this.val = C.next_val++;
		}
		
		public static ir_mode_arithmetic getEnum(int val) {
			for(ir_mode_arithmetic entry : values()) {
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
		private static class C { static int next_val; }

		pn_generic(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_generic() {
			this.val = C.next_val++;
		}
		
		public static pn_generic getEnum(int val) {
			for(pn_generic entry : values()) {
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
		private static class C { static int next_val; }

		pn_Start(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Start() {
			this.val = C.next_val++;
		}
		
		public static pn_Start getEnum(int val) {
			for(pn_Start entry : values()) {
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
		private static class C { static int next_val; }

		pn_Cond(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Cond() {
			this.val = C.next_val++;
		}
		
		public static pn_Cond getEnum(int val) {
			for(pn_Cond entry : values()) {
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
		private static class C { static int next_val; }

		pn_Call(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Call() {
			this.val = C.next_val++;
		}
		
		public static pn_Call getEnum(int val) {
			for(pn_Call entry : values()) {
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
		private static class C { static int next_val; }

		pn_Builtin(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Builtin() {
			this.val = C.next_val++;
		}
		
		public static pn_Builtin getEnum(int val) {
			for(pn_Builtin entry : values()) {
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
		private static class C { static int next_val; }

		pn_Quot(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Quot() {
			this.val = C.next_val++;
		}
		
		public static pn_Quot getEnum(int val) {
			for(pn_Quot entry : values()) {
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
		private static class C { static int next_val; }

		pn_DivMod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_DivMod() {
			this.val = C.next_val++;
		}
		
		public static pn_DivMod getEnum(int val) {
			for(pn_DivMod entry : values()) {
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
		private static class C { static int next_val; }

		pn_Div(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Div() {
			this.val = C.next_val++;
		}
		
		public static pn_Div getEnum(int val) {
			for(pn_Div entry : values()) {
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
		private static class C { static int next_val; }

		pn_Mod(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Mod() {
			this.val = C.next_val++;
		}
		
		public static pn_Mod getEnum(int val) {
			for(pn_Mod entry : values()) {
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
		private static class C { static int next_val; }

		pn_Load(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Load() {
			this.val = C.next_val++;
		}
		
		public static pn_Load getEnum(int val) {
			for(pn_Load entry : values()) {
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
		pn_Store_max(pn_generic.pn_Generic_other.val);
		public final int val;
		private static class C { static int next_val; }

		pn_Store(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Store() {
			this.val = C.next_val++;
		}
		
		public static pn_Store getEnum(int val) {
			for(pn_Store entry : values()) {
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
		private static class C { static int next_val; }

		pn_Alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Alloc() {
			this.val = C.next_val++;
		}
		
		public static pn_Alloc getEnum(int val) {
			for(pn_Alloc entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_CopyB {
		pn_CopyB_M_regular(pn_generic.pn_Generic_M.val),
		pn_CopyB_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_CopyB_X_except(pn_generic.pn_Generic_X_except.val),
		pn_CopyB_max(pn_generic.pn_Generic_other.val);
		public final int val;
		private static class C { static int next_val; }

		pn_CopyB(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_CopyB() {
			this.val = C.next_val++;
		}
		
		public static pn_CopyB getEnum(int val) {
			for(pn_CopyB entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum pn_InstOf {
		pn_InstOf_M_regular(pn_generic.pn_Generic_M.val),
		pn_InstOf_X_regular(pn_generic.pn_Generic_X_regular.val),
		pn_InstOf_X_except(pn_generic.pn_Generic_X_except.val),
		pn_InstOf_res(pn_generic.pn_Generic_other.val),
		pn_InstOf_max();
		public final int val;
		private static class C { static int next_val; }

		pn_InstOf(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_InstOf() {
			this.val = C.next_val++;
		}
		
		public static pn_InstOf getEnum(int val) {
			for(pn_InstOf entry : values()) {
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
		private static class C { static int next_val; }

		pn_Raise(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Raise() {
			this.val = C.next_val++;
		}
		
		public static pn_Raise getEnum(int val) {
			for(pn_Raise entry : values()) {
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
		private static class C { static int next_val; }

		pn_Bound(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		pn_Bound() {
			this.val = C.next_val++;
		}
		
		public static pn_Bound getEnum(int val) {
			for(pn_Bound entry : values()) {
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
		private static class C { static int next_val; }

		cond_jmp_predicate(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		cond_jmp_predicate() {
			this.val = C.next_val++;
		}
		
		public static cond_jmp_predicate getEnum(int val) {
			for(cond_jmp_predicate entry : values()) {
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
		private static class C { static int next_val; }

		tarval_int_overflow_mode_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		tarval_int_overflow_mode_t() {
			this.val = C.next_val++;
		}
		
		public static tarval_int_overflow_mode_t getEnum(int val) {
			for(tarval_int_overflow_mode_t entry : values()) {
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
		private static class C { static int next_val; }

		tv_output_mode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		tv_output_mode() {
			this.val = C.next_val++;
		}
		
		public static tv_output_mode getEnum(int val) {
			for(tv_output_mode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	void ir_init(Pointer params);
	void ir_finish();
	int ir_get_version_major();
	int ir_get_version_minor();
	String ir_get_version_revision();
	String ir_get_version_build();
	/* firm_kind */int get_kind(Pointer firm_thing);
	String print_firm_kind(Pointer firm_thing);
	void firm_identify_thing(Pointer X);
	/* ir_visibility */int get_entity_visibility(Pointer entity);
	void set_entity_visibility(Pointer entity, /* ir_visibility */int visibility);
	int entity_is_externally_visible(Pointer entity);
	int entity_has_definition(Pointer entity);
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
	/* ir_linkage */int get_entity_linkage(Pointer entity);
	void set_entity_linkage(Pointer entity, /* ir_linkage */int linkage);
	void add_entity_linkage(Pointer entity, /* ir_linkage */int linkage);
	void remove_entity_linkage(Pointer entity, /* ir_linkage */int linkage);
	int is_entity_constant(Pointer ent);
	/* ir_volatility */int get_entity_volatility(Pointer ent);
	void set_entity_volatility(Pointer ent, /* ir_volatility */int vol);
	String get_volatility_name(/* ir_volatility */int var);
	int get_entity_alignment(Pointer entity);
	void set_entity_alignment(Pointer entity, int alignment);
	/* ir_align */int get_entity_aligned(Pointer ent);
	void set_entity_aligned(Pointer ent, /* ir_align */int a);
	String get_align_name(/* ir_align */int a);
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
	void set_entity_label(Pointer ent, com.sun.jna.NativeLong label);
	com.sun.jna.NativeLong get_entity_label(Pointer ent);
	int is_entity_compiler_generated(Pointer ent);
	void set_entity_compiler_generated(Pointer ent, int flag);
	/* ir_entity_usage */int get_entity_usage(Pointer ent);
	void set_entity_usage(Pointer ent, /* ir_entity_usage */int flag);
	Pointer get_entity_dbg_info(Pointer ent);
	void set_entity_dbg_info(Pointer ent, Pointer db);
	int is_irn_const_expression(Pointer n);
	Pointer copy_const_value(Pointer dbg, Pointer n);
	Pointer get_atomic_ent_value(Pointer ent);
	void set_atomic_ent_value(Pointer ent, Pointer val);
	/* ir_initializer_kind_t */int get_initializer_kind(Pointer initializer);
	String get_initializer_kind_name(/* ir_initializer_kind_t */int ini);
	Pointer get_initializer_null();
	Pointer create_initializer_const(Pointer value);
	Pointer create_initializer_tarval(Pointer tv);
	Pointer get_initializer_const_value(Pointer initializer);
	Pointer get_initializer_tarval_value(Pointer initialzier);
	Pointer create_initializer_compound(int n_entries);
	int get_initializer_compound_n_entries(Pointer initializer);
	void set_initializer_compound_value(Pointer initializer, int index, Pointer value);
	Pointer get_initializer_compound_value(Pointer initializer, int index);
	void set_entity_initializer(Pointer entity, Pointer initializer);
	int has_entity_initializer(Pointer entity);
	Pointer get_entity_initializer(Pointer entity);
	void add_entity_overwrites(Pointer ent, Pointer overwritten);
	int get_entity_n_overwrites(Pointer ent);
	int get_entity_overwrites_index(Pointer ent, Pointer overwritten);
	Pointer get_entity_overwrites(Pointer ent, int pos);
	void set_entity_overwrites(Pointer ent, int pos, Pointer overwritten);
	void remove_entity_overwrites(Pointer ent, Pointer overwritten);
	int get_entity_n_overwrittenby(Pointer ent);
	int get_entity_overwrittenby_index(Pointer ent, Pointer overwrites);
	Pointer get_entity_overwrittenby(Pointer ent, int pos);
	void set_entity_overwrittenby(Pointer ent, int pos, Pointer overwrites);
	void remove_entity_overwrittenby(Pointer ent, Pointer overwrites);
	int is_entity(Pointer thing);
	int is_atomic_entity(Pointer ent);
	int is_compound_entity(Pointer ent);
	int is_method_entity(Pointer ent);
	com.sun.jna.NativeLong get_entity_nr(Pointer ent);
	com.sun.jna.NativeLong get_entity_visited(Pointer ent);
	void set_entity_visited(Pointer ent, com.sun.jna.NativeLong num);
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
	Pointer get_tpop_class();
	Pointer get_tpop_struct();
	Pointer get_tpop_method();
	Pointer get_tpop_union();
	Pointer get_tpop_array();
	Pointer get_tpop_enumeration();
	Pointer get_tpop_pointer();
	Pointer get_tpop_primitive();
	Pointer get_tpop_code_type();
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
	void free_type_entities(Pointer tp);
	void free_type(Pointer tp);
	Pointer get_type_tpop(Pointer tp);
	Pointer get_type_tpop_nameid(Pointer tp);
	String get_type_tpop_name(Pointer tp);
	/* tp_opcode */int get_type_tpop_code(Pointer tp);
	void ir_print_type(String buffer, com.sun.jna.NativeLong buffer_size, Pointer tp);
	String get_type_state_name(/* ir_type_state */int s);
	/* ir_type_state */int get_type_state(Pointer tp);
	void set_type_state(Pointer tp, /* ir_type_state */int state);
	Pointer get_type_mode(Pointer tp);
	void set_type_mode(Pointer tp, Pointer m);
	int get_type_size_bytes(Pointer tp);
	void set_type_size_bytes(Pointer tp, int size);
	int get_type_alignment_bytes(Pointer tp);
	void set_type_alignment_bytes(Pointer tp, int align);
	com.sun.jna.NativeLong get_type_visited(Pointer tp);
	void set_type_visited(Pointer tp, com.sun.jna.NativeLong num);
	void mark_type_visited(Pointer tp);
	int type_visited(Pointer tp);
	int type_not_visited(Pointer tp);
	Pointer get_type_link(Pointer tp);
	void set_type_link(Pointer tp, Pointer l);
	void set_master_type_visited(com.sun.jna.NativeLong val);
	com.sun.jna.NativeLong get_master_type_visited();
	void inc_master_type_visited();
	void set_type_dbg_info(Pointer tp, Pointer db);
	Pointer get_type_dbg_info(Pointer tp);
	int is_type(Pointer thing);
	int equal_type(Pointer typ1, Pointer typ2);
	int smaller_type(Pointer st, Pointer lt);
	Pointer new_type_class(Pointer name);
	Pointer new_d_type_class(Pointer name, Pointer db);
	Pointer get_class_ident(Pointer clss);
	String get_class_name(Pointer clss);
	int get_class_n_members(Pointer clss);
	Pointer get_class_member(Pointer clss, int pos);
	int get_class_member_index(Pointer clss, Pointer mem);
	Pointer get_class_member_by_name(Pointer clss, Pointer name);
	void set_class_member(Pointer clss, Pointer member, int pos);
	void set_class_members(Pointer clss, Pointer[] members, int arity);
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
	int is_Class_type(Pointer clss);
	Pointer new_type_struct(Pointer name);
	Pointer new_d_type_struct(Pointer name, Pointer db);
	Pointer get_struct_ident(Pointer strct);
	String get_struct_name(Pointer strct);
	int get_struct_n_members(Pointer strct);
	Pointer get_struct_member(Pointer strct, int pos);
	int get_struct_member_index(Pointer strct, Pointer member);
	void set_struct_member(Pointer strct, int pos, Pointer member);
	int is_Struct_type(Pointer strct);
	Pointer new_type_method(int n_param, int n_res);
	Pointer new_d_type_method(int n_param, int n_res, Pointer db);
	int get_method_n_params(Pointer method);
	Pointer get_method_param_type(Pointer method, int pos);
	void set_method_param_type(Pointer method, int pos, Pointer tp);
	Pointer get_method_value_param_ent(Pointer method, int pos);
	void set_method_value_param_type(Pointer method, Pointer tp);
	Pointer get_method_value_param_type(Pointer method);
	Pointer get_method_param_ident(Pointer method, int pos);
	String get_method_param_name(Pointer method, int pos);
	void set_method_param_ident(Pointer method, int pos, Pointer id);
	int get_method_n_ress(Pointer method);
	Pointer get_method_res_type(Pointer method, int pos);
	void set_method_res_type(Pointer method, int pos, Pointer tp);
	Pointer get_method_value_res_ent(Pointer method, int pos);
	Pointer get_method_value_res_type(Pointer method);
	String get_variadicity_name(/* ir_variadicity */int vari);
	/* ir_variadicity */int get_method_variadicity(Pointer method);
	void set_method_variadicity(Pointer method, /* ir_variadicity */int vari);
	int get_method_first_variadic_param_index(Pointer method);
	void set_method_first_variadic_param_index(Pointer method, int index);
	int get_method_additional_properties(Pointer method);
	void set_method_additional_properties(Pointer method, int property_mask);
	void set_method_additional_property(Pointer method, /* mtp_additional_property */int flag);
	int get_method_calling_convention(Pointer method);
	void set_method_calling_convention(Pointer method, int cc_mask);
	int get_method_n_regparams(Pointer method);
	void set_method_n_regparams(Pointer method, int n_regs);
	int is_Method_type(Pointer method);
	Pointer new_type_union(Pointer name);
	Pointer new_d_type_union(Pointer name, Pointer db);
	Pointer get_union_ident(Pointer uni);
	String get_union_name(Pointer uni);
	int get_union_n_members(Pointer uni);
	Pointer get_union_member(Pointer uni, int pos);
	int get_union_member_index(Pointer uni, Pointer member);
	void set_union_member(Pointer uni, int pos, Pointer member);
	int is_Union_type(Pointer uni);
	Pointer new_type_array(int n_dims, Pointer element_type);
	Pointer new_d_type_array(int n_dims, Pointer element_type, Pointer db);
	int get_array_n_dimensions(Pointer array);
	void set_array_bounds_int(Pointer array, int dimension, int lower_bound, int upper_bound);
	void set_array_bounds(Pointer array, int dimension, Pointer lower_bound, Pointer upper_bound);
	void set_array_lower_bound(Pointer array, int dimension, Pointer lower_bound);
	void set_array_lower_bound_int(Pointer array, int dimension, int lower_bound);
	void set_array_upper_bound(Pointer array, int dimension, Pointer upper_bound);
	void set_array_upper_bound_int(Pointer array, int dimension, int upper_bound);
	int has_array_lower_bound(Pointer array, int dimension);
	Pointer get_array_lower_bound(Pointer array, int dimension);
	com.sun.jna.NativeLong get_array_lower_bound_int(Pointer array, int dimension);
	int has_array_upper_bound(Pointer array, int dimension);
	Pointer get_array_upper_bound(Pointer array, int dimension);
	com.sun.jna.NativeLong get_array_upper_bound_int(Pointer array, int dimension);
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
	Pointer get_enumeration_ident(Pointer enumeration);
	String get_enumeration_name(Pointer enumeration);
	void set_enumeration_const(Pointer enumeration, int pos, Pointer nameid, Pointer con);
	int get_enumeration_n_enums(Pointer enumeration);
	Pointer get_enumeration_const(Pointer enumeration, int pos);
	Pointer get_enumeration_owner(Pointer enum_cnst);
	void set_enumeration_value(Pointer enum_cnst, Pointer con);
	Pointer get_enumeration_value(Pointer enum_cnst);
	void set_enumeration_nameid(Pointer enum_cnst, Pointer id);
	Pointer get_enumeration_const_nameid(Pointer enum_cnst);
	String get_enumeration_const_name(Pointer enum_cnst);
	int is_Enumeration_type(Pointer enumeration);
	Pointer new_type_pointer(Pointer points_to);
	Pointer new_d_type_pointer(Pointer points_to, Pointer db);
	void set_pointer_points_to_type(Pointer pointer, Pointer tp);
	Pointer get_pointer_points_to_type(Pointer pointer);
	int is_Pointer_type(Pointer pointer);
	Pointer find_pointer_type_to_type(Pointer tp);
	Pointer new_type_primitive(Pointer mode);
	Pointer new_d_type_primitive(Pointer mode, Pointer db);
	int is_Primitive_type(Pointer primitive);
	Pointer get_primitive_base_type(Pointer tp);
	void set_primitive_base_type(Pointer tp, Pointer base_tp);
	Pointer get_none_type();
	Pointer get_code_type();
	Pointer get_unknown_type();
	int is_atomic_type(Pointer tp);
	Pointer get_compound_ident(Pointer tp);
	String get_compound_name(Pointer tp);
	int get_compound_n_members(Pointer tp);
	Pointer get_compound_member(Pointer tp, int pos);
	int get_compound_member_index(Pointer tp, Pointer member);
	void default_layout_compound_type(Pointer tp);
	int is_compound_type(Pointer tp);
	int is_code_type(Pointer tp);
	int is_frame_type(Pointer tp);
	int is_value_param_type(Pointer tp);
	int is_lowered_type(Pointer tp);
	Pointer new_type_value();
	Pointer new_type_frame();
	Pointer clone_frame_type(Pointer type);
	void set_lowered_type(Pointer tp, Pointer lowered_type);
	Pointer get_associated_type(Pointer tp);
	Pointer frame_alloc_area(Pointer frame_type, int size, int alignment, int at_start);
	com.sun.jna.NativeLong get_type_nr(Pointer tp);
	int compare_names(Pointer tp1, Pointer tp2);
	int compare_strict(Pointer tp1, Pointer tp2);
	int firm_hash_name(Pointer tp);
	Pointer mature_type(Pointer tp);
	Pointer mature_type_free(Pointer tp);
	Pointer mature_type_free_entities(Pointer tp);
	void type_walk(Pointer pre, Pointer post, Pointer env);
	void type_walk_prog(Pointer pre, Pointer post, Pointer env);
	void type_walk_irg(Pointer irg, Pointer pre, Pointer post, Pointer env);
	void type_walk_super2sub(Pointer pre, Pointer post, Pointer env);
	void type_walk_super(Pointer pre, Pointer post, Pointer env);
	void class_walk_super2sub(Pointer pre, Pointer post, Pointer env);
	void walk_types_entities(Pointer tp, Pointer doit, Pointer env);
	void types_calc_finalization();
	/* ir_visibility */int get_type_visibility(Pointer tp);
	void set_type_visibility(Pointer tp, /* ir_visibility */int v);
	/* ir_allocation */int get_entity_allocation(Pointer ent);
	void set_entity_allocation(Pointer ent, /* ir_allocation */int al);
	/* ir_peculiarity */int get_entity_peculiarity(Pointer ent);
	void set_entity_peculiarity(Pointer ent, /* ir_peculiarity */int pec);
	int is_entity_final(Pointer ent);
	void set_entity_final(Pointer ent, int _final);
	/* ir_peculiarity */int get_class_peculiarity(Pointer clss);
	void set_class_peculiarity(Pointer clss, /* ir_peculiarity */int pec);
	Pointer new_id_from_str(String str);
	Pointer new_id_from_chars(String str, com.sun.jna.NativeLong len);
	String get_id_str(Pointer id);
	com.sun.jna.NativeLong get_id_strlen(Pointer id);
	int id_is_prefix(Pointer prefix, Pointer id);
	int id_is_suffix(Pointer suffix, Pointer id);
	int id_contains_char(Pointer id, byte c);
	Pointer id_unique(String tag);
	Pointer id_mangle_entity(Pointer ent);
	Pointer id_mangle_u(Pointer first, Pointer scnd);
	Pointer id_mangle_dot(Pointer first, Pointer scnd);
	Pointer id_mangle(Pointer first, Pointer scnd);
	Pointer id_mangle3(String prefix, Pointer middle, String suffix);
	Pointer id_decorate_win32_c_fkt(Pointer ent, Pointer id);
	Pointer get_op_Abs();
	Pointer get_op_Add();
	Pointer get_op_Alloc();
	Pointer get_op_Anchor();
	Pointer get_op_And();
	Pointer get_op_ASM();
	Pointer get_op_Bad();
	Pointer get_op_Block();
	Pointer get_op_Borrow();
	Pointer get_op_Bound();
	Pointer get_op_Break();
	Pointer get_op_Builtin();
	Pointer get_op_CallBegin();
	Pointer get_op_Call();
	Pointer get_op_Carry();
	Pointer get_op_Cast();
	Pointer get_op_Cmp();
	Pointer get_op_Cond();
	Pointer get_op_Confirm();
	Pointer get_op_Const();
	Pointer get_op_Conv();
	Pointer get_op_CopyB();
	Pointer get_op_DivMod();
	Pointer get_op_Div();
	Pointer get_op_Dummy();
	Pointer get_op_EndExcept();
	Pointer get_op_EndReg();
	Pointer get_op_End();
	Pointer get_op_Eor();
	Pointer get_op_Filter();
	Pointer get_op_Free();
	Pointer get_op_Id();
	Pointer get_op_IJmp();
	Pointer get_op_InstOf();
	Pointer get_op_Jmp();
	Pointer get_op_Load();
	Pointer get_op_Minus();
	Pointer get_op_Mod();
	Pointer get_op_Mulh();
	Pointer get_op_Mul();
	Pointer get_op_Mux();
	Pointer get_op_NoMem();
	Pointer get_op_Not();
	Pointer get_op_Or();
	Pointer get_op_Phi();
	Pointer get_op_Pin();
	Pointer get_op_Proj();
	Pointer get_op_Quot();
	Pointer get_op_Raise();
	Pointer get_op_Return();
	Pointer get_op_Rotl();
	Pointer get_op_Sel();
	Pointer get_op_Shl();
	Pointer get_op_Shrs();
	Pointer get_op_Shr();
	Pointer get_op_Start();
	Pointer get_op_Store();
	Pointer get_op_Sub();
	Pointer get_op_SymConst();
	Pointer get_op_Sync();
	Pointer get_op_Tuple();
	Pointer get_op_Unknown();
	Pointer get_op_ident(Pointer op);
	String get_op_name(Pointer op);
	int get_op_code(Pointer op);
	String get_op_pin_state_name(/* op_pin_state */int s);
	/* op_pin_state */int get_op_pinned(Pointer op);
	void set_op_pinned(Pointer op, /* op_pin_state */int pinned);
	int get_next_ir_opcode();
	int get_next_ir_opcodes(int num);
	Pointer get_generic_function_ptr(Pointer op);
	void set_generic_function_ptr(Pointer op, Pointer func);
	/* irop_flags */int get_op_flags(Pointer op);
	Pointer new_ir_op(int code, String name, /* op_pin_state */int p, int flags, /* op_arity */int opar, int op_index, com.sun.jna.NativeLong attr_size, Pointer ops);
	Pointer get_op_ops(Pointer op);
	String get_mode_arithmetic_name(/* ir_mode_arithmetic */int ari);
	Pointer new_ir_mode(String name, /* ir_mode_sort */int sort, int bit_size, int sign, /* ir_mode_arithmetic */int arithmetic, int modulo_shift);
	Pointer new_ir_vector_mode(String name, /* ir_mode_sort */int sort, int bit_size, int num_of_elem, int sign, /* ir_mode_arithmetic */int arithmetic, int modulo_shift);
	int is_mode(Pointer thing);
	Pointer get_mode_ident(Pointer mode);
	String get_mode_name(Pointer mode);
	/* ir_mode_sort */int get_mode_sort(Pointer mode);
	int get_mode_size_bits(Pointer mode);
	int get_mode_size_bytes(Pointer mode);
	int get_mode_sign(Pointer mode);
	/* ir_mode_arithmetic */int get_mode_arithmetic(Pointer mode);
	int get_mode_modulo_shift(Pointer mode);
	int get_mode_n_vector_elems(Pointer mode);
	Pointer get_mode_link(Pointer mode);
	void set_mode_link(Pointer mode, Pointer l);
	Pointer get_mode_min(Pointer mode);
	Pointer get_mode_max(Pointer mode);
	Pointer get_mode_null(Pointer mode);
	Pointer get_mode_one(Pointer mode);
	Pointer get_mode_minus_one(Pointer mode);
	Pointer get_mode_all_one(Pointer mode);
	Pointer get_mode_infinite(Pointer mode);
	Pointer get_mode_NAN(Pointer mode);
	Pointer get_modeF();
	Pointer get_modeD();
	Pointer get_modeE();
	Pointer get_modeBs();
	Pointer get_modeBu();
	Pointer get_modeHs();
	Pointer get_modeHu();
	Pointer get_modeIs();
	Pointer get_modeIu();
	Pointer get_modeLs();
	Pointer get_modeLu();
	Pointer get_modeLLs();
	Pointer get_modeLLu();
	Pointer get_modeP();
	Pointer get_modeb();
	Pointer get_modeX();
	Pointer get_modeBB();
	Pointer get_modeM();
	Pointer get_modeT();
	Pointer get_modeANY();
	Pointer get_modeBAD();
	Pointer get_modeP_code();
	Pointer get_modeP_data();
	void set_modeP_code(Pointer p);
	void set_modeP_data(Pointer p);
	int mode_is_signed(Pointer mode);
	int mode_is_float(Pointer mode);
	int mode_is_int(Pointer mode);
	int mode_is_reference(Pointer mode);
	int mode_is_num(Pointer mode);
	int mode_is_data(Pointer mode);
	int mode_is_datab(Pointer mode);
	int mode_is_dataM(Pointer mode);
	int mode_is_float_vector(Pointer mode);
	int mode_is_int_vector(Pointer mode);
	int smaller_mode(Pointer sm, Pointer lm);
	int values_in_mode(Pointer sm, Pointer lm);
	Pointer find_unsigned_mode(Pointer mode);
	Pointer find_signed_mode(Pointer mode);
	Pointer find_double_bits_int_mode(Pointer mode);
	int mode_honor_signed_zeros(Pointer mode);
	int mode_overflow_on_unary_Minus(Pointer mode);
	int mode_wrap_around(Pointer mode);
	Pointer get_reference_mode_signed_eq(Pointer mode);
	void set_reference_mode_signed_eq(Pointer ref_mode, Pointer int_mode);
	Pointer get_reference_mode_unsigned_eq(Pointer mode);
	void set_reference_mode_unsigned_eq(Pointer ref_mode, Pointer int_mode);
	int is_reinterpret_cast(Pointer src, Pointer dst);
	Pointer get_type_for_mode(Pointer mode);
	int is_ir_node(Pointer thing);
	int get_irn_arity(Pointer node);
	int get_irn_intra_arity(Pointer node);
	int get_irn_inter_arity(Pointer node);
	void set_irn_in(Pointer node, int arity, Pointer[] in);
	Pointer get_irn_n(Pointer node, int n);
	int add_irn_dep(Pointer node, Pointer dep);
	void add_irn_deps(Pointer tgt, Pointer src);
	int get_irn_deps(Pointer node);
	Pointer get_irn_dep(Pointer node, int pos);
	void set_irn_dep(Pointer node, int pos, Pointer dep);
	Pointer get_irn_intra_n(Pointer node, int n);
	Pointer get_irn_inter_n(Pointer node, int n);
	void set_irn_n(Pointer node, int n, Pointer in);
	int add_irn_n(Pointer node, Pointer in);
	void del_Sync_n(Pointer n, int i);
	void set_irn_mode(Pointer node, Pointer mode);
	Pointer get_irn_mode(Pointer node);
	Pointer get_irn_modeident(Pointer node);
	String get_irn_modename(Pointer node);
	Pointer get_irn_op(Pointer node);
	void set_irn_op(Pointer node, Pointer op);
	int get_irn_opcode(Pointer node);
	String get_irn_opname(Pointer node);
	Pointer get_irn_opident(Pointer node);
	int get_irn_pred_pos(Pointer node, Pointer arg);
	com.sun.jna.NativeLong get_irn_visited(Pointer node);
	void set_irn_visited(Pointer node, com.sun.jna.NativeLong visited);
	void mark_irn_visited(Pointer node);
	int irn_visited(Pointer node);
	int irn_visited_else_mark(Pointer node);
	void set_irn_link(Pointer node, Pointer link);
	Pointer get_irn_link(Pointer node);
	Pointer get_irn_irg(Pointer node);
	com.sun.jna.NativeLong get_irn_node_nr(Pointer node);
	/* op_pin_state */int get_irn_pinned(Pointer node);
	void set_irn_pinned(Pointer node, /* op_pin_state */int state);
	/* op_pin_state */int is_irn_pinned_in_irg(Pointer node);
	Pointer new_ir_node(Pointer db, Pointer irg, Pointer block, Pointer op, Pointer mode, int arity, Pointer[] in);
	Pointer get_nodes_block(Pointer node);
	void set_nodes_block(Pointer node, Pointer block);
	Pointer get_nodes_MacroBlock(Pointer node);
	Pointer is_frame_pointer(Pointer n);
	Pointer is_tls_pointer(Pointer n);
	int get_Block_n_cfgpreds(Pointer block);
	Pointer get_Block_cfgpred(Pointer block, int pos);
	void set_Block_cfgpred(Pointer block, int pos, Pointer pred);
	int get_Block_cfgpred_pos(Pointer block, Pointer pred);
	Pointer get_Block_cfgpred_block(Pointer node, int pos);
	int get_Block_matured(Pointer block);
	void set_Block_matured(Pointer block, int matured);
	com.sun.jna.NativeLong get_Block_block_visited(Pointer block);
	void set_Block_block_visited(Pointer block, com.sun.jna.NativeLong visit);
	Pointer set_Block_dead(Pointer block);
	int is_Block_dead(Pointer block);
	void mark_Block_block_visited(Pointer node);
	int Block_block_visited(Pointer node);
	Pointer get_Block_extbb(Pointer block);
	void set_Block_extbb(Pointer block, Pointer extblk);
	Pointer get_Block_MacroBlock(Pointer block);
	void set_Block_MacroBlock(Pointer block, Pointer mbh);
	Pointer get_irn_MacroBlock(Pointer n);
	Pointer get_Block_irg(Pointer block);
	int has_Block_entity(Pointer block);
	Pointer get_Block_entity(Pointer block);
	Pointer create_Block_entity(Pointer block);
	void set_Block_entity(Pointer block, Pointer entity);
	Pointer get_Block_phis(Pointer block);
	void set_Block_phis(Pointer block, Pointer phi);
	void add_Block_phi(Pointer block, Pointer phi);
	int get_Block_mark(Pointer block);
	void set_Block_mark(Pointer block, int mark);
	int get_End_n_keepalives(Pointer end);
	Pointer get_End_keepalive(Pointer end, int pos);
	void add_End_keepalive(Pointer end, Pointer ka);
	void set_End_keepalive(Pointer end, int pos, Pointer ka);
	void set_End_keepalives(Pointer end, int n, Pointer[] in);
	void remove_End_keepalive(Pointer end, Pointer irn);
	void remove_End_Bads_and_doublets(Pointer end);
	void free_End(Pointer end);
	Pointer get_IJmp_target(Pointer ijmp);
	void set_IJmp_target(Pointer ijmp, Pointer tgt);
	Pointer get_Cond_selector(Pointer node);
	void set_Cond_selector(Pointer node, Pointer selector);
	com.sun.jna.NativeLong get_Cond_default_proj(Pointer node);
	void set_Cond_default_proj(Pointer node, com.sun.jna.NativeLong defproj);
	Pointer get_Return_mem(Pointer node);
	void set_Return_mem(Pointer node, Pointer mem);
	Pointer[] get_Return_res_arr(Pointer node);
	int get_Return_n_ress(Pointer node);
	Pointer get_Return_res(Pointer node, int pos);
	void set_Return_res(Pointer node, int pos, Pointer res);
	Pointer get_Const_tarval(Pointer node);
	void set_Const_tarval(Pointer node, Pointer con);
	int is_Const_null(Pointer node);
	int is_Const_one(Pointer node);
	int is_Const_all_one(Pointer node);
	Pointer get_Const_type(Pointer node);
	void set_Const_type(Pointer node, Pointer tp);
	/* symconst_kind */int get_SymConst_kind(Pointer node);
	void set_SymConst_kind(Pointer node, /* symconst_kind */int num);
	Pointer get_SymConst_type(Pointer node);
	void set_SymConst_type(Pointer node, Pointer tp);
	Pointer get_SymConst_entity(Pointer node);
	void set_SymConst_entity(Pointer node, Pointer ent);
	Pointer get_SymConst_enum(Pointer node);
	void set_SymConst_enum(Pointer node, Pointer ec);
	Pointer get_SymConst_value_type(Pointer node);
	void set_SymConst_value_type(Pointer node, Pointer tp);
	Pointer get_Sel_mem(Pointer node);
	void set_Sel_mem(Pointer node, Pointer mem);
	Pointer get_Sel_ptr(Pointer node);
	void set_Sel_ptr(Pointer node, Pointer ptr);
	Pointer[] get_Sel_index_arr(Pointer node);
	int get_Sel_n_indexs(Pointer node);
	Pointer get_Sel_index(Pointer node, int pos);
	void set_Sel_index(Pointer node, int pos, Pointer index);
	Pointer get_Sel_entity(Pointer node);
	void set_Sel_entity(Pointer node, Pointer ent);
	Pointer get_Call_mem(Pointer node);
	void set_Call_mem(Pointer node, Pointer mem);
	Pointer get_Call_ptr(Pointer node);
	void set_Call_ptr(Pointer node, Pointer ptr);
	Pointer[] get_Call_param_arr(Pointer node);
	int get_Call_n_params(Pointer node);
	Pointer get_Call_param(Pointer node, int pos);
	void set_Call_param(Pointer node, int pos, Pointer param);
	Pointer get_Call_type(Pointer node);
	void set_Call_type(Pointer node, Pointer tp);
	int get_Call_tail_call(Pointer node);
	void set_Call_tail_call(Pointer node, int tail_call);
	int is_self_recursive_Call(Pointer call);
	int Call_has_callees(Pointer node);
	int get_Call_n_callees(Pointer node);
	Pointer get_Call_callee(Pointer node, int pos);
	void set_Call_callee_arr(Pointer node, int n, Pointer[] arr);
	void remove_Call_callee_arr(Pointer node);
	Pointer get_Builtin_mem(Pointer node);
	void set_Builtin_mem(Pointer node, Pointer mem);
	/* ir_builtin_kind */int get_Builtin_kind(Pointer node);
	void set_Builtin_kind(Pointer node, /* ir_builtin_kind */int kind);
	Pointer[] get_Builtin_param_arr(Pointer node);
	int get_Builtin_n_params(Pointer node);
	Pointer get_Builtin_param(Pointer node, int pos);
	void set_Builtin_param(Pointer node, int pos, Pointer param);
	Pointer get_Builtin_type(Pointer node);
	void set_Builtin_type(Pointer node, Pointer tp);
	String get_builtin_kind_name(/* ir_builtin_kind */int kind);
	Pointer get_CallBegin_ptr(Pointer node);
	void set_CallBegin_ptr(Pointer node, Pointer ptr);
	Pointer get_CallBegin_call(Pointer node);
	void set_CallBegin_call(Pointer node, Pointer call);
	int is_unop(Pointer node);
	Pointer get_unop_op(Pointer node);
	void set_unop_op(Pointer node, Pointer op);
	int is_binop(Pointer node);
	Pointer get_binop_left(Pointer node);
	void set_binop_left(Pointer node, Pointer left);
	Pointer get_binop_right(Pointer node);
	void set_binop_right(Pointer node, Pointer right);
	Pointer get_Add_left(Pointer node);
	void set_Add_left(Pointer node, Pointer left);
	Pointer get_Add_right(Pointer node);
	void set_Add_right(Pointer node, Pointer right);
	Pointer get_Carry_left(Pointer node);
	void set_Carry_left(Pointer node, Pointer left);
	Pointer get_Carry_right(Pointer node);
	void set_Carry_right(Pointer node, Pointer right);
	Pointer get_Borrow_left(Pointer node);
	void set_Borrow_left(Pointer node, Pointer left);
	Pointer get_Borrow_right(Pointer node);
	void set_Borrow_right(Pointer node, Pointer right);
	Pointer get_Sub_left(Pointer node);
	void set_Sub_left(Pointer node, Pointer left);
	Pointer get_Sub_right(Pointer node);
	void set_Sub_right(Pointer node, Pointer right);
	Pointer get_Minus_op(Pointer node);
	void set_Minus_op(Pointer node, Pointer op);
	Pointer get_Mul_left(Pointer node);
	void set_Mul_left(Pointer node, Pointer left);
	Pointer get_Mul_right(Pointer node);
	void set_Mul_right(Pointer node, Pointer right);
	Pointer get_Mulh_left(Pointer node);
	void set_Mulh_left(Pointer node, Pointer left);
	Pointer get_Mulh_right(Pointer node);
	void set_Mulh_right(Pointer node, Pointer right);
	Pointer get_Quot_left(Pointer node);
	void set_Quot_left(Pointer node, Pointer left);
	Pointer get_Quot_right(Pointer node);
	void set_Quot_right(Pointer node, Pointer right);
	Pointer get_Quot_mem(Pointer node);
	void set_Quot_mem(Pointer node, Pointer mem);
	Pointer get_Quot_resmode(Pointer node);
	void set_Quot_resmode(Pointer node, Pointer mode);
	Pointer get_DivMod_left(Pointer node);
	void set_DivMod_left(Pointer node, Pointer left);
	Pointer get_DivMod_right(Pointer node);
	void set_DivMod_right(Pointer node, Pointer right);
	Pointer get_DivMod_mem(Pointer node);
	void set_DivMod_mem(Pointer node, Pointer mem);
	Pointer get_DivMod_resmode(Pointer node);
	void set_DivMod_resmode(Pointer node, Pointer mode);
	Pointer get_Div_left(Pointer node);
	void set_Div_left(Pointer node, Pointer left);
	Pointer get_Div_right(Pointer node);
	void set_Div_right(Pointer node, Pointer right);
	Pointer get_Div_mem(Pointer node);
	void set_Div_mem(Pointer node, Pointer mem);
	Pointer get_Div_resmode(Pointer node);
	void set_Div_resmode(Pointer node, Pointer mode);
	int get_Div_no_remainder(Pointer node);
	void set_Div_no_remainder(Pointer node, int no_remainder);
	Pointer get_Mod_left(Pointer node);
	void set_Mod_left(Pointer node, Pointer left);
	Pointer get_Mod_right(Pointer node);
	void set_Mod_right(Pointer node, Pointer right);
	Pointer get_Mod_mem(Pointer node);
	void set_Mod_mem(Pointer node, Pointer mem);
	Pointer get_Mod_resmode(Pointer node);
	void set_Mod_resmode(Pointer node, Pointer mode);
	Pointer get_Abs_op(Pointer node);
	void set_Abs_op(Pointer node, Pointer op);
	Pointer get_And_left(Pointer node);
	void set_And_left(Pointer node, Pointer left);
	Pointer get_And_right(Pointer node);
	void set_And_right(Pointer node, Pointer right);
	Pointer get_Or_left(Pointer node);
	void set_Or_left(Pointer node, Pointer left);
	Pointer get_Or_right(Pointer node);
	void set_Or_right(Pointer node, Pointer right);
	Pointer get_Eor_left(Pointer node);
	void set_Eor_left(Pointer node, Pointer left);
	Pointer get_Eor_right(Pointer node);
	void set_Eor_right(Pointer node, Pointer right);
	Pointer get_Not_op(Pointer node);
	void set_Not_op(Pointer node, Pointer op);
	String get_pnc_string(int pnc);
	/* pn_Cmp */int get_negated_pnc(com.sun.jna.NativeLong pnc, Pointer mode);
	/* pn_Cmp */int get_inversed_pnc(com.sun.jna.NativeLong pnc);
	Pointer get_Cmp_left(Pointer node);
	void set_Cmp_left(Pointer node, Pointer left);
	Pointer get_Cmp_right(Pointer node);
	void set_Cmp_right(Pointer node, Pointer right);
	Pointer get_Shl_left(Pointer node);
	void set_Shl_left(Pointer node, Pointer left);
	Pointer get_Shl_right(Pointer node);
	void set_Shl_right(Pointer node, Pointer right);
	Pointer get_Shr_left(Pointer node);
	void set_Shr_left(Pointer node, Pointer left);
	Pointer get_Shr_right(Pointer node);
	void set_Shr_right(Pointer node, Pointer right);
	Pointer get_Shrs_left(Pointer node);
	void set_Shrs_left(Pointer node, Pointer left);
	Pointer get_Shrs_right(Pointer node);
	void set_Shrs_right(Pointer node, Pointer right);
	Pointer get_Rotl_left(Pointer node);
	void set_Rotl_left(Pointer node, Pointer left);
	Pointer get_Rotl_right(Pointer node);
	void set_Rotl_right(Pointer node, Pointer right);
	Pointer get_Conv_op(Pointer node);
	void set_Conv_op(Pointer node, Pointer op);
	int get_Conv_strict(Pointer node);
	void set_Conv_strict(Pointer node, int flag);
	Pointer get_Cast_op(Pointer node);
	void set_Cast_op(Pointer node, Pointer op);
	Pointer get_Cast_type(Pointer node);
	void set_Cast_type(Pointer node, Pointer to_tp);
	int is_Cast_upcast(Pointer node);
	int is_Cast_downcast(Pointer node);
	int is_Phi(Pointer n);
	int is_Phi0(Pointer n);
	Pointer[] get_Phi_preds_arr(Pointer node);
	int get_Phi_n_preds(Pointer node);
	Pointer get_Phi_pred(Pointer node, int pos);
	void set_Phi_pred(Pointer node, int pos, Pointer pred);
	Pointer get_Phi_next(Pointer phi);
	void set_Phi_next(Pointer phi, Pointer next);
	Pointer get_Filter_pred(Pointer node);
	void set_Filter_pred(Pointer node, Pointer pred);
	com.sun.jna.NativeLong get_Filter_proj(Pointer node);
	void set_Filter_proj(Pointer node, com.sun.jna.NativeLong proj);
	void set_Filter_cg_pred_arr(Pointer node, int arity, Pointer[] in);
	void set_Filter_cg_pred(Pointer node, int pos, Pointer pred);
	int get_Filter_n_cg_preds(Pointer node);
	Pointer get_Filter_cg_pred(Pointer node, int pos);
	int is_memop(Pointer node);
	Pointer get_memop_mem(Pointer node);
	void set_memop_mem(Pointer node, Pointer mem);
	Pointer get_memop_ptr(Pointer node);
	void set_memop_ptr(Pointer node, Pointer ptr);
	Pointer get_Load_mem(Pointer node);
	void set_Load_mem(Pointer node, Pointer mem);
	Pointer get_Load_ptr(Pointer node);
	void set_Load_ptr(Pointer node, Pointer ptr);
	Pointer get_Load_mode(Pointer node);
	void set_Load_mode(Pointer node, Pointer mode);
	/* ir_volatility */int get_Load_volatility(Pointer node);
	void set_Load_volatility(Pointer node, /* ir_volatility */int volatility);
	/* ir_align */int get_Load_align(Pointer node);
	void set_Load_align(Pointer node, /* ir_align */int align);
	Pointer get_Store_mem(Pointer node);
	void set_Store_mem(Pointer node, Pointer mem);
	Pointer get_Store_ptr(Pointer node);
	void set_Store_ptr(Pointer node, Pointer ptr);
	Pointer get_Store_value(Pointer node);
	void set_Store_value(Pointer node, Pointer value);
	/* ir_volatility */int get_Store_volatility(Pointer node);
	void set_Store_volatility(Pointer node, /* ir_volatility */int volatility);
	/* ir_align */int get_Store_align(Pointer node);
	void set_Store_align(Pointer node, /* ir_align */int align);
	Pointer get_Alloc_mem(Pointer node);
	void set_Alloc_mem(Pointer node, Pointer mem);
	Pointer get_Alloc_count(Pointer node);
	void set_Alloc_count(Pointer node, Pointer count);
	Pointer get_Alloc_type(Pointer node);
	void set_Alloc_type(Pointer node, Pointer tp);
	/* ir_where_alloc */int get_Alloc_where(Pointer node);
	void set_Alloc_where(Pointer node, /* ir_where_alloc */int where);
	Pointer get_Free_mem(Pointer node);
	void set_Free_mem(Pointer node, Pointer mem);
	Pointer get_Free_ptr(Pointer node);
	void set_Free_ptr(Pointer node, Pointer ptr);
	Pointer get_Free_size(Pointer node);
	void set_Free_size(Pointer node, Pointer size);
	Pointer get_Free_type(Pointer node);
	void set_Free_type(Pointer node, Pointer tp);
	/* ir_where_alloc */int get_Free_where(Pointer node);
	void set_Free_where(Pointer node, /* ir_where_alloc */int where);
	Pointer[] get_Sync_preds_arr(Pointer node);
	int get_Sync_n_preds(Pointer node);
	Pointer get_Sync_pred(Pointer node, int pos);
	void set_Sync_pred(Pointer node, int pos, Pointer pred);
	void add_Sync_pred(Pointer node, Pointer pred);
	Pointer get_Proj_type(Pointer node);
	Pointer get_Proj_pred(Pointer node);
	void set_Proj_pred(Pointer node, Pointer pred);
	com.sun.jna.NativeLong get_Proj_proj(Pointer node);
	void set_Proj_proj(Pointer node, com.sun.jna.NativeLong proj);
	int is_arg_Proj(Pointer node);
	Pointer[] get_Tuple_preds_arr(Pointer node);
	int get_Tuple_n_preds(Pointer node);
	Pointer get_Tuple_pred(Pointer node, int pos);
	void set_Tuple_pred(Pointer node, int pos, Pointer pred);
	Pointer get_Id_pred(Pointer node);
	void set_Id_pred(Pointer node, Pointer pred);
	Pointer get_Confirm_value(Pointer node);
	void set_Confirm_value(Pointer node, Pointer value);
	Pointer get_Confirm_bound(Pointer node);
	void set_Confirm_bound(Pointer node, Pointer bound);
	/* pn_Cmp */int get_Confirm_cmp(Pointer node);
	void set_Confirm_cmp(Pointer node, /* pn_Cmp */int cmp);
	Pointer get_Mux_sel(Pointer node);
	void set_Mux_sel(Pointer node, Pointer sel);
	Pointer get_Mux_false(Pointer node);
	void set_Mux_false(Pointer node, Pointer ir_false);
	Pointer get_Mux_true(Pointer node);
	void set_Mux_true(Pointer node, Pointer ir_true);
	Pointer get_CopyB_mem(Pointer node);
	void set_CopyB_mem(Pointer node, Pointer mem);
	Pointer get_CopyB_dst(Pointer node);
	void set_CopyB_dst(Pointer node, Pointer dst);
	Pointer get_CopyB_src(Pointer node);
	void set_CopyB_src(Pointer node, Pointer src);
	Pointer get_CopyB_type(Pointer node);
	void set_CopyB_type(Pointer node, Pointer data_type);
	Pointer get_InstOf_type(Pointer node);
	void set_InstOf_type(Pointer node, Pointer type);
	Pointer get_InstOf_store(Pointer node);
	void set_InstOf_store(Pointer node, Pointer obj);
	Pointer get_InstOf_obj(Pointer node);
	void set_InstOf_obj(Pointer node, Pointer obj);
	Pointer get_Raise_mem(Pointer node);
	void set_Raise_mem(Pointer node, Pointer mem);
	Pointer get_Raise_exo_ptr(Pointer node);
	void set_Raise_exo_ptr(Pointer node, Pointer exoptr);
	Pointer get_Bound_mem(Pointer bound);
	void set_Bound_mem(Pointer bound, Pointer mem);
	Pointer get_Bound_index(Pointer bound);
	void set_Bound_index(Pointer bound, Pointer idx);
	Pointer get_Bound_lower(Pointer bound);
	void set_Bound_lower(Pointer bound, Pointer lower);
	Pointer get_Bound_upper(Pointer bound);
	void set_Bound_upper(Pointer bound, Pointer upper);
	Pointer get_Pin_op(Pointer pin);
	void set_Pin_op(Pointer pin, Pointer node);
	Pointer get_ASM_text(Pointer node);
	void set_ASM_text(Pointer node, Pointer text);
	int get_ASM_n_input_constraints(Pointer node);
	Pointer get_ASM_input_constraints(Pointer node);
	void set_ASM_input_constraints(Pointer node, Pointer constraints);
	int get_ASM_n_output_constraints(Pointer node);
	Pointer get_ASM_output_constraints(Pointer node);
	void set_ASM_output_constraints(Pointer node, Pointer constraints);
	int get_ASM_n_clobbers(Pointer node);
	Pointer[] get_ASM_clobbers(Pointer node);
	void set_ASM_clobbers(Pointer node, Pointer[] clobbers);
	Pointer skip_Proj(Pointer node);
	Pointer skip_Proj_const(Pointer node);
	Pointer skip_Id(Pointer node);
	Pointer skip_Tuple(Pointer node);
	Pointer skip_Cast(Pointer node);
	Pointer skip_Cast_const(Pointer node);
	Pointer skip_Pin(Pointer node);
	Pointer skip_Confirm(Pointer node);
	Pointer skip_HighLevel_ops(Pointer node);
	int is_Const(Pointer node);
	int is_Conv(Pointer node);
	int is_strictConv(Pointer node);
	int is_Cast(Pointer node);
	int is_Bad(Pointer node);
	int is_NoMem(Pointer node);
	int is_Start(Pointer node);
	int is_End(Pointer node);
	int is_EndExcept(Pointer node);
	int is_EndReg(Pointer node);
	int is_Minus(Pointer node);
	int is_Abs(Pointer node);
	int is_Mod(Pointer node);
	int is_Div(Pointer node);
	int is_DivMod(Pointer node);
	int is_Quot(Pointer node);
	int is_Add(Pointer node);
	int is_Carry(Pointer node);
	int is_And(Pointer node);
	int is_Or(Pointer node);
	int is_Eor(Pointer node);
	int is_Sub(Pointer node);
	int is_Not(Pointer node);
	int is_Shl(Pointer node);
	int is_Shr(Pointer node);
	int is_Shrs(Pointer node);
	int is_Rotl(Pointer node);
	int is_Id(Pointer node);
	int is_Tuple(Pointer node);
	int is_Bound(Pointer node);
	int is_no_Block(Pointer node);
	int is_Block(Pointer node);
	int is_Unknown(Pointer node);
	int is_Return(Pointer node);
	int is_Call(Pointer node);
	int is_Builtin(Pointer node);
	int is_CallBegin(Pointer node);
	int is_Sel(Pointer node);
	int is_Mul(Pointer node);
	int is_Mulh(Pointer node);
	int is_Mux(Pointer node);
	int is_Load(Pointer node);
	int is_Store(Pointer node);
	int is_Sync(Pointer node);
	int is_Confirm(Pointer node);
	int is_Pin(Pointer node);
	int is_SymConst(Pointer node);
	int is_SymConst_addr_ent(Pointer node);
	int is_Cond(Pointer node);
	int is_CopyB(Pointer node);
	int is_Cmp(Pointer node);
	int is_Alloc(Pointer node);
	int is_Free(Pointer node);
	int is_Jmp(Pointer node);
	int is_IJmp(Pointer node);
	int is_Raise(Pointer node);
	int is_ASM(Pointer node);
	int is_Dummy(Pointer node);
	int is_Anchor(Pointer node);
	int is_Borrow(Pointer node);
	int is_Break(Pointer node);
	int is_InstOf(Pointer node);
	int is_Proj(Pointer node);
	int is_Filter(Pointer node);
	int is_cfop(Pointer node);
	int is_ip_cfop(Pointer node);
	int is_fragile_op(Pointer node);
	Pointer get_fragile_op_mem(Pointer node);
	Pointer get_divop_resmod(Pointer node);
	int is_irn_forking(Pointer node);
	void copy_node_attr(Pointer irg, Pointer old_node, Pointer new_node);
	Pointer get_irn_type(Pointer n);
	Pointer get_irn_type_attr(Pointer n);
	Pointer get_irn_entity_attr(Pointer n);
	int is_irn_constlike(Pointer node);
	int is_irn_always_opt(Pointer node);
	int is_irn_keep(Pointer node);
	int is_irn_start_block_placed(Pointer node);
	int is_irn_machine_op(Pointer node);
	int is_irn_machine_operand(Pointer node);
	int is_irn_machine_user(Pointer node, int n);
	int is_irn_cse_neutral(Pointer node);
	String get_cond_jmp_predicate_name(/* cond_jmp_predicate */int pred);
	/* cond_jmp_predicate */int get_Cond_jmp_pred(Pointer cond);
	void set_Cond_jmp_pred(Pointer cond, /* cond_jmp_predicate */int pred);
	int is_Global(Pointer node);
	Pointer get_Global_entity(Pointer node);
	int firm_register_additional_node_data(int size);
	Pointer get_irn_generic_attr(Pointer node);
	Pointer get_irn_generic_attr_const(Pointer node);
	int get_irn_idx(Pointer node);
	void set_irn_dbg_info(Pointer n, Pointer db);
	Pointer get_irn_dbg_info(Pointer n);
	int firm_default_hash(Pointer node);
	String gdb_node_helper(Pointer firm_object);
	Pointer new_tarval_from_str(String str, com.sun.jna.NativeLong len, Pointer mode);
	Pointer new_integer_tarval_from_str(String str, com.sun.jna.NativeLong len, byte sign, byte base, Pointer mode);
	Pointer new_tarval_from_long(com.sun.jna.NativeLong l, Pointer mode);
	com.sun.jna.NativeLong get_tarval_long(Pointer tv);
	int tarval_is_long(Pointer tv);
	Pointer new_tarval_from_double(double d, Pointer mode);
	double get_tarval_double(Pointer tv);
	int tarval_is_double(Pointer tv);
	Pointer get_tarval_mode(Pointer tv);
	int tarval_is_negative(Pointer tv);
	int tarval_is_null(Pointer tv);
	int tarval_is_one(Pointer tv);
	int tarval_is_minus_one(Pointer tv);
	int tarval_is_all_one(Pointer tv);
	int tarval_is_constant(Pointer tv);
	Pointer get_tarval_bad();
	Pointer get_tarval_undefined();
	Pointer get_tarval_b_false();
	Pointer get_tarval_b_true();
	Pointer get_tarval_unreachable();
	Pointer get_tarval_reachable();
	Pointer get_tarval_max(Pointer mode);
	Pointer get_tarval_min(Pointer mode);
	Pointer get_tarval_null(Pointer mode);
	Pointer get_tarval_one(Pointer mode);
	Pointer get_tarval_minus_one(Pointer mode);
	Pointer get_tarval_all_one(Pointer mode);
	Pointer get_tarval_nan(Pointer mode);
	Pointer get_tarval_plus_inf(Pointer mode);
	Pointer get_tarval_minus_inf(Pointer mode);
	void tarval_set_integer_overflow_mode(/* tarval_int_overflow_mode_t */int ov_mode);
	/* tarval_int_overflow_mode_t */int tarval_get_integer_overflow_mode();
	/* pn_Cmp */int tarval_cmp(Pointer a, Pointer b);
	Pointer tarval_convert_to(Pointer src, Pointer mode);
	Pointer tarval_not(Pointer a);
	Pointer tarval_neg(Pointer a);
	Pointer tarval_add(Pointer a, Pointer b);
	Pointer tarval_sub(Pointer a, Pointer b, Pointer dst_mode);
	Pointer tarval_mul(Pointer a, Pointer b);
	Pointer tarval_quo(Pointer a, Pointer b);
	Pointer tarval_div(Pointer a, Pointer b);
	Pointer tarval_mod(Pointer a, Pointer b);
	Pointer tarval_divmod(Pointer a, Pointer b, Pointer[] mod_res);
	Pointer tarval_abs(Pointer a);
	Pointer tarval_and(Pointer a, Pointer b);
	Pointer tarval_andnot(Pointer a, Pointer b);
	Pointer tarval_or(Pointer a, Pointer b);
	Pointer tarval_eor(Pointer a, Pointer b);
	Pointer tarval_shl(Pointer a, Pointer b);
	Pointer tarval_shr(Pointer a, Pointer b);
	Pointer tarval_shrs(Pointer a, Pointer b);
	Pointer tarval_rotl(Pointer a, Pointer b);
	int tarval_carry();
	int set_tarval_mode_output_option(Pointer mode, Pointer modeinfo);
	Pointer get_tarval_mode_output_option(Pointer mode);
	String get_tarval_bitpattern(Pointer tv);
	byte get_tarval_sub_bits(Pointer tv, int byte_ofs);
	int tarval_is_single_bit(Pointer tv);
	int get_tarval_popcount(Pointer tv);
	int get_tarval_lowest_bit(Pointer tv);
	int tarval_snprintf(String buf, com.sun.jna.NativeLong buflen, Pointer tv);
	int tarval_printf(Pointer tv);
	int tarval_ieee754_zero_mantissa(Pointer tv);
	int tarval_ieee754_get_exponent(Pointer tv);
	int tarval_ieee754_can_conv_lossless(Pointer tv, Pointer mode);
	int tarval_ieee754_set_immediate_precision(int bits);
	int tarval_ieee754_get_exact();
	int tarval_ieee754_get_mantissa_size(Pointer mode);
	void tarval_enable_fp_ops(int enable);
	int tarval_fp_ops_enabled();
	int tarval_is_NaN(Pointer tv);
	int tarval_is_plus_inf(Pointer tv);
	int tarval_is_minus_inf(Pointer tv);
	int tarval_is_finite(Pointer tv);
	int is_tarval(Pointer thing);
}
