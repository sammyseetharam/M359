package Unit5_Writing.HeroVilliainExample;

public class SuperHero {
    private String heroName;
    private Power superPower;

    public SuperHero(String heroName, Power superPower) {
        this.heroName = heroName;
        this.superPower = superPower;
    }
    public void setHeroName(String setHeroName){
        heroName = setHeroName;
    }
    public String getHeroName(){
        return heroName;
    }
    public void setSuperPower(Power setSuperPower){
        superPower = setSuperPower;
    }
    public Power getSuperPower(){
        return superPower;
    }

    public String toString(){
        return "Hero Name: " + heroName + "\n" + superPower;

    }
}
