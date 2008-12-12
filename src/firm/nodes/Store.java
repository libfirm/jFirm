/* Warning: Automatically generated file */
package firm.nodes;

import com.sun.jna.Pointer;
import firm.Graph;
import firm.Mode;
import firm.Type;

public class Store extends Node {

	
	public Store(Block block, Node mem, Node ptr, Node value) {
		super(binding_cons.new_r_Store(Graph.getCurrent().ptr, block.ptr, mem.ptr, ptr.ptr, value.ptr));
	}
	

	public Store(Pointer ptr) {
		super(ptr);
	}

	
	public Node getMem() {
		return createWrapper(binding.get_Store_mem(ptr));
	}

	public void setMem(Node mem) {
		binding.set_Store_mem(this.ptr, mem.ptr);
	}
	
	public Node getPtr() {
		return createWrapper(binding.get_Store_ptr(ptr));
	}

	public void setPtr(Node ptr) {
		binding.set_Store_ptr(this.ptr, ptr.ptr);
	}
	
	public Node getValue() {
		return createWrapper(binding.get_Store_value(ptr));
	}

	public void setValue(Node value) {
		binding.set_Store_value(this.ptr, value.ptr);
	}
	
}