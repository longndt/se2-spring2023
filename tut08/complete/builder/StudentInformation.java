package complete.builder;

public class StudentInformation {
	public static void main(String[] args) {
		Student stu1 = new Student.StudentBuilder(12341, "Jack", "Harrison").withOptionalAddress("Address")
				.withOptionalAge(21).withOptionalPhone("874116073648").buildStudent();
		System.out.println("Student : " + stu1.toString());
		Student stu2 = new Student.StudentBuilder(1225, "Diana", "Daniels").withOptionalAge(18).buildStudent();
		System.out.println("Student : " + stu2.toString());
	}
}
