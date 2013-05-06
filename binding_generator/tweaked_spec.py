from ir_spec import *

java_binding = "firm.bindings.binding_irnode"
java_package = "firm.nodes"

# some tweaks are necessary to generate the java code
SymConst.noconstructor = True
End.noconstructor = True
Block.java_add = '''
	public void addPred(Node node) {
		firm.bindings.binding_ircons.add_immBlock_pred(ptr, node.ptr);
	}

	public void mature() {
		firm.bindings.binding_ircons.mature_immBlock(ptr);
	}

	@Override
	public Block getBlock() {
		return null;
	}

	public boolean blockVisited() {
		return 0 != firm.bindings.binding_irnode.Block_block_visited(ptr);
	}

	public void markBlockVisited() {
		firm.bindings.binding_irnode.mark_Block_block_visited(ptr);
	}

	'''
for a in Load.attrs:
	if a["name"] == "mode":
		a["java_name"] = "load_mode"

del ASM # n_clobbers has no setter in libfirm, so leave out the whole node
        # for now...
