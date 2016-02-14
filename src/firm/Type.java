package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_irnode;
import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_type_state;

public class Type extends JNAWrapper {

	protected Type(Pointer ptr) {
		super(ptr);
	}

	public static Type createWrapper(Pointer ptr) {
		if (binding_typerep.is_Primitive_type(ptr) != 0) {
			return new PrimitiveType(ptr);
		} else if (binding_typerep.is_Method_type(ptr) != 0) {
			return new MethodType(ptr);
		} else if (binding_typerep.is_Array_type(ptr) != 0) {
			return new ArrayType(ptr);
		} else if (binding_typerep.is_Class_type(ptr) != 0) {
			return new ClassType(ptr);
		} else if (binding_typerep.is_segment_type(ptr) != 0) {
			return new SegmentType(ptr);
		} else if (binding_typerep.is_Pointer_type(ptr) != 0) {
			return new PointerType(ptr);
		} else if (binding_typerep.is_Struct_type(ptr) != 0) {
			return new StructType(ptr);
		} else if (binding_typerep.is_Union_type(ptr) != 0) {
			return new UnionType(ptr);
		} else if (binding_typerep.is_unknown_type(ptr) != 0
		        || binding_typerep.is_code_type(ptr) != 0) {
			return new Type(ptr);
		} else {
			Type type = new Type(ptr);
			System.err.println("Unknown Type kind found: " + type);
			return type;
		}
	}

	/** @deprecated */
	public void setSizeBytes(int size) {
		binding_typerep.set_type_size(ptr, size);
	}

	/** @deprecated */
	public int getSizeBytes() {
		return binding_typerep.get_type_size(ptr);
	}

	/** @deprecated */
	public void setAlignmentBytes(int alignment) {
		binding_typerep.set_type_alignment(ptr, alignment);
	}

	/** @deprecated */
	public int getAlignmentBytes() {
		return binding_typerep.get_type_alignment(ptr);
	}

	public void setSize(int size) {
		binding_typerep.set_type_size(ptr, size);
	}

	public int getSize() {
		return binding_typerep.get_type_size(ptr);
	}

	public void setAlignment(int alignment) {
		binding_typerep.set_type_alignment(ptr, alignment);
	}

	public int getAlignment() {
		return binding_typerep.get_type_alignment(ptr);
	}

	public void setTypeState(binding_typerep.ir_type_state state) {
		binding_typerep.set_type_state(ptr, state.val);
	}

	public binding_typerep.ir_type_state getTypeState() {
		return ir_type_state.getEnum(binding_typerep.get_type_state(ptr));
	}

	/** returns the mode of a type (or null for non-atomic types) */
	public Mode getMode() {
		Pointer mode_ptr = binding_typerep.get_type_mode(ptr);
		if (mode_ptr == null)
			return null;
		return new Mode(mode_ptr);
	}

	public static Type getUnknown() {
		Pointer ptr = binding_typerep.get_unknown_type();
		return new Type(ptr);
	}

	public static Type getCode() {
		Pointer ptr = binding_typerep.get_code_type();
		return new Type(ptr);
	}

	/** you must call this function when you are finished constructing a type */
	public void finishLayout() {
		setTypeState(ir_type_state.layout_fixed);
	}

	@Override
	public String toString() {
		return binding_irnode.gdb_node_helper(ptr);
	}
}
