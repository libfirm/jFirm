import com.sun.jna.Native;

public class Main {
	public static void main(String[] args) {
		binding_firm_common firm = (binding_firm_common) Native.loadLibrary("firm", binding_firm_common.class);

		System.out.printf("Firm Version %1s.%2s Rev: %3s Build: %4s",
				firm.ir_get_version_minor(),
				firm.ir_get_version_major(),
				firm.ir_get_version_revision(),
				firm.ir_get_version_build());
	}
}
