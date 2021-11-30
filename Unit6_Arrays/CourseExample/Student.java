package Unit6_Arrays.CourseExample;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name) {
        this.name = name;
        myClasses = new Course[8]; //8 periods a day}
    }

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    //write a toString method that will print the students name and all of the course objects

    public String toString() {
        String output = "Name: " + name + "\n" + "\nCourses: " + "" + "\n" + "\n";

        if (this.myClasses[0] != null) {

            for (int i = 0; i < myClasses.length; i++) {
                output += myClasses[i] + "\n";
            }
            return output;
        } else {
            output += "HAS NO COURSES YET\n";
        }
        return output;
    }
}