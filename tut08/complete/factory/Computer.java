package complete.factory;

// Create Computer class that extends Courses abstract class 
class Computer extends Course {
	// @override
	public void getDuration() {
		duration = 8; // duration in semesters
		System.out.println(duration + " semesters");
	}

	public void getFeePerSemester() {
		fee = 3000; // fee in dollars
		System.out.println(fee + " $");
	}
} 
