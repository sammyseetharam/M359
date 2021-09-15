package Unit2_UsingObjects.examples;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";

        //.toUpperCase returns s1 as an all caps word while still maintaining the same string
        System.out.println(s1.toUpperCase());
        //Just regularly prints s1
        System.out.println(s1);
        //Returns the index of the letter in the s2 string
        System.out.println(s2.indexOf("u"));
        System.out.println(s2.indexOf("x"));
        //Includes the letter at the 4th index with the rest of the string
        System.out.println(s1.substring(4));
        //Includes the letter at the 2nd index and stops before the 5th index
        System.out.println(s1.substring(2, 5));
        //Returns the number of characters in the string s1
        System.out.println(s1.length());
        //Returns the number of characters in the string s2 including spaces
        System.out.println(s2.length());
        //Returns if the s1 equals the string "vacation", false because its all caps
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);
        //Declaration of the isEqual but also returns if s1 equals the string true because its normal
        isEqual = s1.equals("Vacation");
        System.out.println(isEqual);
        //retruns true because using the uppercase method makes it eqaul to VACATION
        isEqual = s1.toUpperCase().equals("VACATION");
        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        //Compares them alphabetically
        System.out.println(s3.compareTo(s4));
        //Compares them lexicographically and the unicode value of the stings
        System.out.println(s3.compareTo(s3));
        //Returns 0 because they're equal
        System.out.println(s4.compareTo(s3));
        //Returns 8 because s4 is greater?
        System.out.println(s5.compareTo(s3));
        //Possibly because its an uppercase
        //Lowercase comes after uppercase in the ASCII table
        System.out.println("I love " + "M" + "3" + "5" + "9");
        //Returns a string concatenation
        System.out.println("I love " + "M" + (3 + 5 + 9));
        //Adds 359 because its in parentheses and then concatenates it
        System.out.println(24 + 56 + " Days of School");
        //Adds 24 to 56 because its in front, and then concatenates it to the string
        System.out.println("Days of School: " + 24 + 56);
        //Concatenates everything because a string is in front.
    }
}
