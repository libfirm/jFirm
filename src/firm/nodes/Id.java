/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.bindings.binding_irop;

public class Id extends Node {
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new Id(ptr);
		}
	}

	static void init() {
		Pointer op = firm.bindings.binding_irnode.get_op_Id();
		Node.registerFactory(binding_irop.get_op_code(op), new Factory());
	}

	public Id(Pointer ptr) {
		super(ptr);
	}

	public Node getPred() {
		return createWrapper(firm.bindings.binding_irnode.get_Id_pred(ptr));
	}

	public void setPred(Node pred) {
		firm.bindings.binding_irnode.set_Id_pred(this.ptr, pred.ptr);
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	public static final int pnMax = 0;
}
