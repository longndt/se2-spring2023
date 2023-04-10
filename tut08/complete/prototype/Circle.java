package complete.prototype;

//Create the Circle concrete class which extends the Shape abstract class
public class Circle extends Shape {

	   public Circle(){
	     type = "Circle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
	}
