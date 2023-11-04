package day30_b_castome_classes;

public class Item {

    String name; // instance Variables
    double price;


    @Override
    public String toString() { // just a method
        return "Item name: " + name+
               "\nprice: " + price;
    }
}
