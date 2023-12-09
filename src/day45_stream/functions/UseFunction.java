package day45_stream.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UseFunction {


    public static void main(String[] args) {

        Function<int[], List<Integer>> convertArray = numbers -> {
            List <Integer> list = new ArrayList<>();

            for (int each : numbers){
                list.add(each);

            }


            return list;

        };


        int [] a = {12,34,5,678};
//        List<Integer> list = convertArray.apply(a);
//        System.out.println(list);
        System.out.println(convertArray.apply(a));







    }



}
