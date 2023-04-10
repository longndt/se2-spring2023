package complete.abstract_factory;

//Create the RoundedSquare concrete class implementing the Shape interface.
public class RoundedSquare implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}
}
