package Unit6_Arrays.CourseExample;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    //constructor for all specified fields
    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    //Constructor for courses without a teacher or a grade (study hall, lunch, etc)
    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        this.teacherName = "NONE";
        this.currentGrade = "NONE";
    }

    public String toString() {
        return "Teacher Name: " + teacherName + "\t" +
                "\nSubject: " + subject + "\t" +
                "\nGrade: " + currentGrade + "\t" +
                "\nPeriod: " + period + "\n";
    }
}
