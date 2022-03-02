package Unit9_Inheritance.Shapes;

public class Square extends Rectangle{

    public Square(String name, String color, int sideLength){
        super(name,color, sideLength, sideLength);
    }

    public double findArea(){
        return this.getLength() * this.getLength();
    }

    public String toString(){
        return getName() + " with a side length of " + getLength();
    }

}
