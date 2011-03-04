package firm;

import firm.bindings.binding_irnode;

public enum Relation {
	False(0),
	Equal(binding_irnode.ir_relation.ir_relation_equal.val),
	Less(binding_irnode.ir_relation.ir_relation_less.val),
	Greater(binding_irnode.ir_relation.ir_relation_greater.val),
	Unordered(binding_irnode.ir_relation.ir_relation_unordered.val),
	LessEqual(Less.val | Equal.val),
	GreaterEqual(Greater.val | Equal.val),
	LessGreater(Less.val | Greater.val),
	LessEqualGreater(Less.val|Equal.val|Greater.val),
	UnorderedEqual(Unordered.val|Equal.val),
	UnorderedLess(Unordered.val|Less.val),
	UnorderedLessEqual(Unordered.val|Less.val|Equal.val),
	UnorderedGreater(Unordered.val|Greater.val),
	UnorderedGreaterEqual(Unordered.val|Greater.val|Equal.val),
	UnorderedLessGreater(Unordered.val|Less.val|Greater.val),
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
		return fromValue(val ^= True.val);
	}

	/** Calculates the inversed (R^-1) relation, i.e., "<" becomes ">" */
	public Relation inversed() {
		return fromValue(binding_irnode.get_inversed_relation(val));
	}
}
