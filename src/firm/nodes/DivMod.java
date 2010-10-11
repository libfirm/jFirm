/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class DivMod extends Node {

	public DivMod(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding_irnode.get_DivMod_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding_irnode.set_DivMod_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getLeft() {
		return createWrapper(binding_irnode.get_DivMod_left(ptr));
	}

	
	public void setLeft(Node left) {
		binding_irnode.set_DivMod_left(this.ptr, left.ptr);
	}
	
	
	public Node getRight() {
		return createWrapper(binding_irnode.get_DivMod_right(ptr));
	}

	
	public void setRight(Node right) {
		binding_irnode.set_DivMod_right(this.ptr, right.ptr);
	}
	

	
	public firm.Mode getResmode() {
		Pointer _res = binding_irnode.get_DivMod_resmode(ptr);
		return new firm.Mode(_res);
	}

	public void setResmode(firm.Mode _val) {
		binding_irnode.set_DivMod_resmode(this.ptr, _val.ptr);
	}
	

	

	
	/** memory result */
	public static final int pnM = 0;
	
	/** control flow when no exception occurs */
	public static final int pnXRegular = 1;
	
	/** control flow when exception occured */
	public static final int pnXExcept = 2;
	
	/** result of computation a/b */
	public static final int pnResDiv = 3;
	
	/** result of computation a%b */
	public static final int pnResMod = 4;
	public static final int pnMax = 5;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}