#!/usr/bin/python
from jinja2 import Environment, Template
import re

from spec_util import verify_node, is_dynamic_pinned, setdefault, isAbstract, setldefault
import ir_spec

java_keywords = [ "public", "private", "protected", "true", "false" ]

nodes = []
for node in ir_spec.nodes:
	# Filter out some special nodes we don't really need/want here
	if node.name in ["ASM", "CallBegin", "Borrow", "Carry", "EndExcept",
	                 "EndReg", "Op" ]:
		continue

	# Some nodes need special constructors for now...
	if node.name in ["SymConst", "End", "Start", "Dummy", "Anchor"]:
		node.noconstr = True
	nodes.append(node)

def format_filter_keywords(arg):
	if arg in java_keywords:
		return "_" + arg
	return arg

def format_argdecls(arglist):
	argstrings = map(lambda arg : (arg["type"] + " " + format_filter_keywords(arg["name"])), arglist)
	return ", ".join(argstrings)

def format_parameterlist(parameterlist):
	return "\n".join(parameterlist)

def format_nodearguments(node):
	def format_argument(arg):
		if arg['type'] == "Node[]":
			return arg["name"] + ".length, Node.getPointerListFromNodeList(" + arg["name"] + ")"
		elif "to_wrapper" in arg:
			return arg["to_wrapper"] % arg['name']
		else:
			return "%s.ptr" % arg['name']
	arguments = map(format_argument, node.arguments)
	return format_parameterlist(arguments)


def format_nodeparameters(node):
	parameters = map(lambda arg: arg["type"] + " " + arg["name"], node.arguments)
	return format_parameterlist(parameters)

def format_args(arglist):
	argstrings = map(lambda arg : arg["name"], arglist)
	return ", ".join(argstrings)

def format_blockparameter(node):
	if not hasattr(node, "knownBlock"):
		return "Node block"
	return ""

def format_blockargument(node):
	if hasattr(node, "knownBlock"):
		if hasattr(node, "knownGraph"):
			return ""
		return "this.ptr"
	else:
		return "block.ptr"

def format_arguments(string, voidwhenempty = False):
	args = re.split('\s*\n\s*', string)
	if args[0] == '':
		args = args[1:]
	if len(args) > 0 and args[-1] == '':
		args = args[:-1]
	if len(args) == 0 and voidwhenempty:
		return "void"
	return ", ".join(args)

def format_parameters(string):
	return format_arguments(string)

def format_binding_args(arglist, need_graph = False):
	first = True
	res   = ""
	if need_graph:
		res = "this.ptr"
		first = False

	for arg in arglist:
		if not first:
			res += ", "
		first = False
		if arg["type"] == "Node[]":
			res += arg["name"] + ".length, Node.getPointerListFromNodeList(" + arg["name"] + ")"
			continue
		name = format_filter_keywords(arg["name"])
		if "to_wrapper" in arg:
			res += arg["to_wrapper"] % name
		else:
			res += name + ".ptr"

	return res

def format_camel_case_helper(string, firstbig):
	result  = ""
	nextbig = firstbig
	for p in range(0,len(string)):
		c = string[p]
		if nextbig:
			c = c.upper()
		if c == '_':
			nextbig = True
			continue
		result += c
		nextbig = False
	
	if result == "":
		return string
	return result

def format_camel_case(string):
	return format_camel_case_helper(string, False)

def format_camel_case_big(string):
	return format_camel_case_helper(string, True)

def format_ifset(string, node, key):
	if hasattr(node, key):
		return string
	return ""

def format_if(string, cond):
	if cond:
		return string
	return ""

def format_ifabstract(string, node):
	if isAbstract(node):
		return string
	return ""

def format_key(node, key, default=""):
	if hasattr(node, key):
		return getattr(node, key)
	return default

env = Environment()
env.filters['argdecls']    = format_argdecls
env.filters['args']        = format_args
env.filters['bindingargs'] = format_binding_args
env.filters['camelCase']   = format_camel_case
env.filters['CamelCase']   = format_camel_case_big
env.filters['ifset']       = format_ifset
env.filters['if']          = format_if
env.filters['ifabstract']  = format_ifabstract
env.filters['key']         = format_key
env.filters['filterkeywords'] = format_filter_keywords

