/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Div extends Node {

	public Div(Pointer ptr) {
		super(ptr);
	}

	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Div_mem(ptr));
	}

	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Div_mem(this.ptr, mem.ptr);
	}

	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_Div_left(ptr));
	}

	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_Div_left(this.ptr, left.ptr);
	}

	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_Div_right(ptr));
	}

	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_Div_right(this.ptr, right.ptr);
	}

	public firm.Mode getResmode() {
		Pointer _res = firm.bindings.binding_irnode.get_Div_resmode(ptr);
		return new firm.Mode(_res);
	}

	public void setResmode(firm.Mode _val) {
		firm.bindings.binding_irnode.set_Div_resmode(this.ptr, _val.ptr);
	}

	public int getNoRemainder() {
		int _res = firm.bindings.binding_irnode.get_Div_no_remainder(ptr);
		return _res;
	}

	public void setNoRemainder(int _val) {
		firm.bindings.binding_irnode.set_Div_no_remainder(this.ptr, _val);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	/** memory result */
	public static final int pnM = 0;

	/** result of computation */
	public static final int pnRes = 1;

	/** control flow when no exception occurs */
	public static final int pnXRegular = 2;

	/** control flow when exception occured */
	public static final int pnXExcept = 3;

	public static final int pnMax = 4;
}
