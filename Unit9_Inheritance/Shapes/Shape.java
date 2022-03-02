package Unit9_Inheritance.Shapes;

public class Shape {
    private String name;
    private String color;

    public Shape(){
        this.name = "no name";
        this.color = "no color";
    }

    public Shape(String name, String color){
       this.name = name;
       this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        String output = "The name of this shape is: " + name +
                " and the color is: " + color;
        return output;
     }
}
