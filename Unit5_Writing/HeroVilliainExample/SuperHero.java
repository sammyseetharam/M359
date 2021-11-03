package Unit5_Writing.HeroVilliainExample;

public class SuperHero {
    private String heroName;
    private Power superPower;
    //Keeps track of total number of super hero objects created
    public static int numHeroes = 0;
    public static double totalHStrength = 0.0;

    public SuperHero(String heroName, Power superPower) {
        this.heroName = heroName;
        this.superPower = new Power(superPower.getPwrName(), superPower.getPwrStrength());
        totalHStrength += superPower.getPwrStrength();
        numHeroes ++;
    }
    public void setHeroName(String setHeroName){
        heroName = setHeroName;
    }
    public String getHeroName(){
        return heroName;
    }
    public void setSuperPower(Power setSuperPower){
        superPower = setSuperPower;
        totalHStrength += Power.setPwrStrength(setSuperPower);
    }
    public Power getSuperPower(){
        return superPower;
    }
    public static int getNumHeroes() {
        return numHeroes;
    }

    public static double getAverageHeroStrength(){
        double calc = totalHStrength/numHeroes;
        return calc;
    }

    public String toString(){
        return "Hero Name: " + heroName + "\n" + superPower.toString();

    }
}
