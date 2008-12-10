package firm;

import com.sun.jna.Native;

import firm.bindings.binding_irdump;

public final class Dump {
	private static final binding_irdump binding = (binding_irdump) Native.loadLibrary("firm", binding_irdump.class);
	
	private Dump() {
	}

	public void dumpGraph(Graph graph, String suffix) {
		binding.dump_ir_graph(graph.ptr, suffix);
	}
	
	public void dumpBlockGraph(Graph graph, String suffix) {
		binding.dump_ir_block_graph(graph.ptr, suffix);
	}
	
	public void dumpExtBlockGraph(Graph graph, String suffix) {
		binding.dump_ir_extblock_graph(graph.ptr, suffix);
	}
	
	public void dumpAllCgBlockGraph(String suffix) {
		binding.dump_all_cg_block_graph(suffix);
	}
	
	public void dumpCfg(Graph graph, String suffix) {
		binding.dump_cfg(graph.ptr, suffix);
	}
	
	public void dumpSubGraph(Node node, int depth, String suffix) {
		binding.dump_subgraph(node.ptr, depth, suffix);
	}
	
	public void dumpCallGraph(String suffix) {
		binding.dump_callgraph(suffix);
	}
	
	public void dumpTypeGraph(Graph graph, String suffix) {
		binding.dump_type_graph(graph.ptr, suffix);
	}
	
	public void dumpAllTypes(String suffix) {
		binding.dump_all_types(suffix);
	}
	
	public void dumpClassHierarchy(boolean withEntities, String suffix) {
		binding.dump_class_hierarchy(withEntities ? 1 : 0, suffix);
	}
	
	public void dumpLoopTree(Graph graph, String suffix) {
		binding.dump_loop_tree(graph.ptr, suffix);
	}
	
	public void dumpCallgraphLoopTree(String suffix) {
		binding.dump_callgraph_loop_tree(suffix);
	}
	
	public void dumpTypesAsText(int verbosity, String suffix) {
		binding.dump_types_as_text(verbosity, suffix);
	}
	
	public void dumpGlobalsAsText(int verbosity, String suffix) {
		binding.dump_globals_as_text(verbosity, suffix);
	}
	
	public void setOnlyDumpMethodWithName(Ident ident) {
		binding.only_dump_method_with_name(ident.ptr);
	}
	
	public void setTurnOffEdgeLabels() {
		binding.turn_off_edge_labels();
	}
	
	public void setConstsLocal(boolean flag) {
		binding.dump_consts_local(flag ? 1 : 0);
	}
	
	public void setNodeIdxLabel(boolean flag) {
		binding.dump_node_idx_label(flag ? 1 : 0);
	}
	
	public void setConstantEntityValues(boolean flag) {
		binding.dump_constant_entity_values(flag ? 1 : 0);
	}
	
	public void setKeepaliveEdges(boolean flag) {
		binding.dump_keepalive_edges(flag ? 1 : 0);
	}
	
	public void setOutEdges(boolean flag) {
		binding.dump_out_edges(flag ? 1 : 0);
	}
	
	public void setDominatorInformation(boolean flag) {
		binding.dump_dominator_information(flag ? 1 : 0);
	}
	
	public void setLoopInformation(boolean flag) {
		binding.dump_loop_information(flag ? 1 : 0);
	}
	
	public void setBackedgeInformation(boolean flag) {
		binding.dump_backedge_information(flag ? 1 : 0);
	}
	
	public void setPointerValuesToInfo(boolean flag) {
		binding.dump_pointer_values_to_info(flag ? 1 : 0);
	}
	
	public void setLdNames(boolean flag) {
		binding.dump_ld_names(flag ? 1 : 0);
	}
	
	public void setAllAnchors(boolean flag) {
		binding.dump_all_anchors(flag ? 1 : 0);
	}
	
	public void setMacroblockEdges(boolean flag) {
		binding.dump_macroblock_edges(flag ? 1 : 0);
	}
	
	public void setBlockMarker(boolean flag) {
		binding.dump_block_marker_in_title(flag ? 1 : 0);
	}
	
	public void setBlockMarkerInTitle(boolean flag) {
		binding.dump_block_marker_in_title(flag ? 1 : 0);
	}	
}
