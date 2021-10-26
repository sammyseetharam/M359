package Unit5_Writing.HeroVilliainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        //Powers for heroes and villains
        Power superStrength = new Power("Brawny", 10);


        //Hero / villain declarations
        SuperHero superman = new SuperHero("Superman", superStrength);
        System.out.println(superman);

        System.out.println();

        Villain hulk = new Villain("Hulk", superStrength);
        System.out.println(hulk);

        //Will change both of their powers
        hulk.getVillainSP().setPwrStrength(15);

        System.out.println();
        System.out.println(superman.toString());
        System.out.println();
        System.out.println(hulk);
    }
}

