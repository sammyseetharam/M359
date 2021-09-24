package Unit3_Booleans_and_IfStatements.Lab;

public class ChevyClass {
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
    final private double taxRate = .122 * this.price; //percentage as a double
    final private double luxRate = 0.2 * this.price; //percentage as a double
    final private int fourWDRate = 3500 + this.price;
    final private double sprtRate = 0.15 * this.price;
    final private double sprtFuel = this.fuelEfficiency - (this.fuelEfficiency * 0.2);
    //default constructor
    public ChevyClass(){
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
    public ChevyClass(int year, int mileage, double fuelEfficiency, int price, String model, String color, boolean luxPackageStatus, boolean fourWDPack, boolean sportsPack) {
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
    public boolean compareTo(ChevyClass other){
        return(this.price == other.price);
    }
    //equals method
    public String equals(ChevyClass other){
        if(this.model.equals(other.model) && this.color.equals(other.color)){
            if(this.mileage < 200 && other.mileage < 200 ||
               this.mileage >= 200 && other.mileage >= 200){
            return "equal";
            }
        }
        return "not equal";
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
        if(sportsPack == true){
            toString += "\n\t-Sports Package";
        }else{
            toString += "\n\t-None";
        }
        return toString;
    }





}

