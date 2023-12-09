package day08_scanner_logical_operators;

public class SignType {
/*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */

    public static void main ( String []args ){


        int  num = 4;

        boolean isNegative = num < 0;
        boolean isPositive = num > 0;
        boolean isZero = num == 0;

        System.out.println(num +" is negative "+ isNegative); //  false
        System.out.println( num + "positive  " + isPositive); // true
        System.out.println( num + " is Zero  " + isZero); // false









    }


}
