package Unit2_UsingObjects.examples;

import org.w3c.dom.ls.LSOutput;

public class Student {
    //name, grade, gpa
    //Instance Variables
    private String name;
    private int grade;
    private double GPA;

    public Student(String studentName, int gradeLevel, double gradePointAverage){
        name = studentName;
        grade = gradeLevel;
        GPA = gradePointAverage;
    }
    //Freshmen
    public Student(String freshmanName){
        grade = 9;
        GPA = -1;
    }

}

