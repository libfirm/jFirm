package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Pointer;


public interface binding_irdump extends Library {
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
	public static enum ird_color_t {
		ird_color_prog_background(),
		ird_color_block_background(),
		ird_color_dead_block_background(),
		ird_color_block_inout(),
		ird_color_default_node(),
		ird_color_phi(),
		ird_color_memory(),
		ird_color_controlflow(),
		ird_color_const(),
		ird_color_anchor(),
		ird_color_proj(),
		ird_color_uses_memory(),
		ird_color_error(),
		ird_color_entity(),
		ird_color_count();
		public final int val;
		private static class C { static int next_val; }

		ird_color_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ird_color_t() {
			this.val = C.next_val++;
		}
		
		public static ird_color_t getEnum(int val) {
			for(ird_color_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum edge_kind {
		data_edge(0x01),
		block_edge(0x02),
		cf_edge(0x03),
		exc_cf_edge(0x04),
		mem_edge(0x05),
		dominator_edge(0x06),
		node2type_edge(0x07),
		ent_type_edge(0x11),
		ent_own_edge(0x12),
		ent_overwrites_edge(0x13),
		ent_value_edge(0x14),
		ent_corr_edge(0x15),
		meth_par_edge(0x21),
		meth_res_edge(0x22),
		type_super_edge(0x23),
		union_edge(0x24),
		ptr_pts_to_edge(0x25),
		arr_elt_type_edge(0x26),
		arr_ent_edge(0x27),
		type_member_edge(0x28),
		intra_edge(0),
		inter_edge(0x40),
		back_edge(0x80);
		public final int val;
		private static class C { static int next_val; }

		edge_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		edge_kind() {
			this.val = C.next_val++;
		}
		
		public static edge_kind getEnum(int val) {
			for(edge_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum dump_verbosity {
		dump_verbosity_onlynames(0x00000001),
		dump_verbosity_fields(0x00000002),
		dump_verbosity_methods(0x00000004),
		dump_verbosity_nostatic(0x00000040),
		dump_verbosity_typeattrs(0x00000008),
		dump_verbosity_entattrs(0x00000010),
		dump_verbosity_entconsts(0x00000020),
		dump_verbosity_accessStats(0x00000100),
		dump_verbosity_noClassTypes(0x00001000),
		dump_verbosity_noStructTypes(0x00002000),
		dump_verbosity_noUnionTypes(0x00004000),
		dump_verbosity_noArrayTypes(0x00008000),
		dump_verbosity_noPointerTypes(0x00010000),
		dump_verbosity_noMethodTypes(0x00020000),
		dump_verbosity_noPrimitiveTypes(0x00040000),
		dump_verbosity_noEnumerationTypes(0x00080000),
		dump_verbosity_onlyClassTypes(0x000FE000),
		dump_verbosity_onlyStructTypes(0x000FD000),
		dump_verbosity_onlyUnionTypes(0x000FB000),
		dump_verbosity_onlyArrayTypes(0x000F7000),
		dump_verbosity_onlyPointerTypes(0x000EF000),
		dump_verbosity_onlyMethodTypes(0x000DF000),
		dump_verbosity_onlyPrimitiveTypes(0x000BF000),
		dump_verbosity_onlyEnumerationTypes(0x0007F000),
		dump_verbosity_max(0x4FF00FBE);
		public final int val;
		private static class C { static int next_val; }

		dump_verbosity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		dump_verbosity() {
			this.val = C.next_val++;
		}
		
		public static dump_verbosity getEnum(int val) {
			for(dump_verbosity entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer __builtin_alloca();
	double __builtin_huge_val();
	float __builtin_huge_valf();
	double __builtin_huge_vall();
	double __builtin_inf();
	float __builtin_inff();
	double __builtin_infl();
	double __builtin_nan();
	float __builtin_nanf();
	double __builtin_nanl();
	void __builtin_va_end();
	com.sun.jna.NativeLong __builtin_expect();
	Pointer __builtin_return_address();
	Pointer __builtin_frame_address();
	int __builtin_ffs();
	int __builtin_clz();
	int __builtin_ctz();
	int __builtin_popcount();
	int __builtin_parity();
	float __builtin_prefetch(Object ... args);
	void __builtin_trap();
	com.sun.jna.NativeLong __builtin_object_size();
	void __builtin_abort();
	int __builtin_abs();
	com.sun.jna.NativeLong __builtin_labs();
	long __builtin_llabs();
	Pointer __builtin_memcpy();
	Pointer __builtin___memcpy_chk();
	void __builtin_exit();
	Pointer __builtin_malloc();
	int __builtin_memcmp();
	Pointer __builtin_memset();
	com.sun.jna.NativeLong __builtin_strlen();
	int __builtin_strcmp();
	String __builtin_strcpy();
	void set_dump_ir_graph_hook(Pointer hook);
	void set_dump_node_vcgattr_hook(Pointer hook);
	void set_dump_edge_vcgattr_hook(Pointer hook);
	void set_dump_node_edge_hook(Pointer func);
	Pointer get_dump_node_edge_hook();
	void set_dump_block_edge_hook(Pointer func);
	Pointer get_dump_block_edge_hook();
	void dump_ir_graph(Pointer irg, String suffix);
	void dump_ir_graph_file(Pointer irg, Pointer out);
	void dump_ir_block_graph(Pointer irg, String suffix);
	void dump_ir_block_graph_file(Pointer irg, Pointer out);
	void dump_ir_extblock_graph(Pointer irg, String suffix);
	void dump_ir_extblock_graph_file(Pointer irg, Pointer out);
	void dump_all_cg_block_graph(String suffix);
	void dump_ir_graph_w_types(Pointer irg, String suffix);
	void dump_ir_graph_w_types_file(Pointer irg, Pointer out);
	void dump_ir_block_graph_w_types(Pointer irg, String suffix);
	void dump_ir_block_graph_w_types_file(Pointer irg, Pointer out);
	void dump_all_ir_graphs(Pointer dump_graph, String suffix);
	Pointer dump_all_ir_graph_pass(String name, Pointer dump_graph, String suffix);
	void dump_cfg(Pointer irg, String suffix);
	void dump_subgraph(Pointer root, int depth, String suffix);
	void dump_callgraph(String suffix);
	void dump_type_graph(Pointer irg, String suffix);
	void dump_all_types(String suffix);
	void dump_class_hierarchy(int entities, String suffix);
	void dump_loop_tree(Pointer irg, String suffix);
	void dump_loop(Pointer l, String suffix);
	void dump_callgraph_loop_tree(String suffix);
	int dump_irnode_to_file(Pointer f, Pointer n);
	void dump_irnode(Pointer n);
	void dump_graph_to_file(Pointer F, Pointer irg);
	void dump_graph(Pointer g);
	void dump_graph_as_text(Pointer irg, String suffix);
	void dump_entity_to_file(Pointer F, Pointer ent, int verbosity);
	void dump_entity(Pointer ent);
	void dump_type_to_file(Pointer f, Pointer tp, /* dump_verbosity */int verbosity);
	void dump_type(Pointer tp);
	void dump_types_as_text(int verbosity, String suffix);
	void dump_globals_as_text(int verbosity, String suffix);
	void only_dump_method_with_name(Pointer name);
	Pointer get_dump_file_filter_ident();
	int is_filtered_dump_name(Pointer name);
	void turn_off_edge_labels();
	void dump_consts_local(int flag);
	void dump_node_idx_label(int flag);
	void dump_constant_entity_values(int flag);
	void dump_keepalive_edges(int flag);
	int get_opt_dump_keepalive_edges();
	void dump_out_edges(int flag);
	void dump_dominator_information(int flag);
	void dump_loop_information(int flag);
	void dump_backedge_information(int flag);
	void set_opt_dump_analysed_type_info(int flag);
	void dump_new_edges(int flag);
	void dump_pointer_values_to_info(int flag);
	void dump_ld_names(int flag);
	void dump_all_anchors(int flag);
	void dump_macroblock_edges(int flag);
	void dump_block_marker_in_title(int flag);
	Pointer dump_add_node_info_callback(Pointer cb, Pointer data);
	void dump_remv_node_info_callback(Pointer handle);
}
