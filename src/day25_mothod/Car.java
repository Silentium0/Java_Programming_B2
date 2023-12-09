package day25_mothod;

public class Car {


    public  static void unlockCar(){
        System.out.println("Unlock a car");

    }

    public static void  openDoor() {
        System.out.println("Open the door");


    }

    public static void sitInCar() {
        System.out.println("Sit in the car");
        System.out.println("Close the door ");

    }

    public static void  getReady() {
        System.out.println("Put  seatbelt");
        System.out.println("Put into drive mode");
        System.out.println("Check the mirror");
        System.out.println("Push gas");
    }

    public static void startCar() {
        System.out.println("Start Car");

    }

    public static void driveInRush() {
        unlockCar(); //  we call methods
        sitInCar();
        startCar();


    }

    public static void main(String[] args) {
        unlockCar(); // we call methods here , not declare
        openDoor();
        sitInCar();
        startCar();
        getReady();
        System.out.println();
        driveInRush();

    }

}
