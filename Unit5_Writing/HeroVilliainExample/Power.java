package Unit5_Writing.HeroVilliainExample;


public class Power {
    private String pwrName;
    private  double pwrStrength;
    //var for totalStrength

    public Power(String name, double strength){
        pwrName = name;
        pwrStrength = strength;
    }

    public String getPwrName() {
        return pwrName;
    }
    public void setPwrName(String pwrName) {
        this.pwrName = pwrName;
    }
    public double getPwrStrength() {
        return pwrStrength;
    }
    public void setPwrStrength(double newPwrStrength) {
        pwrStrength = newPwrStrength;
    }

    public String toString(){
        return "Power: " + pwrName + "\nStrength: " + pwrStrength;
    }
}
