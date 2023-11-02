package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {


    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();

        num.add(34);
        num.add(200);
        num.add(34);
        num.add(544);
        num.add(2);
        num.add(988);

        System.out.println(num.indexOf(544));
        System.out.println(num.lastIndexOf(34)); // first matching index from the end

        num.set(num.indexOf(34),0 );
        System.out.println(num);
        num.set(num.indexOf(34),0 );
        System.out.println(num);
        num.set(num.indexOf(2),2344 );
        System.out.println(num);




    }
}
