package firm.bindings;

import com.sun.jna.Native;

public final class Bindings {

	private Bindings() {
	}
	
	public final static FirmBinding getBinding() {
		return (FirmBinding) Native.loadLibrary("firm", FirmBinding.class);
	}
	
	public final static ModeBinding getModeBinding() {
		return (ModeBinding) Native.loadLibrary("firm", ModeBinding.class);
	}
	
	public final static TargetValueBinding getTargetValueBinding() {
		return (TargetValueBinding) Native.loadLibrary("firm", TargetValueBinding.class);
	}
	
}
