package firm.bindings;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface binding_libc extends Library {

	Pointer fopen(String name, String mode);
	void fclose(Pointer file);
	
	interface SigHandler extends Callback {
		void callback(int arg);
	}
	
	SigHandler signal(int signum, SigHandler handler);
}
