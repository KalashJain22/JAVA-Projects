import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private int gradeYear;
    private String studentID;
    private List<String> courses = new ArrayList<>();
    private int tuitionBalance = 0;
    private static final int costOfCourse = 600;
    private static int id = 1000;
    private static final Scanner input = new Scanner(System.in);

    public Student() {
        System.out.print("\nEnter student's name: ");
        this.name = input.nextLine();
        System.out.println("1 - freshmen\n2 - sophomore\n3 - junior\n4 - senior");
        System.out.print("Enter student's grade year: ");
        this.gradeYear = input.nextInt();
        input.nextLine();
        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        String course;
        System.out.println();
        while (true) {
            System.out.print("Enter the course you want to enroll in (Q to exit): ");
            course = input.nextLine();
            if (course.equalsIgnoreCase("Q")) {
                break;
            }
            if (!courses.contains(course)) {
                courses.add(course);
                tuitionBalance += costOfCourse;
            } else {
                System.out.println("You are already enrolled in " + course);
            }
        }
    }

    public void viewBalance() {
        System.out.println("Your balance is: Rs." + tuitionBalance);
    }

    public void payTuition() {
        System.out.println();
        viewBalance();
        System.out.print("Enter the amount you want to pay: Rs.");
        int payment = input.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for payment of Rs." + payment);
        viewBalance();
        input.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", courses=" + courses +
                ", tuitionBalance=" + tuitionBalance +
                ", gradeYear=" + gradeYear +
                '}';
    }
}
