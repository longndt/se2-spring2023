package complete.abstract_factory;

//Create the Square concrete class implementing the Shape interface.
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
