package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


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
		data_edge(1),
		block_edge(2),
		cf_edge(3),
		exc_cf_edge(4),
		mem_edge(5),
		dominator_edge(6),
		node2type_edge(7),
		ent_type_edge(17),
		ent_own_edge(18),
		ent_overwrites_edge(19),
		ent_value_edge(20),
		ent_corr_edge(21),
		meth_par_edge(33),
		meth_res_edge(34),
		type_super_edge(35),
		union_edge(36),
		ptr_pts_to_edge(37),
		arr_elt_type_edge(38),
		arr_ent_edge(39),
		type_member_edge(40),
		intra_edge(0),
		inter_edge(64),
		back_edge(128);
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
		dump_verbosity_onlynames(1),
		dump_verbosity_fields(2),
		dump_verbosity_methods(4),
		dump_verbosity_nostatic(64),
		dump_verbosity_typeattrs(8),
		dump_verbosity_entattrs(16),
		dump_verbosity_entconsts(32),
		dump_verbosity_accessStats(256),
		dump_verbosity_csv(512),
		dump_verbosity_noClassTypes(4096),
		dump_verbosity_noStructTypes(8192),
		dump_verbosity_noUnionTypes(16384),
		dump_verbosity_noArrayTypes(32768),
		dump_verbosity_noPointerTypes(65536),
		dump_verbosity_noMethodTypes(131072),
		dump_verbosity_noPrimitiveTypes(262144),
		dump_verbosity_noEnumerationTypes(524288),
		dump_verbosity_onlyClassTypes(1040384),
		dump_verbosity_onlyStructTypes(1036288),
		dump_verbosity_onlyUnionTypes(1028096),
		dump_verbosity_onlyArrayTypes(1011712),
		dump_verbosity_onlyPointerTypes(978944),
		dump_verbosity_onlyMethodTypes(913408),
		dump_verbosity_onlyPrimitiveTypes(782336),
		dump_verbosity_onlyEnumerationTypes(520192),
		dump_verbosity_max(1341132734);
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
	void dump_all_ir_graphs(Pointer dump_graph, String suffix);
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
	void dump_pointer_values_to_info(int flag);
	void dump_ld_names(int flag);
	void dump_all_anchors(int flag);
	void dump_macroblock_edges(int flag);
	void dump_block_marker_in_title(int flag);
	Pointer dump_add_node_info_callback(Pointer cb, Pointer data);
	void dump_remv_node_info_callback(Pointer handle);
}
