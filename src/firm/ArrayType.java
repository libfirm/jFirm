package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;
import firm.bindings.binding_typerep.ir_type_state;
import firm.nodes.Node;

public class ArrayType extends Type {

	ArrayType(Pointer ptr) {
		super(ptr);
	}

	public ArrayType(int n_dims, Type elementType) {
		super(binding_typerep.new_type_array(n_dims, elementType.ptr));
	}

	public ArrayType(Type elementType) {
		this(1, elementType);
	}

	public int getNDimensions() {
		return binding_typerep.get_array_n_dimensions(ptr).intValue();
	}

	public void setBounds(int dimension, int lowerBound, int upperBound) {
		binding_typerep.set_array_bounds_int(ptr, new NativeLong(dimension),
				lowerBound, upperBound);
	}

	public void setBounds(int dimension, Node lowerBound, Node upperBound) {
		binding_typerep.set_array_bounds(ptr, new NativeLong(dimension),
				lowerBound.ptr, upperBound.ptr);
	}

	public void setLowerBound(int dimension, int lowerBound) {
		binding_typerep.set_array_lower_bound_int(ptr, new NativeLong(dimension),
				lowerBound);
	}

	public void setLowerBound(int dimension, Node lowerBound) {
		binding_typerep.set_array_lower_bound(ptr, new NativeLong(dimension), lowerBound.ptr);
	}

	public int getLowerBoundInt(int dimension) {
		return binding_typerep.get_array_lower_bound_int(ptr, new NativeLong(dimension)).intValue();
	}

	public Node getLowerBound(int dimension) {
		return Node.createWrapper(binding_typerep.get_array_lower_bound(ptr,
				new NativeLong(dimension)));
	}

	public void setUpperBound(int dimension, int upperBound) {
		binding_typerep.set_array_upper_bound_int(ptr, new NativeLong(dimension), upperBound);
	}

	public void setUpperBound(int dimension, Node upperBound) {
		binding_typerep.set_array_upper_bound(ptr, new NativeLong(dimension), upperBound.ptr);
	}

	public int getUpperBoundInt(int dimension) {
		NativeLong l = binding_typerep.get_array_upper_bound_int(ptr, new NativeLong(dimension));
		return l.intValue();
	}

	public Node getUpperBound(int dimension) {
		return Node.createWrapper(binding_typerep.get_array_upper_bound(ptr,
				new NativeLong(dimension)));
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

		int size = getElementType().getSizeBytes();
		for (int d = 0; d < getNDimensions(); ++d) {
			int n = getUpperBoundInt(d) - getLowerBoundInt(d);
			size *= n;
		}
		setSizeBytes(size);

		super.finishLayout();
	}
}
