package Unit5_Writing.PartnerLab;

public class Buyer {
    private String buyerName;
    private int shoeSize;
    private double budget;
    private double bankAmount;
    public static int numBuyers = 0;
    public static double totalBudget = 0.0;

    public Buyer(String buyerName, int shoeSize, double budget, double bankAmount) {
        this.buyerName = buyerName;
        this.shoeSize = shoeSize;
        this.budget = budget;
        this.bankAmount = bankAmount;
        numBuyers++;
        totalBudget += budget;
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

    public double getBankAmount() {
        return bankAmount;
    }

    public void setBankAmount(double bankAmount) {
        this.bankAmount = bankAmount;
    }

    public static double averagePrice(){
        return totalBudget/numBuyers;
    }
    // make toString

    /**
     * This method informs the user about the buyer's shoe size, name, and budget
     *
     * @return the summary of the info for the Buyer
     */
    public String toString(){
        String output = "";
        output += "Name: " + buyerName + '\n' +
                    "Shoe Size : " + shoeSize + '\n' +
                    "Buyer Budget: $" + budget;
        return output;
    }

}

