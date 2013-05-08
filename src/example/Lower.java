package example;
import firm.ClassType;
import firm.Entity;
import firm.MethodType;
import firm.Program;
import firm.Type;
import firm.Util;

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
	private Lower() {
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

	/**
	 * Lower some highlevel constructs to make firm-graph suitable to be used
	 * by x86 backend.
	 */
	public static void lower() {
		Lower instance = new Lower();
		instance.layoutTypes();
		instance.fixEntityNames();
		Util.lowerSels();
	}
}
