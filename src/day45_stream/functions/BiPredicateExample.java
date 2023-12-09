package day45_stream.functions;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<Integer[] , Integer> contains = (arr , num ) -> {
            for(Integer each : arr){
                if (each == num){
                    return true;
                }
            }
            return false;
        };



        Integer [] arr = {12,3,6,888,8};
        System.out.println(contains.test(arr, 12));
        System.out.println(contains.test(arr, 1));


        System.out.println("___ANAGRAM_____");


        BiPredicate<String, String > anagram = (str , str2 )->{
            String [] arr1 = str.split("");
            String [] arr2 = str2.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };

        System.out.println(anagram.test("listen","silent"));


    }






}
