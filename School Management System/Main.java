import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher tea1 = new Teacher(1, "Samar", 500);
        Teacher tea2 = new Teacher(2, "Manisha", 700);
        Teacher tea3 = new Teacher(3, "Vineet", 600);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(tea1);
        teacherList.add(tea2);
        teacherList.add(tea3);

        Student std1 = new Student(1, "Ram", 4);
        Student std2 = new Student(2, "Aman", 12);
        Student std3 = new Student(3, "Manya", 7);
        List<Student> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);

        School mps = new School(teacherList, studentList);

        Teacher tea4 = new Teacher(4, "Sanjeev", 900);
        mps.addTeachers(tea4);
        Student std4 = new Student(4, "Tanya", 9);
        mps.addStudents(std4);

        System.out.println();
        std1.payFees(15000);
        std2.payFees(35000);
        std3.payFees(9000);
        System.out.println("\nTotal fees of the " + std1.getName() + " is Rs." + std1.getFeesTotal());
        System.out.println("Fees paid by the " + std2.getName() + " is Rs." + std2.getFeesPaid());
        System.out.println("Remaining fees of the " + std3.getName() + " is Rs." + std3.getRemainingFees());

        System.out.println("\nMPS has total earned of Rs." + mps.getTotalMoneyEarned());

        System.out.println("\n------Making School pay Teacher's Salary------");

        tea1.receiveSalary(tea1.getSalary());
        System.out.println("MPS has spent Rs." + tea1.getSalary() + " for salary to " + tea1.getName());
        tea2.receiveSalary(tea2.getSalary());
        System.out.println("MPS has spent Rs." + tea2.getSalary() + " for salary to " + tea2.getName());
        tea3.receiveSalary(tea3.getSalary());
        System.out.println("MPS has spent Rs." + tea3.getSalary() + " for salary to " + tea3.getName());

        System.out.println("\nMPS total earned left is Rs." + mps.getTotalMoneyEarned());
    }
}
