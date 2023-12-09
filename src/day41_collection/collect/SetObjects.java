package day41_collection.collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {

    public static void main(String[] args) {

        // No duplicates  and random order
        Set<String> set = new HashSet<>(); //
        set.add(null);
        set.add("hello");
        set.add("World");
        set.add("400");
        set.add("!@#$");
        set.add("34");
        set.add("World");
        set.add("33");
        set.add("32");
        set.add("31");
        set.add("30");

        System.out.println(set);


        // in order but no duplicates
        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("World");
        set2.add("400");
        set2.add("!@#$");
        set2.add("34");
        set2.add("World");
        set2.add("33");
        set2.add("32");
        set2.add("33");

        System.out.println(set2);

         // null NOT allow /  order is sorted / no duplicates
        Set<String> set3 = new TreeSet<>();
        try{
            set3.add(null);

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        set3.add("hello");
        set3.add("World");
        set3.add("400");
        set3.add("!@#$");
        set3.add("34");
        set3.add("World");
        set3.add("33");
        set3.add("32");
        set3.add("33");

        System.out.println(set3);







    }
}
