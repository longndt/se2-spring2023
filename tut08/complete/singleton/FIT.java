package complete.singleton;

// Create the FIT class with getInstance method()
public class FIT {
	private static FIT instance = null;
	public String text;

	private FIT() {
		text = "Faculty of Information Technology - Hanoi University";
	}

	public static FIT getInstance() {
		if (instance == null)
			instance = new FIT();
		return instance;
	}
	
	public String toUpper () {
		return text.toUpperCase();
	}
	
	public String toLower () {
		return text.toLowerCase();
	}
}
