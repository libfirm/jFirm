{{warning}}
package {{java_package}};

/**
 * Visitor interface for firm nodes
 */
public interface NodeVisitor {

	{%- for node in nodes -%}
	{% if not is_abstract(node) %}

	/** called when accept is called on a {{node.classname}} node */
	void visit({{node.classname}} node);
	{%- endif %}
	{%- endfor %}

	void visitUnknown(Node node);

	/**
	 * Default Visitor: A class which implements every visit function of the
	 * NodeVisitor interface with a call to the defaultVisit function. Usefull
	 * as base for own visitors which need to treat all nodes equally or only
	 * need to override some visit functions.
	 */
	public static abstract class Default implements NodeVisitor {

		public void defaultVisit(Node n) {
		}

		{%- for node in nodes -%}
		{% if not is_abstract(node) %}

		@Override
		public void visit({{node.classname}} node) {
			defaultVisit(node);
		}
		{%- endif -%}
		{%- endfor %}

		@Override
		public void visitUnknown(Node node) {
			defaultVisit(node);
		}
	}
}
