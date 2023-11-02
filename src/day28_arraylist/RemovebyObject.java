package day28_arraylist;

import java.util.ArrayList;

public class RemovebyObject {


    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();

        num.add(100);
        num.add(423);
        num.add(83);
        num.add(22);
        num.add(522);
        num.add(12);
        System.out.println(num);

        num.remove(3);
        System.out.println(num);

        num.remove(Integer.valueOf(83)); // we can choose witch one we want to remove element from the middle
        System.out.println(num);

        Integer a = 423;
        num.remove(a); // or we can remove this way  any object what we want
        System.out.println(num);
        num.remove((Integer)522); // we cast and  this way we remove also any object what we want
        System.out.println(num);

    }
}
