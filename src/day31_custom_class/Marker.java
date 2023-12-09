package day31_custom_class;

public class Marker {


    String type;
    String brand;
    String  color;

    public Marker(String type1, String brand1, String color1){
        type = type1;
        brand = brand1;
        color = color1;


    }


    @Override
    public String toString() {
        return "Marker " +
                "\ntype: " + type +
                "\nbrand: " + brand +
                "\ncolor: " + color ;
    }
}
