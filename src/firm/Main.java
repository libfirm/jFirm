package firm;

/* Test libFirm bindings */
public class Main {
	public static void main(String[] args) {
		System.out.printf("Version: %1s.%2s\n", Firm.getMinorVersion(), Firm.getMajorVersion());

		Ident ident = new Ident("main");
		System.out.println("Ident: " + ident);
		
		Mode iu = Mode.getIu();
		System.out.println("IuName: " + iu.getName() + " Bits: " + iu.getSizeBits());
	}
}
