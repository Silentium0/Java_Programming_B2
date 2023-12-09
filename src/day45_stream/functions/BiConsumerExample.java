package day45_stream.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    public static void main(String[] args) {

        BiConsumer<String, Integer> printNTimes = (str , num) ->{
            for (int i = 0; i < num; i++) {
                System.out.println(str);

            }


        };

        printNTimes.accept("hellop", 4);
        System.out.println();
        printNTimes.accept("hellop", 2);

        System.out.println("_____________");

        Map<String , Integer> map = new HashMap<>();
        map.put("lilu",3);
        map.put("enter",7);
        map.put("water",32);
        map.put("hold",78);



        map.forEach (
                (key, value) -> {
                    System.out.println(key + " " + value);
                }
        );

        System.out.println();




        for (Integer each : map.values()){
            System.out.println(each);
        }
        System.out.println();
        for (String  each : map.keySet()){
            System.out.println(each);
        }








    }
}
