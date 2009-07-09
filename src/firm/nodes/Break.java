/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Break extends Node {

	public Break(Pointer ptr) {
		super(ptr);
	}

	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}