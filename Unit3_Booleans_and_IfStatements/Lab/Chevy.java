package Unit3_Booleans_and_IfStatements.Lab;

public class Chevy {
    //instance variables
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private int price;
    private String model;
    private String color;
    private boolean luxPackageStatus;
    private boolean fourWDPack;
    private boolean sportsPack;
    //constants
    final private String make = "Chevrolet";
    final private double taxRate = .122; //percentage as a double
    final private double luxRate = 0.2; //percentage as a double
    final private int fourWDRate = 3500;
    final private double sprtRate = 0.15;
    final private double sprtFuel = 0.2;
    //default constructor
    public Chevy(){
        year = 2021;
        mileage = 0;
        color = "White";
        model = "Trax";
        fuelEfficiency = 35;
        price = 16000;
        luxPackageStatus = false;
        fourWDPack = false;
        sportsPack = false;
    }
    //Full Constructor
    public Chevy(int year, int mileage, double fuelEfficiency, int price, String model, String color, boolean luxPackageStatus, boolean fourWDPack, boolean sportsPack) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.price = price;
        this.model = model;
        this.color = color;
        this.luxPackageStatus = luxPackageStatus;
        this.fourWDPack = fourWDPack;
        this.sportsPack = sportsPack;
    }
    //compareTo method
    public double compareTo(Chevy other){
        return(this.price - other.price);
    }
    //equals method
    public boolean equals(Chevy other){
        if(this.model.equals(other.model) && this.color.equals(other.color)){
            if(this.mileage < 200 && other.mileage < 200 ||
               this.mileage >= 200 && other.mileage >= 200){
            return true;
            }
        }
        return false;
    }
    //toString method
    public String toString(){
        String toString = year + " " + make + " " + model + " " + "(" + color + ")";
        toString += "\n\tPRICE\t\t" + "$" + price;
        toString += "\n\tMILES\t\t" + mileage;
        toString += "\n\tFUEL EFFICIENCY\t" + fuelEfficiency + " mpg";
        toString += "\n\tPACKAGES:";

        if(luxPackageStatus == true){
            toString += "\n\t-Luxury Package";
        }
        if(fourWDPack == true){
            toString += "\n\t-4WD Package";
        }
        else if(sportsPack == true){
            toString += "\n\t-Sports Package";
        }else{
            toString += "\n\t-None";
        }
        return toString;
    }
    //CalcPrice method
    public double calcPrice(Chevy other){
        double taxPrice = other.price;
        if(other.luxPackageStatus == true){
            taxPrice += (taxPrice * luxRate);
        }
        if(other.fourWDPack == true){
            taxPrice += fourWDRate;
        }
        if(other.sportsPack == true){
            taxPrice += (taxPrice * sprtRate);
            other.fuelEfficiency -= (other.fuelEfficiency * sprtFuel);
        }
        return taxPrice += (taxPrice * taxRate);
    }
    //Getters and Setters
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isLuxPackageStatus() {
        return luxPackageStatus;
    }
    public void setLuxPackageStatus(boolean luxPackageStatus) {
        this.luxPackageStatus = luxPackageStatus;
    }
    public boolean isFourWDPack() {
        return fourWDPack;
    }
    public void setFourWDPack(boolean fourWDPack) {
        this.fourWDPack = fourWDPack;
    }
    public boolean isSportsPack() {
        return sportsPack;
    }
    public void setSportsPack(boolean sportsPack) {
        this.sportsPack = sportsPack;
    }
}

