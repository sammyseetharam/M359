package Unit4_Iteration.examples;

import java.sql.SQLOutput;

public class Four_Point_Five_Notes {
    public static void outputBreak(String name){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(name);
        System.out.println();
    }

    public static void everOtherLetterPyramid(String str) {
        boolean isDone = true;

            while(isDone){
                System.out.println(str);
                for (int i = str.length() - 1; i > 0 ; i-=2) {
                    for (int j = 0; j <= i; j+= 2) {
                        System.out.print(str.charAt(j));
                    }
                    System.out.println();
                }
                isDone = false;
            }

            //Class code

        String orgStr = str;
        System.out.println();
        }
    public static void main(String[] args) {
        everOtherLetterPyramid("FremdVikings");
        System.out.println();
        //Challenge #1
        outputBreak("Challenge 1: Two for loops to go from 1 - 5 in decrementing order");
        //Runs a total of 5 - 1 times in parent loop
        //The value j Runs from 1 - value of i, and prints out j each time
        for (int i = 5; i > 0  ; i--) {
            for (int j = 1; j <= i ;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //Challenge #2
        outputBreak("Challenge 2: Two for loops to print a number its correlating amount of times in decrementing order");
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //Challenge #3



    }
}
