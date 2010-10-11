package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;


public class binding_iredges {
	static { Native.register("firm"); }
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
	public static enum ir_edge_kind_t {
		EDGE_KIND_NORMAL(),
		EDGE_KIND_BLOCK(),
		EDGE_KIND_DEP(),
		EDGE_KIND_LAST();
		public final int val;
		private static class C { static int next_val; }

		ir_edge_kind_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_edge_kind_t() {
			this.val = C.next_val++;
		}
		
		public static ir_edge_kind_t getEnum(int val) {
			for(ir_edge_kind_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static native Pointer get_irn_out_edge_first_kind(Pointer irn, /* ir_edge_kind_t */int kind);
	public static native Pointer get_irn_out_edge_next(Pointer irn, Pointer last);
	public static native Pointer get_edge_src_irn(Pointer edge);
	public static native int get_edge_src_pos(Pointer edge);
	public static native Pointer get_irn_edge_kind(Pointer irg, Pointer irn, int pos, /* ir_edge_kind_t */int kind);
	public static native int get_irn_n_edges_kind(Pointer irn, /* ir_edge_kind_t */int kind);
	public static native int edges_activated_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	public static native void edges_activate_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	public static native void edges_deactivate_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	public static native void edges_reroute_kind(Pointer old, Pointer nw, /* ir_edge_kind_t */int kind, Pointer irg);
	public static native int edges_verify(Pointer irg);
	public static native int edges_verify_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	public static native void edges_init_dbg(int do_dbg);
	public static native Pointer irg_verify_edges_pass(String name, int assert_on_problem);
	public static native Pointer get_irn_edge(Pointer irg, Pointer src, int pos);
	public static native void edges_activate(Pointer irg);
	public static native void edges_deactivate(Pointer irg);
	public static native int edges_assure(Pointer irg);
	public static native int edges_assure_kind(Pointer irg, /* ir_edge_kind_t */int kind);
	public static native void edges_node_deleted(Pointer irn, Pointer irg);
	public static native void edges_notify_edge(Pointer src, int pos, Pointer tgt, Pointer old_tgt, Pointer irg);
	public static native void irg_block_edges_walk(Pointer block, Pointer pre, Pointer post, Pointer env);
	public static native void irg_walk_edges(Pointer start, Pointer pre, Pointer post, Pointer env);
	public static native void edges_reset_private_data(Pointer irg, int offset, int size);
}
