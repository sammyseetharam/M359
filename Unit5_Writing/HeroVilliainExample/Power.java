package Unit5_Writing.HeroVilliainExample;


public class Power {
    private String pwrName;
    private int pwrStrength;

    public Power(String name, int strength){
        pwrName = name;
        pwrStrength = strength;
    }

    public String getPwrName() {
        return pwrName;
    }
    public void setPwrName(String pwrName) {
        this.pwrName = pwrName;
    }
    public int getPwrStrength() {
        return pwrStrength;
    }
    public void setPwrStrength(int pwrStrength) {
        this.pwrStrength = pwrStrength;
    }

    public String toString(){
        return "Power: " + pwrName + "\nStrength: " + pwrStrength;
    }
}
