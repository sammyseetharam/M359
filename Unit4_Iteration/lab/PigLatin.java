package Unit4_Iteration.lab;

import java.util.Locale;

public class PigLatin {
    //This method translates the whole phrase to pigLatin
    public static String toPigLatin(String phrase) {
        String finalResult = "";
        phrase = phrase + " ";
        boolean isDone = false;
        //This while loop was created to find a space and then translate each word. It then added that to a blank string to create a fully translated phrase.
        while (!isDone) {
            if (phrase.indexOf(' ') > 0) {
                finalResult += translateWordToPigLatin(phrase.substring(0, phrase.indexOf(' ')));
                finalResult += " ";
                phrase = phrase.substring(phrase.indexOf(' ') + 1);
            } else {
                isDone = true;
            }
        }
        //I had to create this extra string to make sure the beginning of the phrase started with a capital letter and everything else was lower case.
        String firstLetter = finalResult.substring(0,1).toUpperCase();
        finalResult = firstLetter + finalResult.substring(1).toLowerCase();
        return finalResult;
    }

    //This method accepts a single letter and translates it to pig latin.
    public static String translateWordToPigLatin(String str) {
        String result = "";
        if (ifVowel(str) == true) {
            //Translates words that start with a vowel to pig latin
            result += str + "yay";
        } else {
            //translates a word that starts with CONS0NANT to pig latin
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    result += str.substring(i) + str.substring(0, i) + "ay";
                    break;
                }
            }
        }
        return result;
    }
    //This method check is a string starts with a vowel or not.
    //I originally iterated through a string of the vowels, but it wasn't working for some reason so used this longer way.
    public static boolean ifVowel(String str){
        if(str.substring(0,1).equals("a") || str.substring(0,1).equals("A")||
                str.substring(0,1).equals("e") || str.substring(0,1).equals("E") ||
                str.substring(0,1).equals("i") || str.substring(0,1).equals("I") ||
                str.substring(0,1).equals("o") || str.substring(0,1).equals("O") ||
                str.substring(0,1).equals("u") || str.substring(0,1).equals("U")){
            return true;
        }else{
            return false;
        }
    }
}





