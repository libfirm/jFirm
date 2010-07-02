package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Pointer;


public interface binding_iroptimize extends Library {
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
	public static enum osr_flags {
		osr_flag_none(0),
		osr_flag_lftr_with_ov_check(1),
		osr_flag_ignore_x86_shift(2),
		osr_flag_keep_reg_pressure(4);
		public final int val;
		private static class C { static int next_val; }

		osr_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		osr_flags() {
			this.val = C.next_val++;
		}
		
		public static osr_flags getEnum(int val) {
			for(osr_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	void optimize_cf(Pointer irg);
	Pointer optimize_cf_pass(String name);
	void opt_jumpthreading(Pointer irg);
	Pointer opt_jumpthreading_pass(String name);
	Pointer opt_loopunroll_pass(String name);
	void opt_bool(Pointer irg);
	Pointer opt_bool_pass(String name);
	int conv_opt(Pointer irg);
	Pointer conv_opt_pass(String name);
	void data_flow_scalar_replacement_opt(Pointer irg);
	void escape_enalysis_irg(Pointer irg, Pointer callback);
	void escape_analysis(int run_scalar_replace, Pointer callback);
	void optimize_funccalls(int force_run, Pointer callback);
	Pointer optimize_funccalls_pass(String name, int force_run, Pointer callback);
	void do_gvn_pre(Pointer irg);
	Pointer do_gvn_pre_pass(String name);
	void opt_if_conv(Pointer irg, Pointer params);
	Pointer opt_if_conv_pass(String name, Pointer params);
	void opt_parallelize_mem(Pointer irg);
	Pointer opt_parallelize_mem_pass(String name);
	Pointer can_replace_load_by_const(Pointer load, Pointer c);
	int optimize_load_store(Pointer irg);
	Pointer optimize_load_store_pass(String name);
	int opt_ldst(Pointer irg);
	Pointer opt_ldst_pass(String name);
	void loop_optimization(Pointer irg);
	void opt_frame_irg(Pointer irg);
	Pointer opt_frame_irg_pass(String name);
	void opt_osr(Pointer irg, int flags);
	Pointer opt_osr_pass(String name, int flags);
	void remove_phi_cycles(Pointer irg);
	Pointer remove_phi_cycles_pass(String name);
	void proc_cloning(float threshold);
	Pointer proc_cloning_pass(String name, float threshold);
	int optimize_reassociation(Pointer irg);
	Pointer optimize_reassociation_pass(String name);
	void normalize_one_return(Pointer irg);
	Pointer normalize_one_return_pass(String name);
	void normalize_n_returns(Pointer irg);
	Pointer normalize_n_returns_pass(String name);
	int scalar_replacement_opt(Pointer irg);
	Pointer scalar_replacement_opt_pass(String name);
	void reduce_strength(Pointer irg);
	int opt_tail_rec_irg(Pointer irg);
	Pointer opt_tail_rec_irg_pass(String name);
	void opt_tail_recursion();
	Pointer opt_tail_recursion_pass(String name);
	void normalize_irp_class_casts(Pointer gppt_fct);
	void normalize_irg_class_casts(Pointer irg, Pointer gppt_fct);
	void optimize_class_casts();
	void combo(Pointer irg);
	Pointer combo_pass(String name);
	void inline_small_irgs(Pointer irg, int size);
	Pointer inline_small_irgs_pass(String name, int size);
	void inline_leave_functions(int maxsize, int leavesize, int size, int ignore_runtime);
	Pointer inline_leave_functions_pass(String name, int maxsize, int leavesize, int size, int ignore_runtime);
	void inline_functions(int maxsize, int inline_threshold, Pointer after_inline_opt);
	Pointer inline_functions_pass(String name, int maxsize, int inline_threshold, Pointer after_inline_opt);
	int shape_blocks(Pointer irg);
	Pointer shape_blocks_pass(String name);
	void do_loop_inversion(Pointer irg);
	void do_loop_unrolling(Pointer irg);
	void do_loop_peeling(Pointer irg);
	Pointer loop_inversion_pass(String name);
	Pointer loop_unroll_pass(String name);
	Pointer loop_peeling_pass(String name);
	Pointer firm_set_Alloc_func(Pointer newf);
	Pointer set_vrp_pass(String name);
	void garbage_collect_entities();
	Pointer garbage_collect_entities_pass(String name);
	void dead_node_elimination(Pointer irg);
	Pointer dead_node_elimination_pass(String name);
	int inline_method(Pointer call, Pointer called_graph);
	void place_code(Pointer irg);
	Pointer place_code_pass(String name);
	void fixpoint_vrp(Pointer _0);
	Pointer fixpoint_vrp_irg_pass(String name);
}
