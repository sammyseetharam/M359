package Unit3_Booleans_and_IfStatements.Lab;

public class ChevyDriverStudent
{
    public static void main(String[] args)
    {
        // Create objects
        Chevy traxBase = new Chevy();
        Chevy traxLux = new Chevy();
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)", "Fire Red", true, false, true);
        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)", "Fire Red", true, false, false);
        Chevy blueSilverado = new Chevy(1990, 15000, 16.5, 37850, "Silverado", "Blue", true, true, false);



        // *** UTILIZE SETTER METHODS TO COMPLETE THE FOLLOWING: ***
        // Set traxBase mileage to 15
        traxBase.setMileage(15);
        // Set traxLux mileage to 175 with both a luxury and 4WD package
        traxLux.setMileage(175);
        traxLux.setLuxPackageStatus(true);
        traxLux.setFourWDPack(true);


        // Printouts
        System.out.println("*** VEHICLE PRINTOUTS ***");

        System.out.println(traxBase);

        System.out.println(traxLux);

        System.out.println(corvetteClassic);

        System.out.println(corvetteSport);

        // Display price comparison
        System.out.println(" ");
        System.out.println("*** COMPARE BY PRICE ***");
        System.out.println("\tClassic Corvette vs. Sport Corvette");
        System.out.print("\tLowest price:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (corvetteClassic.compareTo(corvetteSport) < 0)
            System.out.println("Classic Corvette at $" + corvetteClassic.calcPrice());
        else if (corvetteClassic.compareTo(corvetteSport) > 0)
            System.out.println("Sport Corvette at $" + corvetteSport.calcPrice());
        else
            System.out.println("Tie at $" + corvetteClassic.calcPrice());

        // Display equality
        System.out.println("\n*** CHECK EQUALITY ***");
        System.out.println("\tBase Trax vs. Luxury Trax");
        System.out.print("\tStatus:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (traxBase.equals(traxLux))
            System.out.println("Same car");
        else
            System.out.println("Not same car");
    }
}
