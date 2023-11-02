package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(132);
        num.add(200);
        num.add(34);
        num.add(544);
        num.add(2);
        num.add(988);

        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.isEmpty()); // boolean

        num.clear(); // we clear all elements from array and make it empty
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.isEmpty());


    }
}
