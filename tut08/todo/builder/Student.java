package to_dos.builder;

//Create the Student class with a static nested (inner class)
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	private String course;

	//TO-DO: Implement the constructor
	public Student(StudentBuilder studentBuilder) {
 
	}

	//TO-DO: Implement GETTERs & SETTERs for given attributes
 
	//TO-DO: Implement toString() method to display student's information
	@Override
	public String toString() {
		return null; 
	}
	
	// Create the StudentBuilder inner class
	public static class StudentBuilder {
		//TO-DO: Initialize the similar attributes with Student class

		//TO-DO: Implement the constructor
		public StudentBuilder(int id, String firstName, String lastName) {
		}

		//TO-DO: Implement the 3 below methods
		public StudentBuilder withOptionalAge(int age) {
			return null;
		}

		public StudentBuilder withOptionalPhone(String phone) {
			return null;
		}

		public StudentBuilder withOptionalAddress(String address) {
			return null;
		}

		public Student buildStudent() {
			validateStudentData();
			return new Student(this);
		}

		private boolean validateStudentData() {
			// Validation process, check if student is registered in the database
			return true;
		}
	}
}
