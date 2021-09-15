package Unit2_UsingObjects.homework.ws1;

public class FruitTester {
    public static void main(String [] args){
        System.out.println("Hello World");

        Fruit myFruit1 = new Fruit("mango", true, 2);
        myFruit1.printInfo();

        int numServingsFruit1 = myFruit1.getNumServings();
        System.out.println("myFruit1 can serve" + numServingsFruit1);
        System.out.println(" ");

        String numServingsFruit2 = myFruit1.getGuestName();

        Fruit myFruit2 = new Fruit ("apple", false, 1);

        myFruit2.setNumServings(3);
        myFruit2.printInfo();
    }
}
