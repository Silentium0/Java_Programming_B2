package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {


    public static void main(String [] args){


        String cityOne = "Fairfax";
        String cityTwo = "Baku";
        String cityThree = "Huston";
        String cityFour = "Seattle";



        String [] cities = {"Fairfax", "Baku", "Houston", "Seattle"};
        String [] cities2 = {cityOne, cityTwo, cityThree, cityFour};
        // index                0         1        2         3





        System.out.println(cities2 [0] );
        System.out.println(cities2 [1] );
        System.out.println(cities2 [2] );
        System.out.println(cities2 [3] );


        System.out.println(cities2[0] + " " +  cities2 [1] + " " + cities2 [2] + " " + cities2[3]);


        System.out.println(Arrays.toString(cities2)); // [ name of all cities ]

        System.out.println(cities2.length); //  count of cities 4

        System.out.println(cities2 [1].substring(2,4));

        System.out.println(Arrays.toString(cities2).charAt(1));// F
        System.out.println(Arrays.toString(cities2).charAt(2));// a
        System.out.println(Arrays.toString(cities2).charAt(3));// i
        System.out.println(Arrays.toString(cities2).charAt(4));// r
        System.out.println(Arrays.toString(cities2).charAt(5));// f
        System.out.println(Arrays.toString(cities2).charAt(6));// a
        System.out.println(Arrays.toString(cities2).charAt(7));// x







    }



}