env.filters['arguments']      = format_arguments
env.filters['parameters']     = format_parameters
env.filters['nodeparameters'] = format_nodeparameters
env.filters['nodearguments']  = format_nodearguments
env.filters['blockparameter'] = format_blockparameter
env.filters['blockargument']  = format_blockargument

def get_java_type(type):
	if type == "ir_type*":
		java_type    = "firm.Type"
		wrap_type    = "Pointer"
		to_wrapper   = "%s.ptr"
		from_wrapper = "firm.Type.createWrapper(%s)"
	elif type == "ir_mode*":
		java_type    = "firm.Mode"
		wrap_type    = "Pointer"
		to_wrapper   = "%s.ptr"
		from_wrapper = "new firm.Mode(%s)"
	elif type == "tarval*":
		java_type    = "firm.TargetValue"
		wrap_type    = "Pointer"
		to_wrapper   = "%s.ptr"
		from_wrapper = "new firm.TargetValue(%s)"
	elif type == "ir_node*":
		java_type    = "firm.Node"
		wrap_type    = "Pointer"
		to_wrapper   = "%s.ptr"
		from_wrapper = "firm.Node.createWrapper(%s)"
	elif type == "ident*":
		java_type    = "firm.Ident"
		wrap_type    = "Pointer"
		to_wrapper   = "%s.ptr"
		from_wrapper = "new firm.Ident(%s)"
	elif type == "pn_Cmp":
		java_type    = "int"
		wrap_type    = "int"
		to_wrapper   = "%s"
		from_wrapper = "%s"
	elif type == "int":
		java_type    = "int"
		wrap_type    = "int"
		to_wrapper   = "%s"
		from_wrapper = "%s"
	elif type == "unsigned":
		java_type    = "int"
		wrap_type    = "int"
		to_wrapper   = "%s"
		from_wrapper = "%s"
	elif type == "long":
		java_type    = "int"
		wrap_type    = "com.sun.jna.NativeLong"
		to_wrapper   = "new com.sun.jna.NativeLong(%s)"
		from_wrapper = "%s.intValue()"
	elif type == "cons_flags":
		java_type    = "firm.bindings.binding_ircons.ir_cons_flags"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_ircons.ir_cons_flags.getEnum(%s)"
	elif type == "ir_where_alloc":
		java_type    = "firm.bindings.binding_ircons.ir_where_alloc"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_ircons.ir_where_alloc.getEnum(%s)"
	elif type == "ir_entity*":
		java_type    = "firm.Entity"
		wrap_type    = "Pointer"
		to_wrapper   = "%s.ptr"
		from_wrapper = "new firm.Entity(%s)"
	elif type == "op_pin_state":
		java_type    = "firm.bindings.binding_ircons.op_pin_state"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_ircons.op_pin_state.getEnum(%s)"
	elif type == "ir_builtin_kind":
		java_type    = "firm.bindings.binding_ircons.ir_builtin_kind"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_ircons.ir_builtin_kind.getEnum(%s)"
	elif type == "ir_cons_flags":
		java_type    = "firm.bindings.binding_ircons.ir_cons_flags"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_ircons.ir_cons_flags.getEnum(%s)"
	elif type == "ir_volatility":
		java_type    = "firm.bindings.binding_irnode.ir_volatility"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_irnode.ir_volatility.getEnum(%s)"
	elif type == "ir_align":
		java_type    = "firm.bindings.binding_irnode.ir_align"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_irnode.ir_align.getEnum(%s)"
	elif type == "cond_kind":
		java_type    = "int"
		wrap_type    = "int"
		to_wrapper   = "%s"
		from_wrapper = "%s"
	elif type == "cond_jmp_predicate":
		java_type    = "firm.bindings.binding_irnode.cond_jmp_predicate"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_irnode.cond_jmp_predicate.getEnum(%s)"
	elif type == "ident**" or type == "ir_asm_constraint*":
		# cheat...
		java_type    = "Pointer"
		wrap_type    = "Pointer"
		to_wrapper   = "%s"
		from_wrapper = "%s"
	else:
		print "UNKNOWN TYPE %s" % type
		java_type    = "BAD"
		wrap_type    = "BAD"
		to_wrapper   = "BAD"
		from_wrapper = "BAD"
	return (java_type,wrap_type,to_wrapper,from_wrapper)

