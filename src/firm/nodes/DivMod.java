/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class DivMod extends Node {

	public DivMod(Pointer ptr) {
		super(ptr);
	}

	
	
	public Node getMem() {
		return createWrapper(binding.get_DivMod_mem(ptr));
	}

	
	public void setMem(Node mem) {
		binding.set_DivMod_mem(this.ptr, mem.ptr);
	}
	
	
	public Node getLeft() {
		return createWrapper(binding.get_DivMod_left(ptr));
	}

	
	public void setLeft(Node left) {
		binding.set_DivMod_left(this.ptr, left.ptr);
	}
	
	
	public Node getRight() {
		return createWrapper(binding.get_DivMod_right(ptr));
	}

	
	public void setRight(Node right) {
		binding.set_DivMod_right(this.ptr, right.ptr);
	}
	

	
	public firm.Mode getResmode() {
		Pointer _res = binding.get_DivMod_resmode(ptr);
		return new firm.Mode(_res);
	}

	public void setResmode(firm.Mode _val) {
		binding.set_DivMod_resmode(this.ptr, _val.ptr);
	}
	

	

	public static final int pnM = 0;
	public static final int pnXRegular = 1;
	public static final int pnXExcept = 2;
	public static final int pnResDiv = 3;
	public static final int pnResMod = 4;
	public static final int pnMax = 5;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}