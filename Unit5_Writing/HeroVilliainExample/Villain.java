package Unit5_Writing.HeroVilliainExample;

public class Villain {
    private String villainName;
    private Power villainSP;

    public Villain(String villainName, Power villainSP) {
        this.villainName = villainName;
        this.villainSP = villainSP;
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
    }

    public String toString(){
        return "Villain name: " + villainName + "\n" + villainSP.toString();
    }
}
