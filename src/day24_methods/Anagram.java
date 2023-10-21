package day24_methods;

import java.util.Arrays;

public class Anagram {

    public static void main(String [] args){

        String str1 = "loop";
        String str2 = "pool";

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        System.out.println(Arrays.equals(arr1,arr2)); // before sort  false
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("____________SORT______________________");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2)); // but after sort true
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));



    }
}
