package day36_inheritance.shapes;

public class Shapes {


    String name;

    public Shapes(String name){
        this.name = name;

    }


    public  double area (){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }











    @Override // tag // annotation
    public String toString() {
        return "Shapes info : " +
                "\n\tName: " + name;
    }
}
