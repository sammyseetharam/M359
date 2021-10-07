package Unit4_Iteration.examples;

public class Four_Two_Notes {
    public static void main(String[] args) {
        //1. Prints outputs from 0 - 20(inclusive), spaces in between
        for(int i = 0; i <= 20; i+= 2){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //2. Prints outputs from 5 - 100(inclusive, multiples of 5), spaces in between
        for(int i = 5; i <= 100; i += 5){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //3. Every char of a string
        String str = "cookie";
        for(int i = 0; i < str.length(); i ++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println(" ");
        //4. Every char of a string in reverse, NO SPACES
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
