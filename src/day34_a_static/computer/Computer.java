package day34_a_static.computer;
/*
Computer - static

class name: computer:
    instance variables:
        price, brand, color, ...

    static variables: hasScreen, hasBattery, hasMemory

    make objects of the class in a main method and access both instance and static members from proper references

 */

public class Computer {
    // access modif for these 3 fields default
    String brand;
    double price;
    String color;

    /**
     * The following is to explain when o use STATIC or NON-STATIC methods
     */
    // create a method that prints $brand and $hasMemory info
    // STATIC accepts only STATIC
    // Since my task requires me to use INSTANCE variable and STATIC v
    // ariable and I know that STATIC accepts only STATIC.
    // So, I need to use NON-STATIC method to be able to have access to instance variables inside of that method as well.

    static boolean hasMonitor, hasBattery, hasMemory;

    static {
        System.out.println("Static block run");
        hasBattery = true;
        hasMemory = true;
        hasMonitor = false;
    }

    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public  void test(){

    }


    @Override
    public String toString() {
        return "Computer" +
                "\n\tBrand: " + brand +
                "\n\tPrice: " + price +
                "\n\tColor: " + color;
    }
}
