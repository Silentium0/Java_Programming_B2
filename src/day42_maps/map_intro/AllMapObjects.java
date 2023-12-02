package day42_maps.map_intro;

import java.util.*;

public class AllMapObjects {

    public static void main(String[] args) {

        Map<String, String>map = new HashMap<>(); // HasMap => order is random
        map.put("java", "noob");
        map.put("hello", "world");
        map.put("Nadir", "loop");
        map.put("userName", "password");
        map.put(null, "car");
        System.out.println(map);


        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("java", "noob");
        map2.put("hello", "world");
        map2.put("Nadir", "loop");
        map2.put("userName", "password");
        map2.put(null, "car");

        System.out.println(map2);


        Map<String, String> map3 = new TreeMap<>(); // IN ORDER
        map3.put("java", "noob");
        map3.put("hello", "world");
        map3.put("Nadir", "loop");
        map3.put("userName", "password");
       // map3.put(null, "car");            //    No null

        System.out.println(map3);


        Map<String,String> hasTable = new Hashtable<>();
        hasTable.put("java", "noob");
        hasTable.put("hello", "world");
        hasTable.put("Nadir", "loop");
        hasTable.put("userName", "password");
       // hasTable.put(null, "car");     NO null key
        // hasTable.put(car, null);     NO null values


        System.out.println(hasTable);





    }
}
