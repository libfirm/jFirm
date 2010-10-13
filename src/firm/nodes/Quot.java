/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Quot extends Node {

	public Quot(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(firm.bindings.binding_irnode.get_Quot_mem(ptr));
	}

	
	public void setMem(Node mem) {
		firm.bindings.binding_irnode.set_Quot_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getLeft() {
		return createWrapper(firm.bindings.binding_irnode.get_Quot_left(ptr));
	}

	
	public void setLeft(Node left) {
		firm.bindings.binding_irnode.set_Quot_left(this.ptr, left.ptr);
	}
	
	
	public Node getRight() {
		return createWrapper(firm.bindings.binding_irnode.get_Quot_right(ptr));
	}

	
	public void setRight(Node right) {
		firm.bindings.binding_irnode.set_Quot_right(this.ptr, right.ptr);
	}
	

	
	public firm.Mode getResmode() {
		Pointer _res = firm.bindings.binding_irnode.get_Quot_resmode(ptr);
		return new firm.Mode(_res);
	}

	public void setResmode(firm.Mode _val) {
		firm.bindings.binding_irnode.set_Quot_resmode(this.ptr, _val.ptr);
	}
	

	

	
	/** memory result */
	public static final int pnM = 0;
	
	/** control flow when no exception occurs */
	public static final int pnXRegular = 1;
	
	/** control flow when exception occured */
	public static final int pnXExcept = 2;
	
	/** result of computation */
	public static final int pnRes = 3;
	public static final int pnMax = 4;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}