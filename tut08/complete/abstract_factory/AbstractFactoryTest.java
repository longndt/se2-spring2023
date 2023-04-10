package complete.abstract_factory;

/* Create the AbstractFactoryTest class which uses the FactoryProducer 
 * to get AbstractFactory in order to get factories 
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
	// TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		// get an object of Shape Rectangle
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		// call draw method of Shape Rectangle
		shape1.draw();
		// get an object of Shape Square
		Shape shape2 = shapeFactory.getShape("SQUARE");
		// call draw method of Shape Square
		shape2.draw();
		// get shape factory
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		// get an object of Shape Rectangle
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		// call draw method of Shape Rectangle
		shape3.draw();
		// get an object of Shape Square
		Shape shape4 = shapeFactory1.getShape("SQUARE");
		// call draw method of Shape Square
		shape4.draw();

	}
}