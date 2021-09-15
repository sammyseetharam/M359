package Unit2_UsingObjects.PracticeQuiz;

public class Toy
{
    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the toy name and price
    private String aToy;
    private double price;


    // *** WRITE CODE HERE ***
    // Part B
    //Setters
    public void setToy(String setToy){
        aToy = setToy;
    }

    public void setPrice(double setPrice){
        price = setPrice;
    }
    //Getters
    public String getToy(){
        return aToy;
    }

    public double getPrice(){
        return price;
    }
    // Create getters & setters for all instance variables


    // *** WRITE CODE HERE ***
    // Part C
    // Create a full constructor that accepts each instance
    // variable as a parameter
    public Toy(String theToy, double thePrice){
        aToy = theToy;
        price = thePrice;
    }

    // *** WRITE CODE HERE ***
    // Part D
    // Create a calcTotal method that adds a 10% tax to the
    // price and returns the total cost

    public double calcTotal(){
        return price + (price * 0.1);
    }

}
