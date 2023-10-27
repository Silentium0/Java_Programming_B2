package day26_methods;

import my_utilities.ArrayUtil;

import java.util.Enumeration;

public class SumOfElements {

    public static void main(String[] args) {

        int [] arr = {5,10,10,5};
        System.out.println(ArrayUtil.sumOfArray(arr));
        System.out.println();


    }

    public static int sum( int [] num) {
        int  sum = 0;

        for (int each : num){
            sum +=each;
        }
        return 0;

    }



}
