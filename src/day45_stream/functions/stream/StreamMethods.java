package day45_stream.functions.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {


    public static void main(String[] args) {
        int [] arr = {212,34,5,767,8};

        Arrays.stream(arr);


        // remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(12,12,1,23,4,56,66,66));
        //System.out.println(list2.stream().distinct()); // will show some memory location
        System.out.println(list2.stream().distinct().collect(Collectors.toList())); //  convert back to  Collection removing duplicates

        list2 = list2.stream().distinct().collect(Collectors.toList()); // reassign
        System.out.println(list2);


        //  we skip first  elements
        List<Integer> list3 = new ArrayList<>(Arrays.asList(12,12,1,23,4,56,66,66));
        System.out.println(list3.stream().skip(6).collect(Collectors.toList())); //  we skip first  elements


        List<Integer> list4 = new ArrayList<>(Arrays.asList(12,12,1,23,4,56,66,66));
        System.out.println(list4.stream().limit(6).skip(3).collect(Collectors.toList())); //  we skip   elements












    }









}
