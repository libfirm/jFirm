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

	public void setSize(int size) {
		assert size >= 0;
		binding_typerep.set_array_size_int(ptr, size);
	}

	public int getSizeInt() {
		return binding_typerep.get_array_size_int(ptr);
	}

	public boolean hasSize() {
		return binding_typerep.has_array_size(ptr) != 0;
	}

	public Type getElementType() {
		return Type.createWrapper(binding_typerep.get_array_element_type(ptr));
	}

	public Entity getElmentEntity() {
		return new Entity(binding_typerep.get_array_element_entity(ptr));
	}

	@Override
	public void finishLayout() {
		/* calculate the array size */
		assert getElementType().getTypeState() == ir_type_state.layout_fixed;

		if (hasSize()) {
			int element_size = getElementType().getSizeBytes();
			int size         = getSizeInt();
			setSizeBytes(element_size * size);
		}

		super.finishLayout();
	}
}
