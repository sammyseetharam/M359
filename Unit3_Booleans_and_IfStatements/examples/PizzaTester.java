package Unit3_Booleans_and_IfStatements.examples;

public class PizzaTester {
    public static void main(String[] args) {
        //Instance Variables
        Pizza myNewPizza = new Pizza("papaJohns", 12, 4, false);
        Pizza myNewPizza2 = new Pizza("papaJohns", 10, 2, false);

        //Prints if two pizzas are from the same store
        System.out.println("Are the pizzas from the same store: " + myNewPizza.sameStore(myNewPizza2));
        System.out.println();
        //Prints myNewPizza's info
        System.out.println("Pizza 1: " + myNewPizza.toString());
        System.out.println();
        //Prints myNewPizza2's info
        System.out.println("Pizza 2: " + myNewPizza2.toString());
        System.out.println();
        //Prints if both pizzas are the same in all attributes
        System.out.println("Are the pizzas completely the same: " + myNewPizza.areThePizzasEqual(myNewPizza2));
        //Prints if the have the same inches
        System.out.println("Are they the same size? " + myNewPizza.equals(myNewPizza2));
        //Prints how much they differ by
        System.out.println("How much do they differ by? " + myNewPizza.compareTo(myNewPizza2));
    }
}
