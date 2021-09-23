package Unit3_Booleans_and_IfStatements.Lab;

public class ChevyClass {
    //instance variables

    //year, mileage, fuel efficiency, price, model, color, luxury package status, 4WD package status, and sports package status (constructor is in this same order!)
    //Vehicle Constants: vehicle make of “Chevrolet”, tax rate of 12.2%, appropriate luxury package price increase, sports price increase, and fuel efficiency deduction (see calcPrice() method description)

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


}
