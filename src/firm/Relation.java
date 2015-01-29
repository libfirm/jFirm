package firm;

import firm.bindings.binding_irnode;

/**
 * This class represents (possible) results when comparing 2 numbers.
 */
public enum Relation {
	/** empty relation (always false) */
	False(0),
	/** equal */
	Equal(binding_irnode.ir_relation.ir_relation_equal.val),
	/** less */
	Less(binding_irnode.ir_relation.ir_relation_less.val),
	/** greater */
	Greater(binding_irnode.ir_relation.ir_relation_greater.val),
	/** unordered (when comparing floating point NANs) */
	Unordered(binding_irnode.ir_relation.ir_relation_unordered.val),
	/** less or equal */
	LessEqual(Less.val | Equal.val),
	/** greater or equal */
	GreaterEqual(Greater.val | Equal.val),
	/** lesser or greater (= not equal for integer values) */
	LessGreater(Less.val | Greater.val),
	/** less, equal or greater */
	LessEqualGreater(Less.val|Equal.val|Greater.val),
	/** unordered or equal */
	UnorderedEqual(Unordered.val|Equal.val),
	/** unordered or less */
	UnorderedLess(Unordered.val|Less.val),
	/** unordered, less or equal */
	UnorderedLessEqual(Unordered.val|Less.val|Equal.val),
	/** unordered or greater */
	UnorderedGreater(Unordered.val|Greater.val),
	/** unordered, greater or equal */
	UnorderedGreaterEqual(Unordered.val|Greater.val|Equal.val),
	/** unordered, less or greater (= not equal) */
	UnorderedLessGreater(Unordered.val|Less.val|Greater.val),
	/** relation containing everything (always true) */
	True(Equal.val|Less.val|Greater.val|Unordered.val);

	private static final Relation[] relations = new Relation[16];
	private int val;
	private Relation(int value) {
		this.val = value;
	}
	static {
		for (Relation entry : values()) {
			assert relations[entry.val] == null;
			relations[entry.val] = entry;
		}
	}

	public int value() {
		return val;
	}

	public static Relation fromValue(int val) {
		return relations[val];
	}

	/** Calculates the negated (Complement(R)) relation, i.e. "<" becomes ">=u" */
	public Relation negated() {
		return fromValue(val ^ True.val);
	}

	/** Calculates the inversed (R^-1) relation, i.e., "<" becomes ">" */
	public Relation inversed() {
		return fromValue(binding_irnode.get_inversed_relation(val));
	}

	/**
	 * Tests whether another relation is completely contained within this one.
	 */
	public boolean contains(Relation other) {
		return (val & other.val) != 0;
	}
}
