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

    /**
     * @param input The number of weeks the workout plan is to be printed
     * @param plan The workout plan object also used to print information about the plan
     * This method is used at the very end of the program to print a final summary and congratulations message.
     */
    public static void workoutSummary(int input, WorkoutPlan plan){
        System.out.println("*** CONGRATULATIONS! ***");
        System.out.println("You have completed your " + input + " week program!");
        System.out.println("Here is a summary of your entire plan: \n");
        System.out.println(plan.printProgress());
        System.out.println();
        System.out.println("We hope you continue to progress towards your fitness goals :)");
    }

    /**
     * This method controls the functionality of the whole program and takes in user input to create objects and
     * access other classed. It also uses a try/ catch system and many if/else statements to find bad inputs.
     * This is all controlled through a big while loop as well!
     */
    public static void scheduleWeeks(){
        int input = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey, welcome to the program, how many weeks would you like to schedule for: ");
        boolean tryAgain = true;

        while(tryAgain){
        try {
                input = userInput.nextInt();
                    if (input > 0 ) {
                        tryAgain = false;
                        System.out.println();
                        System.out.println("Great, let's take a look at your " + input + " week schedule!");
                        System.out.println();
                        WorkoutPlan wkPlan = new WorkoutPlan(input);
                        System.out.println();

                        System.out.println("Time to start to working out!");
                        System.out.println();
                        for(int i = 0; i < input; i++) {
                            System.out.println("Type " + "\"Start\"" + " to complete one week of workouts:");
                            String user = userInput.next();
                            while (!user.equalsIgnoreCase("Start") ) {
                                System.out.println("Not ready? Don't worry, you've got this!");
                                System.out.println("Type " + "\"Start\"" + " to complete one week of workouts:");
                                user = userInput.next();
                                System.out.println();
                            }
                            if(i == input - 1){
                                wkPlan.workoutNextWeek(i);
                                System.out.println();
                                workoutSummary(input, wkPlan);
                                userInput.close();
                                break;
                            }else{
                                wkPlan.workoutNextWeek(i);
                                System.out.println();
                                System.out.println(wkPlan.printProgress());
                                System.out.println();
                            }
                        }
                    }else{
                        System.out.println("The number you entered was out of bounds. Type in a VALID integer for the number of weeks: ");
                        userInput.nextInt();
                    }
            }catch (InputMismatchException e) {
                System.out.println("You didn't type an integer, please try again.");
                System.out.println("Enter how many weeks you would like to schedule: ");
                userInput.nextLine();
            }
        }
    }
}
