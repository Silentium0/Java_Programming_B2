package day36_inheritance.shapes;

public class Circle extends Shapes {

    int radius;

    public Circle(int radius){
        super("Circle");
        this.radius = radius;
    }

    public double area(){
        return radius * radius* Math.PI;
    }

    @Override
    public double perimeter() {
        return radius* 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Info" +
                "\n\tradius: " + radius+
                "\n\tName: "+name;
    }
}
