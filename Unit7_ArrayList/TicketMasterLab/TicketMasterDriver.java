package Unit7_ArrayList.TicketMasterLab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
       userFlow();
    }

    public static void choices() {
        System.out.println("Pick a filter: ");
        System.out.println("\t" + "1. Sort A-Z");
        System.out.println("\t" + "2. Sort Z-A");
        System.out.println("\t" + "3. Sort by Price Low-High");
        System.out.println("\t" + "4. Sort by Price High-Low");
        System.out.println("\t" + "5. Search by City");
        System.out.println("\t" + "6. End");
    }

    public static void userFlow() throws FileNotFoundException{
        TicketMaster master = new TicketMaster();
        master.fillArrayList();
        System.out.println("********Welcome to the Official Ticket Master Program********");
        System.out.println();
        choices();
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        int input = 6;
        boolean isDone = true;

        while (isDone == true) {
            System.out.print("Pick an option: ");
            try {
                input = userInput.nextInt();
                isDone = false;
                if (input < 1 || input > 6) {
                    System.out.println("Your input was out of range. Please try again.");
                    isDone = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("You didn't type an integer. Please try again.");
                userInput.next();
            }
        }

        //more to be added
        if(input == 1){
            System.out.println("Sorry, we are under maintenance for this feature :(");
        }

        if(input == 2){
            System.out.println("Sorry, we are under maintenance for this feature :(");
        }

        if(input == 3){
            System.out.println("Sorry, we are under maintenance for this feature :(");
        }

        if(input == 4){
            System.out.println("Sorry, we are under maintenance for this feature :(");
        }

        if (input == 5) {
            System.out.println("**** These are all of our available tickets in ALL cities ****");
            System.out.println();
            System.out.println(master);
            master.citySearch();

        }

        if(input == 6){
            System.out.println("Have a nice day!");
        }
    }

}
