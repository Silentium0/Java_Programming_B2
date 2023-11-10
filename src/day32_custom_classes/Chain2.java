package day32_custom_classes;

public class Chain2 {

    public static void main(String[] args) {


        new Chain();
        System.out.println("_________");
        new Chain(12345,"nooob"); // we put this(); in second constructor,  refer to first constructor
        System.out.println("___________");

        new Chain(12.0,123);  // can be any volume  but order mandatory




   }
}
