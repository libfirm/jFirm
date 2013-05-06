package firm.nodes;

import com.sun.jna.Pointer;

public class UnknownNode extends Node {

	protected UnknownNode(Pointer ptr) {
		super(ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visitUnknown(this);
	}
}
