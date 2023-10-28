package day27_wrapper_arrays;

import my_utilities.ArrayUtil;
import my_utilities.StringUtil;

public class ArrayIndexOf {

    public static void main(String[] args) {

        int[] arr = {233, 45, 678, 94, 54, 87, 2, 8};
        // index--->  0   1    2    3   4   5  6  7
        int num = 87;
        System.out.println(ArrayUtil.indexOf(arr,num));
        System.out.println();
        String [] words = {"hello", "java"};
        String str = "hello";
        System.out.println(StringUtil.indexOfSt(words,str));

        // each time you call  method you have to provide  or  from ArrayUtil of StringUtil






    }



}
