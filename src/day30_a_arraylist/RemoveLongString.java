package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {


    public static ArrayList<String> removeLongString(ArrayList<String> list,int maxlength ) {

        ArrayList<String> updateList = new ArrayList<>(list);

        updateList.removeIf(each -> each.length() > maxlength);

        return updateList;
    }


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));

        removeLongString(list,4); // we have 2 parameters,  last one int
        System.out.println(list);
        System.out.println(removeLongString(list,3)); // we  leave length of elements  by provide  maxlength 3

    }
}
