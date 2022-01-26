package Unit7_ArrayList.examples;

public class ScrambleWordFRQ {
    public static void main(String[] args) {
        System.out.println(scrambleWord("ABRACADABRA"));
    }

    public static String scrambleWord(String word){
        int curIndex = 0;
        String result = "";

        while(curIndex < word.length() - 1){
            String curLetter = word.substring(curIndex, curIndex + 1);
            String nextLetter = word.substring(curIndex + 1, curIndex + 2);

            if(curLetter.equals("A")){

            }
        }
        return result;
    }
}