def prepare_attr(attr):
	type = attr["type"]
	(java_type,wrap_type,to_wrapper,from_wrapper) = get_java_type(type)
	attr["java_type"] = java_type
	attr["wrap_type"] = wrap_type
	attr["to_wrapper"] = to_wrapper
	attr["from_wrapper"] = from_wrapper
	if "java_name" not in attr:
		attr["java_name"] = attr["name"]

def preprocess_node(node):
	if not isAbstract(node):
		setdefault(node, "java_add", "")
		setldefault(node, "parent", node.__base__)
		verify_node(node)
	else:
		setldefault(node, "parent", ir_spec.Op)
		ir_spec.Op.classname = "Node"
	setldefault(node, "attrs", [])
	setldefault(node, "constructor_args", [])
	node.classname = format_camel_case_big(node.name)

	# dynamic pin node?
	if is_dynamic_pinned(node) and not hasattr(node, "pinned_init"):
		node.constructor_args.append(dict(
			name = "pin_state",
			type = "op_pin_state"
		))

	# transform outs into name, comment tuples if not in this format already
	if hasattr(node, "outs"):
		for i in range(0,len(node.outs)):
			out = node.outs[i]
			if not isinstance(out, tuple):
				out = (out, "")
			node.outs[i] = out

	# construct node arguments
	if not isAbstract(node):
		arguments = [ ]
		for input in node.ins:
			arguments.append(dict(
				name = input,
				type = "Node"
			))
		if node.arity == "variable" or node.arity == "dynamic":
			arguments.append(dict(
				name = "ins",
				type = "Node[]"
			))
		if not hasattr(node, "mode"):
			arguments.append(dict(
				name = "mode",
				type = "firm.Mode"
			))
		for attr in node.attrs:
			prepare_attr(attr)
			if "init" in attr:
				continue
			
			arguments.append(dict(
				name = attr["java_name"],
				type = attr["java_type"],
				to_wrapper = attr["to_wrapper"]
			))
		for arg in node.constructor_args:
			old_type = arg["type"]
			(java_type,wrap_type,to_wrapper,from_wrapper) = get_java_type(old_type)

			arguments.append(dict(
				name = arg["name"],
				type = java_type,
				to_wrapper = to_wrapper
			))

		for arg in arguments:
			arg['name'] = format_filter_keywords(arg['name'])
			
		node.arguments = arguments

for node in nodes:
	preprocess_node(node)

for node in nodes:
	filename = "%s.java" % node.classname
	print "Create: %s" % filename
	file = open(filename, "w");
	
	template = env.from_string('''/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public {{"abstract "|ifabstract(node)}}class {{node.classname}} extends {{node.parent.classname}} {

	public {{node.classname}}(Pointer ptr) {
		super(ptr);
	}

	{% for input in node.ins %}
	{{"@Override"|if(node.parent.name != "Op")}}
	public Node get{{input|CamelCase}}() {
		return createWrapper(binding.get_{{node.name}}_{{input}}(ptr));
	}

	{{"@Override"|if(node.parent.name != "Op")}}
	public void set{{input|CamelCase}}(Node {{input|filterkeywords}}) {
		binding.set_{{node.name}}_{{input}}(this.ptr, {{input|filterkeywords}}.ptr);
	}
	{% endfor %}

	{% for attr in node.attrs %}
	public {{attr.java_type}} get{{attr.java_name|CamelCase}}() {
		{{attr.wrap_type}} _res = binding.get_{{node.name}}_{{attr.name}}(ptr);
		return {{attr.from_wrapper % "_res"}};
	}

	public void set{{attr.java_name|CamelCase}}({{attr.java_type}} _val) {
		binding.set_{{node.name}}_{{attr.name}}(this.ptr, {{attr.to_wrapper % "_val"}});
	}
	{% endfor %}

	{{ node.java_add }}

	{% for out in node.outs -%}
	{%- if out[1] != "" %}
	/** {{out[1]}} */
	{% endif -%}
	public static final int pn{{out[0]|CamelCase}} = {{loop.index0}};
	{% endfor -%}
	public static final int pnMax = {{len(node.outs)}};

	{% if not isAbstract(node) %}
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	{% endif %}
}
''')
	file.write(template.render(node = node, isAbstract = isAbstract, len=len))
	file.close()

