import java.util.List;

/**
 * Many teachers and many students.
 * Implements teachers and student using
 * an ArrayList.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public List<Student> getStudents() {
        return students;
    }
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
        totalMoneySpent += moneySpent;
    }
}
