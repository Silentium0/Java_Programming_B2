package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {

    public static void main (String [] args){


        int [] arr1 = {24,45,23,78,48,523,47};
        int [] arr2 = {43,5,13,56,78,7,34};

        System.out.println(arr2.length == arr1.length);

        System.out.println("_________________________");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("________Sort____________");

        Arrays.sort(arr2);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));

        System.out.println("__________________________");

        String [] word = {"hello", "Java", "learn", "Me"};
        System.out.println(Arrays.toString(word));
        Arrays.sort(word);// after sort goes to Alphabetic order
        System.out.println(Arrays.toString(word));




    }
}
