package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_irgraph {
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

	public static enum symconst_kind {
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

	public static enum irg_callee_info_state {
		irg_callee_info_none(),
		irg_callee_info_consistent(),
		irg_callee_info_inconsistent();
		public final int val;

		private static class C {
			static int next_val;
		}

		irg_callee_info_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		irg_callee_info_state() {
			this.val = C.next_val++;
		}

		public static irg_callee_info_state getEnum(int val) {
			for (irg_callee_info_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_resources_t {
		IR_RESOURCE_NONE(0),
		IR_RESOURCE_BLOCK_VISITED((1 << 0)),
		IR_RESOURCE_BLOCK_MARK((1 << 1)),
		IR_RESOURCE_IRN_VISITED((1 << 2)),
		IR_RESOURCE_IRN_LINK((1 << 3)),
		IR_RESOURCE_LOOP_LINK((1 << 4)),
		IR_RESOURCE_PHI_LIST((1 << 5));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_resources_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_resources_t() {
			this.val = C.next_val++;
		}

		public static ir_resources_t getEnum(int val) {
			for (ir_resources_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_graph_constraints_t {
		IR_GRAPH_CONSTRAINT_ARCH_DEP((1 << 0)),
		IR_GRAPH_CONSTRAINT_MODEB_LOWERED((1 << 1)),
		IR_GRAPH_CONSTRAINT_NORMALISATION2((1 << 2)),
		IR_GRAPH_CONSTRAINT_OPTIMIZE_UNREACHABLE_CODE((1 << 3)),
		IR_GRAPH_CONSTRAINT_CONSTRUCTION((1 << 4)),
		IR_GRAPH_CONSTRAINT_TARGET_LOWERED((1 << 5)),
		IR_GRAPH_CONSTRAINT_BACKEND((1 << 6));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_graph_constraints_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_graph_constraints_t() {
			this.val = C.next_val++;
		}

		public static ir_graph_constraints_t getEnum(int val) {
			for (ir_graph_constraints_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_graph_properties_t {
		IR_GRAPH_PROPERTIES_NONE(0),
		IR_GRAPH_PROPERTY_NO_CRITICAL_EDGES((1 << 0)),
		IR_GRAPH_PROPERTY_NO_BADS((1 << 1)),
		IR_GRAPH_PROPERTY_NO_TUPLES((1 << 2)),
		IR_GRAPH_PROPERTY_NO_UNREACHABLE_CODE((1 << 3)),
		IR_GRAPH_PROPERTY_ONE_RETURN((1 << 4)),
		IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE((1 << 5)),
		IR_GRAPH_PROPERTY_CONSISTENT_POSTDOMINANCE((1 << 6)),
		IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE_FRONTIERS((1 << 7)),
		IR_GRAPH_PROPERTY_CONSISTENT_OUT_EDGES((1 << 8)),
		IR_GRAPH_PROPERTY_CONSISTENT_OUTS((1 << 9)),
		IR_GRAPH_PROPERTY_CONSISTENT_LOOPINFO((1 << 10)),
		IR_GRAPH_PROPERTY_CONSISTENT_ENTITY_USAGE((1 << 11)),
		IR_GRAPH_PROPERTY_MANY_RETURNS((1 << 12)),
		IR_GRAPH_PROPERTIES_CONTROL_FLOW(((((((ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_CRITICAL_EDGES.val | ir_graph_properties_t.IR_GRAPH_PROPERTY_ONE_RETURN.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_UNREACHABLE_CODE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_LOOPINFO.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_POSTDOMINANCE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_DOMINANCE_FRONTIERS.val)),
		IR_GRAPH_PROPERTIES_ALL(((((((ir_graph_properties_t.IR_GRAPH_PROPERTIES_CONTROL_FLOW.val | ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_BADS.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_NO_TUPLES.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_OUT_EDGES.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_OUTS.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_CONSISTENT_ENTITY_USAGE.val) | ir_graph_properties_t.IR_GRAPH_PROPERTY_MANY_RETURNS.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_graph_properties_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_graph_properties_t() {
			this.val = C.next_val++;
		}

		public static ir_graph_properties_t getEnum(int val) {
			for (ir_graph_properties_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native Pointer new_ir_graph(Pointer ent, int n_loc);

	public static native void free_ir_graph(Pointer irg);

	public static native int is_ir_graph(Pointer thing);

	public static native Pointer get_irg_entity(Pointer irg);

	public static native void set_irg_entity(Pointer irg, Pointer ent);

	public static native Pointer get_irg_frame_type(Pointer irg);

	public static native void set_irg_frame_type(Pointer irg, Pointer ftp);

	public static native Pointer get_irg_start_block(Pointer irg);

	public static native void set_irg_start_block(Pointer irg, Pointer node);

	public static native Pointer get_irg_start(Pointer irg);

	public static native void set_irg_start(Pointer irg, Pointer node);

	public static native Pointer get_irg_end_block(Pointer irg);

	public static native void set_irg_end_block(Pointer irg, Pointer node);

	public static native Pointer get_irg_end(Pointer irg);

	public static native void set_irg_end(Pointer irg, Pointer node);

	public static native Pointer get_irg_initial_exec(Pointer irg);

	public static native void set_irg_initial_exec(Pointer irg, Pointer node);

	public static native Pointer get_irg_frame(Pointer irg);

	public static native void set_irg_frame(Pointer irg, Pointer node);

	public static native Pointer get_irg_initial_mem(Pointer irg);

	public static native void set_irg_initial_mem(Pointer irg, Pointer node);

	public static native Pointer get_irg_args(Pointer irg);

	public static native void set_irg_args(Pointer irg, Pointer node);

	public static native Pointer get_irg_no_mem(Pointer irg);

	public static native void set_irg_no_mem(Pointer irg, Pointer node);

	public static native int get_irg_n_locs(Pointer irg);

	public static native com.sun.jna.NativeLong get_irg_graph_nr(Pointer irg);

	public static native com.sun.jna.NativeLong get_irg_idx(Pointer irg);

	public static native Pointer get_idx_irn(Pointer irg, int idx);

	public static native /* op_pin_state */int get_irg_pinned(Pointer irg);

	public static native /* irg_callee_info_state */int get_irg_callee_info_state(Pointer irg);

	public static native void set_irg_callee_info_state(Pointer irg, /* irg_callee_info_state */int s);

	public static native void set_irg_link(Pointer irg, Pointer thing);

	public static native Pointer get_irg_link(Pointer irg);

	public static native void inc_irg_visited(Pointer irg);

	public static native com.sun.jna.NativeLong get_irg_visited(Pointer irg);

	public static native void set_irg_visited(Pointer irg, com.sun.jna.NativeLong i);

	public static native com.sun.jna.NativeLong get_max_irg_visited();

	public static native void set_max_irg_visited(int val);

	public static native com.sun.jna.NativeLong inc_max_irg_visited();

	public static native void inc_irg_block_visited(Pointer irg);

	public static native com.sun.jna.NativeLong get_irg_block_visited(Pointer irg);

	public static native void set_irg_block_visited(Pointer irg, com.sun.jna.NativeLong i);

	public static native void ir_reserve_resources(Pointer irg, /* ir_resources_t */int resources);

	public static native void ir_free_resources(Pointer irg, /* ir_resources_t */int resources);

	public static native /* ir_resources_t */int ir_resources_reserved(Pointer irg);

	public static native void add_irg_constraints(Pointer irg, /* ir_graph_constraints_t */int constraints);

	public static native void clear_irg_constraints(Pointer irg, /* ir_graph_constraints_t */int constraints);

	public static native int irg_is_constrained(Pointer irg, /* ir_graph_constraints_t */int constraints);

	public static native void add_irg_properties(Pointer irg, /* ir_graph_properties_t */int props);

	public static native void clear_irg_properties(Pointer irg, /* ir_graph_properties_t */int props);

	public static native int irg_has_properties(Pointer irg, /* ir_graph_properties_t */int props);

	public static native void set_irg_loc_description(Pointer irg, int n, Pointer description);

	public static native Pointer get_irg_loc_description(Pointer irg, int n);

	public static native int get_irg_last_idx(Pointer irg);

	public static native int get_irg_fp_model(Pointer irg);

	public static native void set_irg_fp_model(Pointer irg, int model);

	public static native void assure_irg_properties(Pointer irg, /* ir_graph_properties_t */int props);

	public static native void confirm_irg_properties(Pointer irg, /* ir_graph_properties_t */int props);
}
