package Unit4_Iteration.examples;

public class StringAlgorithmsFour_Three {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i += 2){
            System.out.print(mySchool.charAt(i));
        }
        System.out.println(" ");
        // print the String mySchool in reverse (all characters on the same line)
        for (int i = mySchool.length() - 1; i >= 0 ; i--) {
            System.out.print(mySchool.charAt(i));
        }
         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String str = "monkey";
        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        int count = 0;
        while(true){
         if(phrase.indexOf("little ") >= 0){
             phrase = phrase.substring(phrase.indexOf("little") + 6);
             count++;
         }else{
             break;
         }

         }
        System.out.println("The word \"little\" appears in the phrase " + count + " times.");

        // Print the amount of times the word "little" appears within phrase?



        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        String newString = "";
       boolean iDone = false;
        while(!iDone){
            if(phrase.indexOf("little ") >= 0){
                newString += (phrase.substring(0, phrase.indexOf("little")) + phrase.substring(phrase.indexOf("little") + 6));
            }else{
                iDone = true;
            }
        }
        System.out.println(newString);



        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
    }
}

