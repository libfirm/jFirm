package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class PointerType extends Type {

	PointerType(Pointer ptr) {
		super(ptr);
	}

	public PointerType(Type pointsTo) {
		super(binding_typerep.new_type_pointer(pointsTo.ptr));
	}

	public Type getPointsTo() {
		return Type.createWrapper(binding_typerep.get_pointer_points_to_type(ptr));
	}

	public void setPointsTo(Type type) {
		binding_typerep.set_pointer_points_to_type(ptr, type.ptr);
	}

	@Override
	public void finishLayout() {
		super.finishLayout();
	}
}
