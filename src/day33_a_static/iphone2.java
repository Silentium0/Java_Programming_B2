package day33_a_static;

public class iphone2 {


    public static void main(String[] args) {

        Iphone info1 = new Iphone("iphone 16",1899.99);
        Iphone info2 = new Iphone("iphone 17",2599.99);

        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info1.os);
        System.out.println(info1.company);
        System.out.println(info1.appday);

    }
}
