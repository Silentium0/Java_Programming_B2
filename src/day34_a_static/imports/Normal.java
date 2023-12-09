package day34_a_static.imports;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {

    public static void main(String[] args) {
        int [] num = {12,345,67,33};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println(StringUtil.reversed("Sergii"));
        System.out.println(Math.PI);


    }



}
