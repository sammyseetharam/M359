package Unit7_ArrayList.examples;

import java.util.Scanner;


public class TryCatchBlock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] myNums = {1,2,3,4};

        try{
            //int x = 5 / 0;
            System.out.println(myNums[4]);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Invalid Index");
        }
        catch (ArithmeticException a){
            System.out.println("Cannot divide by 0");
        }
        catch(Exception e){
            System.out.println("Something went wrong and caused an exception!");
        }

        }


}
