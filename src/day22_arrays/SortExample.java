package day22_arrays;

import java.util.Arrays;

public class SortExample {


    public static void main(String[] args) {


        int [] num = {678,34,56,12,89,76};
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println();

        System.out.println(num[0]); // min number
        System.out.println(num[num.length-1]); // max number
    }
}
