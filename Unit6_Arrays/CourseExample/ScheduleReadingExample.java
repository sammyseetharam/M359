package Unit6_Arrays.CourseExample;


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ScheduleReadingExample  {
    public static void main(String[] args) throws FileNotFoundException {
        //Access the data
        File scheduleData = new File("scheduleData.txt");
        //Read the data
        Scanner readme = new Scanner(scheduleData);

        //The very first line in the number of students in the class
        int numStudents = readme.nextInt();
        readme.nextLine();
        System.out.println("There are " + numStudents + " students in this class.");
        System.out.println();

        //Create an array of appropriate size
        Student[] myStudents = new Student[numStudents];

        int studentCount = 0;
        //While the file does have the next line
        while(readme.hasNextLine()){
            //read in the students name

            String studentName = readme.nextLine();
            Course[] allClasses = new Course[8];
            for (int i = 0; i < 8; i++) {
                //code to read in classes
                    //Reads and sticks the classes into mollys courses
                Course myNewCourse = new Course(readme.nextLine(), //teacher
                                                readme.nextLine(), //subject
                                                readme.nextLine(), //grade
                                                readme.nextInt()); //period

                if(readme.hasNextLine()) {
                    readme.nextLine();
                }
                allClasses[i] = myNewCourse;

            }
            myStudents[studentCount] = new Student(studentName, allClasses);
            studentCount++;

            printAllStudentSchedules(myStudents);
            }
        }

    public static void printAllStudentSchedules(Student[] allStudents){
        for (Student s:allStudents) {
            if(s != null){
                System.out.println(s);
                System.out.println();
            }
        }
    }
}
