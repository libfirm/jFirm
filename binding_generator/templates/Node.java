{{warning}}
package firm.nodes;

import com.sun.jna.Pointer;

public {% if isAbstract(node) %}abstract {%endif-%} class {{node.classname}} extends {{node.parent.classname}} {

	public {{node.classname}}(Pointer ptr) {
		super(ptr);
	}

	{% for input in node.ins -%}
	{%if node.parent.classname != "Node"%}@Override
	{%endif-%}
	public Node get{{input[0]|CamelCase}}() {
		return createWrapper(firm.bindings.binding_irnode.get_{{node.name}}_{{input[0]}}(ptr));
	}

	{%if node.parent.classname != "Node"%}@Override
	{%endif-%}
	public void set{{input[0]|CamelCase}}(Node {{input[0]|filterkeywords}}) {
		firm.bindings.binding_irnode.set_{{node.name}}_{{input[0]}}(this.ptr, {{input[0]|filterkeywords}}.ptr);
	}

	{% endfor -%}

	{%- for attr in node.attrs -%}
	public {{attr.java_type}} get{{attr.java_name|CamelCase}}() {
		{{attr.wrap_type}} _res = firm.bindings.binding_irnode.get_{{node.name}}_{{attr.name}}(ptr);
		return {{attr.from_wrapper % "_res"}};
	}

	public void set{{attr.java_name|CamelCase}}({{attr.java_type}} _val) {
		firm.bindings.binding_irnode.set_{{node.name}}_{{attr.name}}(this.ptr, {{attr.to_wrapper % "_val"}});
	}

	{% endfor -%}

	{{- node.java_add -}}
	{%- if not isAbstract(node) and not spec.external -%}
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

	{% endif -%}

	{%- for out in node.outs -%}
	{%- if out[1] != "" -%}
	/** {{out[1]}} */
	{% endif -%}
	public static final int pn{{out[0]|CamelCase}} = {{loop.index0}};

	{% endfor -%}
	public static final int pnMax = {{len(node.outs)}};
}
