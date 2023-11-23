package day38_a_abstraction_interface.interface_method;

public interface Mac {



    String NAME = "Mac";

    String  OS = "IOS";

    void turnOn();


    static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release");
    }




    public default  void faceTime(){
        System.out.println("Open face time");
        System.out.println("Calling facetime");
    }

}
