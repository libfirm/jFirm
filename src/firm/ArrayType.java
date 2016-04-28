package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_type_state;

public class ArrayType extends Type {

	ArrayType(Pointer ptr) {
		super(ptr);
	}

	public ArrayType(Type elementType) {
		super(binding_typerep.new_type_array(elementType.ptr));
	}

	public void setNumElements(int num) {
		assert num >= 0;
		binding_typerep.set_array_size_int(ptr, num);
	}

	public int getNumElements() {
		return binding_typerep.get_array_size_int(ptr);
	}

	public boolean hasSize() {
		return binding_typerep.has_array_size(ptr) != 0;
	}

	public Type getElementType() {
		return Type.createWrapper(binding_typerep.get_array_element_type(ptr));
	}

	@Override
	public void finishLayout() {
		/* calculate the array size */
		assert getElementType().getTypeState() == ir_type_state.layout_fixed;

		if (hasSize()) {
			final int elementSize = getElementType().getSize();
			final int num = getNumElements();
			setSize(elementSize * num);
		}

		super.finishLayout();
	}
}
