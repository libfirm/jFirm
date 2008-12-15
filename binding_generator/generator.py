#!/usr/bin/python

from jinja2 import Environment, Template

nodes = dict(
Start = dict(
	mode       = "mode_T",
	op_flags   = "cfopcode",
	state      = "pinned",
	knownBlock = True,
	noconstr   = True,
),

End = dict(
	mode       = "mode_X",
	op_flags   = "cfopcode",
	state      = "pinned",
	arity      = "dynamic",
	knownBlock = True,
	noconstr   = True,
),

Phi = dict(
	noconstr = True,
	state    = "pinned",
	arity    = "variable",
),

Jmp = dict(
	mode     = "mode_X",
	op_flags = "cfopcode",
	state    = "pinned",
	ins      = [],
),

IJmp = dict(
	mode     = "mode_X",
	op_flags = "cfopcode",
	state    = "pinned",
	ins      = [ "target" ],
),

# Const
# SymConst
# simpleSel
# Sel

Call = dict(
	ins      = [ "mem", "ptr" ],
	arity    = "variable",
	outs     = [ "M_regular", "X_regular", "X_except", "T_result", "M_except", "P_value_res_base" ],
	attrs    = [
		dict(
			type = "ir_type*",
			name = "type"
		)
	]
),

binop = dict(
	abstract = True,
	ins      = [ "left", "right" ]
),

Add = dict(
	is_a     = "binop"
),

Sub = dict(
	is_a     = "binop"
),

Mul = dict(
	is_a     = "binop"
),

Mulh = dict(
	is_a     = "binop"
),

Abs = dict(
	is_a     = "unop"
),

And = dict(
	is_a     = "binop"
),

Or = dict(
	is_a     = "binop"
),

Eor = dict(
	is_a     = "binop"
),

Not = dict(
	is_a     = "unop"
),

Shl = dict(
	is_a     = "binop"
),

Shr = dict(
	is_a     = "binop"
),

Shrs = dict(
	is_a     = "binop"
),

Rotl = dict(
	is_a     = "binop"
),

Load = dict(
	ins      = [ "mem", "ptr" ],
	outs     = [ "M", "X_regular", "X_except", "res" ],
	attrs    = [
		dict(
			type = "ir_mode*",
			name = "mode"
		),
	],
	constructor_args = [
		dict(
			type = "cons_flags",
			name = "flags",
		),
	],
),

Store = dict(
	ins      = [ "mem", "ptr", "value" ],
	outs     = [ "M", "X_regular", "X_except" ],
	constructor_args = [
		dict(
			type = "cons_flags",
			name = "flags",
		),
	],
),

Anchor = dict(
	mode       = "mode_T",
	knownBlock = True,
	noconstr   = True
),

NoMem = dict(
	mode       = "mode_M",
	knownBlock = True,
),

Bad = dict(
	mode       = "mode_Bad",
	knownBlock = True,
),

Pin = dict(
	ins      = [ "op" ],
	mode     = "get_irn_mode(op);"
),

Proj = dict(
	ins      = [ "pred" ],
	attrs    = [
		dict(
			type = "long",
			name = "proj"
		)
	]
),

Sel = dict(
	ins    = [ "mem", "ptr" ],
	arity  = "variable",
	mode   = "mode_P",
	attrs    = [
		dict(
			type = "ir_entity*",
			name = "entity"
		)
	]
),

Sync = dict(
	mode     = "mode_M",
	arity    = "dynamic"
),

Tuple = dict(
	arity    = "variable",
	mode     = "mode_T",
),

Unknown = dict(
	knownBlock = True
),

Confirm = dict(
	ins      = [ "value", "bound" ],
	block    = "get_nodes_block(value)",
	mode     = "get_irn_mode(value)",
	attrs    = [
		dict(
			name = "cmp",
			type = "pn_Cmp"
		),
	],
),

Return = dict(
	ins      = [ "mem" ],
	arity    = "variable",
	mode     = "mode_X"
),

unop = dict(
	abstract = True,
	ins      = [ "op" ]
),

Minus = dict(
	is_a     = "unop"
),

Mux = dict(
	ins      = [ "sel", "false", "true" ]
),

Cond = dict(
	ins      = [ "selector" ],
	outs     = [ "false", "true" ],
),

Cmp = dict(
	is_a     = "binop",
	outs     = [ "False", "Eq", "Lt", "Le", "Gt", "Ge", "Lg", "Leg", "Uo", "Ue", "Ul", "Ule", "Ug", "Uge", "Ne", "True" ],
),

Conv = dict(
	is_a     = "unop"
)
)

java_keywords = [ "public", "private", "protected", "true", "false" ]

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
		res = "firm.Graph.getCurrent().ptr"
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
	elif type == "pn_Cmp":
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
		java_type    = "firm.bindings.binding_ircons.cons_flags"
		wrap_type    = "int"
		to_wrapper   = "%s.val"
		from_wrapper = "firm.bindings.binding_ircons.cons_flags.getEnum(%s)"
	elif type == "ir_entity*":
		java_type    = "firm.Entity"
		wrap_type    = "Pointer"
		to_wrapper   = "%s.ptr"
		from_wrapper = "new firm.Entity(%s)"
	else:
		print "UNKNOWN TYPE"
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
	if "arity" not in node:
		node["arity"] = len(node["ins"])
	if "attrs" not in node:
		node["attrs"] = []
	if "constructor_args" not in node:
		node["constructor_args"] = []

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
		
		arguments.append(dict(
			name = attr["name"],
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

	{% if not node.abstract and not node.noconstr %}
	public {{node["classname"]}}({{ext_arguments|argdecls}}) {
		super(binding_cons.new_r_{{nodename}}({{ext_arguments|bindingargs(True)}}));
	}
	{% endif %}

	public {{node["classname"]}}(Pointer ptr) {
		super(ptr);
	}

	{% for input in node.ins %}
	public Node get{{input|CamelCase}}() {
		return createWrapper(binding.get_{{nodename}}_{{input}}(ptr));
	}

	public void set{{input|CamelCase}}(Node {{input|filterkeywords}}) {
		binding.set_{{nodename}}_{{input}}(this.ptr, {{input|filterkeywords}}.ptr);
	}
	{% endfor %}

	{% for attr in node.attrs %}
	public {{attr.java_type}} get{{attr.name|CamelCase}}() {
		{{attr.wrap_type}} _res = binding.get_{{nodename}}_{{attr.name}}(ptr);
		return {{attr.from_wrapper % "_res"}};
	}
	{% endfor %}

	{% for out in node.outs %}
	public static final int pn{{out|CamelCase}} = {{loop.index0}};
	{% endfor %}
}
''')

	file.write(template.render(vars()))
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

template = env.from_string('''/* Warning: automatically generated fiel */
package firm.nodes;

import com.sun.jna.Pointer;

import firm.bindings.binding_irnode;

class NodeWrapperConstruction {

	public static Node createWrapper(Pointer ptr) {
		switch (binding_irnode.ir_opcode.getEnum(Node.binding.get_irn_opcode(ptr))) {
		{% for nodename, node in nodes.iteritems() %}
		{% if not node.abstract %}
			case iro_{{nodename}}:
				return new {{node["classname"]}}(ptr);
		{% endif %}
		{% endfor %}
			default:
				return new Node(ptr);
		}
	}

}''')
file = open("NodeWrapperConstruction.java", "w")
file.write(template.render(nodes = nodes))
file.close()

