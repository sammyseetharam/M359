package Unit5_Writing.PartnerLab;


// Students : Kuldeep Debnath and Samahith Seetharam
// Teacher : Mr.Moon, Period 3

public class Buyer {
    private String buyerName;
    private int shoeSize;
    private double budget;
    private double bankAmount;

    public Buyer(String buyerName, int shoeSize, double budget, double bankAmount) {
        this.buyerName = buyerName;
        this.shoeSize = shoeSize;
        this.budget = budget;
        this.bankAmount = bankAmount;
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
    // make toString

    /**
     * This method informs the user about the buyer's shoe size, name, and budget
     *
     * @return the summary of the info for the Buyer
     */
    public String toString(){
        String output = "";
        output += "Buyer: " + buyerName + '\n' +
                "Shoe Size : " + shoeSize + '\n' +
                "Buyer Budget: $" + budget +
                "Bank Balance : " + bankAmount + '\n';
        return output;
    }

}


