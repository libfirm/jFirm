package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Pointer;


public interface binding_irop extends Library {
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
	public static enum op_arity {
		oparity_invalid(0),
		oparity_unary(),
		oparity_binary(),
		oparity_trinary(),
		oparity_zero(),
		oparity_variable(),
		oparity_dynamic(),
		oparity_any();
		public final int val;
		private static class C { static int next_val; }

		op_arity(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		op_arity() {
			this.val = C.next_val++;
		}
		
		public static op_arity getEnum(int val) {
			for(op_arity entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irop_flags {
		irop_flag_none(0x00000000),
		irop_flag_labeled(0x00000001),
		irop_flag_commutative(0x00000002),
		irop_flag_cfopcode(0x00000004),
		irop_flag_ip_cfopcode(0x00000008),
		irop_flag_fragile(0x00000010),
		irop_flag_forking(0x00000020),
		irop_flag_highlevel(0x00000040),
		irop_flag_constlike(0x00000080),
		irop_flag_always_opt(0x00000100),
		irop_flag_keep(0x00000200),
		irop_flag_start_block(0x00000400),
		irop_flag_uses_memory(0x00000800),
		irop_flag_dump_noblock(0x00001000),
		irop_flag_dump_noinput(0x00002000),
		irop_flag_machine(0x00010000),
		irop_flag_machine_op(0x00020000),
		irop_flag_cse_neutral(0x00040000),
		irop_flag_user(0x00080000);
		public final int val;
		private static class C { static int next_val; }

		irop_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irop_flags() {
			this.val = C.next_val++;
		}
		
		public static irop_flags getEnum(int val) {
			for(irop_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_opcode {
		iro_Block(),
		iro_First(ir_opcode.iro_Block.val),
		iro_Start(),
		iro_End(),
		iro_Jmp(),
		iro_IJmp(),
		iro_Cond(),
		iro_Return(),
		iro_Const(),
		iro_SymConst(),
		iro_Sel(),
		iro_Call(),
		iro_Add(),
		iro_Sub(),
		iro_Minus(),
		iro_Mul(),
		iro_Mulh(),
		iro_Quot(),
		iro_DivMod(),
		iro_Div(),
		iro_Mod(),
		iro_Abs(),
		iro_And(),
		iro_Or(),
		iro_Eor(),
		iro_Not(),
		iro_Cmp(),
		iro_Shl(),
		iro_Shr(),
		iro_Shrs(),
		iro_Rotl(),
		iro_Conv(),
		iro_Cast(),
		iro_Carry(),
		iro_Borrow(),
		iro_Phi(),
		iro_Load(),
		iro_Store(),
		iro_Alloc(),
		iro_Free(),
		iro_Sync(),
		iro_Proj(),
		iro_Tuple(),
		iro_Id(),
		iro_Bad(),
		iro_Confirm(),
		iro_Unknown(),
		iro_Filter(),
		iro_Break(),
		iro_CallBegin(),
		iro_EndReg(),
		iro_EndExcept(),
		iro_NoMem(),
		iro_Mux(),
		iro_CopyB(),
		iro_InstOf(),
		iro_Raise(),
		iro_Bound(),
		iro_Pin(),
		iro_ASM(),
		iro_Builtin(),
		iro_Dummy(),
		iro_Anchor(),
		iro_Last(ir_opcode.iro_Anchor.val),
		beo_First(),
		beo_Spill(ir_opcode.beo_First.val),
		beo_Reload(),
		beo_Perm(),
		beo_MemPerm(),
		beo_Copy(),
		beo_Keep(),
		beo_CopyKeep(),
		beo_Call(),
		beo_Return(),
		beo_AddSP(),
		beo_SubSP(),
		beo_IncSP(),
		beo_Start(),
		beo_FrameAddr(),
		beo_Barrier(),
		beo_Last(ir_opcode.beo_Barrier.val),
		iro_MaxOpcode();
		public final int val;
		private static class C { static int next_val; }

		ir_opcode(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_opcode() {
			this.val = C.next_val++;
		}
		
		public static ir_opcode getEnum(int val) {
			for(ir_opcode entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum dump_reason_t {
		dump_node_opcode_txt(),
		dump_node_mode_txt(),
		dump_node_nodeattr_txt(),
		dump_node_info_txt();
		public final int val;
		private static class C { static int next_val; }

		dump_reason_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		dump_reason_t() {
			this.val = C.next_val++;
		}
		
		public static dump_reason_t getEnum(int val) {
			for(dump_reason_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer new_id_from_str(String str);
	Pointer new_id_from_chars(String str, com.sun.jna.NativeLong len);
	String get_id_str(Pointer id);
	com.sun.jna.NativeLong get_id_strlen(Pointer id);
	int id_is_prefix(Pointer prefix, Pointer id);
	int id_is_suffix(Pointer suffix, Pointer id);
	int id_contains_char(Pointer id, byte c);
	Pointer id_unique(String tag);
	Pointer id_mangle_entity(Pointer ent);
	Pointer id_mangle_u(Pointer first, Pointer scnd);
	Pointer id_mangle_dot(Pointer first, Pointer scnd);
	Pointer id_mangle(Pointer first, Pointer scnd);
	Pointer id_mangle3(String prefix, Pointer middle, String suffix);
	Pointer id_decorate_win32_c_fkt(Pointer ent, Pointer id);
	Pointer get_op_Abs();
	Pointer get_op_Add();
	Pointer get_op_Alloc();
	Pointer get_op_Anchor();
	Pointer get_op_And();
	Pointer get_op_ASM();
	Pointer get_op_Bad();
	Pointer get_op_Block();
	Pointer get_op_Borrow();
	Pointer get_op_Bound();
	Pointer get_op_Break();
	Pointer get_op_Builtin();
	Pointer get_op_CallBegin();
	Pointer get_op_Call();
	Pointer get_op_Carry();
	Pointer get_op_Cast();
	Pointer get_op_Cmp();
	Pointer get_op_Cond();
	Pointer get_op_Confirm();
	Pointer get_op_Const();
	Pointer get_op_Conv();
	Pointer get_op_CopyB();
	Pointer get_op_DivMod();
	Pointer get_op_Div();
	Pointer get_op_Dummy();
	Pointer get_op_EndExcept();
	Pointer get_op_EndReg();
	Pointer get_op_End();
	Pointer get_op_Eor();
	Pointer get_op_Filter();
	Pointer get_op_Free();
	Pointer get_op_Id();
	Pointer get_op_IJmp();
	Pointer get_op_InstOf();
	Pointer get_op_Jmp();
	Pointer get_op_Load();
	Pointer get_op_Minus();
	Pointer get_op_Mod();
	Pointer get_op_Mulh();
	Pointer get_op_Mul();
	Pointer get_op_Mux();
	Pointer get_op_NoMem();
	Pointer get_op_Not();
	Pointer get_op_Or();
	Pointer get_op_Phi();
	Pointer get_op_Pin();
	Pointer get_op_Proj();
	Pointer get_op_Quot();
	Pointer get_op_Raise();
	Pointer get_op_Return();
	Pointer get_op_Rotl();
	Pointer get_op_Sel();
	Pointer get_op_Shl();
	Pointer get_op_Shrs();
	Pointer get_op_Shr();
	Pointer get_op_Start();
	Pointer get_op_Store();
	Pointer get_op_Sub();
	Pointer get_op_SymConst();
	Pointer get_op_Sync();
	Pointer get_op_Tuple();
	Pointer get_op_Unknown();
	Pointer get_op_ident(Pointer op);
	String get_op_name(Pointer op);
	int get_op_code(Pointer op);
	String get_op_pin_state_name(/* op_pin_state */int s);
	/* op_pin_state */int get_op_pinned(Pointer op);
	void set_op_pinned(Pointer op, /* op_pin_state */int pinned);
	int get_next_ir_opcode();
	int get_next_ir_opcodes(int num);
	Pointer get_generic_function_ptr(Pointer op);
	void set_generic_function_ptr(Pointer op, Pointer func);
	/* irop_flags */int get_op_flags(Pointer op);
	Pointer new_ir_op(int code, String name, /* op_pin_state */int p, int flags, /* op_arity */int opar, int op_index, com.sun.jna.NativeLong attr_size, Pointer ops);
	Pointer get_op_ops(Pointer op);
}
