/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public class Start extends Node {

	public Start(Pointer ptr) {
		super(ptr);
	}

	

	

	

	public static final int pnXInitialExec = 0;
	public static final int pnM = 1;
	public static final int pnPFrameBase = 2;
	public static final int pnPTls = 3;
	public static final int pnTArgs = 4;
	public static final int pnMax = 5;

	
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	
}