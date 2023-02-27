package lecture.lec05.creational_patterns.builder;

public class LargeCheezePizza extends VegPizza {
	@Override
	public float price() {
		return 260.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}
}
//End of the LargeCheezePizza class.
