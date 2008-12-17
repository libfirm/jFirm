package firm;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.Bindings;
import firm.bindings.binding_firm_common;
import firm.bindings.binding_irflag;
import firm.bindings.binding_libc;

public final class Firm {
	private static final binding_firm_common binding = Bindings.getFirmCommonBinding();
	private static final binding_irflag binding_flag = (binding_irflag) Native.loadLibrary("firm", binding_irflag.class);
	
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
	
	public static binding_libc.SigHandler handler = new binding_libc.SigHandler() {
		@Override
		public void callback(int arg) {
			throw new RuntimeException("Prog Aborted");
		}			
	}; 
	
	public static void init() {
		/* hack to catch asserts... */
		Backend.binding_c.signal(/*SIGABRT*/ 6, handler);
		
		binding.ir_init(Pointer.NULL);
		
		/* disable all optimisations */
		binding_flag.set_optimize(0);
	}
	
	private Firm() {
	}
}
