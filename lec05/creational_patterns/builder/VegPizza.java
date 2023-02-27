package lecture.lec05.creational_patterns.builder;

public abstract class VegPizza extends Pizza {
	@Override
	public abstract float price();

	@Override
	public abstract String name();

	@Override
	public abstract String size();
}// End of the abstract class VegPizza.
