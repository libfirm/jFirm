package example;

import java.io.IOException;

import firm.Backend;
import firm.Dump;
import firm.Firm;
import firm.Graph;
import firm.Program;

/* Test libFirm bindings */
public class Main {
	
	public static final boolean IS_ON_MAC_OSX =
		"Mac OS X".equals(System.getProperty("os.name"));
	
	public static void main(String[] args) throws IOException {
		Firm.init();
		System.out.printf("Initialized Firm Version: %1s.%2s\n",
		                  Firm.getMinorVersion(), Firm.getMajorVersion());

		/* what is our input file? */
		String input = "bf_examples/rot13.bf";
		if (args.length > 0) {
			input = args[0]; 
		}
		
		/* transform brainfuck program to firm graphs */
		BrainFuck fuck = new BrainFuck();
		fuck.compile(input);
		
		/* dump all firm graphs to disk */
		for(Graph g : Program.getGraphs()) {
			Dump.dumpBlockGraph(g, "-finished");
		}
		
		/* omit frame pointer for speed :) */
		Backend.option("omitfp");
		
		/* mac os/x */
		if (IS_ON_MAC_OSX) {
			Backend.option("ia32-gasmode=macho");
			Backend.option("ia32-stackalign=4");
			Backend.option("pic");
		} else {
			/* linux */
			Backend.option("ia32-gasmode=elf");
		}
		
		/* transform to x86 assembler */
		Backend.createAssembler("test.s", "<builtin>");
		/* assembler */
		Runtime.getRuntime().exec("gcc test.s -o a.out");
	}
}
