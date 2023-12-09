package day43_map.map_recap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {



        Map<String ,Double> list = new HashMap<>();
        list.put("Water",1.5);
        list.put("Coffee",4.0);
        list.put("Cola",2.5);
        list.put("Apples",1.2);
        list.put("Butter",5.5);
        System.out.println(list);
        System.out.println(list.values());

        for (String each : list.keySet()){
            if (each.equals("Apples") || each.equals("Water")){
                System.out.println(each);
            }
        }

        for (Double each : list.values()){
            System.out.println(each);
        }



        for (String each: list.keySet()){
            System.out.print(each+": ");
            System.out.println(list.get(each));
        }
        System.out.println("__________________");
        for (Map.Entry<String , Double> each : list.entrySet()){
            System.out.print(each.getKey()+": ");
            System.out.println(each.getValue());
        }

        Scanner input = new Scanner(System.in);
        System.out.print("What item do you want to check: ");
        String userItem = input.nextLine();
        // Check if item is in the store. If i it tell the info about item.

        String result = list.containsKey(userItem) ? userItem + " is in stock and price is " + list.get(userItem) : "Not available in Store";
        System.out.println(result);







    }
}
