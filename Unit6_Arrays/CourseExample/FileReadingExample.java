package Unit6_Arrays.CourseExample;

/**
 * This will show us how to access a txt file and read data
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//When opening a file make sure you remember the "throws" exception and the import statement
public class FileReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("courseData.txt");
        Scanner fileIn = new Scanner(myFile);

        String teacherName = fileIn.nextLine(); //Vlaming
        String subject = fileIn.nextLine(); //Basketball PE
        int period = fileIn.nextInt();  //Period
        fileIn.nextLine();
        String grade = fileIn.nextLine(); 

        //char grade = fileIn.next().charAt(0); //Grade

        //Opens the file and reads it
        System.out.println(teacherName);
        System.out.println(subject);
        System.out.println(period);
        System.out.println(grade);



    }
}
