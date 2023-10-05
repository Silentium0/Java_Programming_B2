package day16_loops;

public class Replace {

    public static void main(String[] args) {

        String  str = "Java is a language";
        //             0123456789........ // up to 4  not with 4 so will be 3 witch is a
        String first = str.substring(0, str.indexOf(" ")); // java
        String second = str.substring(str.indexOf(" ")+1); // is a language

        System.out.println(first);
        System.out.println(second);

        System.out.println(first+" "+second);
    }
}
