package day15_string;

public class IndexOfMethod {

    public static void main(String[] args) {

        String str = "pen";

        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("n"));


        System.out.println("_________________--");

        String str2 = "pencil";
        System.out.println(str2.indexOf("p"));// it will look just for a P like a target and will show in a number
        str2 = "enfpifr:";
        System.out.println(str2.indexOf("p"));// it will look just for a P like a target and will show in a number


        System.out.println("_____________");

        String str3 = "Exorcist";
        System.out.println(str3.indexOf("Exorcist"));



    }
}
