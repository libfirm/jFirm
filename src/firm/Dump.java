package firm;

import firm.bindings.Bindings;
import firm.bindings.binding_irdump;

/**
 * Utility class containing various functions for dumping firm graphs
 * @author matze
 */
public final class Dump {
	private static final binding_irdump binding = Bindings.getIrDumpBinding();
	
	private Dump() {
	}

	public static void dumpGraph(Graph graph, String suffix) {
		binding.dump_ir_graph(graph.ptr, suffix);
	}
	
	/** TODO: bring back dumpers from new dumping API */
	
	public static void addDumpFlags(int flags) {
		binding.ir_add_dump_flags(flags);
	}
	
	public static void removeDumpFlags(int flags) {
		binding.ir_remove_dump_flags(flags);
	}
	
	public static int getDumpFlags() {
		return binding.ir_get_dump_flags();
	}
	
	public static void setDumpFlags(int flags) {
		binding.ir_set_dump_flags(flags);
	}
	
	public static void setDumpFilter(String filter) {
		binding.ir_set_dump_filter(filter);
	}
	
	public static String getDumpFilter() {
		return binding.ir_get_dump_filter();
	}
}
