/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Cmp extends Binop {

	public Cmp(Pointer ptr) {
		super(ptr);
	}

	
	@Override
	public Node getLeft() {
		return createWrapper(binding.get_Cmp_left(ptr));
	}

	@Override
	public void setLeft(Node left) {
		binding.set_Cmp_left(this.ptr, left.ptr);
	}
	
	@Override
	public Node getRight() {
		return createWrapper(binding.get_Cmp_right(ptr));
	}

	@Override
	public void setRight(Node right) {
		binding.set_Cmp_right(this.ptr, right.ptr);
	}
	

	

	

	
	/** always false */
	public static final int pnFalse = 0;
	
	/** equal */
	public static final int pnEq = 1;
	
	/** less */
	public static final int pnLt = 2;
	
	/** less or equal */
	public static final int pnLe = 3;
	
	/** greater */
	public static final int pnGt = 4;
	
	/** greater or equal */
	public static final int pnGe = 5;
	
	/** less or greater */
	public static final int pnLg = 6;
	
	/** less, equal or greater ('not equal' for integer numbers) */
	public static final int pnLeg = 7;
	
	/** unordered */
	public static final int pnUo = 8;
	
	/** unordered or equal */
	public static final int pnUe = 9;
	
	/** unordered or less */
	public static final int pnUl = 10;
	
	/** unordered, less or equal */
	public static final int pnUle = 11;
	
	/** unordered or greater */
	public static final int pnUg = 12;
	
	/** onordered, greater or equal */
	public static final int pnUge = 13;
	
	/** unordered, less, greater or equal ('not equal' for floatingpoint numbers) */
	public static final int pnNe = 14;
	
	/** always true */
	public static final int pnTrue = 15;
	public static final int pnMax = 16;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}