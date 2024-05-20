package day42_maps.map_intro;

import java.util.HashMap;
import java.util.Map;

public class ClassRoom {


    public static void main(String[] args) {


        Map<Integer,Student> map = new HashMap<>(); // random order

        Student studentOne = new Student("Tom",22,10);
        map.put(1,studentOne);
        System.out.println(map.get(1));

        map.put(2,new Student("Mickie",12,3));
        System.out.println(map.get(2));

        map.put(3,new Student("Jack",33,111));
        System.out.println(map.get(3));

        System.out.println();

        System.out.println(map);

        System.out.println(map.get(3).name); // just a name
        System.out.println(map.get(2).age); // we get just an age from KEY 2


        System.out.println(map.keySet()); // will return of all KEYS
        System.out.println("______________________________");
        for (Integer each: map.keySet()){
            System.out.println("KEY: "+each);
            System.out.println("Value: "+map.get(each));
        }

        System.out.println("________________");

        for (Student each : map.values()){
            if (each.id == 111)
            System.out.println(each);
        }








    }


}
