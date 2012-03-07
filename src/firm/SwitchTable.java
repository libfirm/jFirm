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

	public final void setEntry(int entry, TargetValue min, TargetValue max, int pn) {
		binding_irnode.ir_switch_table_set(ptr, new NativeLong(entry), min.ptr, max.ptr, new NativeLong(pn));
	}

	public final void setEntry(int entry, int min, int max, int pn) {
		TargetValue minTV = new TargetValue(min, Mode.getIs());
		TargetValue maxTV = new TargetValue(max, Mode.getIs());
		setEntry(entry, minTV, maxTV, pn);
	}

	public final int getNEntries() {
		return binding_irnode.ir_switch_table_get_n_entries(ptr).intValue();
	}

	public final TargetValue getMin(int entry) {
		return new TargetValue(binding_irnode.ir_switch_table_get_min(ptr, new NativeLong(entry)));
	}

	public final TargetValue getMax(int entry) {
		return new TargetValue(binding_irnode.ir_switch_table_get_max(ptr, new NativeLong(entry)));
	}

	public final int getPn(int entry) {
		return binding_irnode.ir_switch_table_get_pn(ptr, new NativeLong(entry)).intValue();
	}
}
