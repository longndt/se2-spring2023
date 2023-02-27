package lecture.lec05.creational_patterns.abstractfactory;

public class SBI implements Bank {
	private final String BNAME;

	public SBI() {
		BNAME = "SBI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
