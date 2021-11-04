package Unit5_Writing.PartnerLab;

// Students : Kuldeep Debnath and Samahith Seetharam
// Teacher : Mr.Moon, Period 3

public class Seller {
    private String name;
    private Shoe theShoe;
    private boolean negotiable;
    private static int numShoesSold= 0;

    public Seller(String name, Shoe theShoe, boolean negotiable) {
        this.name = name;
        this.theShoe = theShoe;
        this.negotiable = negotiable;
        numShoesSold++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shoe getTheShoe() {
        return theShoe;
    }

    public void setTheShoe(Shoe theShoe) {
        this.theShoe = theShoe;
    }

    public boolean isNegotiable() {
        return negotiable;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }
//
//    public int getNumSales() {
//        return numSales;
//    }
//
//    public void setNumSales(int numSales) {
//        this.numSales = numSales;
//    }
    //make toString
    public static int getNumShoesSold(){
        return numShoesSold;
    }


    /**
     * This method informs the user about the seller's credibility, name, inventory, and
     *
     * @return the summary of the info for the Seller
     */
    public String toString(){
        String output = "";
        output += "Seller: " + name + "\nShoe(s) available: " + theShoe.getShoeName() + "\nWilling to bargain: " + negotiable + "\nTotal number of sales: " + numShoesSold;
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