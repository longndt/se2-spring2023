package to_dos.abstract_factory;

/* Create ShapeFactory class extending AbstractFactory to generate 
 * object of concrete class based on given information. 
 */

public class ShapeFactory extends AbstractFactory {
	// TO-DO: Implement the getShape() method
	@Override
	public Shape getShape(String shapeType) {
		/*
		 * check for the shape type is equal to 'Rectangle' or 'Square' (ignore case)
		 * then return the corresponding type
		 */
		return null;
	}
}
