/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


public interface binding_firm_common extends Library {
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
	public static enum firm_kind {
		k_BAD(0),
		k_entity(),
		k_type(),
		k_ir_graph(),
		k_ir_node(),
		k_ir_mode(),
		k_ir_op(),
		k_tarval(),
		k_ir_loop(),
		k_ir_compound_graph_path(),
		k_ir_extblk(),
		k_ir_prog(),
		k_ir_region(),
		k_ir_max();
		public final int val;
		private static class C { static int next_val; }

		firm_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		firm_kind() {
			this.val = C.next_val++;
		}
		
		public static firm_kind getEnum(int val) {
			for(firm_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	void ir_init(Pointer params);
	void ir_finish();
	int ir_get_version_major();
	int ir_get_version_minor();
	String ir_get_version_revision();
	String ir_get_version_build();
	/* firm_kind */int get_kind(Pointer firm_thing);
	String print_firm_kind(Pointer firm_thing);
	void firm_identify_thing(Pointer X);
}
