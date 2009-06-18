package firm.bindings;

import com.sun.jna.Native;
import com.sun.jna.Platform;

public final class Bindings {

	private Bindings() {
	}
	
	public final static ModeBinding getModeBinding() {
		return (ModeBinding) Native.loadLibrary("firm", ModeBinding.class);
	}
	
	public final static TargetValueBinding getTargetValueBinding() {
		return (TargetValueBinding) Native.loadLibrary("firm", TargetValueBinding.class);
	}
	
	
	public final static binding_typerep getTypeRepBinding() {
		return (binding_typerep) Native.loadLibrary("firm", binding_typerep.class);
	}
	
	public final static binding_irdump getIrDumpBinding() {
		return (binding_irdump) Native.loadLibrary("firm", binding_irdump.class);
	}
	
	public final static binding_firm_common getFirmCommonBinding() {
		return (binding_firm_common) Native.loadLibrary("firm", binding_firm_common.class);
	}
		
	public final static binding_irgraph getIrGraphBinding() {
		return (binding_irgraph) Native.loadLibrary("firm", binding_irgraph.class);
	}
		
	public final static binding_ident getIdentBinding() {
		return (binding_ident) Native.loadLibrary("firm", binding_ident.class);
	}
		
	public final static binding_irprog getIrProgBinding() {
		return (binding_irprog) Native.loadLibrary("firm", binding_irprog.class);
	}
		
	public final static binding_be getBeBinding() {
		return (binding_be) Native.loadLibrary("firm", binding_be.class);
	}

	public final static binding_libc getLibcBinding() {
		return (binding_libc) Native.loadLibrary(
				Platform.isWindows() ? "msvcrt" : "c",
				binding_libc.class);
	}

	public final static binding_ircons getIrConsBinding() {
		return (binding_ircons) Native.loadLibrary("firm", binding_ircons.class);
	}

	public final static binding_irnode getIrNodeBinding() {
		return (binding_irnode) Native.loadLibrary("firm", binding_irnode.class);
	}
	
	public final static binding_iroptimize getIrOptimizeBinding() {
		return (binding_iroptimize) Native.loadLibrary("firm", binding_iroptimize.class);
	}

	public static binding_irop getIrOpBinding() {
		return (binding_irop) Native.loadLibrary("firm", binding_irop.class);
	}
	
}
