package lecture.lec05.creational_patterns.builder;

public class LargeOnionPizza extends VegPizza {
	@Override
	public float price() {
		return 180.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Large size";
	}
}// End of the LargeOnionPizza class.