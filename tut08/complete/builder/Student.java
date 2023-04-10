package complete.builder;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	private String course;

	public Student(StudentBuilder studentBuilder) {
		this.id = studentBuilder.id;
		this.firstName = studentBuilder.firstName;
		this.lastName = studentBuilder.lastName;
		this.age = studentBuilder.age;
		this.phone = studentBuilder.phone;
		this.address = studentBuilder.address;
		this.course = studentBuilder.course;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getCourse() {
		return course;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", age=" + age + ", phone='" + phone + '\'' + ", address='" + address + '\'' + ", course='" + course
				+ '\'' + '}';
	}

	public static class StudentBuilder {
		private int id;
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;
		private String course;

		public StudentBuilder(int id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public StudentBuilder withOptionalAge(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder withOptionalPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public StudentBuilder withOptionalAddress(String address) {
			this.address = address;
			return this;
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
