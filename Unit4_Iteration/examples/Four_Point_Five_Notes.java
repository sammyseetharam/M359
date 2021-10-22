package Unit4_Iteration.examples;

import java.sql.SQLOutput;

public class Four_Point_Five_Notes {
    public static void outputBreak(String name) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(name);
        System.out.println();
    }

    //Challenge #3

    public static void everyOtherLetterPyramid(String str){

        while(str.length() > 1) {
            System.out.println(str);
            String temp = "";
            for (int i = 0; i < str.length(); i += 2) {
                temp += str.charAt(i);
            }
            str = temp;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        //Challenge #1 use 2 loops to generate the following output
        outputBreak("This is challenge 1");
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        outputBreak("This is challenge #2");
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        outputBreak("This is challenge #3");
        everyOtherLetterPyramid("FremdVikings");


    }
}

