package Unit2_UsingObjects.examples;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Your name is: " + name);

        System.out.println("What is your age?");
        int age = input.nextInt();

        System.out.println("Your age is " + age);

        System.out.println("What is your gpa? ");
        double gpa = input.nextDouble();

        System.out.println("Your gpa is: " + gpa);
    }
}
