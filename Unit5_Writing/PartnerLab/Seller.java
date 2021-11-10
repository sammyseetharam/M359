package Unit5_Writing.PartnerLab;

public class Seller {
    private String name;
    private int negotiable = (int)(Math.random()*3);
    private static int numSales;
    private static int numSeller = 0;
    public Seller(String name) {
        int isNegotiable = (int)(Math.random()*3);
        if(){

        }
        this.name = name;
        this.numSales = 0;
        numSeller++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     *@return if the seller is wiling to negotiate price of shoe
     */

    public boolean isNegotiable() {
        return negotiable;
    }

    public static int getNumSales() {
        return numSales;
    }
    public static void setNumSales(int numSales) {
        Seller.numSales = numSales;
    }

    public static void setNumSeller(int numSeller) {
        Seller.numSeller = numSeller;
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