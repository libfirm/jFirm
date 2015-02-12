from jinjautil import export_filter
from irops import is_abstract, setdefault, setldefault, is_dynamic_pinned, Node, Attribute

java_keywords = [ "public", "private", "protected", "true", "false", "ptr" ]
def filterkeywords(arg):
	if arg in java_keywords:
		return "_" + arg
	return arg

def argdecls(arglist):
	argstrings = [ "%s %s" % (arg.type, filterkeywords(arg.name)) for arg in arglist ]
	return ", ".join(argstrings)

def parameterlist(parameterlist):
	return "\n".join(parameterlist)

def javanodearguments(node):
	def argument(arg):
		if arg.type == "Node[]":
			return arg.name + ".length, Node.getBufferFromNodeList(" + arg.name + ")"
		elif hasattr(arg, "to_wrapper") and arg.to_wrapper is not None:
			return arg.to_wrapper % (arg.name,)
		else:
			return "%s.ptr" % (arg.name,)
	arguments = map(argument, node.arguments)
	return parameterlist(arguments)

def javablockargument(node):
	if not node.block:
		return "block.ptr"
	elif node.usesGraph:
		return "this.ptr"
	else:
		return ""

def block_construction(node, extern=False):
	if extern:
		graph = "cons.getGraph().ptr"
	else:
		graph = "graph.ptr"

	if not node.block:
		return "binding_ircons.get_r_cur_block(%s)" % graph
	elif node.usesGraph:
		return graph
	else:
		return ""

def extern_block_construction(node):
	return block_construction(node, extern=True)

def bindingargs(arglist, need_graph = False):
	first = True
	res   = ""
	if need_graph:
		res = "this.ptr"
		first = False

	for arg in arglist:
		if not first:
			res += ", "
		first = False
		if arg.type == "Node[]":
			res += arg.name + ".length, Node.getBufferFromNodeList(" + arg.name + ")"
			continue
		name = filterkeywords(arg.name)
		if hasattr(arg, "to_wrapper") and arg.to_wrapper is not None:
			res += arg.to_wrapper % (name,)
		else:
			res += name + ".ptr"

	return res

def camel_case_helper(string, firstbig):
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

def CamelCase(string):
	return camel_case_helper(string, True)

for f in [argdecls, CamelCase, filterkeywords, bindingargs, javablockargument,
          block_construction, is_abstract, javanodearguments,
          extern_block_construction]:
	export_filter(f)

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
	elif type == "ir_tarval*":
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
	elif type == "ir_relation":
		java_type    = "firm.Relation"
		wrap_type    = "int"
		to_wrapper   = "%s.value()"
		from_wrapper = "firm.Relation.fromValue(%s)"
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
	elif type in ("ir_node**", "ident**", "ir_asm_constraint*", "ir_switch_table*"):
		# cheat...
		java_type    = "Pointer"
		wrap_type    = "Pointer"
		to_wrapper   = "%s"
		from_wrapper = "%s"
	else:
		print "UNKNOWN TYPE %s" % type
		java_type    = "BAD"
		wrap_type    = "BAD"
		to_wrapper   = "BAD(%s)"
		from_wrapper = "BAD(%s)"
	return (java_type,wrap_type,to_wrapper,from_wrapper)

def prepare_attr(attr):
	(java_type,wrap_type,to_wrapper,from_wrapper) = get_java_type(attr.type)
	attr.java_type = java_type
	attr.wrap_type = wrap_type
	attr.to_wrapper = to_wrapper
	attr.from_wrapper = from_wrapper
	if not hasattr(attr, "java_name"):
		attr.java_name = attr.name

# Dummy class serving as anchor to the class hierarchy and mapping to the
# "Node" class already defined manually in jFirm.
Node.name = "Node"
Node.classname = "Node"
Node.java_add = ""

class JavaArgument(Attribute):
	def __init__(self, name, type, to_wrapper, **kwargs):
		super(JavaArgument, self).__init__(name, type, **kwargs)
		self.to_wrapper = to_wrapper

def preprocess_node(node):
	parent = node.__base__
	if parent == object:
		parent = Node
	node.parent = parent
	node.classname = CamelCase(node.name)

	# construct node arguments
	if not is_abstract(node):
		arguments = [ ]
		for input in node.ins:
			arguments.append(
				Attribute(name=input.name, type="Node", comment=input.comment))
		if node.arity == "variable" or node.arity == "dynamic":
			arguments.append(
				Attribute("ins", type="Node[]"))
		if node.mode is None:
			arguments.append(
				Attribute("mode", type="firm.Mode"))
		for attr in node.attrs:
			prepare_attr(attr)
			if attr.init is not None:
				continue

			arguments.append(
				JavaArgument(name=attr.java_name, type=attr.java_type,
				             to_wrapper=attr.to_wrapper, comment=attr.comment))
		if is_dynamic_pinned(node):
			if node.pinned_init is None:
				(java_type,wrap_type,to_wrapper,from_wrapper) = get_java_type("op_pin_state")
				arguments.append(
					JavaArgument(name="pin_state", type=java_type,
					             to_wrapper=to_wrapper))
		for arg in node.constructor_args:
			old_type = arg.type
			(java_type,wrap_type,to_wrapper,from_wrapper) = get_java_type(old_type)

			arguments.append(
				JavaArgument(name=arg.name, type=java_type,
				             to_wrapper=to_wrapper, comment=arg.comment))

		for arg in arguments:
			arg.name = filterkeywords(arg.name)

		node.arguments = arguments
