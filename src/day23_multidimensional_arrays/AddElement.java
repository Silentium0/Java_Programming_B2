package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements do you want to have in an Array");
        int size = input.nextInt();
        int [] arr = new int[size]; // new  array with size what user give

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter value to element : " + i + ": ");
            arr [i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        int [] arr2 = Arrays.copyOf(arr,arr.length+1);
        arr2[arr.length-1] = 100;
        System.out.println("new addition "+Arrays.toString(arr2));

    }
}
