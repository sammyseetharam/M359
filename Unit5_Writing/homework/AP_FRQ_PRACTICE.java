package Unit5_Writing.homework;

public class AP_FRQ_PRACTICE {
    public static String getHint(String input) {
        String result = "";
        String word = "HARPS";
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            temp += input.charAt(i);
            if (input.charAt(i) == word.charAt(i)) {
                result += input.charAt(i);
            } else if (word.indexOf(temp) > -1) {
                result += "+";
            } else {
                result += "*";
                temp = "";
            }
        }
        return result;
    }


        public static void main (String[]args){
            System.out.println("The result is " + getHint("HARMS"));
        }
    }

