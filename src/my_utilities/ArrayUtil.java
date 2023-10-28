package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * add + all numbers in Array together
     */
    public static int sumOfArray(int[] num) {
        int sum = 0;
        for (int each : num) {
            sum += each;
        }
        return sum;
    }


    /**
     * Min number in Array
     */
    public static int minInArray(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    /**
     * Max number in Array
     */
    public static int maxInArray(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    /**
     * This method accepts an int array and an int numb
     * Then check if the number is in the array
     * If yes, return true, otherwise return false
     */
    public static boolean containsInArray(int[] arr, int num) {
        // [1, 3, 45, 57, 54, 57]  - 57
        for (int eachElem : arr) {
            if (eachElem == num) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * will give you  Index  from  number
     */
    public static int indexOf(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;

    }



    public static int [] addElementInArr (int [] originalArr, int num) {
        int [] newArr = Arrays.copyOf(originalArr, originalArr.length+1 ); // [1, 3, 5, 2, 123, 234, _ ]
        newArr[newArr.length-1] = num;
        return newArr;
    }


    public static String [] addElementInArr (String [] originalArr, String str) {
        String [] newArr = new String [originalArr.length + 1];
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i] = originalArr [i];
        }
        newArr [newArr.length - 1] = str;
        return newArr;
    }





}