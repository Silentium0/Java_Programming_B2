package day42_maps.map_intro;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {


    public static void main(String[] args) {

        //    key     value
        Map<Integer,Integer> list = new HashMap<>();
        list.put(1,2);
        list.put(3,4);

        Map<Integer,String> list2 = new HashMap<>();
        list2.put(1,"me");
        list2.put(2,"you");
        list2.put(3,"he");
        list2.put(4,"she");
        list2.put(5,"it");
        System.out.println(list2); //  no sorted

        System.out.println(list2.get(2)); // the key will give you value
        System.out.println(list2.get(5));

        String name = list2.get(1);
        System.out.println(name);

        list2.remove(3); // remove by the key "Integer"
        System.out.println(list2);
        System.out.println(list2.containsKey(1));
        System.out.println(list2.containsKey(3)); // false  we removed key (3)
        System.out.println(list2.containsValue("she"));
        System.out.println(list2.containsValue("he"));  // false  we removed key (3)

        System.out.println("_________________");
        list2.put(null,null);
        System.out.println(list2);
        list2.put(null,"World");
        System.out.println(list2);
        list2.put(5,"map"); // it will update value under key
        System.out.println(list2);
        list2.put(6,"map");
        System.out.println(list2); // duplicate just value   but  NOT KEY




    }
}
