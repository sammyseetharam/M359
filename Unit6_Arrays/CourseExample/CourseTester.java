package Unit6_Arrays.CourseExample;

public class CourseTester {
    public static void main(String[] args) {
        Course java = new Course("Mr.Moon", "AP JAVA", "A+", 3);
        System.out.println(java.toString());
        System.out.println();
        String name = "Jeffery";
        System.out.println();
        Course per1 = new Course("O'donell", "english", "A", 1);
        Course per2 = new Course("carlson", "chemisty", "A", 2);
        Course per3 = new Course("moon", "java", "A", 3);
        Course per4 = new Course("matarattzo", "gym", "A", 4);
        Course per5 = new Course("study hall", 5);
        Course per6 = new Course("crosse", "comp repair", "A", 6);
        Course per7 = new Course("piggott", "trig", "A", 7);
        Course per8 = new Course("spanish", "houchins", "A", 8);

        Course[] sched = {per1, per2, per3, per4, per5, per6, per7, per8};

        Student st1 = new Student("Jefferey", sched);
        System.out.println(st1);

        Student st2 = new Student(name);
        System.out.println(st2);

    }
}
