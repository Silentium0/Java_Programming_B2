package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood {

    public void wear(){
        System.out.println("Wearing  Jacket");
    }

    @Override
    public void putHood() {
        System.out.println("Putting on the Jacket");
    }
}
