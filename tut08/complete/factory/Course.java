package complete.factory;

// Create an abstract class called Course
abstract class Course {
	protected int duration;
	protected double fee;

	abstract void getDuration();

	abstract void getFeePerSemester();

	public void calculateTotalFee() {
		System.out.println(duration * fee + " $");
	}
} 