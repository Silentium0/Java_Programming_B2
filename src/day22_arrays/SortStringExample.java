package day22_arrays;

import java.util.Arrays;

public class SortStringExample {


    public static void main(String[] args) {


        String [] arr = {"java", "api","selenium","database"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();

        String [] arr1 = {"java", "api","selenium", "56","database", "Apple"};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));






    }
}
