package Unit3_Booleans_and_IfStatements.examples;

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    public Pizza(String nameStore, int numIN, int toppings, boolean ifdeepdish) {
        store = nameStore;
        inches = numIN;
        numToppings = toppings;
        isDeepDish = ifdeepdish;
    }

    //No toppings constructor
    public Pizza(String nameStore, int numIN, boolean ifdeepdish) {
        store = nameStore;
        inches = numIN;
        numToppings = 0;
        isDeepDish = ifdeepdish;
    }

    //Get and set methods
    //Setters

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public String getStore() {
        return store;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public boolean isEquals(String string1, String string2) {
        return string1.equals(string2);
    }
    //Only for the store

    //Can't do this.store == pizza2.store because this '==' does not work for non primitive types
    public boolean sameStore(Pizza pizza2) {
        return (this.store.equals(pizza2.store));
    }

    //A method that returns string
    public String toString() {

        String output = ("The store is: " + store);
        output += ("\nIt has " + inches + " inches");
        output += ("\nIt has " + numToppings + " toppings");
        output += ("\nIs it deep dish? " + isDeepDish);

        return output;
    }

    public boolean equals(Pizza other){
        //Longer version
        return this.inches == other.inches;
    }
    public boolean areThePizzasEqual(Pizza pizza2){
        return(this.store.equals(pizza2.store) && this.inches == pizza2.inches && this.numToppings == pizza2.numToppings && this.isDeepDish == pizza2.isDeepDish);
    }

    //return neg if it comes before, return pos if it comes after, return 0 if same
    public int compareTo(Pizza other){
        //no matter what it subtracts them
        return (this.inches - other.inches);
    }
}


