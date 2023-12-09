package day25_mothod;

import java.util.Arrays;

public class OurArrayClass {


    public static void firstElement(int[] nums) {
        System.out.println("First Element: "+ nums[0]);
    }


    public static void lastElement(int[] nums) {
        System.out.println("last element: "+ nums[nums.length-1]); // it will print last element

    }

    public static void printArray(int [] nums) {
        System.out.println(Arrays.toString(nums));

    }

    public static void  midNum(int [] nums) {
        if (nums.length% 2 ==0)
        System.out.println("first mid number: " + nums [nums.length / 2 -1 ]);
        System.out.println("Second mid number: "+ nums [nums.length / 2] );


    }

    public static void main(String[] args) {
        int [] numbers  = {23,45,67,12,23,777};

        firstElement(numbers);
        lastElement(numbers);
        printArray(numbers);
        midNum(numbers);

        firstElement(new  int[]{12,43,1,7});

    }
}