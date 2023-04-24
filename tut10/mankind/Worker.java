package tut10.mankind;

public class Worker extends Human{
    private double weekSalary;
    private int workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

    private double salaryPerHour () {
        return weekSalary / (workHoursPerDay * 7);
    }

    @Override
    public String toString() {
        return "Worker {" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", weekSalary='" + weekSalary + '\'' +
                ", workHoursPerDay='" + workHoursPerDay + '\'' +
                ", salaryPerHour='" + salaryPerHour() + '\'' +
                '}';
    }
}
