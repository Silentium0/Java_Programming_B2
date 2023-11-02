package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        list.add("computer");
        list.add("screen");
        list.add("desk");
        list.add("mouse");

        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.remove("desk");
        System.out.println(list);

        boolean b1 = list.remove("screen");
        System.out.println(b1);






    }






}
