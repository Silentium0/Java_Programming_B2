package day15_string;

public class CharMethod {


    public static void main(String[] args) {


        String s = "Demo";

       System.out.println(s.length());

        System.out.println(s.charAt(0)); // j -- data type will be char
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
       // System.out.println(s.charAt(4)); // will show  Error  because it is 4 char  not 5
       // System.out.println(s.charAt("4")); // accept   only number , after that SYNTAX  code will not run at all

        System.out.println("_______________");

        String s4 =  "enter num";
        int lastWord = s4.length()-2; // dymamic way
        System.out.println(s4.charAt(lastWord));

        lastWord = s4.length() -5;
        System.out.println(s4.charAt(lastWord));
    }
}
