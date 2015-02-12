{%- for node in nodes -%}{% if node.classname==NODENAME -%}
{{warning}}
package {{java_package}};

import com.sun.jna.Pointer;
{%- if spec.external %}
import firm.bindings.binding_ircons;
import firm.nodes.Node;
import firm.nodes.NodeVisitor;
import firm.nodes.NodeWrapperFactory;
import firm.Construction;
{%- endif %}

public {% if is_abstract(node) %}abstract {%endif-%} class {{node.classname}} extends {{node.parent.classname}} {

	{%- if not is_abstract(node) %}
	static class Factory implements NodeWrapperFactory {
		@Override
		public Node createWrapper(Pointer ptr) {
			return new {{node.classname}}(ptr);
		}
	}

	static void init() {
		Pointer op = {{java_binding}}.get_op_{{node.name}}();
		Node.registerFactory(firm.bindings.binding_irop.get_op_code(op), new Factory());
	}

	{%- if spec.external %}
	public static Node create(
		{%- filter parameters %}
			{% if not node.block%} Node block {% endif %}
			{{node|nodeparameters}}
		{%- endfilter %}) {
		return Node.createWrapper({{java_binding}}.new_r_{{node.name}}(
			{%- filter arguments %}
				{{node|javablockargument}}
				{{node|javanodearguments}}
			{%- endfilter %}));
	}

	public static Node create(Construction cons, {{node.arguments|argdecls}}) {
		return Node.createWrapper({{java_binding}}.new_r_{{node.name}}(
			{%- filter parameters %}
				{{node|extern_block_construction}}
				{{node.arguments|bindingargs}}
			{%- endfilter %}));
	}
	{%- endif %}

	{%- endif %}

	public {{node.classname}}(Pointer ptr) {
		super(ptr);
	}

	{% for input in node.ins -%}
	{%if node.parent.classname != "Node"%}@Override
	{%endif-%}
	public Node get{{input.name|CamelCase}}() {
		return createWrapper({{java_binding}}.get_{{node.name}}_{{input.name}}(ptr));
	}

	{%if node.parent.classname != "Node"%}@Override
	{%endif-%}
	public void set{{input.name|CamelCase}}(Node {{input.name|filterkeywords}}) {
		{{java_binding}}.set_{{node.name}}_{{input.name}}(this.ptr, {{input.name|filterkeywords}}.ptr);
	}

	{% endfor -%}

	{%- if not is_abstract(node) %}
	{%- for attr in node.attrs -%}
	public {{attr.java_type}} get{{attr.java_name|CamelCase}}() {
		{{attr.wrap_type}} _res = {{java_binding}}.get_{{node.name}}_{{attr.name}}(ptr);
		return {{attr.from_wrapper % "_res"}};
	}

	public void set{{attr.java_name|CamelCase}}({{attr.java_type}} _val) {
		{{java_binding}}.set_{{node.name}}_{{attr.name}}(this.ptr, {{attr.to_wrapper % "_val"}});
	}

	{% endfor -%}
	{% endif -%}

	{{- node.java_add -}}
	{%- if not is_abstract(node) -%}
	@Override
	public void accept(NodeVisitor visitor) {
		{%- if not spec.external %}
		visitor.visit(this);
		{%- else %}
		visitor.visitUnknown(this);
		{%- endif %}
	}

	{% endif -%}

	{%- for out in node.outs -%}
	{%- if out.comment != "" -%}
	/** {{out.comment}} */
	{% endif -%}
	public static final int pn{{out.name|CamelCase}} = {{loop.index0}};

	{% endfor -%}
	public static final int pnMax = {{len(node.outs)}};
}
{%endif%}{%-endfor-%}
