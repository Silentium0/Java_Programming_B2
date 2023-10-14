package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {


    public static void main (String [] args){

        double [] arr = new double[5]; // 5 elements in  one Array
        System.out.println(arr.length); //4

        System.out.println(Arrays.toString(arr));

        arr[0] = 30.34; // we assign value to one of elements in our case is 0 witch is first 1
        System.out.println(Arrays.toString(arr));

        arr[1]= 4.5;
        arr[2]= 6.7;
        arr[3]= 7.5;
        arr[4]= 7;
        System.out.println(Arrays.toString(arr));

        System.out.println("_____________________-");

        arr = new double[6]; // new one Array
        System.out.println(Arrays.toString(arr));

        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 54;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]+" "+arr[1]+ " " +arr[2]);

        System.out.println("_____________________-");


        int [] arr2 = new int [6]; // new one Array
        System.out.println(Arrays.toString(arr2));

        arr2[0] = 23;
        arr2[1] = 34;
        arr2[2] = 54;
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]+" "+arr2[1]+ " " +arr2[2]);

        System.out.println("__________________________-");



        char [] arr3 = new  char[]{1,2,4,7}; // 4 element
        System.out.println(arr3.length);


























    }
}
