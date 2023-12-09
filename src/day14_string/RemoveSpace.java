package day14_string;

public class RemoveSpace {

    public static void main(String[] args) {

        String s = "      Jinx      ";
        System.out.println(s);

        System.out.println(s.length());// count  include space

        System.out.println(s.trim()); // will remove the empty space from  beginning and END
        System.out.println(s.length());


        s = s.trim();
        System.out.println(s.length()); //  just after reassing we got 4 before 16 with space

        System.out.println("_____________-");

        System.out.println(s.startsWith("Ji")); // we reassing  at top




    }
}
