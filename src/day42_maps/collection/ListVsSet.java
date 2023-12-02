package day42_maps.collection;

import java.io.FilterOutputStream;
import java.util.*;

public class ListVsSet {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null); // null is allowed
        list.add("a"); // can have duplicates
        System.out.println(list); // in order
        System.out.println(list.get(3));// faster to get index


        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null); // null is allowed
        list2.add("a"); // can have duplicates
        System.out.println(list2); // in order
        System.out.println(list2.get(3));// slower to get index
        // add and remove  faster


        List<String> list3 = new Vector<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null); // null is allowed
        list3.add("a"); // can have duplicates
        System.out.println(list3); // in order
        System.out.println(list3.get(3));
        //  thread safe,  and slower


        System.out.println("______________________________");

        /*


        Set - > parent

            HasSet
               - no duplicates
               - not in order
               - accepts null
            LinkedHashSet
               - no duplicates
               - in order
               - accepts null

            TreeSet
               - implement SortedSet interface
               - no duplicates
               - in order
               - accepts null
         */


        Set<Integer> list4 = new HashSet<>();
        list4.add(5);
        list4.add(12);
        list4.add(1);
        list4.add(77);
        list4.add(56);
        System.out.println(list4);
        //System.out.println(list4.get(2));
        // you cant use index in Set
        //  use FOR EACH LOOP

        for (Integer each : list4) {

            if (each > 13) {
                System.out.println(each);

            }

        }
        // to sort
        Set<Integer> Sorted = new TreeSet<>(list4);
        System.out.println(Sorted);


        System.out.println("_____________________");
        List<String> list1 = new ArrayList<>();
        list1.add("d");
        list1.add("c");
        list1.add("b");
        list1.add("a");
        list1.add(null); // null is allowed
        list1.add("a"); // can have duplicates
        list1.add("b");
        list1.add(null);
        System.out.println(list1); // in order

        // remove duplicates
        Set<String> removeDuplicates = new HashSet<>(list1);
        System.out.println(removeDuplicates);

        System.out.println("____REMOVE____DUPLICATES________");

        String s = "aaasdfffffghjklttttttttt";
        s.split("");
        System.out.println(Arrays.toString(s.split(""))); // convert to Array
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))); // remove duplicates

        System.out.println(
                new HashSet<>(Arrays.asList(s.split("")))
                        .toString()
                        .replace("]","")
                        .replace("[","")
                        .replaceAll(",","")
                        .replaceAll(" ","")
        );



    }
}
