#!/usr/bin/python
from jinja2 import Environment, Template
from ir_spec import nodes
from spec_util import verify_node, is_dynamic_pinned

java_keywords = [ "public", "private", "protected", "true", "false" ]

# Filter out some special nodes we don't really need/want here
del nodes["ASM"]
del nodes["CallBegin"]
del nodes["Borrow"]
del nodes["Carry"]
del nodes["EndExcept"]
del nodes["EndReg"]
# Some nodes need special constructors for now...
for n in ["SymConst", "End", "Start", "Dummy", "Anchor"]:
	nodes[n]["noconstr"] = True

def format_filter_keywords(arg):
	if arg in java_keywords:
		return "_" + arg
	return arg

def format_argdecls(arglist):
	argstrings = map(lambda arg : (arg["type"] + " " + format_filter_keywords(arg["name"])), arglist)
	return ", ".join(argstrings)

def format_args(arglist):
	argstrings = map(lambda arg : arg["name"], arglist)
	return ", ".join(argstrings)

def format_binding_args(arglist, need_graph = False):
	first = True
	res   = ""
	if need_graph:
#		res = "firm.Graph.getCurrent().ptr"
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
	if key in node:
		return string
	return ""

def format_key(node, key, default=""):
	if key in node:
		return node[key]
	return default

env = Environment()
env.filters['argdecls']    = format_argdecls
env.filters['args']        = format_args
env.filters['bindingargs'] = format_binding_args
env.filters['camelCase']   = format_camel_case
env.filters['CamelCase']   = format_camel_case_big
env.filters['ifset']       = format_ifset
env.filters['key']         = format_key
env.filters['filterkeywords'] = format_filter_keywords

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

def preprocess_node(nodename, node):
	node["classname"] = format_camel_case_big(nodename)

	if "is_a" in node:
		parent = nodes[node["is_a"]]
		node["ins"] = parent["ins"]
		if "outs" in parent:
			node["outs"] = parent["outs"]
	if "ins" not in node:
		node["ins"] = []
	if "outs" in node:
		node["mode"] = "mode_T"
	if "java_add" not in node:
		node["java_add"] = ""
	if "arity" not in node:
		node["arity"] = len(node["ins"])
	if "attrs" not in node:
		node["attrs"] = []
	if "constructor_args" not in node:
		node["constructor_args"] = []
	if "pinned" not in node:
		node["pinned"] = "no"

	verify_node(node)

	# dynamic pin node?
	if is_dynamic_pinned(node) and "pinned_init" not in node:
		node["constructor_args"].append(dict(
			name = "pin_state",
			type = "op_pin_state"
		))

	# construct node arguments
	arguments = [ ]
	for input in node["ins"]:
		arguments.append(dict(
			name = input,
			type = "Node"
		))
	if node["arity"] == "variable" or node["arity"] == "dynamic":
		arguments.append(dict(
			name = "ins",
			type = "Node[]"
		))
	if "mode" not in node:
		arguments.append(dict(
			name = "mode",
			type = "firm.Mode"
		))
	for attr in node["attrs"]:
		prepare_attr(attr)
		if "init" in attr:
			continue
		
		arguments.append(dict(
			name = attr["java_name"],
			type = attr["java_type"],
			to_wrapper = attr["to_wrapper"]
		))
	for arg in node["constructor_args"]:
		old_type = arg["type"]
		(java_type,wrap_type,to_wrapper,from_wrapper) = get_java_type(old_type)

		arguments.append(dict(
			name = arg["name"],
			type = java_type,
			to_wrapper = to_wrapper
		))
		
	node["arguments"] = arguments

	#if "block" not in node:
	ext_arguments = [ ]
	if not "knownBlock" in node:
		ext_arguments.append(dict(
			name       = "block",
			type       = "Block",
			to_wrapper = "%s.ptr"
		))
	for a in arguments:
		ext_arguments.append(a)
	node["ext_arguments"] = ext_arguments
		

