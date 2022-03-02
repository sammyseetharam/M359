package Unit9_Inheritance.Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, String color,double radius){
        super(name,color);
        this.radius = radius;
    }
    public Circle(String name, String color){
        super(name,color);
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return getName() + " with a radius of " + radius;
    }
}
