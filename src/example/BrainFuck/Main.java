package example.BrainFuck;

import java.io.IOException;

import firm.Backend;
import firm.Firm;

/* Test libFirm bindings */
public class Main {
	
	public static void main(String[] args) throws IOException {
		Firm.init();
		Firm.finish();
		Firm.init();
		System.out.printf("Initialized Firm Version: %1s.%2s\n",
		                  Firm.getMinorVersion(), Firm.getMajorVersion());

		/* what is our input file? */
		String input = "bf_examples/bockbeer.bf";
		if (args.length > 0) {
			input = args[0]; 
		}
		
		/* transform brainfuck program to firm graphs */
		BrainFuck fuck = new BrainFuck();
		fuck.compile(input);
		
		/* dump all firm graphs to disk */
		/*for(Graph g : Program.getGraphs()) {
			Dump.dumpBlockGraph(g, "-finished");
		}
		*/
		
		/* transform to x86 assembler */
		Backend.createAssembler("test.s", "<builtin>");
		/* assembler */
		Runtime.getRuntime().exec("gcc test.s -o a.out");
		
		Firm.finish();
		Firm.init();
		Firm.finish();
	}
}
