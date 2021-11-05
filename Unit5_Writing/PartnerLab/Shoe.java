package Unit5_Writing.PartnerLab;

public class Shoe {
    private String shoeName;
    private double retailPrice;
    private String colorway;
    private double size;
    private boolean isNew;
    private String releaseDate;
    public static int numShoes = 0;
    private final double TAX = .10;

    //A price has not been set yet for the shoe
    public Shoe(String shoeName, String colorway, double size, boolean isNew, String releaseDate) {
        this.shoeName = shoeName;
        retailPrice = 0;
        this.colorway = colorway;
        this.size = size;
        this.isNew = isNew;
        this.releaseDate = releaseDate;
        numShoes++;
    }
    //constructor for all the values
    public Shoe(String shoeName, double retailPrice, String colorway, double size, boolean isNew, String releaseDate) {
        this.shoeName = shoeName;
        this.retailPrice = retailPrice;
        this.colorway = colorway;
        this.size = size;
        this.isNew = isNew;
        this.releaseDate = releaseDate;
        numShoes++;
    }
    public String toString(){
        String output = "";
        output += "\nName: " + shoeName + "\nRetail Price: $" + retailPrice + "\nColor Way: " + colorway + "\nSize: " + size + "\nIs it new? : " + isNew + "\nRelease Date: " + releaseDate + "\n";
        return output;
    }

    public String getShoeName() {
        return shoeName;
    }
    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }
    public double getRetailPrice() {
        return retailPrice;
    }
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    public String getColorway() {
        return colorway;
    }
    public void setColorway(String colorway) {
        this.colorway = colorway;
    }
    public double getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isNew() {
        return isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public static int getNumShoes(){return numShoes;}
    public double getTAX(){
        return TAX;
    }
}

