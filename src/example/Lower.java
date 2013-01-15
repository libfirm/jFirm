package example;
import firm.ArrayType;
import firm.ClassType;
import firm.Entity;
import firm.Graph;
import firm.MethodType;
import firm.Mode;
import firm.PrimitiveType;
import firm.Program;
import firm.Type;
import firm.Util;
import firm.bindings.binding_ircons.ir_where_alloc;
import firm.bindings.binding_typerep.ir_visibility;
import firm.nodes.Alloc;
import firm.nodes.Call;
import firm.nodes.Node;
import firm.nodes.NodeVisitor;

/**
 * A transformation pass that lowers some highlevel features of OO languages,
 * so we can generate machine assembler:
 *
 *   - Replace Alloc-nodes by calls to libcs "calloc"
 *   - Move methods from classtypes into global type
 *   - escape/replace special chars in LdNames so normal assemblers are fine
 *     with them
 *
 * This demonstrates the usage of turnIntoTuple and Graph.walk()
 */
public class Lower {
	private Entity callocEntity;

	private Lower() {
		PrimitiveType tptr = new PrimitiveType(Mode.getP());
		PrimitiveType tuint = new PrimitiveType(Mode.getIu());
		MethodType type = new MethodType(new Type[] {tuint, tuint}, new Type[] {tptr});

		callocEntity = new Entity(Program.getGlobalType(), "calloc", type);
		final String callocid;
		if (com.sun.jna.Platform.isWindows() || com.sun.jna.Platform.isMac()) {
			callocid = "_calloc";
		} else {
			callocid = "calloc";
		}
		callocEntity.setLdIdent(callocid);
		callocEntity.setVisibility(ir_visibility.ir_visibility_external);
	}

	private void fixEntityLdName(Entity entity) {
		String name = entity.getLdName();
		/* replace some "java" names with "C" names:
		 * - The main method has to be called "main" in C
		 * - There is no PrintStream.println (but we use our dummy print_int implementation)
		 * - java/lang/system/out is also replaced by a dummy variable
		 */
		if (name.equals("main([Ljava.lang.String;)V")) {
			name = "main";
		}
		if (name.equals("java/io/PrintStream/println(I)V")) {
			name = "print_int";
		}
		if (name.equals("java/lang/System/out")) {
			name = "sysoutdummy";
		}
		/* C linker doesn't allow all possible ascii chars for identifiers,
		 * filter some out */
		name = name.replaceAll("[()\\[\\];]", "_");
		entity.setLdIdent(name);
	}

	private void fixEntityNames() {
		for (Entity entity : Program.getGlobalType().getMembers()) {
			fixEntityLdName(entity);
		}
	}

	private void layoutClass(ClassType cls) {
		if (cls.equals(Program.getGlobalType()))
			return;

		for (int m = 0; m < cls.getNMembers(); /* nothing */) {
			Entity member = cls.getMember(m);
			Type type = member.getType();
			if (! (type instanceof MethodType)) {
				++m;
				continue;
			}

			/* methods get implemented outside the class, move the entity */
			member.setOwner(Program.getGlobalType());
		}

		cls.layoutFields();
	}

	private void layoutTypes() {
		for (Type type : Program.getTypes()) {
			if (type instanceof ClassType) {
				layoutClass((ClassType) type);
			}
			type.finishLayout();
		}
	}

	private void lowerGraph(Graph graph) {
		graph.walk(new LowerWalker(graph));
	}

	private void lowerGraphs() {
		for (Graph graph : Program.getGraphs()) {
			lowerGraph(graph);
		}
	}

	/**
	 * Lower some highlevel constructs to make firm-graph suitable to be used
	 * by x86 backend.
	 */
	public static void lower() {
		Lower instance = new Lower();
		instance.layoutTypes();
		instance.fixEntityNames();
		instance.lowerGraphs();
		Util.lowerSels();
	}

	private class LowerWalker extends NodeVisitor.Default {
		private Graph graph;

		public LowerWalker(Graph graph) {
			this.graph = graph;
		}

		@Override
		public void visit(Alloc alloc) {
			/* Replace Alloc nodes with calls to "malloc" */
			if (alloc.getWhere() != ir_where_alloc.heap_alloc)
				return;

			Node block = alloc.getBlock();
			Type type = alloc.getType();
			if (type instanceof ArrayType) {
				type = ((ArrayType)type).getElementType();
			}
			Mode sizeMode = Mode.getIu();
			Node size = graph.newConst(type.getSizeBytes(), sizeMode);
			Node count = alloc.getCount();
			if (!count.getMode().equals(sizeMode))
				count = graph.newConv(block, count, sizeMode);

			Node symConst = graph.newSymConst(callocEntity);
			Node mem = alloc.getMem();
			Node[] arguments = new Node[] { count, size };
			Node call = graph.newCall(block, mem, symConst, arguments, callocEntity.getType());
			Node projM = graph.newProj(call, Mode.getM(), Call.pnM);
			Node projT = graph.newProj(call, Mode.getT(), Call.pnTResult);
			Node projRes = graph.newProj(projT, Mode.getP(), 0);

			Graph.turnIntoTuple(alloc, new Node[] { projM, projRes });
		}
	}
}
