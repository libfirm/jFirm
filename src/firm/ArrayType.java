package firm;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import firm.bindings.binding_typerep.ir_type_state;
import firm.nodes.Node;

public class ArrayType extends Type {

	ArrayType(Pointer ptr) {
		super(ptr);
	}
	
	public ArrayType(int n_dims, Type elementType) {
		super(binding.new_type_array(n_dims, elementType.ptr));
	}

	public ArrayType(Type elementType) {
		this(1, elementType);
	}
	
	public int getNDimensions() {
		return binding.get_array_n_dimensions(ptr);
	}
	
	public void setBounds(int dimension, int lowerBound, int upperBound) {
		binding.set_array_bounds_int(ptr, dimension, lowerBound, upperBound);
	}
	
	public void setBounds(int dimension, Node lowerBound, Node upperBound) {
		binding.set_array_bounds(ptr, dimension, lowerBound.ptr, upperBound.ptr);
	}
	
	public void setLowerBound(int dimension, int lowerBound) {
		binding.set_array_lower_bound_int(ptr, dimension, lowerBound);
	}
	
	public void setLowerBound(int dimension, Node lowerBound) {
		binding.set_array_lower_bound(ptr, dimension, lowerBound.ptr);
	}
	
	public int getLowerBoundInt(int dimension) {
		NativeLong l = binding.get_array_lower_bound_int(ptr, dimension);
		return l.intValue();
	}
	
	public Node getLowerBound(int dimension) {
		return Node.createWrapper(binding.get_array_lower_bound(ptr, dimension));
	}
	
	public void setUpperBound(int dimension, int upperBound) {
		binding.set_array_upper_bound_int(ptr, dimension, upperBound);
	}
	
	public void setUpperBound(int dimension, Node upperBound) {
		binding.set_array_upper_bound(ptr, dimension, upperBound.ptr);
	}
	
	public int getUpperBoundInt(int dimension) {
		NativeLong l = binding.get_array_upper_bound_int(ptr, dimension);
		return l.intValue();
	}
	
	public Node getUpperBound(int dimension) {
		return Node.createWrapper(binding.get_array_upper_bound(ptr, dimension));
	}	
	
	public Type getElementType() {
		return Type.createWrapper(binding.get_array_element_type(ptr));
	}
	
	public Entity getElmentEntity() {
		return new Entity(binding.get_array_element_entity(ptr));
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
