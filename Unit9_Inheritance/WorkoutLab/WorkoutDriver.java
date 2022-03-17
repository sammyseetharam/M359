package Unit9_Inheritance.WorkoutLab;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        System.out.println("************************************************");
        System.out.println("*** Welcome to your customized workout plan! ***");
        System.out.println("************************************************");
        System.out.println();
        scheduleWeeks();
    }

    public static void scheduleWeeks(){
        int input = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey, welcome to the program, how many weeks would you like to schedule for: ");

        boolean isDone = true;

        while (isDone) {
            try {
                input = userInput.nextInt();
                while (isDone == true) {

                    if (input < 0) {
                        System.out.println("Your input was out of bounds, please Try again: ");
                        input = userInput.nextInt();
                    }
                    if (input >= 0 ) {
                        System.out.println();
                        System.out.println("Great, let's take a look at your " + input + " week schedule!");
                        System.out.println();
                        WorkoutPlan wkPlan = new WorkoutPlan(input);
                        System.out.println();
                        System.out.println("Time to start to working out!");
                        System.out.println();
                        Scanner nextWeek = new Scanner(System.in);
                        System.out.println("Type" + "\"Start\"" +  " to complete one week of workouts:");
                        userInput.next(); 
                        input = userInput.nextInt();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You didn't type an integer. Please try again.");
                userInput.next();
            }
        }
    }
}
