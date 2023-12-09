package day27_wrapper_arrays;

import java.util.ArrayList;

public class RemoveExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList(); // we need provide data type , here we have String

        list.add("water");
        list.add("apple");
        list.add("banana");
        list.add("butter");
        System.out.println(list);
        list.add(1,"watermelon"); //   will replace element  1  with new value  and move  old one  will shift to right
        System.out.println(list);
        System.out.println(list.get(2)); // we get each element
        System.out.println(list.get(list.size()-1)); // we get last one element from array

        System.out.println("__________________");
        list.remove(0); // we remove element from array
        System.out.println(list);
        list.remove(list.size()-1); // we remove last  one element from array
        System.out.println(list);
        list.remove("apple");  // i choose Object not index to remove element
        System.out.println(list);
        list.add(0,"car"); // we make it middle one i array by assign  index
        list.add(3,"java");
        System.out.println(list);



    }
}
