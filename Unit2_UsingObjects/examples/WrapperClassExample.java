package Unit2_UsingObjects.examples;

public class WrapperClassExample {
    public static void main(String[] args) {

        //Creates a wrappedInt
        Integer wrappedX = new Integer(7);
        //Extract the value from inside wrappedX
        int insideValue = wrappedX.intValue();
        //Print out the new int
        System.out.println(insideValue);
        //Autoboxing and boxing
        Integer newWrapped = 9; //Exactly the same as
                                //Integer wrappedX = new Integer(7);

        System.out.println(newWrapped);

        //1. Create a double variable using autoboxing
        //Then print it
        //Noob way
        Double wrappedY = new Double(3.4);
        double insideY = wrappedY.doubleValue();
        System.out.println(insideY);

        //Cool way: autoboxing & auto - unboxing
        Double newY = 3.4;
        System.out.println(newY);

        //2. Print the min and max ints
        int newWrap;
        System.out.println("Min value for this class: " + Integer.MIN_VALUE);
        System.out.println("Max value for this class: " + Integer.MAX_VALUE);
    }
}
