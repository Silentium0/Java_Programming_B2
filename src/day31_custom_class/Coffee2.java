package day31_custom_class;

public class Coffee2 {

    public static void main(String[] args) {


        Coffee info = new Coffee();

        info.brand = "Balenciaga";
        info.type = "PinkKind";
        info.price = 100_500;
        info.size = 3.0;
        System.out.println(info);
        info.refeel(5.0);
        System.out.println(info);

    }


}