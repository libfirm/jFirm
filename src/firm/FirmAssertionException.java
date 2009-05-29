package firm;

@SuppressWarnings("serial")
public class FirmAssertionException extends RuntimeException {
	
	private final int lineNr;
	private final String file;
	private final String expr;

	public FirmAssertionException(String expr, String file, int lineNr) {
		super();
		this.expr = expr;
		this.file = file;
		this.lineNr = lineNr;
	}

	@Override
	public String getMessage() {
		return "Failed assert('" + expr + "') in " + file + ":" + lineNr;
	}
	
}