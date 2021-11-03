package Unit5_Writing.PartnerLab;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        //Shoe info
        Shoe breds = new Shoe("Jordan 1 Retro Breds", 971.00, "BLACK/VARSITY/RED-WHITE", 9 , true, "09/03/2016");
        Shoe mochas = new Shoe("Jordan 1 Mocha", 545.00, "MOCHA/BLACK/BROWN/WHITE", 10, true, "10/31/2020");
        Shoe ultraBoosts = new Shoe("Adidas UBs 4.0 GOT Targaryen Dragons", 244,"BLACK/FIREORANGE/INFERNO", 11, true, "03/22/2019");
        Shoe dunks = new Shoe("Nike Dunk Low Retros", 265, "WHITE/BLACK", 9.5, true, "03/10/2021");
        Shoe yeezy = new Shoe("Adidas Yeezy Boost 350 V2", 150, "ZYON", 10.5, false,  "07/18/2020");
        // inventory of shoes
        Shoe[] inventory = {mochas, breds, ultraBoosts, dunks, yeezy};
        System.out.println(Arrays.toString(inventory));
        //Buyer info
        System.out.println();
        Buyer sammy = new Buyer("Sammy", 11, 200.00);
        System.out.println(sammy.toString());
        System.out.println("\n------------------------\n");

        Seller kuldeep = new Seller("Kuldeep", mochas, true, 3);
        System.out.println(kuldeep);
    }
    //bargain method
    // sell method

}
