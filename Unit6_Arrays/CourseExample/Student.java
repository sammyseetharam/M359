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

}
