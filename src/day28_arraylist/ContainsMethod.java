package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(132);
        num.add(200);
        num.add(34);
        num.add(544);
        num.add(2);
        num.add(988);
        System.out.println(num.contains(200));
        System.out.println(num.contains(233));


    }
}
