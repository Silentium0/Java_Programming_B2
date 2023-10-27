package day26_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class MinNumberIArray {

    public static void main(String[] args) {

        int[] arr = {12, 45, 23, 78, 90, 33};
        System.out.println(ArrayUtil.maxInArray(arr));
        System.out.println(minInArray(arr));


    }

    public static int minInArray(int[] arr) {
        Arrays.sort(arr);
        return arr[0];

    }

    public static int minInArray2(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each > min) {
                min = each;
            }
        }
        return min;

    }
}