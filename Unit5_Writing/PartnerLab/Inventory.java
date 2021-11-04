package Unit5_Writing.PartnerLab;

import java.util.ArrayList;

public class Inventory {
    Shoe breds = new Shoe("Jordan 1 Retro Breds", 971.00, "BLACK/VARSITY/RED-WHITE", 9 , true, "09/03/2016");
    Shoe mochas = new Shoe("Jordan 1 Mocha", 545.00, "MOCHA/BLACK/BROWN/WHITE", 10, true, "10/31/2020");
    Shoe ultraBoosts = new Shoe("Adidas UBs 4.0 GOT Targaryen Dragons", 244,"BLACK/FIREORANGE/INFERNO", 11, true, "03/22/2019");
    Shoe dunks = new Shoe("Nike Dunk Low Retros", 265, "WHITE/BLACK", 9.5, true, "03/10/2021");
    Shoe yeezy = new Shoe("Adidas Yeezy Boost 350 V2", 150, "ZYON", 10.5, false,  "07/18/2020");
    // static inentory list anf towtla whatnot
    // identify which array to eb added to
    // inventory of shoes
    public static Inventory(Shoe shoe, ArrayList<Shoe>){
        //inventory
    }
    //static can be the inventory method, everytime they make it it will add
    ArrayList<Shoe> inventory = new ArrayList<Shoe>();
        inventory.add(breds);
        inventory.add(mochas);
        inventory.add(ultraBoosts);
        inventory.add(dunks);
        inventory.add(yeezy);
        System.out.println(inventory.toString());

}
