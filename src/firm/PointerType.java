package firm;

import com.sun.jna.Pointer;

public class PointerType extends Type {

	protected PointerType(Pointer ptr) {
		super(ptr);
	}
	
	public PointerType(Ident name, Type pointsTo, Mode pointerMode) {
		super(binding.new_type_pointer(name.ptr, pointsTo.ptr, pointerMode.ptr));
	}
	
	/* convenience constructor */
	public PointerType(String name, Type pointsTo) {
		this(new Ident(name), pointsTo, Mode.getP());
	}
	
	public Type getPointsTo() {
		return Type.createWrapper(binding.get_pointer_points_to_type(ptr));
	}
	
	public void setPointsTo(Type type) {
		binding.set_pointer_points_to_type(ptr, type.ptr);
	}
	
	@Override
	public void fixed() {
		super.fixed();
	}
}
