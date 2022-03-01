package Unit9_Inheritance.Notes;

public class Entree extends MenuItem{
    private int numSides;
    public Entree(String name, int numSides) {
        super(name);
        this.numSides = numSides;
        System.out.println("Created an Entree with " + numSides + " sides");
    }

    @Override
    public String toString(){
        String output = "This is an entree with: " + numSides;
        output += " sides and is called " + this.getName();

        return output;
    }
}
