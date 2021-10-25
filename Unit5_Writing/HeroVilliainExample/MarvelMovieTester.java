package Unit5_Writing.HeroVilliainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        //Powers for heroes and villains
        Power myNewPower = new Power("Dragons inferno", 10);
        Power villainPower = new Power("Super Chill", 5);
        //Hero / villain declarations
        SuperHero MrArson = new SuperHero("Mr. Arson", myNewPower);
        Villain MsFreeze = new Villain("Mr. Freeze", villainPower);
        //Printing out the info.
        System.out.println(MrArson);
        System.out.println();
        System.out.println(MsFreeze);

        myNewPower.setPwrStrength(23);

    }
}

