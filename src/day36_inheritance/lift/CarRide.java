package day36_inheritance.lift;

public class CarRide {


    public static void main(String[] args) {


        Lyft info = new Lyft("Frank");
        System.out.println(info.calculateRate(5));


        LiftXL info2 = new LiftXL("Taras");
        System.out.println(info2.calculateRate(5));





    }








}
