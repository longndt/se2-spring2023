package complete.factory;

// Create the CivilService class that extends Course abstract class 
class CivilService extends Course {
	// @override
	public void getDuration() {
		duration = 6; // duration in semesters
		System.out.println(duration + " semesters");
	}

	public void getFeePerSemester() {
		fee = 2000; // fee in dollars
		System.out.println(fee + " $");
	}
} 