package firm.nodes;

import com.sun.jna.Pointer;

public interface NodeWrapperFactory {
	public Node createWrapper(Pointer ptr);
}
