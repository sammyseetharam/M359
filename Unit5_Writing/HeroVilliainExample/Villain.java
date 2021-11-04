package Unit5_Writing.HeroVilliainExample;

public class Villain {
    private String villainName;
    private Power villainSP;
    //Keeps track of total number of villain objects created
    public static int numVillain = 0;
    public static double totalVStrength = 0.0;

    public Villain(String villainName, Power villainSP) {
        this.villainName = villainName;
        this.villainSP = new Power(villainSP.getPwrName(), villainSP.getPwrStrength());
        totalVStrength += villainSP.getPwrStrength();
        numVillain++;
    }

    public String getVillainName() {
        return villainName;
    }
    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }
    public Power getVillainSP() {
        return villainSP;
    }
    public void setVillainSP(Power villainSP) {
        this.villainSP = villainSP;
        totalVStrength += villainSP.getPwrStrength();
    }
    public static int getNumVillain() {
        return numVillain;
    }


    public static double getAverageVillainStrength(){
        double calc = totalVStrength/numVillain;
        return calc;
    }

    public String toString(){
        return "Villain name: " + villainName + "\n" + villainSP.toString();
    }
}
