package complete.singleton;

// Create the FIT_Test for testing purpose
public class FIT_Test {
	public static void main(String args[]) {
		FIT fit1 = FIT.getInstance();
		FIT fit2 = FIT.getInstance();
		//Display text in upper case
		System.out.println("FIT in upper case : " + fit1.toUpper());
		//Display text in lower case
		System.out.println("FIT in lowercase : " + fit2.toLower());
	}
}
