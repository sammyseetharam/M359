package Unit4_Iteration.lab;

public class PigLatin {

    public static String toPigLatin(String phrase) {
        String finalResult = "";
        phrase = phrase + " ";
        boolean isDone = false;

        while (!isDone) {
            if (phrase.indexOf(' ') > 0) {
                finalResult += translateWordToPigLatin(phrase.substring(0, phrase.indexOf(' ')));
                finalResult += " ";
                phrase = phrase.substring(phrase.indexOf(' ') + 1);
            } else {
                isDone = true;
            }
        }
        return finalResult;
    }

    public static String translateWordToPigLatin(String str) {
        String result = "";
        if (ifVowel(str) == true) {
            //translates vowels to pig latin
            result = str + "yay";
        } else {
            //translates a consonant to pig latin
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    result += str.substring(i) + str.substring(0, i) + "ay";
                    break;
                }
            }
        }
        return result;
    }

        public static boolean ifVowel(String str){
            String vowelList = "aeiouAEIOU";
            boolean checkCondition = false;
            for (int i = 0; i < vowelList.length(); i++) {
                if (str.charAt(0) == vowelList.charAt(i)) {
                    checkCondition = true;
                }else{
                    checkCondition = false; 
                }
            }
            return checkCondition;
        }
}




