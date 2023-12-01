package day41_collection.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListObjects {


    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("a"); // List allow you to add duplicates
        System.out.println(list);

        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);
        list2.add("a"); // List allow you to add duplicates
        System.out.println(list2);


        List<String> list3 = new LinkedList<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);
        list3.add("a");
        System.out.println(list3);




    }
}
