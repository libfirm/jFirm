{{warning}}
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_irnode;

class NodeWrapperConstruction {

	public static Node createWrapper(Pointer ptr) {
		final binding_irnode.ir_opcode opcode = binding_irnode.ir_opcode
				.getEnum(binding_irnode.get_irn_opcode(ptr));

		switch (opcode) {
		{% for node in nodes -%}
		{% if not isAbstract(node) -%}
		case iro_{{node.name}}:
			return new {{node.classname}}(ptr);

		{% endif -%}
		{% endfor -%}
		default:
			throw new IllegalStateException("Unkown node type: " + opcode);
		}
	}
}
