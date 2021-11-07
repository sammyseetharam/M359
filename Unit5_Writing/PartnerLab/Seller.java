package Unit5_Writing.PartnerLab;

public class Seller {
    private String name;
    private boolean negotiable;
    private int numSales;
    private static int numSeller = 0;

    public Seller(String name, boolean negotiable, int numSales) {
        this.name = name;
        this.negotiable = negotiable;
        this.numSales = numSales;
        numSeller++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNegotiable() {
        return negotiable;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }

    public int getNumSales() {
        return numSales;
    }

    public void setNumSales(int numSales) {
        this.numSales = numSales;
    }
    //make toString
    public static int getNumSeller(){
        return numSeller;
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

//const StockXAPI = require('stockx-api');
//const stockX = new StockXAPI();
//
//stockX.newSearchProducts('yeezy', {
//    limit: 5
//})
//.then(products => console.log(products))
//.catch(err => console.log(`Error searching: ${err.message}`));