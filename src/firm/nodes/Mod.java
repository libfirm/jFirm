/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Mod extends Node {

	public Mod(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_Mod_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_Mod_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getLeft() {
		return createWrapper(binding.get_Mod_left(ptr));
	}

	
	public void setLeft(Node left) {
		binding.set_Mod_left(this.ptr, left.ptr);
	}
	
	
	public Node getRight() {
		return createWrapper(binding.get_Mod_right(ptr));
	}

	
	public void setRight(Node right) {
		binding.set_Mod_right(this.ptr, right.ptr);
	}
	

	
	public firm.Mode getResmode() {
		Pointer _res = binding.get_Mod_resmode(ptr);
		return new firm.Mode(_res);
	}

	public void setResmode(firm.Mode _val) {
		binding.set_Mod_resmode(this.ptr, _val.ptr);
	}
	

	

	public static final int pnM = 0;
	public static final int pnXRegular = 1;
	public static final int pnXExcept = 2;
	public static final int pnRes = 3;
	public static final int pnMax = 4;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}