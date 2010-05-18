package firm;

import firm.bindings.Bindings;
import firm.bindings.binding_irdump;
import firm.nodes.Node;

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
	
	public static void dumpBlockGraph(Graph graph, String suffix) {
		binding.dump_ir_block_graph(graph.ptr, suffix);
	}
	
	public static void dumpExtBlockGraph(Graph graph, String suffix) {
		binding.dump_ir_extblock_graph(graph.ptr, suffix);
	}
	
	public static void dumpAllCgBlockGraph(String suffix) {
		binding.dump_all_cg_block_graph(suffix);
	}
	
	public static void dumpCfg(Graph graph, String suffix) {
		binding.dump_cfg(graph.ptr, suffix);
	}
	
	public static void dumpSubGraph(Node node, int depth, String suffix) {
		binding.dump_subgraph(node.ptr, depth, suffix);
	}
	
	public static void dumpCallGraph(String suffix) {
		binding.dump_callgraph(suffix);
	}
	
	public static void dumpTypeGraph(Graph graph, String suffix) {
		binding.dump_type_graph(graph.ptr, suffix);
	}
	
	public static void dumpAllTypes(String suffix) {
		binding.dump_all_types(suffix);
	}
	
	public static void dumpClassHierarchy(boolean withEntities, String suffix) {
		binding.dump_class_hierarchy(withEntities ? 1 : 0, suffix);
	}
	
	public static void dumpLoopTree(Graph graph, String suffix) {
		binding.dump_loop_tree(graph.ptr, suffix);
	}
	
	public static void dumpCallgraphLoopTree(String suffix) {
		binding.dump_callgraph_loop_tree(suffix);
	}
	
	public static void dumpTypesAsText(int verbosity, String suffix) {
		binding.dump_types_as_text(verbosity, suffix);
	}
	
	public static void dumpGlobalsAsText(int verbosity, String suffix) {
		binding.dump_globals_as_text(verbosity, suffix);
	}
	
	public static void setOnlyDumpMethodWithName(Ident ident) {
		binding.only_dump_method_with_name(ident.ptr);
	}
	
	public static void setTurnOffEdgeLabels() {
		binding.turn_off_edge_labels();
	}
	
	public static void setConstsLocal(boolean flag) {
		binding.dump_consts_local(flag ? 1 : 0);
	}
	
	public static void setNodeIdxLabel(boolean flag) {
		binding.dump_node_idx_label(flag ? 1 : 0);
	}
	
	public static void setConstantEntityValues(boolean flag) {
		binding.dump_constant_entity_values(flag ? 1 : 0);
	}
	
	public static void setKeepaliveEdges(boolean flag) {
		binding.dump_keepalive_edges(flag ? 1 : 0);
	}
	
	public static void setOutEdges(boolean flag) {
		binding.dump_out_edges(flag ? 1 : 0);
	}
	
	public static void setDominatorInformation(boolean flag) {
		binding.dump_dominator_information(flag ? 1 : 0);
	}
	
	public static void setLoopInformation(boolean flag) {
		binding.dump_loop_information(flag ? 1 : 0);
	}
	
	public static void setBackedgeInformation(boolean flag) {
		binding.dump_backedge_information(flag ? 1 : 0);
	}
	
	public static void setPointerValuesToInfo(boolean flag) {
		binding.dump_pointer_values_to_info(flag ? 1 : 0);
	}
	
	public static void setLdNames(boolean flag) {
		binding.dump_ld_names(flag ? 1 : 0);
	}
	
	public static void setAllAnchors(boolean flag) {
		binding.dump_all_anchors(flag ? 1 : 0);
	}
	
	public static void setMacroblockEdges(boolean flag) {
		binding.dump_macroblock_edges(flag ? 1 : 0);
	}
	
	public static void setBlockMarker(boolean flag) {
		binding.dump_block_marker_in_title(flag ? 1 : 0);
	}
	
	public static void setBlockMarkerInTitle(boolean flag) {
		binding.dump_block_marker_in_title(flag ? 1 : 0);
	}	
}
