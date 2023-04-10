package complete.factory;

// Create the Admission class to generate object of sub-classes
class Admission {
	// use admittingCourse method to get object of type Course
	public Course admittingCourse(String courseName) {
		if (courseName == null) {
			return null;
		}
		if (courseName.equalsIgnoreCase("Computer")) {
			return new Computer();
		} else if (courseName.equalsIgnoreCase("CivilService")) {
			return new CivilService();
		} else if (courseName.equalsIgnoreCase("Health")) {
			return new Health();
		}
		return null;
	}
}