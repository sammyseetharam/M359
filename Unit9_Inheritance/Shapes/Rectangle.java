package Unit9_Inheritance.Shapes;

public class Rectangle extends Shape{
    private double length;
    private double width;
    private int numSides;
    public Rectangle(String name, String color, int length, int width){
        super(name,color);
        this.length = length;
        this.width = width;
        numSides = 4;
    }
    public void scaleSize(double scaleFactor){
        width *= scaleFactor;
        length *= scaleFactor;
    }

    public Rectangle(){
        this.length = 0;
        this.length = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double findArea(){
        return length * width;
    }

    public String toString(){
        return getName() + " with a width of " + width + " with a length of " + length;
    }
}
