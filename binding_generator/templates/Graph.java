{{warning}}
package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_irgraph;
import firm.nodes.Node;

/**
 * A graph is an object owning stuff related to a firm graph. That is:
 *
 * - Nodes and Blocks
 * - A type describing the stackframe layout
 * - Direct pointers to some unique nodes (StartBlock, Start, ...)
 * - Helper functions to traverse the graph
 */
public class Graph extends GraphBase {

	public Graph(Pointer pointer) {
		super(pointer);
	}

	/**
	 * create a new firm graph.
	 * You have to specify the number of parameters, you want to use during
	 * graph construction (for Construction.setVariable/Construction.getVariable)
	 * @param entity      Entity for the graph (an entity with MethodType)
	 * @param nLocalVars  number of local variables during graph construction
	 */
	public Graph(Entity entity, int nLocalVars) {
		this(binding_irgraph.new_ir_graph(entity.ptr, nLocalVars));
	}

{% for node in nodes -%}
	{% if not is_abstract(node) and node.constructor %}

	/** Create a new {{node.name}} node */
	public final Node new{{node.classname}}(
		{%- filter arguments %}
			{%if not node.block%} Node block {%endif%}
			{{node|nodeparameters}}
		{%- endfilter %}) {
		return Node.createWrapper(firm.bindings.binding_ircons.new_r_{{node.name}}(
			{%- filter arguments %}
				{{node|javablockargument}}
				{{node|javanodearguments}}
			{%- endfilter %}));
	}
	{%- endif %}
	{%- endfor %}
}
