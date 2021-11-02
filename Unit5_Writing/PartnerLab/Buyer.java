package Unit5_Writing.PartnerLab;

public class Buyer {
    private String buyerName;
    private int shoeSize;
    private double budget;

    public Buyer(String buyerName, int shoeSize, double budget) {
        this.buyerName = buyerName;
        this.shoeSize = shoeSize;
        this.budget = budget;
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

