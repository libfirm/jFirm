package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;


public class binding_irdump {
	static { Native.register("firm"); }
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
		mtp_property_inherited((1<<31));
		public final int val;
		private static class C { static int next_val; }

		mtp_additional_properties(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		mtp_additional_properties() {
			this.val = C.next_val++;
		}
		
		public static mtp_additional_properties getEnum(int val) {
			for(mtp_additional_properties entry : values()) {
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
	public static enum ir_value_classify_sign {
		value_classified_unknown(0),
		value_classified_positive(1),
		value_classified_negative(-1);
		public final int val;
		private static class C { static int next_val; }

		ir_value_classify_sign(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_value_classify_sign() {
			this.val = C.next_val++;
		}
		
		public static ir_value_classify_sign getEnum(int val) {
			for(ir_value_classify_sign entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_dump_verbosity_t {
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

		ir_dump_verbosity_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_dump_verbosity_t() {
			this.val = C.next_val++;
		}
		
		public static ir_dump_verbosity_t getEnum(int val) {
			for(ir_dump_verbosity_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_dump_flags_t {
		ir_dump_flag_blocks_as_subgraphs((1<<0)),
		ir_dump_flag_group_extbb((1<<1)),
		ir_dump_flag_with_typegraph((1<<2)),
		ir_dump_flag_disable_edge_labels((1<<3)),
		ir_dump_flag_consts_local((1<<4)),
		ir_dump_flag_idx_label((1<<5)),
		ir_dump_flag_number_label((1<<6)),
		ir_dump_flag_keepalive_edges((1<<7)),
		ir_dump_flag_out_edges((1<<8)),
		ir_dump_flag_dominance((1<<9)),
		ir_dump_flag_loops((1<<10)),
		ir_dump_flag_back_edges((1<<11)),
		ir_dump_flag_analysed_types((1<<12)),
		ir_dump_flag_iredges((1<<13)),
		ir_dump_flag_node_addresses((1<<14)),
		ir_dump_flag_all_anchors((1<<15)),
		ir_dump_flag_show_marks((1<<16)),
		ir_dump_flag_no_entity_values((1<<20)),
		ir_dump_flag_ld_names((1<<21)),
		ir_dump_flag_entities_in_hierarchy((1<<22));
		public final int val;
		private static class C { static int next_val; }

		ir_dump_flags_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_dump_flags_t() {
			this.val = C.next_val++;
		}
		
		public static ir_dump_flags_t getEnum(int val) {
			for(ir_dump_flags_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static native void dump_ir_graph(Pointer graph, String suffix);
	public static native void dump_ir_prog_ext(Pointer func, String suffix);
	public static native void dump_ir_graph_ext(Pointer func, Pointer graph, String suffix);
	public static native void dump_all_ir_graphs(String suffix);
	public static native void ir_set_dump_path(String path);
	public static native void ir_set_dump_filter(String name);
	public static native String ir_get_dump_filter();
	public static native int ir_should_dump(String name);
	public static native Pointer dump_all_ir_graph_pass(String name, String suffix);
	public static native void dump_ir_graph_file(Pointer out, Pointer graph);
	public static native void dump_cfg(Pointer out, Pointer graph);
	public static native void dump_callgraph(Pointer out);
	public static native void dump_typegraph(Pointer out);
	public static native void dump_class_hierarchy(Pointer out);
	public static native void dump_loop_tree(Pointer out, Pointer graph);
	public static native void dump_callgraph_loop_tree(Pointer out);
	public static native void dump_types_as_text(Pointer out);
	public static native void dump_globals_as_text(Pointer out);
	public static native void dump_loop(Pointer out, Pointer loop);
	public static native void dump_irnode_to_file(Pointer out, Pointer node);
	public static native void dump_graph_as_text(Pointer out, Pointer graph);
	public static native void dump_entity_to_file(Pointer out, Pointer entity);
	public static native void dump_type_to_file(Pointer out, Pointer type);
	public static native void ir_set_dump_verbosity(/* ir_dump_verbosity_t */int verbosity);
	public static native /* ir_dump_verbosity_t */int ir_get_dump_verbosity();
	public static native void ir_set_dump_flags(/* ir_dump_flags_t */int flags);
	public static native void ir_add_dump_flags(/* ir_dump_flags_t */int flags);
	public static native void ir_remove_dump_flags(/* ir_dump_flags_t */int flags);
	public static native /* ir_dump_flags_t */int ir_get_dump_flags();
	public static native void set_dump_node_vcgattr_hook(Pointer hook);
	public static native void set_dump_edge_vcgattr_hook(Pointer hook);
	public static native void set_dump_node_edge_hook(Pointer func);
	public static native Pointer get_dump_node_edge_hook();
	public static native void set_dump_block_edge_hook(Pointer func);
	public static native Pointer get_dump_block_edge_hook();
	public static native Pointer dump_add_node_info_callback(Pointer cb, Pointer data);
	public static native void dump_remove_node_info_callback(Pointer handle);
}
