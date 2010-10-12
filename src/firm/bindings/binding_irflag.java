package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.nio.Buffer;


public class binding_irflag {
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
	public static enum firm_verification_t {
		FIRM_VERIFICATION_OFF(0),
		FIRM_VERIFICATION_ON(1),
		FIRM_VERIFICATION_REPORT(2),
		FIRM_VERIFICATION_ERROR_ONLY(3);
		public final int val;
		private static class C { static int next_val; }

		firm_verification_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		firm_verification_t() {
			this.val = C.next_val++;
		}
		
		public static firm_verification_t getEnum(int val) {
			for(firm_verification_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static native void set_optimize(int value);
	public static native int get_optimize();
	public static native void set_opt_constant_folding(int value);
	public static native void set_opt_algebraic_simplification(int value);
	public static native void set_opt_cse(int value);
	public static native int get_opt_cse();
	public static native void set_opt_global_cse(int value);
	public static native void set_opt_unreachable_code(int value);
	public static native void set_opt_dyn_meth_dispatch(int value);
	public static native int get_opt_dyn_meth_dispatch();
	public static native void set_opt_suppress_downcast_optimization(int value);
	public static native int get_opt_suppress_downcast_optimization();
	public static native void set_opt_ldst_only_null_ptr_exceptions(int value);
	public static native void set_opt_sel_based_null_check_elim(int value);
	public static native void set_opt_global_null_ptr_elimination(int value);
	public static native void set_opt_auto_create_sync(int value);
	public static native void set_opt_alias_analysis(int value);
	public static native void set_opt_closed_world(int value);
	public static native void save_optimization_state(Pointer state);
	public static native void restore_optimization_state(Pointer state);
	public static native void all_optimizations_off();
	public static native void do_node_verification(/* firm_verification_t */int mode);
}
