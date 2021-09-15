package Unit2_UsingObjects.homework.ws1;

public class Fruit {
    private String name;
    private boolean status;
    private int servings;

    public Fruit(String fruitName, boolean fruitRipe, int aNumber){
        name = fruitName;
        status = fruitRipe;
        servings = aNumber;
    }
    public Fruit(String aName, boolean isRipe){
        name = aName;
        status = isRipe;
        servings = 1;
    }

    //methods
    public void printInfo(){
        System.out.println("Name:" + name);
        System.out.println("Ripe :" + status);
        System.out.println("Number of servings:" + servings);
        System.out.println(" ");

}

    //Getters
    public int getNumServings(){
        return servings;

    }

    public String getGuestName(){
        return name;
    }

    //setters
    public void setNumServings(int numXServings){
        servings = numXServings;
    }
}
