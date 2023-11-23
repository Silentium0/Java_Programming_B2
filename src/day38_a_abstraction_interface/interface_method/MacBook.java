package day38_a_abstraction_interface.interface_method;

public class MacBook implements Mac {

    @Override
    public void turnOn() {

    }
}


class Runner{


    public static void main(String[] args) {


        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
        System.out.println();
        System.out.println(MacBook.NAME);
        System.out.println(MacBook.OS);


        MacBook info = new MacBook();

        info.faceTime();
        info.turnOn();

        System.out.println();

        Mac.company();


    }
}