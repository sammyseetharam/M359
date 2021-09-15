package Unit1_PrimitiveTypes.examples;

public class LearningIntellij{
    public static void main(String[] args) {
        System.out.println("Hi Java");
        System.out.println("Code completion is pretty cool");

        //(int) forces it to loose information

        double x = 9 / 4;

        System.out.print(x);
        //^Looses data

        x = 6;
        int y = 5;
        double z = 1/0;

        double result1 = (x / (y + z));
        //GitHub Test
        //prints 1.0 and 2.0

    }
}
