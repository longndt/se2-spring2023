package lecture.lec05.creational_patterns.builder;

public class MediumCheezePizza extends VegPizza {
	@Override
	public float price() {
		return 220.f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Medium Size";
	}
}// End of the MediumCheezePizza class.
