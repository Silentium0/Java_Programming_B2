package day27_wrapper_arrays;

public class ParselVsValue {
    public static void main(String[] args) {

        String str = "30";

        int num1 = Integer.parseInt(str); // convert String  to primitive date type
        Integer num2 = Integer.valueOf(str); //  convert String to Integer wrapper class object
        System.out.println(num2+20);
        System.out.println(num1+20);
        System.out.println("++++++++");

        int num3 = Integer.valueOf(str); // not recommended
        Integer num4 = Integer.parseInt(str); // Not recommended


        String str2 = "java"; // if ypu will  assign "true" output will be true
        Boolean isvalue = Boolean.valueOf(str2);
        System.out.println(isvalue);



    }
}
