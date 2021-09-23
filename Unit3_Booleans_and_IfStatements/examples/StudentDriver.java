package Unit3_Booleans_and_IfStatements.examples;

public class StudentDriver {
    public static void main(String[] args) {
        StudentClass st1 = new StudentClass("Lebron", "James", 232323);
        StudentClass st2 = new StudentClass("Steph", "Curry", 303030);
        StudentClass st3 = new StudentClass("Luka", "Doncic", 777777);

        System.out.println(st1.equals(st2));
        System.out.println(st2.equals(st3));
        System.out.println(st1.equals(st1));

        System.out.println(st1.compareTo(st2));
        System.out.println(st2.compareTo(st3));
    }
}
