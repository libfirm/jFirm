package example;

import firm.ClassType;
import firm.Construction;
import firm.Dump;
import firm.Entity;
import firm.Firm;
import firm.Graph;
import firm.MethodType;
import firm.Mode;
import firm.PointerType;
import firm.PrimitiveType;
import firm.Program;
import firm.Relation;
import firm.Type;
import firm.nodes.Block;
import firm.nodes.Cond;
import firm.nodes.Node;

/**
 * Simple example. Creating a firm equivalent to:
 *
 * public class A { public int calc(int x, int y) { int sum;
 *
 * if (x > y) { sum = x + y; } else { sum = x * y; }
 *
 * return sum; } }
 */
public class SimpleIf {
	public static void main(String[] main_args) {
		final int varNumThis = 0;
		final int varNumX = 1;
		final int varNumY = 2;
		final int varNumSum = 3;
		final int numLocalVars = 3 + 1; /* 3 parameters + 1 local variable */

		// Initialize firm
		Firm.init();
		System.out.printf("Firm Version: %1s.%2s\n",
				Firm.getMajorVersion(), Firm.getMinorVersion());

		// decide which modes represent int and references
		final Mode modeInt = Mode.getIs();
		final Mode modeRef = Mode.getP();

		// Create type and unique entity for class A
		ClassType class_A = new ClassType("A");

		// Create method type for calc (first parameter is this-pointer)
		Type intType = new PrimitiveType(modeInt);
		Type reference_to_A = new PointerType(class_A);
		Type calcMethodType = new MethodType(new Type[] { reference_to_A,
				intType, intType }, new Type[] { intType });

		// Create entity for calc method
		Entity calcEnt = new Entity(class_A, "calc(II)I", calcMethodType);

		// Start actual code creation
		Graph graph = new Graph(calcEnt, numLocalVars);
		Construction cons = new Construction(graph);

		// Initialize parameter "variables"
		Node args = graph.getArgs();
		Node projThis = cons.newProj(args, modeRef, 0); /*
														 * this is parameter
														 * number 0
														 */
		cons.setVariable(varNumThis, projThis);

		Node projX = cons.newProj(args, modeInt, 1); /* x is parameter number 1 */
		cons.setVariable(varNumX, projX);

		Node projY = cons.newProj(args, modeInt, 2); /* y is parameter number 2 */
		cons.setVariable(varNumY, projY);

		// Code for Condition expression
		// Get value of x
		Node xVal = cons.getVariable(varNumX, modeInt);
		// Get value of y
		Node yVal = cons.getVariable(varNumY, modeInt);
		// Compare x,y with <
		Node cmp = cons.newCmp(xVal, yVal, Relation.Less);

		// Conditional Jump Node with the True+False Proj
		Node cond = cons.newCond(cmp);
		Node projTrue = cons.newProj(cond, Mode.getX(), Cond.pnTrue);
		Node projFalse = cons.newProj(cond, Mode.getX(), Cond.pnFalse);

		// If-Block (the true part)
		Block bTrue = cons.newBlock();
		bTrue.addPred(projTrue);
		cons.setCurrentBlock(bTrue); /* we create nodes in the new block now */

		// Code for if-part
		// Compute value of right part of the assignment
		Node xVal2 = cons.getVariable(varNumX, modeInt);
		Node yVal2 = cons.getVariable(varNumY, modeInt);
		Node add = cons.newAdd(xVal2, yVal2, modeInt);
		// Set value to local var sum
		cons.setVariable(varNumSum, add);

		// Jump out of if-block
		Node endIf = cons.newJmp();

		// Else-Block
		Block bFalse = cons.newBlock();
		bFalse.addPred(projFalse);
		cons.setCurrentBlock(bFalse);

		// Code for else-part
		Node xVal3 = cons.getVariable(varNumX, modeInt);
		Node yVal3 = cons.getVariable(varNumY, modeInt);
		Node mul = cons.newMul(xVal3, yVal3, Mode.getIs());
		// Set value to local var sum
		cons.setVariable(varNumSum, mul);

		// Jump out of else-block
		Node endElse = cons.newJmp();

		// Follow-up block connect with the jumps out of if- and else-block
		Block bAfter = cons.newBlock();
		bAfter.addPred(endIf);
		bAfter.addPred(endElse);
		cons.setCurrentBlock(bAfter);

		// Get value of sum variable
		Node sumVal = cons.getVariable(varNumSum, Mode.getIs());

		// Create Return statement
		Node curMem = cons.getCurrentMem();
		Node retn = cons.newReturn(curMem, new Node[] { sumVal });
		graph.getEndBlock().addPred(retn);

		// No code should follow a return statement.
		cons.setUnreachable();
		// Done.
		cons.finish();

		// Check and dump created graphs - can be viewed with ycomp
		for (Graph g : Program.getGraphs()) {
			g.check();
			// Should produce a file calc(II)I.vcg
			Dump.dumpGraph(g, "");
		}
	}
}
