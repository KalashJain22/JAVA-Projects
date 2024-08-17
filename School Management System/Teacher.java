/**
 * This class is responsible for keeping
 * the track of teacher's name, id & salary.
 */
public class Teacher {
     private int id;
     private String name;
     private int salary;
     private int salaryEarned;

    /**
     * Creates a new teacher's object.
     * Salary earned is initially is 0.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * Used to update the new salary of the teacher.
     * @param salary new salary of the teacher.
     */
    public void setSalary(int salary) {
        this.salary += salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public int getSalaryEarned() {
        return salaryEarned;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
