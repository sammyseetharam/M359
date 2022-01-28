package Unit7_ArrayList.TicketMasterLab;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
       userFlow();
    }

    public static void choices() {
        System.out.println();
        System.out.println("Pick a filter: ");
        System.out.println("\t" + "1. Sort A-Z");
        System.out.println("\t" + "2. Sort Z-A");
        System.out.println("\t" + "3. Sort by Price Low-High");
        System.out.println("\t" + "4. Sort by Price High-Low");
        System.out.println("\t" + "5. Search by City");
        System.out.println("\t" + "6. End");
    }

    public static void userFlow() throws FileNotFoundException{
        System.out.println("******** Welcome to the Official Ticket Master Program ********");
        System.out.println();
        TicketMaster master = new TicketMaster();
        master.fillArrayList();
        choices();
        System.out.println();

        System.out.print("Pick an option: ");
        int input = 0;
        Scanner userInput = new Scanner(System.in);

        while (input < 1 || input > 6){
            try {
                input = userInput.nextInt();

                if(input < 1 || input > 6){
                    System.out.println("Your input was out of range. Please Try again: ");
                    choices();
                    input = userInput.nextInt();
                }
                if (input >= 1 || input <= 6) {
                    //more to be added
                    if(input == 1){
                        master.selectionSortA_Z();
                        System.out.println(master);
                        choices();
                        input = 0;
                    }

                    if(input == 2){
                        master.selectionSortZ_A();
                        System.out.println(master);
                        choices();
                        input = 0;
                    }

                    if(input == 3){
                        master.insertionSortL_H();
                        System.out.println(master);
                        choices();
                        input = 0;
                    }

                    if(input == 4){
                        System.out.println("Sorry, we are under maintenance for this feature :(");
                        choices();
                        input = 0;
                    }

                    if (input == 5) {
                        System.out.println("**** These are all of our available tickets in ALL cities ****");
                        System.out.println();
                        System.out.println(master);
                        System.out.println(master.citySearch());
                        choices();
                        input = 0;
                    }

                    if(input == 6){
                        System.out.println("Have a nice day!");
                        choices();
                        break;
                    }
                }else{
                    while(input < 1 || input > 6){
                        System.out.println("Your input was invalid. Try again: ");
                        userInput.nextInt();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You didn't type an integer. Please try again.");
                userInput.next();
            }
        }

    }

}
