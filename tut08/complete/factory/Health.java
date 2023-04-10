package complete.factory;

// Create the Health classes that extends Course abstract class 
class Health extends Course {
	// @override
	public void getDuration() {
		duration = 10; // duration in semesters
		System.out.println(duration + " semesters");
	}

	public void getFeePerSemester() {
		fee = 5000; // fee in dollars
		System.out.println(fee + " $");
	}
} 