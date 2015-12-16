package firm;

import java.util.Iterator;

import com.sun.jna.NativeLong;

import firm.bindings.binding_irprog;
import firm.bindings.binding_typerep;

/**
 * Represents a complete program/compilation unit in firm. There is currently
 * only a single active program allowed in firm so this is class only contains
 * static utility functions.
 */
public class Program {

	private Program() {
		/*
		 * Program should not be instantiated currently just use the static
		 * functions
		 */
	}

	/**
	 * creates a new Program/Compilation Unit and makes it the current program.
	 * Note that this does not free the memory of the previous program.
	 */
	public static void newProgram(String name) {
		binding_irprog.new_ir_prog(name);
	}

	/**
	 * Set name of the currently active program/compilation unit
	 */
	public static void setName(String name) {
		binding_irprog.set_irp_prog_name(new Ident(name).ptr);
	}

	/**
	 * Get name of the currently active program/compilation unit
	 */
	public static String getName() {
		return binding_irprog.get_irp_name();
	}

	public static ClassType getSegmentType(int val) {
		Type type = Type.createWrapper(binding_irprog.get_segment_type(val));
		assert type instanceof ClassType;
		return (ClassType) type;
	}

	public static SegmentType getGlobalType() {
		Type type = Type.createWrapper(binding_irprog.get_glob_type());
		assert type instanceof SegmentType;
		return (SegmentType) type;
	}

	public static Graph getConstCodeGraph() {
		return new Graph(binding_irprog.get_const_code_irg());
	}

	/**
	 * set the "main"-graph, the method which is called initially by the
	 * runtime-/operating-system when the program starts.
	 */
	public static void setMainGraph(Graph graph) {
		binding_irprog.set_irp_main_irg(graph.ptr);
	}

	public static int getNGraphs() {
		return binding_irprog.get_irp_n_irgs().intValue();
	}

	public static Iterable<Graph> getGraphs() {
		return new Iterable<Graph>() {
			@Override
			public Iterator<Graph> iterator() {
				return new Iterator<Graph>() {
					int n;

					@Override
					public boolean hasNext() {
						return n < getNGraphs();
					}

					@Override
					public Graph next() {
						return getGraph(n++);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException(
								"Graphs remove not implemented");
					}
				};
			}
		};
	}

	public static Graph getGraph(int n) {
		return new Graph(binding_irprog.get_irp_irg(new NativeLong(n)));
	}

	public static int getNTypes() {
		return binding_irprog.get_irp_n_types().intValue();
	}

	public static Type getType(int n) {
		return Type.createWrapper(binding_irprog.get_irp_type(new NativeLong(n)));
	}

	public static Iterable<Type> getTypes() {
		return new Iterable<Type>() {
			@Override
			public Iterator<Type> iterator() {
				return new Iterator<Type>() {
					int n;

					@Override
					public boolean hasNext() {
						return n < getNTypes();
					}

					@Override
					public Type next() {
						return getType(n++);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException(
								"Type remove not implemented");
					}
				};
			}
		};
	}

	/**
	 * Checks for errors in types/entities in the program
	 */
	public static boolean checkTypes() {
		return binding_typerep.tr_verify() != 0;
	}

	/**
	 * Checks for errors in the program.
	 * Checks all graphs and calls checkTYpes().
	 */
	public static boolean check() {
		boolean result = true;
		for (Graph g : getGraphs()) {
			result &= g.check();
		}
		result &= checkTypes();
		return result;
	}
}
