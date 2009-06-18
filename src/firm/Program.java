package firm;

import java.util.Iterator;

import firm.bindings.Bindings;
import firm.bindings.binding_irprog;

public class Program {
	
	private static final binding_irprog binding = Bindings.getIrProgBinding();
	
	public static ClassType getGlobalType() {
		Type type = Type.createWrapper(binding.get_glob_type());
		assert type instanceof ClassType;
		return (ClassType) type;
	}
	
	public static Graph getConstCodeGraph() {
		return new Graph(binding.get_const_code_irg());
	}
	
	public static int getNGraphs() {
		return binding.get_irp_n_irgs();
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
						throw new RuntimeException("Graphs remove not implemented");
					}					
				};
			}			
		};
	}
	
	public static Graph getGraph(int n) {
		return new Graph(binding.get_irp_irg(n));
	}
	
	public static int getNTypes() {
		return binding.get_irp_n_types();
	}
		
	public static Type getType(int n) {
		return Type.createWrapper(binding.get_irp_type(n));
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
						throw new RuntimeException("Type remove not implemented");
					}					
				};
			}			
		};
	}

	
	public static int getNModes() {
		return binding.get_irp_n_modes();
	}
	
	public static Mode getMode(int n) {
		return new Mode(binding.get_irp_mode(n));
	}
	
	public static Iterable<Mode> getModes() {
		return new Iterable<Mode>() {
			@Override
			public Iterator<Mode> iterator() {
				return new Iterator<Mode>() {
					int n;
					@Override
					public boolean hasNext() {
						return n < getNModes();
					}

					@Override
					public Mode next() {
						return getMode(n++);
					}

					@Override
					public void remove() {
						throw new RuntimeException("mode remove not available");
					}					
				};
			}			
		};
	}
}
