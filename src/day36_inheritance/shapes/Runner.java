package day36_inheritance.shapes;

public class Runner {


    public static void main(String[] args) {

        Square obj = new Square(4);
        System.out.println(obj);
        System.out.println(obj.perimeter());
        System.out.println(obj.area());

        Circle obj2 = new Circle(6);
        System.out.println(obj2);
        System.out.println(obj2.perimeter());
        System.out.println(obj2.area());

    }
}
