package Unit5_Writing.HeroVilliainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        //Powers for heroes and villains
        Power superStrength = new Power("Brawny", 10);


        //Hero / villain declarations
        //Will store separate objects for superman and hulk when it comes to the "power" instance variable
        SuperHero superman = new SuperHero("Superman", superStrength);
        System.out.println(superman);

        System.out.println();

        Villain LexLuthor = new Villain("Lex Luthor", superStrength);
        System.out.println(LexLuthor);

        //Will change both of their powers
        LexLuthor.getVillainSP().setPwrStrength(15);

        System.out.println();
        System.out.println(superman.toString());
        System.out.println();
        System.out.println(LexLuthor);
        battle(superman, LexLuthor);

        System.out.println();
        System.out.println(superman.toString());
        System.out.println();
        System.out.println(LexLuthor);



    }

    /**
     * Simulates a battle between hero vs. villain. Whoever has greater strength wins
     * winner will gain 10% of losers strength
     * loser will loose between 5 - 35% of their own strength
     * In the case of a tie, both objects will loose 5 - 35% of their strength
     * Print the result of the battle (who won)
     * @param hero
     * @param villain
     */

    public static void battle(SuperHero hero, Villain villain){
        double difference = hero.getSuperPower().getPwrStrength() - villain.getVillainSP().getPwrStrength();
        double randomPercent = ((double) (Math.random() * 35) + 5)/100;
        if(difference != 0){
            //hero wins
            if(difference > 0){
                //adds to hero and substracts from villain
                System.out.println("The hero wins, hooray");
                hero.getSuperPower().setPwrStrength(hero.getSuperPower().getPwrStrength() + (villain.getVillainSP().getPwrStrength() * 0.1));
                villain.getVillainSP().setPwrStrength(villain.getVillainSP().getPwrStrength() - (randomPercent * villain.getVillainSP().getPwrStrength()));
            }else{
                //villain wins
                System.out.println("The villain wins, boo");
                //Adds to the villain and subtracts from hero
                villain.getVillainSP().setPwrStrength(villain.getVillainSP().getPwrStrength() + (hero.getSuperPower().getPwrStrength() * 0.1));
                hero.getSuperPower().setPwrStrength(hero.getSuperPower().getPwrStrength() - (randomPercent * hero.getSuperPower().getPwrStrength()));
            }
        }else{
            //they tied
            System.out.println("They tied...");
            //Sets the hero and villain powerStrength to 5 - 35% less than orginal
            villain.getVillainSP().setPwrStrength(villain.getVillainSP().getPwrStrength() - (randomPercent * villain.getVillainSP().getPwrStrength()));
            hero.getSuperPower().setPwrStrength(hero.getSuperPower().getPwrStrength() - (randomPercent * hero.getSuperPower().getPwrStrength()));
        }
        System.out.println();
        System.out.println("The percentage lost was about: " + (int)(randomPercent * 100 + 0.5) + "%");
    }
}

