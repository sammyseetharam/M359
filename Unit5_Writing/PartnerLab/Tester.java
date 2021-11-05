package Unit5_Writing.PartnerLab;

import java.sql.SQLOutput;
import java.util.Scanner;

// Students : Kuldeep Debnath and Samahith Seetharam
// Teacher : Mr.Moon, Period 3

public class Tester {
    /*
     *This method adds a divider between sections of text
     *@return a space and a line divider between texts
     */
    public static void addDivider(){
        System.out.println( "\n------------------------\n");
    }
    public static void main(String[] args){
        //Shoe info:
        System.out.println("Welcome to Kuldeep's Sneaker Store: ");
        addDivider();
        Shoe mochas = new Shoe("Jordan 1 Mocha", 545.00, "MOCHA/BLACK/BROWN/WHITE", 10, true, "10/31/2020");
        System.out.println(mochas);

        //Buyer info:
        addDivider();
        Buyer Sammy = new Buyer("Sammy", 11, 200.00, 600.00);
        System.out.println(Sammy);

        addDivider();
        //Seller Info:
        Seller Kuldeep = new Seller("Kuldeep", mochas, true, 3);
        System.out.println(Kuldeep);
        addDivider();

        //Bargain Method:
        bargain(Sammy,Kuldeep,mochas);

        addDivider();

        System.out.println("After customers left, Kuldeep decided to crunch some numbers");
        System.out.println("He concluded that the average customer spends about: $" + Buyer.averagePrice());


    }
    // budget of buyer
    // negotiable or not
    // add total sales
    // inventory and num size shoe
    //bargain method
    // sell method


    /**
     * This method allows for the buyer to negotiate
     * @param buyer the buyer is the person who will purchase the shoe by deducting their money and obtaioning the shoe
     * @param seller the seller will sell his show in exhacnge for moeny via the buyer's bnk account
     * @param shoe the shoe is the object being trandsferd form the seller to the buyer, each one is different
     * @return
     */
// add specification for shoe size
    // has the shor
    // not the size
    public static String bargain(Buyer buyer,Seller seller, Shoe shoe){
        String output = "";
        Scanner buyerInput = new Scanner(System.in);
        System.out.println("Does " + buyer.getName() + " want to bargain? : (y/n)");
        String name = buyerInput.nextLine(); // input is a scanner

        Scanner sellerInput = new Scanner(System.in);
        System.out.println("Is " + seller.getName() + " willing to bargain? : (y/n)");
        String bank = sellerInput.nextLine(); // input is a scanner
        boolean isDone = true;
        while (isDone) {
            if (name.equals("y") && bank.equals("y")) {
                // asks buyer for desried price
                Scanner buyerPrice = new Scanner(System.in);
                System.out.println("What price would " + buyer.getName() + " like?");
                // add buyer name
                double price = buyerInput.nextDouble(); // input is a scanner

                //asks seller if they are ok wiht it
                System.out.println("Is " + seller.getName() + " willing to go to this price?: (y/n)");
                String sellerTalk = sellerInput.nextLine();
                if (sellerTalk.equals("y")) {
                    shoe.setRetailPrice(price);
                    Buyer.totalSpent += price;
                    System.out.println(shoe.getShoeName() + " has been marked down to $" + shoe.getRetailPrice());
                    if(shoe.getRetailPrice() > buyer.getBudget()) {
                        System.out.println("Unfortunately the shoes are out of your budget. Try negotiating again");
                        isDone = false;
                        // maybe add a part where they can increase thier budget till the bank AMount?
                    }

                } else if (sellerTalk.equals("n")) {
                    System.out.println("The seller decided not to negotiate ");
                    isDone = false;
                } else {
                    System.out.println("Seller doesn't like that price, try again");
                    buyerInput.nextDouble();
                }

            } else {
                System.out.println("Seller does not want to negotiate");
                isDone = false;
            }

            Scanner input = new Scanner(System.in);
            System.out.println("\nDo you want to bargain more? : (y/n)");
            String finalResult = input.nextLine(); // input is a scanner
            if(finalResult.equals("y")){
                isDone = true;
            }else{
                isDone = false;
                output += (sellShoe(buyer, seller, shoe));
            }
        }
        return output;
    }

    //sell method add

    /**
     * This method sells the Shoe object to the buyer
     * It deducts the price from the buyers budget
     * @param buyer
     * @param seller
     * @param shoe
     * @return
     */
    public static String sellShoe(Buyer buyer ,Seller seller, Shoe shoe){
        String result = buyer.getName() + " has bought " + shoe.getShoeName() + " from " + seller.getName();
        double newBalance = buyer.getBankAmount() - shoe.getRetailPrice();
        buyer.setBankAmount(newBalance);
        result += " for $" + shoe.getRetailPrice();
        System.out.println(result);
        return " ";
        // ask sammy how to add and remove form inventory
    }
}
