package firm;

/**
 * Helper class simplifying the handling of Cmp result (Proj-) numbers
 * @author matze
 */
public enum CompareResult {
	False(0),
	Equal(1),
	Less(2),
	Greater(4),
	Unordered(8),
	LessEqual(Less.num | Equal.num),
	GreaterEqual(Greater.num | Equal.num),
	LessGreater(Less.num | Greater.num),
	LessGreaterEqual(Less.num | Greater.num | Equal.num),
	UnorderedEqual(Unordered.num | Equal.num),
	UnorderedLess(Unordered.num | Less.num),
	UnorderedLessEqual(Unordered.num | Less.num | Equal.num),
	UnorderedGreater(Unordered.num | Greater.num),
	UnorderedGreaterEqual(Unordered.num | Greater.num | Equal.num),
	UnorderedLessGreater(Unordered.num | Less.num | Greater.num),
	UnorderedLessGreaterEqual(Unordered.num | Less.num | Greater.num | Equal.num)
	;
	
	private int num;
	private static CompareResult[] fromInt = new CompareResult[] {
		False,
		Equal,
		Less,
		LessEqual,
		Greater,
		GreaterEqual,
		LessGreater,
		LessGreaterEqual,
		Unordered,
		UnorderedEqual,
		UnorderedLess,
		UnorderedLessEqual,
		UnorderedGreater,
		UnorderedGreaterEqual,
		UnorderedLessGreater,
		UnorderedLessGreaterEqual
	};
	
	private CompareResult(int num) {
		this.num = num;
	}
	
	public int asProjNum() {
		return num;
	}	
	
	public static CompareResult fromProjNum(int pn) {
		return fromInt[pn];
	}
	
	/**
	 * Calculates a negated pnc condition (ie. a&lt;b becomes a&gt;=b)
	 */
	public CompareResult getNegated(Mode mode) {
		int newn = num ^ UnorderedLessGreaterEqual.num;
		if (!mode.isFloat())
			newn &= ~Unordered.num;
		return fromProjNum(newn);
	}
	
	/**
	 * Calculates the inversed pnc condition (ie. a&lt;b becomes a&gt;b)
	 */
	public CompareResult getInverse() {
		int newn = num & ~(Less.num | Greater.num);
		if ((num & Less.num) != 0)
			newn |= Greater.num;
		if ((num & Greater.num) != 0)
			newn |= Less.num;
		return fromProjNum(newn);
	}
	
	/**
	 * return true if the result fullfills all specifis of the other.
	 * (ie. GreaterEqual.fullfills(Greater) gives true) 
	 */
	public boolean fullFills(CompareResult condition) {
		return (condition.num & num) != 0;
	}
}
