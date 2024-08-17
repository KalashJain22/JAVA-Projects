/**
 * This class is responsible to keeping
 * the track of student's name, id, grade
 * & total fees and fees paid.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    /**
     * To create a new Student by initializing.
     * Fees for every student is Rs.30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {
        this.feesTotal = 30000;
        this.feesPaid = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Used to update the new grade of the student..
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        if(fees > getRemainingFees()){
            System.out.println("You are paying more than remaining fees.");
            return;
        } else {
            feesPaid += fees;
            System.out.println("Successfully paid Rs." + fees);
        }

        School.updateTotalMoneyEarned(fees);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getFeesPaid() {
        return feesPaid;
    }
}
