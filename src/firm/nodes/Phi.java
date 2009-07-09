/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Phi extends Node {

	public Phi(Pointer ptr) {
		super(ptr);
	}

	

	

	

	public static final int pnMax = 0;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}