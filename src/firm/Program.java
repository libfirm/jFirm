package firm;

import firm.bindings.Bindings;
import firm.bindings.binding_irprog;

public class Program {
	
	private static final binding_irprog binding = Bindings.getIrProgBinding();
	
	public static Type getGlobalType() {
		return Type.createWrapper(binding.get_glob_type());
	}

}
