package day27_wrapper_arrays;

import java.util.ArrayList;

public class classRoom {

    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());
        group.add("Java");
        group.add("Sergii");
        group.add("Alina");
        group.add("Olexandr");
        System.out.println(group);
        System.out.println(group.size()); // 4 element
        System.out.println("First name: "+group.get(1));
        System.out.println("First name: "+group.get(2));
        System.out.println("First name: "+group.get(3));
        System.out.println("_________________");

        for (int i = 0; i < group.size(); i++) {
            System.out.println( i + 1+ " First name: "+group.get(i));

        }
        System.out.println();

        for (String each : group){
            System.out.println("Name: "+each); // if you put in comment statement  it will print all  names in one row
            for (int i = 0; i < each.length(); i++) {
                System.out.println("Each char "+each.charAt(i));

            }
        }

    }
}