template = env.from_string('''/* Warning: Automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_ircons;
import firm.bindings.binding_irnode;
import firm.bindings.Bindings;
import firm.nodes.Node;

class ConstructionBase {

	protected static final binding_ircons binding_cons = Bindings.getIrConsBinding();
	protected static final binding_irnode binding = Bindings.getIrNodeBinding();

	protected ConstructionBase() {
	}

	{% for node in nodes %}
	{% if not isAbstract(node) and not node.noconstr %}
	public Node new{{node.classname}}({{node.arguments|argdecls}}) {
		Pointer result_ptr = binding_cons.new_{{node.name}}({{node.arguments|bindingargs}});
		return Node.createWrapper(result_ptr);
	}
	{% endif %}
	{% endfor %}
}''')

file = open("ConstructionBase.java", "w")
file.write(template.render(nodes = nodes, isAbstract = isAbstract))
file.close()

template = env.from_string('''/* Warning: automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_irnode;

class NodeWrapperConstruction {

	public static Node createWrapper(Pointer ptr) {
		final binding_irnode.ir_opcode opcode = 
			binding_irnode.ir_opcode.getEnum(Node.binding.get_irn_opcode(ptr));

		switch (opcode) {
		{% for node in nodes %}
		{% if not isAbstract(node) %}
			case iro_{{node.name}}:
				return new {{node.classname}}(ptr);
		{% endif %}
		{% endfor %}
			default:
				throw new IllegalStateException("Unkown node type: " + opcode);
		}
	}
}''')
file = open("NodeWrapperConstruction.java", "w")
file.write(template.render(nodes = nodes, isAbstract = isAbstract))
file.close()

template = env.from_string('''/* Warning: automatically generated file */
package firm.nodes;

/**
 * Visitor interface for firm nodes
 */
public interface NodeVisitor {

	{% for node in nodes -%}
	{% if not isAbstract(node) -%}
	/** called when accept is called on a {{node.classname}} node */
	void visit({{node.classname}} node);
	{% endif %}
	{%- endfor %}

	/**
	 * Default Visitor: A class which implements every visit function of
	 * the NodeVisitor interface with a call to the defaultVisit function.
	 * Usefull as base for own visitors which need to treat all nodes
	 * equally or only need to override some visit functions.
	 */
	public static abstract class Default implements NodeVisitor {

		public void defaultVisit(Node n) {}
		
	{% for node in nodes -%}
	{% if not isAbstract(node) %}
		@Override
		public void visit({{node.classname}} node) {
			defaultVisit(node);
		}
	{% endif %}
	{%- endfor %}	
	}

}''')
file = open("NodeVisitor.java", "w")
file.write(template.render(nodes = nodes, isAbstract = isAbstract))
file.close()


template = env.from_string('''/* Warning: automatically generated file */
package firm;

import com.sun.jna.Pointer;

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
		this(binding.new_ir_graph(entity.ptr, nLocalVars));
	}

	{% for node in nodes -%}
	{% if not isAbstract(node) and not node.noconstr %}
	/** Create a new {{node.name}} node */
	public final Node new{{node.classname}}(
		{%- filter parameters %}
			{{node|blockparameter}}
			{{node|nodeparameters}}
		{%- endfilter %}) {
		return Node.createWrapper(binding_cons.new_r_{{node.name}}(
			{%- filter arguments %}
				{{node|blockargument}}
				{{node|nodearguments}}
			{%- endfilter %}));
	}
	{% endif %}
	{%- endfor %}
}''')
file = open("Graph.java", "w")
file.write(template.render(nodes = nodes, isAbstract = isAbstract))
file.close()
