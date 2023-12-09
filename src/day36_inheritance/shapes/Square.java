package day36_inheritance.shapes;

public class Square extends Shapes {

    int side;


    public Square(int side){
        super("Square");
        setSide(side);
    }

    public void setSide(int side) {
        if (side >=0){
            this.side = side;
        }
    }


    public double area (){
        return side* side;

    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Info" +
                "\n\tside: " + side+
                "\n\tName: "+name;
    }
}
