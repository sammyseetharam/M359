package Unit4_Iteration.lab;

public class PigLatin {

    public static String toPigLatin(String phrase){
        String finalResult = "";
        while(phrase.indexOf(' ') > 0){
            finalResult += translateWordToPigLatin(phrase.substring(0, phrase.indexOf(' ')));
            phrase = phrase.substring(phrase.indexOf(' '));
        }
        return finalResult; 
    }

    public static String translateWordToPigLatin(String str){
        String result = "";
        if(ifVowel(str) == true){
            //translates vowels to pig latin
            result = str + "yay";
        }else{
            //translates a consonant to pig latin
            result = str.substring(1) + str.substring(0, 1) + "ay";
        }
        return result;
    }

    public static boolean ifVowel(String str) {
        String vowelList = "aeiouAEIOU";
        boolean checkCondition = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == vowelList.charAt(i)) {
                checkCondition = true;
            } else {
                checkCondition = false;
            }
        }
        return checkCondition;
    }


}

