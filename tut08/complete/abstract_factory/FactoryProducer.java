package complete.abstract_factory;

/* Create a Factory generator/producer class to get factories 
 * by passing an information such as Shape
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
