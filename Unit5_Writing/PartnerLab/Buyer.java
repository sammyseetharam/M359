package Unit5_Writing.PartnerLab;

public class Buyer {
    private String buyerName;
    private int shoeSize;
    private double budget;
    private static double bankAmount;
    private static double singleSpent;
    public static int numBuyers = 0;
    public static double totalSpent = 0.0;

    public Buyer(String buyerName, int shoeSize, double budget, double bankAmount) {
        this.buyerName = buyerName;
        this.shoeSize = shoeSize;
        this.budget = budget;
        this.bankAmount = bankAmount;
        numBuyers++;
    }

    public String getName() {
        return buyerName;
    }
    public void setName(String name) {
        this.buyerName = name;
    }
    public int getShoeSize() {
        return shoeSize;
    }
    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public static double getBankAmount() {
        return bankAmount;
    }
    public static void setBankAmount(double bankAmount) {
        Buyer.bankAmount = bankAmount;
    }
    public static int getnumBuyers(){ return numBuyers;}
    public static void setTotalSpent(double totalSpent) {
        Buyer.totalSpent = totalSpent;
    }
    public String getBuyerName() {
        return buyerName;
    }
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
    public static double getSingleSpent() {
        return singleSpent;
    }
    public static void setSingleSpent(double singleSpent) {
        Buyer.singleSpent = singleSpent;
    }

    /**
     * This method is called when all the customers have baught something and/or left the store
     * @return the average amount of money a customer spends when buying the shoe
     */

    public static double averagePrice(){
        double average= (double)Buyer.totalSpent/Buyer.getnumBuyers();
        return average;
    }

    /**
     * This method informs the user about the buyer's shoe size, name, and budget
     *
     * @return the summary of the info for the Buyer
     */
    public String toString(){
        String output = "";
        output += "Name: " + buyerName + '\n' +
                "Shoe Size : " + shoeSize + '\n' +
                "Buyer Budget: $" + budget + '\n' +
                "TOTAL BANK BALANCE: $" + Buyer.getBankAmount();
        return output;
        //add bank amount
    }

}
