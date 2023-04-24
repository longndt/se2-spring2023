package tut10.mankind;

public class Student extends Human{
    private int facultyNumber;

    public Student(String firstName, String lastName, int facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", facultyNumber='" + getFacultyNumber() + '\'' +
                '}';
    }
}
