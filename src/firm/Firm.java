package firm;

import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_firm_common;

public final class Firm {
	private static final binding_firm_common binding = Bindings.getFirmCommonBinding();
	
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
	
	public static void init() {
		binding.ir_init(Pointer.NULL);		
	}
	
	private Firm() {
	}
}
