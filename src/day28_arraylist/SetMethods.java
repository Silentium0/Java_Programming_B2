package day28_arraylist;

import java.util.ArrayList;

public class SetMethods {


    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();

        num.add(132);
        num.add(200);
        num.add(34);
        num.add(544);
        num.add(2);
        num.add(988);

        System.out.println(num);
        num.set(0,344); // update element in Array
        System.out.println(num);

        num.set(5,893);
        System.out.println(num);





    }
}
