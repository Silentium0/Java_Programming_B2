package day08_scanner_logical_operators;

public class OrPractice {


    public static void main ( String [] args ){


         int apple = 5;
         int orange = 10;

             //             true         false
        System.out.println(apple > 1 || orange <5);
        //                   false        true
        System.out.println( apple > 10 || orange == 10);
//                          false        true
        System.out.println(apple > 10 && orange == 10);



    }
}
