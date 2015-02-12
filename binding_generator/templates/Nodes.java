{{warning}}
package {{java_package}};

public class Nodes {
	public static void init() {
		{%- for node in nodes -%}
		{% if not is_abstract(node) %}
		{{node.classname}}.init();
		{%- endif -%}
		{% endfor %}
	}
}
