package school;

/**
 * Created by Kevin on 3/12/2017.
 */
public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    // constructor for a transfer student
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    // constructor for a new student
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public void addGrade(int courseCredits, double grade) {

        // get current quality score of student
        double currQualityScore = this.getGpa() * this.getNumberOfCredits();

        // find quality score of grade to add and add that to current quality score
        double qualityScoreOfGradeToAdd = grade * courseCredits;
        double totalQualityScore = currQualityScore + qualityScoreOfGradeToAdd;

        // update the number of credits
        this.setNumberOfCredits(this.getNumberOfCredits() + courseCredits);

        // update the gpa
        this.setGpa(totalQualityScore / this.getNumberOfCredits());
    }

    public String getGradeLevel() {
        // TODO Determine the grade level of the student based on numberOfCredits
        if (this.getNumberOfCredits() < 30) {
            return "Freshman";
        } else if (30 <= this.getNumberOfCredits() & this.getNumberOfCredits() < 60) {
            return "Sophomore";
        } else if (60 <= this.getNumberOfCredits() & this.getNumberOfCredits() < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }



    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public int getStudentId() { return studentId;}

    public void setStudentId(int studentId) { this.studentId = studentId;}

    public int getNumberOfCredits() { return numberOfCredits;}

    public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits;}

    public double getGpa() { return gpa;}

    public void setGpa(double gpa) { this.gpa = gpa;}

    public String toString() {
        return name + " (ID: " + studentId + "; Credits: " + numberOfCredits + "; GPA: " + gpa + ")";
    }

}
