import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of new Students to enroll: ");
        int num = input.nextInt();
        Student[] students = new Student[num];

        for(int i = 0; i < num; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
