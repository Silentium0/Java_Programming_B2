package day37_a_bstraction.cars;

public class Garage {


    public static void main(String[] args) {


        Toyota info = new Toyota();
        info.start();

        System.out.println();

        Honda info2 = new Honda();
        info2.start();


        System.out.println();

        Tesla info3 = new Tesla();

        info3.fly();
        info3.start();


    }


}
