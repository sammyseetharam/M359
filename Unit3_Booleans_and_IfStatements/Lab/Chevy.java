package Unit3_Booleans_and_IfStatements.Lab;
import java.text.DecimalFormat; //for extra credit

public class Chevy {
    //instance variables
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double price;
    private String model;
    private String color;
    private boolean luxPackageStatus;
    private boolean fourWDPack;
    private boolean sportsPack;
    //constants
    final public String make = "Chevrolet";
    final public double taxRate = .122; //percentage as a double
    final public double luxRate = 0.2; //percentage as a double
    final public int fourWDRate = 3500;
    final public double sprtRate = 0.15;
    final public double sprtFuel = 0.2;
    //default constructor
    public Chevy(){
        year = 2021;
        mileage = 0;
        color = "White";
        model = "Trax";
        fuelEfficiency = 35;
        price = 16000.0;
        luxPackageStatus = false;
        fourWDPack = false;
        sportsPack = false;
    }
    //Full Constructor
    public Chevy(int year, int mileage, double fuelEfficiency, double price, String model, String color, boolean luxPackageStatus, boolean fourWDPack, boolean sportsPack) {
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
        return(this.calcPrice() - other.calcPrice());
    }
    //equals method
    public boolean equals(Chevy other){
        int num = 0;
        if(this.model.equals(other.model) && this.color.equals(other.color)){
            if(this.mileage < 200 && other.mileage < 200 ||
               this.mileage >= 200 && other.mileage >= 200){
            return true;
            }
        }
        return false;
    }
    //toString method
    //the two string method should return the price with the tax and lux packages
    public String toString(){
        //for extra credit
        DecimalFormat order = new DecimalFormat("###.00");
        String toString = year + " " + make + " " + model + " " + "(" + color + ")";
        toString += "\n\tPRICE:\t\t\t\t" + "$" + order.format(calcPrice());
        toString += "\n\tMILES:\t\t\t\t" + mileage;
        toString += "\n\tFUEL EFFICIENCY:\t" + fuelEfficiency + " mpg";
        toString += "\n\tPACKAGES:";

        if(luxPackageStatus == true){
            toString += "\n\t\t-Luxury Package";
        }
        if(fourWDPack == true){
            toString += "\n\t\t-4WD Package";
        }
        else if(sportsPack == true){
            toString += "\n\t\t-Sports Package";
        }else{
            toString += "\n\t\t-None";
        }
        return toString;
    }
    //CalcPrice method
    public double calcPrice(){
        double orgPrice = this.price;
        if(this.luxPackageStatus == true) {
            orgPrice += this.price * luxRate;
        }if(this.fourWDPack == true){
            orgPrice += fourWDRate;
        }if(this.sportsPack == true){
            orgPrice += (this.price * sprtRate);
            this.fuelEfficiency -= (this.fuelEfficiency * sprtFuel);
        }
        return orgPrice += (orgPrice * taxRate);
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
    public double getPrice() {
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

