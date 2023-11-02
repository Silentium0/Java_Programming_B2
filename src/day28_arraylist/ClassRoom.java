package day28_arraylist;

import java.util.ArrayList;

public class ClassRoom {


    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();

        group.add("Sergii");
        group.add("Java");
        System.out.println(group);

        group.add(0,"Nadir");
        System.out.println(group);

        System.out.println(group.get(1));
    }
}
