package firm.bindings;

import com.sun.jna.Callback;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_libc {
	static {
		if (System.getProperty("os.name").startsWith("Windows")) {
			Native.register("msvcrt");
		} else {
			Native.register("firm");
		}
	}

	public static native Pointer fopen(String name, String mode);

	public static native void fclose(Pointer file);

	public interface SigHandler extends Callback {
		void callback(int arg);
	}

	public static native SigHandler signal(int signum, SigHandler handler);
}
