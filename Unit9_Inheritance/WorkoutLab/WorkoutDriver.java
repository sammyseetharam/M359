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

    public static void workoutSummary(int input, WorkoutPlan plan){
        System.out.println("*** CONGRATULATIONS! ***");
        System.out.println("You have completed your " + input + " week program!");
        System.out.println("Here is a summary of your entire plan: \n");
        System.out.println(plan.printProgress());
        System.out.println();
        System.out.println("We hope you continue to progress towards your fitness goals :)");
    }

    public static void scheduleWeeks(){
        int input = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey, welcome to the program, how many weeks would you like to schedule for: ");

            try {
                input = userInput.nextInt();
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

                        for(int i = 0; i < input; i++) {
                            //Scanner nextWeek = new Scanner(System.in);
                            System.out.println("Type " + "\"Start\"" + " to complete one week of workouts:");
                            userInput.next();
                            String user = userInput.nextLine();
                            System.out.println();
                            while (user.equalsIgnoreCase("Start") == false) {
                                System.out.println("Not ready? Don't worry, you've got this!");
                                System.out.println();
                                System.out.println("Type " + "\"Start\"" + " to complete one week of workouts:");
                                user = userInput.nextLine();
                                System.out.println();
                            }
                            if(i == input - 1){
                                wkPlan.workoutNextWeek(i);
                                System.out.println();
                                workoutSummary(input, wkPlan);
                                break;
                            }else{
                                wkPlan.workoutNextWeek(i);
                                System.out.println();
                                System.out.println(wkPlan.printProgress());
                                System.out.println();
                            }
                        }
                    }
            } catch (InputMismatchException e) {
                System.out.println("You didn't type an integer. Please try again.");
                userInput.nextInt();
            }
    }
}
