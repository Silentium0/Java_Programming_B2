package day24_methods;

import java.util.Arrays;

public class MultiArrayExample {


    public static void main(String [] args){

        int [] nums1 = {3,56,32,7,89};// 4
        int [] nums2 = {3,56,54,7,89,76};// 5
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        int [][] all = {nums1,nums2}; // 2 multidementional Arrays holds 2 Arrays in one
        System.out.println(all); // some hashcode not correct
        System.out.println(Arrays.deepToString(all)); // this method print 2  arrays  together in one

        System.out.println("_________Split_arrays_in_2D_______________");
        System.out.println(Arrays.toString(all[0]));
        System.out.println(Arrays.toString(all[1]));

        System.out.println("___________2D_______________");


        int [] [] mult = {
                {43,56,132},// 1
                {32,657,132,54,1,5,34}, // 2
                {2,45,32,56,78,},// 3
                {12},// 4
                {34,56}, // 5 length
        };
        System.out.println(mult.length); // numbers of Arrays
        System.out.println(mult[0].length); // numbers of elements in array
        System.out.println(mult[1].length); // numbers of elements in array
        System.out.println(Arrays.deepToString(mult)); // all arrays
        System.out.println(mult[2][0]); // value of element




    }
}
