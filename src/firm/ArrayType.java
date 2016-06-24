package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_type_state;

public class ArrayType extends Type {

	ArrayType(Pointer ptr) {
		super(ptr);
	}

	public ArrayType(Type elementType, int numElements) {
		super(binding_typerep.new_type_array(elementType.ptr, numElements));
	}

	public int getNumElements() {
		return binding_typerep.get_array_size(ptr);
	}

	public Type getElementType() {
		return Type.createWrapper(binding_typerep.get_array_element_type(ptr));
	}
}
