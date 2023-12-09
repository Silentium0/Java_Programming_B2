package day25_mothod;

public class MyMathClass {


    public static void add(int num1, int num2) {
        System.out.println(num1 + "+" +num2+ "=" +(num1+num2) );

    }

    public static void multiply(int num1, int num2) {
        System.out.println(num1+ "*"+num2+"="+(num1*num2));

    }

    public static void divide(int num1, int num2) {
        System.out.println(num1+ "/"+num2+"="+(num1/num2));


    }
    public static void subtract(int num1, int num2) {
        System.out.println(num1+ "-"+num2+"="+(num1-num2));

    }
    public static void main(String[] args) {
        add(4,5);
        multiply(7,2);
        divide(8,2);
        subtract(3,18);

    }
}