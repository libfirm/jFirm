package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class Type extends JNAWrapper {
	
	protected static final binding_typerep binding = Entity.binding;
	
	protected Type(Pointer ptr) {
		super(ptr);
	}
	
	public static Type createWrapper(Pointer ptr) {
		if (binding.is_Primitive_type(ptr) != 0) {
			return new PrimitiveType(ptr);
		} else if (binding.is_Method_type(ptr) != 0) {
			return new MethodType(ptr);
		} else if (binding.is_Array_type(ptr) != 0) {
			return new ArrayType(ptr);
		} else {
			/* TODO: add missing types */
			return new Type(ptr);
		}
	}
	
	public void setSizeBytes(int size) {
		binding.set_type_size_bytes(ptr, size);
	}
	
	public void setAlignmentBytes(int alignment) {
		binding.set_type_alignment_bytes(ptr, alignment);
	}
	
	public void setTypeState(binding_typerep.ir_type_state state) {
		binding.set_type_state(ptr, state.val);
	}
}
