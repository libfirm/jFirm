/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
/* There are "unused" warnings in some classes,
	but suppressing these, emits warnings, because
	of useless suppress in others. Just ignore this! */

public class Mod extends Node {

	public Mod(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding_irnode.get_Mod_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding_irnode.set_Mod_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getLeft() {
		return createWrapper(binding_irnode.get_Mod_left(ptr));
	}

	
	public void setLeft(Node left) {
		binding_irnode.set_Mod_left(this.ptr, left.ptr);
	}
	
	
	public Node getRight() {
		return createWrapper(binding_irnode.get_Mod_right(ptr));
	}

	
	public void setRight(Node right) {
		binding_irnode.set_Mod_right(this.ptr, right.ptr);
	}
	

	
	public firm.Mode getResmode() {
		Pointer _res = binding_irnode.get_Mod_resmode(ptr);
		return new firm.Mode(_res);
	}

	public void setResmode(firm.Mode _val) {
		binding_irnode.set_Mod_resmode(this.ptr, _val.ptr);
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