for nodename, node in nodes.iteritems():
	preprocess_node(nodename, node)
	classname = node["classname"]
	arguments = node["arguments"]
	ext_arguments = node["ext_arguments"]

	filename = "%s.java" % classname
	print "Create: %s" % filename
	file = open(filename, "w");
	
	template = env.from_string('''/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;

public {{"abstract "|ifset(node,"abstract")}}class {{node["classname"]}} extends {{node|key("is_a", "node")|CamelCase}} {

	public {{node["classname"]}}(Pointer ptr) {
		super(ptr);
	}

	{% for input in node.ins %}
	{{"@Override"|ifset(node,"is_a")}}
	public Node get{{input|CamelCase}}() {
		return createWrapper(binding.get_{{nodename}}_{{input}}(ptr));
	}

	{{"@Override"|ifset(node,"is_a")}}
	public void set{{input|CamelCase}}(Node {{input|filterkeywords}}) {
		binding.set_{{nodename}}_{{input}}(this.ptr, {{input|filterkeywords}}.ptr);
	}
	{% endfor %}

	{% for attr in node.attrs %}
	public {{attr.java_type}} get{{attr.java_name|CamelCase}}() {
		{{attr.wrap_type}} _res = binding.get_{{nodename}}_{{attr.name}}(ptr);
		return {{attr.from_wrapper % "_res"}};
	}

	public void set{{attr.java_name|CamelCase}}({{attr.java_type}} _val) {
		binding.set_{{nodename}}_{{attr.name}}(this.ptr, {{attr.to_wrapper % "_val"}});
	}
	{% endfor %}

	{{ node.java_add }}

	{% for out in node.outs %}
	public static final int pn{{out|CamelCase}} = {{loop.index0}};
	{% endfor %}
	public static final int pnMax = {{len(node.outs)}};

	{% if not node.abstract %}
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	} 
	{% endif %}
}
''')

	file.write(template.render(vars(), len=len))
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

	{% for nodename, node in nodes.iteritems() %}
	{% if not node.abstract and not node.noconstr %}
	public Node new{{node["classname"]}}({{node["arguments"]|argdecls}}) {
		Pointer result_ptr = binding_cons.new_{{nodename}}({{node["arguments"]|bindingargs}});
		return Node.createWrapper(result_ptr);
	}
	{% endif %}
	{% endfor %}
}''')

file = open("ConstructionBase.java", "w")
file.write(template.render(nodes = nodes))
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
		{% for nodename, node in nodes.iteritems() %}
		{% if not node.abstract %}
			case iro_{{nodename}}:
				return new {{node["classname"]}}(ptr);
		{% endif %}
		{% endfor %}
			default:
				throw new IllegalStateException("Unkown node type: " + opcode);
		}
	}

}''')
file = open("NodeWrapperConstruction.java", "w")
file.write(template.render(nodes = nodes))
file.close()

template = env.from_string('''/* Warning: automatically generated file */
package firm.nodes;

public interface NodeVisitor {

	{% for nodename, node in nodes.iteritems() %}
	{% if not node.abstract %}
	void visit({{node["classname"]}} node);
	{% endif %}
	{% endfor %}

	public static abstract class Default implements NodeVisitor {

		public void defaultVisit(Node n) {}
		
	{% for nodename, node in nodes.iteritems() %}
	{% if not node.abstract %}
		@Override
		public void visit({{node["classname"]}} node) {
			defaultVisit(node);
		}
	{% endif %}
	{% endfor %}
	
	}

}''')
file = open("NodeVisitor.java", "w")
file.write(template.render(nodes = nodes))
file.close()


template = env.from_string('''/* Warning: automatically generated file */
package firm;

import com.sun.jna.Pointer;

import firm.nodes.Block;
import firm.nodes.Node;

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


	{% for nodename, node in nodes.iteritems() %}
	{% if not node.abstract and not node.noconstr %}
	public final Node new{{node["classname"]}}({{node.ext_arguments|argdecls}}) {
		return Node.createWrapper(binding_cons.new_r_{{nodename}}({{node.ext_arguments|bindingargs(True)}}));
	}
	{% endif %}
	{% endfor %}

}''')
file = open("Graph.java", "w")
file.write(template.render(nodes = nodes))
file.close()
