package firm;

import java.util.Iterator;

import com.sun.jna.Pointer;

import firm.bindings.binding_tv;

public class CompoundType extends Type {
	CompoundType(Pointer ptr) {
		super(ptr);
	}

	public Ident getIdent() {
		return new Ident(binding_tv.get_compound_ident(ptr));
	}

	public String getName() {
		return getIdent().toString();
	}

	public int getNMembers() {
		return binding_tv.get_compound_n_members(ptr);
	}

	public Entity getMember(int n) {
		return new Entity(binding_tv.get_compound_member(ptr, n));
	}

	public Iterable<Entity> getMembers() {
		return new Iterable<Entity>() {
			@Override
			public Iterator<Entity> iterator() {
				return new Iterator<Entity>() {
					int n;

					@Override
					public boolean hasNext() {
						return n < getNMembers();
					}

					@Override
					public Entity next() {
						return getMember(n++);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	/**
	 * Layout members of a compound type in a "default" way which should be okay
	 * for most languages.
	 */
	public void layoutFields() {
		binding_tv.default_layout_compound_type(ptr);
	}

	@Override
	public void finishLayout() {
		/*
		 * you have to layout the type first. (for example by calling
		 * layoutFields) layouting should also set the size of the class
		 */
		assert getSizeBytes() >= 0;

		super.finishLayout();
	}
}
