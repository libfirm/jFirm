package firm;

import com.sun.jna.Pointer;

import firm.bindings.binding_tv;

public class PointerType extends Type {

	PointerType(Pointer ptr) {
		super(ptr);
	}

	public PointerType(Type pointsTo) {
		super(binding_tv.new_type_pointer(pointsTo.ptr));
	}

	public Type getPointsTo() {
		return Type.createWrapper(binding_tv.get_pointer_points_to_type(ptr));
	}

	public void setPointsTo(Type type) {
		binding_tv.set_pointer_points_to_type(ptr, type.ptr);
	}

	@Override
	public void finishLayout() {
		super.finishLayout();
	}
}
