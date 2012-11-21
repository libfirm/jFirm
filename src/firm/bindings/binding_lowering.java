package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_lowering {
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
		mtp_property_intrinsic((1 << 7)),
		mtp_property_runtime((1 << 8)),
		mtp_property_private((1 << 9)),
		mtp_property_has_loop((1 << 10)),
		mtp_property_always_inline((1 << 11)),
		mtp_property_noinline((1 << 12)),
		mtp_property_inline_recommended((1 << 13)),
		mtp_temporary((1 << 14));
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

	public static enum ir_where_alloc {
		stack_alloc(),
		heap_alloc();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_where_alloc(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_where_alloc() {
			this.val = C.next_val++;
		}

		public static ir_where_alloc getEnum(int val) {
			for (ir_where_alloc entry : values()) {
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
		ir_bk_last(ir_builtin_kind.ir_bk_inner_trampoline.val);
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

	public static enum ikind {
		INTRINSIC_CALL(0),
		INTRINSIC_INSTR();
		public final int val;

		private static class C {
			static int next_val;
		}

		ikind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ikind() {
			this.val = C.next_val++;
		}

		public static ikind getEnum(int val) {
			for (ikind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native void lower_CopyB(Pointer irg, int max_small_size, int min_large_size, int allow_misalignments);

	public static native void lower_switch(Pointer irg, int small_switch, int spare_size, Pointer selector_mode);

	public static native void lower_highlevel_graph(Pointer irg);

	public static native Pointer lower_highlevel_graph_pass(String name);

	public static native void lower_highlevel();

	public static native void lower_const_code();

	public static native Pointer lower_const_code_pass(String name);

	public static native void lower_mux(Pointer irg, Pointer cb_func);

	public static native Pointer lower_mux_pass(String name, Pointer cb_func);

	public static native com.sun.jna.NativeLong lower_intrinsics(Pointer list, com.sun.jna.NativeLong length, int part_block_used);

	public static native Pointer lower_intrinsics_pass(String name, Pointer list, com.sun.jna.NativeLong length, int part_block_used);

	public static native int i_mapper_abs(Pointer call, Pointer ctx);

	public static native int i_mapper_bswap(Pointer call, Pointer ctx);

	public static native int i_mapper_sqrt(Pointer call, Pointer ctx);

	public static native int i_mapper_cbrt(Pointer call, Pointer ctx);

	public static native int i_mapper_pow(Pointer call, Pointer ctx);

	public static native int i_mapper_exp(Pointer call, Pointer ctx);

	public static native int i_mapper_exp2(Pointer call, Pointer ctx);

	public static native int i_mapper_exp10(Pointer call, Pointer ctx);

	public static native int i_mapper_log(Pointer call, Pointer ctx);

	public static native int i_mapper_log2(Pointer call, Pointer ctx);

	public static native int i_mapper_log10(Pointer call, Pointer ctx);

	public static native int i_mapper_sin(Pointer call, Pointer ctx);

	public static native int i_mapper_cos(Pointer call, Pointer ctx);

	public static native int i_mapper_tan(Pointer call, Pointer ctx);

	public static native int i_mapper_asin(Pointer call, Pointer ctx);

	public static native int i_mapper_acos(Pointer call, Pointer ctx);

	public static native int i_mapper_atan(Pointer call, Pointer ctx);

	public static native int i_mapper_sinh(Pointer call, Pointer ctx);

	public static native int i_mapper_cosh(Pointer call, Pointer ctx);

	public static native int i_mapper_tanh(Pointer call, Pointer ctx);

	public static native int i_mapper_strcmp(Pointer call, Pointer ctx);

	public static native int i_mapper_strncmp(Pointer call, Pointer ctx);

	public static native int i_mapper_strcpy(Pointer call, Pointer ctx);

	public static native int i_mapper_strlen(Pointer call, Pointer ctx);

	public static native int i_mapper_memcpy(Pointer call, Pointer ctx);

	public static native int i_mapper_mempcpy(Pointer call, Pointer ctx);

	public static native int i_mapper_memmove(Pointer call, Pointer ctx);

	public static native int i_mapper_memset(Pointer call, Pointer ctx);

	public static native int i_mapper_memcmp(Pointer call, Pointer ctx);

	public static native int i_mapper_alloca(Pointer call, Pointer ctx);

	public static native int i_mapper_RuntimeCall(Pointer node, Pointer rt);
}
