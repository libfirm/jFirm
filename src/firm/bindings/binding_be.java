package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Pointer;


public interface binding_be extends Library {
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
	public static enum insn_kind {
		LEA(),
		SHIFT(),
		SUB(),
		ADD(),
		ZERO(),
		MUL(),
		ROOT();
		public final int val;
		private static class C { static int next_val; }

		insn_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		insn_kind() {
			this.val = C.next_val++;
		}
		
		public static insn_kind getEnum(int val) {
			for(insn_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum arch_dep_opts_t {
		arch_dep_none(0),
		arch_dep_mul_to_shift(1),
		arch_dep_div_by_const(2),
		arch_dep_mod_by_const(4);
		public final int val;
		private static class C { static int next_val; }

		arch_dep_opts_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		arch_dep_opts_t() {
			this.val = C.next_val++;
		}
		
		public static arch_dep_opts_t getEnum(int val) {
			for(arch_dep_opts_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum add_hidden {
		ADD_HIDDEN_ALWAYS_IN_FRONT(0),
		ADD_HIDDEN_ALWAYS_LAST(1),
		ADD_HIDDEN_SMART(2);
		public final int val;
		private static class C { static int next_val; }

		add_hidden(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		add_hidden() {
			this.val = C.next_val++;
		}
		
		public static add_hidden getEnum(int val) {
			for(add_hidden entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum lowering_flags {
		LF_NONE(0),
		LF_COMPOUND_PARAM(1),
		LF_COMPOUND_RETURN(2),
		LF_RETURN_HIDDEN(4),
		LF_SMALL_CMP_IN_REGS(8);
		public final int val;
		private static class C { static int next_val; }

		lowering_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		lowering_flags() {
			this.val = C.next_val++;
		}
		
		public static lowering_flags getEnum(int val) {
			for(lowering_flags entry : values()) {
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
		private static class C { static int next_val; }

		ikind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ikind() {
			this.val = C.next_val++;
		}
		
		public static ikind getEnum(int val) {
			for(ikind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum asm_constraint_flags_t {
		ASM_CONSTRAINT_FLAG_SUPPORTS_REGISTER(0x0001),
		ASM_CONSTRAINT_FLAG_SUPPORTS_MEMOP(0x0002),
		ASM_CONSTRAINT_FLAG_SUPPORTS_IMMEDIATE(0x0004),
		ASM_CONSTRAINT_FLAG_NO_SUPPORT(0x0008),
		ASM_CONSTRAINT_FLAG_MODIFIER_WRITE(0x0010),
		ASM_CONSTRAINT_FLAG_MODIFIER_NO_WRITE(0x0020),
		ASM_CONSTRAINT_FLAG_MODIFIER_READ(0x0040),
		ASM_CONSTRAINT_FLAG_MODIFIER_NO_READ(0x0080),
		ASM_CONSTRAINT_FLAG_MODIFIER_EARLYCLOBBER(0x0100),
		ASM_CONSTRAINT_FLAG_MODIFIER_COMMUTATIVE(0x0200),
		ASM_CONSTRAINT_FLAG_INVALID(0x8000);
		public final int val;
		private static class C { static int next_val; }

		asm_constraint_flags_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		asm_constraint_flags_t() {
			this.val = C.next_val++;
		}
		
		public static asm_constraint_flags_t getEnum(int val) {
			for(asm_constraint_flags_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer arch_dep_default_factory();
	void arch_dep_init(Pointer factory);
	void arch_dep_set_opts(/* arch_dep_opts_t */int opts);
	Pointer arch_dep_replace_mul_with_shifts(Pointer irn);
	Pointer arch_dep_replace_div_by_const(Pointer irn);
	Pointer arch_dep_replace_mod_by_const(Pointer irn);
	void arch_dep_replace_divmod_by_const(Pointer[] div, Pointer[] mod, Pointer irn);
	void lower_calls_with_compounds(Pointer params);
	void lower_CopyB(Pointer irg, int max_size, int native_mode_bytes);
	void lower_switch(Pointer irg, int spare_size);
	Pointer lower_switch_pass(String name, int spare_size);
	void lower_dw_ops(Pointer param);
	Pointer lower_dw_ops_pass(String name, Pointer param);
	Pointer def_create_intrinsic_fkt(Pointer method, Pointer op, Pointer imode, Pointer omode, Pointer context);
	void lower_highlevel_graph(Pointer irg, int lower_bitfields);
	Pointer lower_highlevel_graph_pass(String name, int lower_bitfields);
	void lower_highlevel(int lower_bitfields);
	void lower_const_code();
	Pointer lower_const_code_pass(String name);
	void ir_lower_mode_b(Pointer irg, Pointer config);
	Pointer ir_lower_mode_b_pass(String name, Pointer config);
	void lower_mux(Pointer irg, Pointer cb_func);
	Pointer lower_mux_pass(String name, Pointer cb_func);
	int lower_intrinsics(Pointer list, int length, int part_block_used);
	Pointer lower_intrinsics_pass(String name, Pointer list, int length, int part_block_used);
	int i_mapper_abs(Pointer call, Pointer ctx);
	int i_mapper_bswap(Pointer call, Pointer ctx);
	int i_mapper_sqrt(Pointer call, Pointer ctx);
	int i_mapper_cbrt(Pointer call, Pointer ctx);
	int i_mapper_pow(Pointer call, Pointer ctx);
	int i_mapper_exp(Pointer call, Pointer ctx);
	int i_mapper_log(Pointer call, Pointer ctx);
	int i_mapper_sin(Pointer call, Pointer ctx);
	int i_mapper_cos(Pointer call, Pointer ctx);
	int i_mapper_tan(Pointer call, Pointer ctx);
	int i_mapper_asin(Pointer call, Pointer ctx);
	int i_mapper_acos(Pointer call, Pointer ctx);
	int i_mapper_atan(Pointer call, Pointer ctx);
	int i_mapper_sinh(Pointer call, Pointer ctx);
	int i_mapper_cosh(Pointer call, Pointer ctx);
	int i_mapper_tanh(Pointer call, Pointer ctx);
	int i_mapper_strcmp(Pointer call, Pointer ctx);
	int i_mapper_strncmp(Pointer call, Pointer ctx);
	int i_mapper_strcpy(Pointer call, Pointer ctx);
	int i_mapper_strlen(Pointer call, Pointer ctx);
	int i_mapper_memcpy(Pointer call, Pointer ctx);
	int i_mapper_mempcpy(Pointer call, Pointer ctx);
	int i_mapper_memmove(Pointer call, Pointer ctx);
	int i_mapper_memset(Pointer call, Pointer ctx);
	int i_mapper_memcmp(Pointer call, Pointer ctx);
	int i_mapper_alloca(Pointer call, Pointer ctx);
	int i_mapper_RuntimeCall(Pointer node, Pointer rt);
	void be_opt_register();
	int be_parse_arg(String arg);
	Pointer be_get_backend_param();
	void be_main(Pointer output, String compilation_unit_name);
	/* asm_constraint_flags_t */int be_parse_asm_constraints(String constraints);
	int be_is_valid_clobber(String clobber);
}
