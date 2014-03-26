package example.BrainFuck;

import java.io.IOException;

import firm.Backend;
import firm.Firm;

/* Test libFirm bindings */
public class Main {

	public static void main(String[] args) throws IOException {
		Firm.init();
		System.out.printf("Initialized Firm Version: %1s.%2s\n",
				Firm.getMajorVersion(), Firm.getMinorVersion());

		/* what is our input file? */
		String input = "bf_examples/bockbeer.bf";
		if (args.length > 0) {
			input = args[0];
		}

		/* transform brainfuck program to firm graphs */
		BrainFuck fuck = new BrainFuck();
		fuck.compile(input);

		/* dump all firm graphs to disk */
		/*
		 * for(Graph g : Program.getGraphs()) { Dump.dumpBlockGraph(g,
		 * "-finished"); }
		 */

		/* transform to x86 assembler */
		Backend.createAssembler("test.s", "<builtin>");
		/* assembler */
		Process p = Runtime.getRuntime().exec("gcc -m32 test.s -o a.out");
		int res = -1;
		try {
			res = p.waitFor();
		} catch (Throwable t) {
		}
		if (res != 0)
			System.err.println("Warning: Linking step failed");

		Firm.finish();
	}
}
