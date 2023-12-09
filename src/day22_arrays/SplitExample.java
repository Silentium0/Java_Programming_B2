package day22_arrays;

import java.util.Arrays;

public class SplitExample {

    public static void main(String[] args) {


        String str = "monday, tuesday, wednesday, thursday, friday";
        String [] days = str.split(", ");

        for(String eachElement : days){
            System.out.println(eachElement);
        }
        System.out.println();

        String [] day2 = str.split("day,");
        for(String each : day2){
            System.out.println(each);
        }
        System.out.println();

        String month = "jan-feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dac";
        String [] month1 = month.split("-");
        for(String  eachmonth : month1){
            System.out.println(eachmonth);
        }

        System.out.println();

        String [] arr2 = month.split("y-");
        for(String eachMonth : arr2){
            System.out.println(eachMonth);
        }
        System.out.println();

        String [] arr3 = month.split("");
        for(String eachElement : arr3){
            System.out.println(eachElement);
        }

        System.out.println();

        String [] arr5 = month.split("java");
        for(String each : arr5){
            System.out.println(each);
        }
        System.out.println(arr5.length);
        System.out.println(Arrays.toString(arr5)); // with []
        System.out.println(arr5[0]); // without [ ]

    }
}
