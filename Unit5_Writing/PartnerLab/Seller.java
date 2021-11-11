package Unit5_Writing.PartnerLab;

public class Seller {
    private String name;
    private boolean negotiable;
    private static int numSales;

    public Seller(String name, boolean negotiable) {
        this.name = name;
        this.negotiable = negotiable;
        this.numSales = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getNumSales() {
        return numSales;
    }
    public static void setNumSales(int numSales) {
        Seller.numSales = numSales;
    }
    public boolean isNegotiable() {
        return negotiable;
    }
    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }

    /**
     * This method informs the user about the seller's credibility, name, inventory, and
     *
     * @return the summary of the info for the Seller
     */
    public String toString(){
        String output = "";
        output += "Name: " + name +  "\nWilling to bargain: " + negotiable + "\nTotal number of sales: " + numSales;
        return output;
    }
}
