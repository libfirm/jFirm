package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_irnode;

public class SwitchTable extends JNAWrapper {

	public SwitchTable(Pointer ptr) {
		super(ptr);
	}

	public SwitchTable(Graph irg, int numCases) {
		this(binding_irnode.ir_new_switch_table(irg.ptr, new NativeLong(numCases)));
	}
}
