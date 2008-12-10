package firm;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.binding_firm_common;
import firm.bindings.binding_irgraph;

public final class Firm {
	private static final binding_firm_common binding = (binding_firm_common) Native.loadLibrary("firm", binding_firm_common.class);	
	
	public static int getMajorVersion() {
		return binding.ir_get_version_major();
	}
	
	public static int getMinorVersion() {
		return binding.ir_get_version_minor();
	}
	
	public static String getBuild() {
		return binding.ir_get_version_build();
	}
	
	public static String getRevision() {
		return binding.ir_get_version_revision();
	}
	
	static {
		binding.ir_init(Pointer.NULL);
	}
	
	private Firm() {
	}
}
