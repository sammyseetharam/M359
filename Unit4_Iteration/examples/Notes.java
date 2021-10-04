package Unit4_Iteration.examples;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reply = " ";
        boolean isDone = false;
        double total = 0;
        int count = 0;

        while(!isDone){
            //Prompt the user

            System.out.println("Do you have a score to enter? (Y or N) ");
            reply = input.nextLine();

            //if so ask user to enter
            //add score to the total
            if(reply.equalsIgnoreCase("y")){
                //The have a score to add
                System.out.println("What is your next score?");
                int nextNum = input.nextInt();
                total += nextNum;
                count++;
                input.nextLine();
            }else{
                //Breaks out of the while loop
                isDone = true;
            }
        }
        System.out.println("Total sum of all numbers: " + total);
        System.out.println("Total count of all numbers: " + count);
        double avg = (double) total/count;
        System.out.println("The average is: " + avg + "%");
    }
}
