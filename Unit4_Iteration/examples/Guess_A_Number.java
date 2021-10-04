package Unit4_Iteration.examples;

import java.util.Scanner;

public class Guess_A_Number {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int reply;
            boolean isDone = false;
            double total = 0;
            int count = 0;
            int theNumber = (int)(Math.random() * 10) + 1;
            System.out.println("Test purposes " + theNumber);
            while(!isDone){
                //Prompt the user
                System.out.println("Guess a number from 1 - 10?");
                reply = input.nextInt();
                //if so ask user to enter
                //add score to the total
                if(reply > 0 && reply <= 10) {
                    if (reply < theNumber) {
                        count++;
                        System.out.println("Your number is too low");
                    }
                    else if (reply > theNumber) {
                        count++;
                        System.out.println("Your number is too high");
                    }else{
                        count++;
                        isDone = true;
                        System.out.println("Congrats you have the number!  You guessed the number " + theNumber + " in " + count);
                    }
                }else{
                    System.out.println("Your number is not in range");
                }
            }
        }
}


