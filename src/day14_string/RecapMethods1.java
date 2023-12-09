package day14_string;

public class RecapMethods1 {

    public static void main (String [] args){

        String s = "pen";
        String s2 = new String("pen");

        System.out.println( s == s2);
        System.out.println( s.equals("pen"));

        String ss = "Pen";
        System.out.println("____________________________________________-");

        s = "PEN";
        ss = "pen";

        boolean isSame = s.equalsIgnoreCase(ss);
        System.out.println(isSame);

        if (isSame){
            System.out.println("Hello");


        ss = "PENN";
        }
        if (s.equalsIgnoreCase(ss)){
            System.out.println("Hello");
        }else {
            System.out.println("Buy");
        }
    }


}
