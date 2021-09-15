package Unit2_UsingObjects.examples.Motorbike;

public class Motorbike {
    /*
    -horsepower , color
     */

    private int horsepower;
    private String color;

    //Constructors

    public Motorbike(String bikeColor, int superHorsePower){
        color = bikeColor;
        horsepower = superHorsePower;
    }

    public Motorbike(int insaneHorsePower){
        horsepower = insaneHorsePower;
        color = "Black";
    }

    //Methods
    //Add 10 to the horsepower
    private void upgrade(){
        horsepower += 10;
    }
    public void printInfo(){
        System.out.println("Your motorbike will be in a brand new" + color);
        System.out.println("Your super fast bike is " + horsepower + " horspower.");
    }
    //Getters
    public int getHorsepower(){
        return horsepower;
    }

    public String getColor(){
        return color;
    }

    //Setters
    public void setHorsepower(int theHorsepower){
         horsepower = theHorsepower;
    }

    public void setColor(String theColor){
        color = theColor;
    }
}

