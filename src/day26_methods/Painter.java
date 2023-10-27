package day26_methods;

public class Painter {

    public static void main(String[] args) {

        PictureMethods.draw();
        PictureMethods.draw();

        PictureMethods.draw("Blue");// String to String
        PictureMethods.draw(5); // int to int
        PictureMethods.draw("Red","Black"); // String to String
        PictureMethods.draw("blue",18); // Order ( String color , int size) all in Order
        PictureMethods.test(3.6);


    }
}
