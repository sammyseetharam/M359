package Unit5_Writing.PartnerLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Students : Kuldeep Debnath and Samahith Seetharam
// Teacher : Mr.Moon, Period 3

public class Tester {
    /**
     * This method just divides lines of output
     */
    public static void addDivider(){
        System.out.println( "\n------------------------\n");
    }
    //Code for the static array (inventory) of all of the shoes we have available
    public static Shoe mochas = new Shoe("Jordan 1 Mocha (mochas)", 545.00, "MOCHA/BLACK/BROWN/WHITE", 10, true, "10/31/2020");
    public static Shoe ultraBoosts = new Shoe("Adidas UBs 4.0 GOT Targaryen Dragons (ultraBoosts)", 244, "BLACK/FIREORANGE/INFERNO", 11, true, "03/22/2019");
    public static Shoe dunks = new Shoe("Nike Dunk Low Retros (dunks)", 265, "WHITE/BLACK", 9.5, true, "03/10/2021");
    public static Shoe yeezy = new Shoe("Adidas Yeezy Boost 350 V2 (yeezy)", 150, "ZYON", 10.5, false, "07/18/2020");
    public static Shoe breds = new Shoe("Jordan 1 Retro Breds (breds)", 971.00, "BLACK/VARSITY/RED-WHITE", 9, true, "09/03/2016");
    public static Shoe[] inventory = {mochas, ultraBoosts, dunks, yeezy, breds};

    public static int bought = 0;
    public static int index;
    /**
     * This method welcomes the user to the store and provided a transition to if they want to bargain or not.
     * @param buyer
     * @param seller
     * @return It doesn't return anything, just provided values
     */
    public static void welcomeToTheStore(Buyer buyer, Seller seller) {
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
                        index = 0;
                    }
                    if (interest.equalsIgnoreCase("ultraBoosts")) {
                        bargain(buyer, seller, ultraBoosts);
                        index = 1;
                    }
                    if (interest.equalsIgnoreCase("dunks")) {
                        bargain(buyer, seller, dunks);
                        index = 2;
                    }
                    if (interest.equalsIgnoreCase("yeezy")) {
                        bargain(buyer, seller, yeezy);
                        index = 3;
                    }
                    if (interest.equalsIgnoreCase("breds")) {
                        bargain(buyer, seller, breds);
                        index = 4;
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
    //MAIN METHOD
    public static void main(String[] args){
        System.out.println("Welcome to Koding Kool Kicks: ");
        addDivider();

        //Buyer info:
        System.out.println("CUSTOMER INFO: ");
        Buyer Sammy = new Buyer("Sammy", 11, 200.00, 600.00);
        System.out.println(Sammy);
        addDivider();

        //Seller Info:
        System.out.println("SELLER INFO:");
        Seller Kuldeep = new Seller("Kuldeep", true);
        System.out.println(Kuldeep);
        addDivider();

        welcomeToTheStore(Sammy, Kuldeep);
        System.out.println();
        System.out.println("NEW INFORMATION: ");
        System.out.println(Sammy);
        addDivider();
        System.out.println(Kuldeep);
        removeShoe();
        addDivider();

        System.out.println("NEXT CUSTOMER INFO: ");
        Buyer Jeff = new Buyer("Jeff", 9, 500.00, 1000.00);
        System.out.println(Jeff);
        welcomeToTheStore(Jeff, Kuldeep);
        removeShoe();
        addDivider();

        System.out.println("NEW INFORMATION: ");
        System.out.println(Jeff);
        addDivider();
        System.out.println(Kuldeep);
        addDivider();
        System.out.println("After customers left, Kuldeep decided to crunch some numbers");
        System.out.println("He concluded that the average customer spends about: $" + Buyer.averagePrice());
    }
    /**
     * This method allows for the buyer to negotiate
     * @param buyer the buyer is the person who will purchase the shoe by deducting their money and obtaining the shoe
     * @param seller the seller will sell his show in exchange for money via the buyer's bnk account
     * @param shoe the shoe is the object being transfered from the seller to the buyer, each one is different
     * @return numerous lines from the program for the user in interact with
     */
    public static String bargain(Buyer buyer,Seller seller, Shoe shoe) {
        String output = "";
        double orgPrice = shoe.getRetailPrice();
        Scanner buyerInput = new Scanner(System.in);
        System.out.println("Do you" + " want to bargain for the " + shoe.getShoeName() + "? (y/n)");
        String name = buyerInput.nextLine(); // input is a scanner

        Scanner sellerInput = new Scanner(System.in);
        System.out.println("Is " + seller.getName() + " willing to bargain? : (y/n)");
        String bank = sellerInput.nextLine(); // input is a scanner
        boolean isDone = true;
        while (isDone) {
            if (name.equals("y") && bank.equals("y")) {
                // asks buyer for desired price
                Scanner buyerPrice = new Scanner(System.in);
                System.out.println("What price would you" + " like?");
                double price = buyerInput.nextDouble(); // input is a scanner
                //asks seller if they are ok with it
                System.out.println("Is " + seller.getName() + " willing to go to this price?: (y/n)");
                String sellerTalk = sellerInput.nextLine();
                if (sellerTalk.equals("y")) {
                    shoe.setRetailPrice(price);
                    System.out.println(shoe.getShoeName() + " has been marked down to $" + shoe.getRetailPrice());

                    if (shoe.getRetailPrice() > buyer.getBudget()) {
                        System.out.println("Unfortunately the shoes are out of your budget. Try negotiating again");
                        isDone = true;
                    }
                } else if (sellerTalk.equals("n")) {
                    System.out.println("Seller doesn't like that price, try again: ");
                    buyerInput.nextDouble();
                }
            } else {
                System.out.println("Seller does not want to negotiate");
                isDone = false;
            }

            Scanner input = new Scanner(System.in);
            System.out.println("\nDo you want to bargain more? : (y/n)");
            String finalResult = input.nextLine(); // input is a scanner
            if (finalResult.equals("y")) {
                isDone = true;
            } else {
                Buyer.setSingleSpent(shoe.getRetailPrice());
                Buyer.totalSpent += Buyer.getSingleSpent();
                output += (sellShoe(buyer, seller, shoe));
                isDone = false;
            }
        }
        return output;
    }

    /**
     *This method is void and all it does is remove the bought values from the array
     */
    public static void removeShoe(){
        //removing element from an array.
        ArrayList<Shoe> arr_new = new ArrayList<Shoe>();
        for (int i = 0; i < inventory.length; i++)
        {
            arr_new.add(inventory[i]);
        }
        arr_new.remove(index);
        inventory = arr_new.toArray(new Shoe[0]);
        System.out.println();
        System.out.println("NEW INVENTORY: ");
        System.out.println();
        System.out.println(Arrays.toString(inventory));
    }

    /**
     * This method sells the Shoe object to the buyer
     * It deducts the price from the buyers budget
     * @param buyer
     * @param seller
     * @param shoe
     * @return this returns the final purchase statement
     */
    public static String sellShoe(Buyer buyer,Seller seller, Shoe shoe){
        String result = buyer.getName() + " has bought " + shoe.getShoeName() + " from " + seller.getName();
        bought++;
        Seller.setNumSales(bought);
        double newBalance = buyer.getBankAmount() - shoe.getRetailPrice();
        buyer.setBankAmount(newBalance);
        result += " for $" + (shoe.getRetailPrice());
        System.out.println(result);
        return " ";
    }
}