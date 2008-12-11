package firm;

/* Test libFirm bindings */
public class Main {
	public static void main(String[] args) {
		Firm.init();
		System.out.printf("Version: %1s.%2s\n", Firm.getMinorVersion(), Firm.getMajorVersion());

		Ident ident = new Ident("main");
		System.out.println("Ident: " + ident);
		
		Mode iu = Mode.getIu();
		System.out.println("IuName: " + iu + " Bits: " + iu.getSizeBits());
		
		/* minimum steps needed to create and dump a graph */
		MethodType type = new MethodType(new Ident("V()"), 0, 0);
		Type global = Program.getGlobalType();
		Entity mainEnt = new Entity(global, ident, type);
		Graph graph = new Graph(mainEnt, 0);
		Dump.dumpBlockGraph(graph, "-XXX");
	}
}
