package Unit5_Writing.PartnerLab;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static void welcomeToTheStore(Buyer buyer, Seller seller) {
        Shoe mochas = new Shoe("Jordan 1 Mocha (mochas)", 545.00, "MOCHA/BLACK/BROWN/WHITE", 10, true, "10/31/2020");
        Shoe ultraBoosts = new Shoe("Adidas UBs 4.0 GOT Targaryen Dragons (ultraBoosts)", 244, "BLACK/FIREORANGE/INFERNO", 11, true, "03/22/2019");
        Shoe dunks = new Shoe("Nike Dunk Low Retros (dunks)", 265, "WHITE/BLACK", 9.5, true, "03/10/2021");
        Shoe yeezy = new Shoe("Adidas Yeezy Boost 350 V2 (yeezy)", 150, "ZYON", 10.5, false, "07/18/2020");
        Shoe breds = new Shoe("Jordan 1 Retro Breds (breds)", 971.00, "BLACK/VARSITY/RED-WHITE", 9, true, "09/03/2016");
        Shoe[] inventory = {mochas, ultraBoosts, dunks, yeezy, breds};

        Scanner welcomeMessage = new Scanner(System.in);
        boolean isDone = false;
        while (isDone != true) {
            System.out.println("Do you want to buy a pair of shoes? (Y/N)");
            String inp = welcomeMessage.nextLine();
            System.out.println(" ");
            if (inp.equalsIgnoreCase("y")) {
                Scanner sizeCheck = new Scanner(System.in);
                System.out.println("Sounds good, what size are you?");
                double size = sizeCheck.nextDouble();
                System.out.println(" ");
                if(size == 9 || size == 9.5 || size == 10 || size == 10.5 || size == 11) {
                    Scanner askShoe = new Scanner(System.in);
                    System.out.println("Cool, do any of these pairs interest you? (Enter shoe name like this: mochas)");
                    System.out.println(Arrays.toString(inventory));
                    System.out.println("Enter here: ");
                    String interest = askShoe.nextLine();
                    System.out.println(" ");
                    if (interest.equalsIgnoreCase("mochas")) {
                        bargain(buyer, seller, mochas);
                    }
                    if (interest.equalsIgnoreCase("ultraBoosts")) {
                        bargain(buyer, seller, ultraBoosts);
                    }
                    if (interest.equalsIgnoreCase("dunks")) {
                        bargain(buyer, seller, dunks);
                    }
                    if (interest.equalsIgnoreCase("yeezy")) {
                        bargain(buyer, seller, yeezy);
                    }
                    if (interest.equalsIgnoreCase("breds")) {
                        bargain(buyer, seller, breds);
                    }
                    isDone = true;
                } else {
                    System.out.println("Sorry, we don't have your size :(");
                    System.out.println("Let us know if you need anything!");
                    isDone = true;
                }
            } else {
                System.out.println("Okay, let us know if you need anything!");
                isDone = true;
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome to Kuldeep's Meet - Up Sneaker Store: ");
        addDivider();

        //Buyer info:
        System.out.println("CUSTOMER INFO: ");
        Buyer Sammy = new Buyer("Sammy", 11, 200.00, 600.00);
        System.out.println(Sammy);

        addDivider();

        //Seller Info:
        System.out.println("SELLER INFO:");
        Seller Kuldeep = new Seller("Kuldeep", true, 3);
        System.out.println(Kuldeep);

        addDivider();

        //new buyer

        //Bargain Method:
        welcomeToTheStore(Sammy, Kuldeep);
        addDivider();
        /*
        System.out.println("NEXT CUSTOMER INFO: ");
        Buyer Jeff = new Buyer("Jeff", 9, 500.00, 1000.00);
        System.out.println(Jeff);
        welcomeToTheStore(Jeff, Kuldeep);
        addDivider();
        */

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
     * @param buyer the buyer is the person who will purchase the shoe by deducting their money and obtaining the shoe
     * @param seller the seller will sell his show in exchange for money via the buyer's bnk account
     * @param shoe the shoe is the object being transfered from the seller to the buyer, each one is different
     * @return
     */
// add specification for shoe size
    // has the shor
    // not the size
    public static String bargain(Buyer buyer,Seller seller, Shoe shoe){
        String output = "";

        Scanner buyerInput = new Scanner(System.in);
        System.out.println("Does " + buyer.getName() + " want to bargain for the  " + shoe.getShoeName() + "? (y/n)");
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

                //asks seller if they are ok with it
                System.out.println("Is " + seller.getName() + " willing to go to this price?: (y/n)");
                String sellerTalk = sellerInput.nextLine();
                if (sellerTalk.equals("y")) {
                    shoe.setRetailPrice(price);
                    Buyer.totalSpent += price;
                    System.out.println(shoe.getShoeName() + " has been marked down to $" + shoe.getRetailPrice());
                    if(shoe.getRetailPrice() > buyer.getBudget()) {
                        System.out.println("Unfortunately the shoes are out of your budget. Try negotiating again");
                        isDone = false;
                        // maybe add a part where they can increase their budget till the bank AMount?
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
        System.out.println(buyer.getBankAmount());
        result += " for $" + shoe.getRetailPrice();
        //add updated bank balance 
        System.out.println(result);
        return " ";
        // ask sammy how to add and remove form inventory
    }
}
