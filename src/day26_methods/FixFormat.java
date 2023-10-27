package day26_methods;

public class FixFormat {

    public static String fixFormat (String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println( fixFormat( "wINNE") );
        System.out.println( fixFormat( "tom") );
    }
}
