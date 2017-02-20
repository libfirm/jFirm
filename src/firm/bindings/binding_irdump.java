package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_irdump {
	static {
		Native.register("firm");
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
		mtp_property_no_write((1 << 0)),
		mtp_property_pure((1 << 1)),
		mtp_property_noreturn((1 << 2)),
		mtp_property_terminates((1 << 3)),
		mtp_property_nothrow((1 << 4)),
		mtp_property_naked((1 << 5)),
		mtp_property_malloc((1 << 6)),
		mtp_property_returns_twice((1 << 7)),
		mtp_property_private((1 << 8)),
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
		ir_bk_saturating_increment(),
		ir_bk_compare_swap(),
		ir_bk_may_alias(),
		ir_bk_va_start(),
		ir_bk_va_arg(),
		ir_bk_last(ir_builtin_kind.ir_bk_va_arg.val);
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

	public static enum ir_dump_verbosity_t {
		dump_verbosity_onlynames(0x00000001),
		dump_verbosity_fields(0x00000002),
		dump_verbosity_methods(0x00000004),
		dump_verbosity_nostatic(0x00000040),
		dump_verbosity_typeattrs(0x00000008),
		dump_verbosity_entattrs(0x00000010),
		dump_verbosity_entconsts(0x00000020),
		dump_verbosity_accessStats(0x00000100),
		dump_verbosity_max(0x4FF00FBE);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_dump_verbosity_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_dump_verbosity_t() {
			this.val = C.next_val++;
		}

		public static ir_dump_verbosity_t getEnum(int val) {
			for (ir_dump_verbosity_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_dump_flags_t {
		ir_dump_flag_blocks_as_subgraphs((1 << 0)),
		ir_dump_flag_with_typegraph((1 << 1)),
		ir_dump_flag_disable_edge_labels((1 << 2)),
		ir_dump_flag_consts_local((1 << 3)),
		ir_dump_flag_idx_label((1 << 4)),
		ir_dump_flag_number_label((1 << 5)),
		ir_dump_flag_keepalive_edges((1 << 6)),
		ir_dump_flag_out_edges((1 << 7)),
		ir_dump_flag_dominance((1 << 8)),
		ir_dump_flag_loops((1 << 9)),
		ir_dump_flag_back_edges((1 << 10)),
		ir_dump_flag_iredges((1 << 11)),
		ir_dump_flag_all_anchors((1 << 12)),
		ir_dump_flag_show_marks((1 << 13)),
		ir_dump_flag_no_entity_values((1 << 14)),
		ir_dump_flag_ld_names((1 << 15)),
		ir_dump_flag_entities_in_hierarchy((1 << 16));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_dump_flags_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_dump_flags_t() {
			this.val = C.next_val++;
		}

		public static ir_dump_flags_t getEnum(int val) {
			for (ir_dump_flags_t entry : values()) {
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
