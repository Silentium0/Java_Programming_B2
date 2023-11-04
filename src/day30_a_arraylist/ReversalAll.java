package day30_a_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversalAll {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted","Talk","Learn"));

        System.out.println(StringUtil.reversAllChar(list));
        System.out.println(list);

    }

}
