package firm;

import com.sun.jna.Native;

import firm.bindings.binding_irgmod;
import firm.bindings.binding_irvrfy;
import firm.nodes.Node;

/**
 * Class containing various static utility functions
 */
public class Util {
	protected static binding_irvrfy binding_vrfy = (binding_irvrfy) Native.loadLibrary("firm", binding_irvrfy.class);
	protected static binding_irgmod binding_mod = (binding_irgmod) Native.loadLibrary("firm", binding_irgmod.class);
	
	private Util() {
	}
	
	/**
	 * Checks if a graph is well formed
	 * @param graph   the graph to check
	 */
	public static void check(Graph graph) {
		binding_vrfy.irg_verify(graph.ptr, binding_irvrfy.irg_verify_flags_t.VRFY_ENFORCE_SSA.val);
	}
	
	/** 
	 * Exchanges two nodes by conserving edges leaving old (i.e.,
	 * pointers pointing to old).  Turns the old node into an Id. 
	 */
	public static void exchange(Node oldNode, Node newNode) {
		binding_mod.exchange(oldNode.ptr, newNode.ptr);
	}
	
	/** Turns a node into a "useless" Tuple.
	 *
	 *  Turns a node into a "useless" Tuple.  The Tuple node just forms a tuple
	 *  from several inputs.  The predecessors of the tuple have to be
	 *  set by hand.  The block predecessor automatically remains the same.
	 *  This is useful if a node returning a tuple is removed, but the Projs
	 *  extracting values from the tuple are not available.
	 *
	 *  @param node The node to be turned into a tuple.
	 *  @param outArity The number of values formed into a Tuple.
	 */
	public static void turnIntoTuple(Node node, int outArity) {
		binding_mod.turn_into_tuple(node.ptr, outArity);
	}
	
	/**
	 * Kill a node by setting its predecessors to Bad and finally
	 * exchange the node by Bad itself.
	 */
	public static void killNode(Node node) {
		binding_mod.kill_node(node.ptr);
	}
}
