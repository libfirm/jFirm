{{warning}}
package firm;

import com.sun.jna.Pointer;

import firm.nodes.Node;
import firm.bindings.binding_ircons;

class ConstructionBase {

	protected final Graph graph;

	protected ConstructionBase(Graph graph) {
		this.graph = graph;
	}

	{%- for node in nodes -%}
	{%- if not is_abstract(node) and node.constructor %}

	public Node new{{node.classname}}({{node.arguments|argdecls}}) {
		Pointer result_ptr = firm.bindings.binding_ircons.new_r_{{node.name}}(
			{%- filter parameters %}
			{{node|block_construction}}
			{{node.arguments|bindingargs}}
			{%- endfilter %});
		return Node.createWrapper(result_ptr);
	}
	{%- endif %}
	{%- endfor %}
}
