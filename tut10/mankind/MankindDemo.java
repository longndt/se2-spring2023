package tut10.mankind;

import java.util.Scanner;

public class MankindDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String firstName, lastName;
        int facultyNumber, workHoursPerDay;
        double weekSalary;
        final int dayPerWeek = 7;
        do {
            System.out.println("Select a choice: ");
            System.out.println("1. Student");
            System.out.println("2. Worker");
            System.out.print("Answer: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 2);
        switch (choice) {
            case 1:
                scanner.nextLine(); //clear buffer
                System.out.print("Enter first name: ");
                firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                lastName = scanner.nextLine();
                System.out.print("Enter faculty number: ");
                facultyNumber = scanner.nextInt();
                Student student = new Student(firstName, lastName, facultyNumber);
                System.out.println(student.toString());
                break;
            case 2:
                scanner.nextLine();
                System.out.print("Enter first name: ");
                firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                lastName = scanner.nextLine();
                System.out.print("Enter week salary: ");
                weekSalary = scanner.nextDouble();
                System.out.print("Enter hours per day: ");
                workHoursPerDay = scanner.nextInt();
                Worker worker = new Worker(firstName, lastName, weekSalary, workHoursPerDay);
                System.out.println(worker.toString());
                break;
            default:
                break;
        }
    }
}
